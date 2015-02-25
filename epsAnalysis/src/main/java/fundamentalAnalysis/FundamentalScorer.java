package fundamentalAnalysis;

import java.util.ArrayList;
import java.util.List;

import buybacksAnalysis.BuybackAnalyzer;
import common.AnalysisResult;
import common.FundamentalCriterionAnalyzer;
import common.StarRatingResult;
import epsAnalysis.CompanyAnnualData;
import epsAnalysis.EpsAnalyzer;

public class FundamentalScorer {

	public static FundamentalScorer getFinancialCompanyScorer(){
		return null;
	}
	
	/**
	 * The most basic algorithm of calculating the fundamental score.
	 * Suits the most of companies available. However, for financial realm
	 * the algorithm must differ. See also {@link FundamentalScorer#getFinancialCompanyScorer()}
	 * @return standard edition of fundamental scorer.
	 */
	public static FundamentalScorer getStandardScorer(){
		FundamentalScorer scorer = new FundamentalScorer();
		scorer._analyzers.add(new EpsAnalyzer());
		scorer._analyzers.add(new BuybackAnalyzer());
		return scorer;
	}
	
	private List<FundamentalCriterionAnalyzer> _analyzers = new ArrayList<FundamentalCriterionAnalyzer>();
	
	public AnalysisResult getFundamentalScore(List<CompanyAnnualData> data){
		if(data == null) return null;

		StarRatingResult result = new StarRatingResult();
		
		for(FundamentalCriterionAnalyzer fca: _analyzers){
			result.setTotalPoints(result.getTotalPoints() + 1);
			
			AnalysisResult tempRes = fca.analyze(data);
			 
			if(tempRes != null){
				Double d = tempRes.getFinalScore();
				if(d != null && d != Double.NaN){
					result.setPoints(result.getPoints() + d.doubleValue());
				}
			}
		}
		
		return result;
	}
}
