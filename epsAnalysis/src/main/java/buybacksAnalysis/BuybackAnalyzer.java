package buybacksAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import statisticHelpers.StatisticHelper;
import epsAnalysis.CompanyAnnualData;

//TODO: manually test it on different companies from the test data list. Think on constants more...
//TODO: create sanity convention about analyzers.
//  Either throw exception or return null.
public class BuybackAnalyzer{

    public static final double DELTA_THERSHOLD = 0.8;

    public BuybackAnalysisResult analyze(List<CompanyAnnualData> data){
        // Sanity checks
        if(data == null) return null;
        if(data.size() <= 1) return null;

        // sort by year desc
        Collections.sort(data);

        // last year is the most recent year.
        Long lastYearSharesOutstanding = data.get(0).getSharesOutstanding();

        // (shares outstanding can be unknown or not presented).
        Long firstYearSharesOutstanding = data.get(data.size() - 1).getSharesOutstanding();
        
        // 1. define if in the end we get more than in the beginning (result).
        boolean getsLower = (lastYearSharesOutstanding != null) && (firstYearSharesOutstanding != null)
        		&& (lastYearSharesOutstanding < firstYearSharesOutstanding);

        // 2. define the character of lowering of shares outstanding.
        List<Double> deltas = new ArrayList<Double>();
        List<CompanyAnnualData> refinedData = new ArrayList<CompanyAnnualData>();

        for(CompanyAnnualData yearData: data){
            if(yearData != null && yearData.getSharesOutstanding() != null)
                refinedData.add(yearData);
        }
        
        if(refinedData.size() <= 1) return new BuybackAnalysisResult();
        // which will be by default 0.00 as final score.
        
        for(int i = 0; i < refinedData.size(); i++){
            if(i + 1 != refinedData.size()){
            	long val = refinedData.get(i).getSharesOutstanding() - refinedData.get(i + 1).getSharesOutstanding();
                deltas.add((double) val);
            }
        }

        double percentNegative = 1 - StatisticHelper.getPercentageOfPositiveValues(deltas);

        BuybackAnalysisResult result = new BuybackAnalysisResult();
        result.setResult(getsLower && percentNegative >= DELTA_THERSHOLD);
        return result;
    }

}