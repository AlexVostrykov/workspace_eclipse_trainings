package epsAnalysis;

public class EpsAnalysisResult {
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
}
