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
	
	//TODO: maybe, move constants out.
	public Double getFinalScore(){
		boolean epsGrows = (epsGrowthRate != null) && (epsGrowthRate.doubleValue() >= 0.019);
		if(!epsGrows) return 0.0;
		
		double result = 0.0;
		if(epsMark.equals(EpsEvalResult.EXCELLENT)){
			result = 1.0;
		}
		else if(epsMark.equals(EpsEvalResult.GOOD)){
			result = 0.9;
		}
		else if(epsMark.equals(EpsEvalResult.MEDIOCRE)){
			result = 0.5;
		}
		
		return result;
	}
}
