package buybacksAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.FundamentalCriterionAnalyzer;

import statisticHelpers.StatisticHelper;
import epsAnalysis.CompanyAnnualData;

//TODO: manually test it on different companies from the test data list. Think on constants more...
//TODO: create sanity convention about analyzers.
//  Either throw exception or return null.
//TODO - test on BUD - get rid of nulls first... How many of them you are allowed to kill and still have
// meaningful statistics? debug + add a unit test.
public class BuybackAnalyzer implements FundamentalCriterionAnalyzer{

	// if company buys back seriously, at least 70% of deltas must be negative.
    public static final double DELTA_THERSHOLD = 70.0;
    
    private static final double MIN_REFINED_PERCENTAGE = 0.4;

    public BuybackAnalysisResult analyze(List<CompanyAnnualData> data){
    	BuybackAnalysisResult result = new BuybackAnalysisResult();
    	
        // Sanity checks
        if(data == null || (data.size() <= 1)){
        	result.setResult(BuybackStatus.UNKNOWN);
        	return result;
        }
        
        // Refining data, getting rid of nulls.
        List<CompanyAnnualData> refinedData = new ArrayList<CompanyAnnualData>();
        for(CompanyAnnualData yearData: data){
            if(yearData != null && yearData.getSharesOutstanding() != null)
                refinedData.add(yearData);
        }
        
        if(MIN_REFINED_PERCENTAGE >= refinedData.size() / ((double) data.size())){
        	// means that too many data are nulls, so no meaningful conclusion can be made.
        	result.setResult(BuybackStatus.UNKNOWN);
        	return result;
        }
        
        // sort by year desc
        Collections.sort(refinedData);

        // last year is the most recent year.
        Long lastYearSharesOutstanding = refinedData.get(0).getSharesOutstanding();

        // (shares outstanding can be unknown or not presented).
        Long firstYearSharesOutstanding = refinedData.get(refinedData.size() - 1).getSharesOutstanding();
        
        // 1. define if in the end we get more than in the beginning (result).
        boolean getsLower = (lastYearSharesOutstanding != null) && (firstYearSharesOutstanding != null)
        		&& (lastYearSharesOutstanding < firstYearSharesOutstanding);
        
        double timesIncreased = ((double)lastYearSharesOutstanding)/firstYearSharesOutstanding;
        
        System.out.println("Gets lower: " + getsLower);
        
        if(getsLower){
			System.out.println("Increased, times: " + timesIncreased);
        }

        // 2. define the character of lowering of shares outstanding.
        List<Double> deltas = new ArrayList<Double>();
        
        if(refinedData.size() <= 1){
        	result.setResult(BuybackStatus.UNKNOWN);
        	return result;
        }
        
        for(int i = 0; i < refinedData.size(); i++){
            if(i + 1 != refinedData.size()){
            	long val = refinedData.get(i).getSharesOutstanding() - refinedData.get(i + 1).getSharesOutstanding();
                deltas.add((double) val);
            }
        }

        double percentNegative = 100.0 - StatisticHelper.getPercentageOfPositiveValues(deltas);
        
        System.out.println("% of negative deltas: " + percentNegative);

        // setting final conclusion.
        if(!getsLower){
        	result.setResult(percentNegative == 100.0 ? BuybackStatus.CONSTANT : BuybackStatus.ISSUES_NEW);
        }
        else{
        	if(percentNegative >= DELTA_THERSHOLD && timesIncreased <= 0.9){
        		result.setResult(BuybackStatus.BUYS_BACK_SERIOSLY);
        	}
        	else{
        		result.setResult(BuybackStatus.BUYS_BACK);
        	}
        }
        
        return result;
    }

}