package epsAnalysis;

import common.AnalysisResult;

public class EpsAnalysisResult implements AnalysisResult{
	
	public EpsEvalResult getEpsMark() {
		return epsMark;
	}
	
	public void setEpsMark(EpsEvalResult _epsMark) {
		if(this.epsMark == null){
			this.epsMark = _epsMark;
		}
		else{
			if(_epsMark.getValue() >= this.epsMark.getValue()){
				this.epsMark = _epsMark;
			}
		}
	}
	
	
	public Double getEpsGrowthRate() {
		return epsGrowthRate;
	}
	public void setEpsGrowthRate(Double epsGrowthRate) {
		this.epsGrowthRate = epsGrowthRate;
	}
	
	private EpsEvalResult epsMark;
	private Double epsGrowthRate;

	public Double getFinalScore(){
		if(EpsEvalResult.UNKNOWN.equals(epsMark)) return Double.NaN;
		
		boolean epsGrows = (epsGrowthRate != null) && (epsGrowthRate.doubleValue() >= 0.019);
		if(!epsGrows) return BAD;
		
		double result = 0.0;
		if(epsMark.equals(EpsEvalResult.EXCELLENT)){
			result = EXCELLENT;
		}
		else if(epsMark.equals(EpsEvalResult.GOOD)){
			result = GOOD;
		}
		else if(epsMark.equals(EpsEvalResult.MEDIOCRE)){
			result = MEDIOCRE;
		}
		
		return result;
	}
	
	public static final double BAD = 0.0;
	public static final double MEDIOCRE = 0.5;
	public static final double GOOD = 0.9;
	public static final double EXCELLENT = 1.0;
}
