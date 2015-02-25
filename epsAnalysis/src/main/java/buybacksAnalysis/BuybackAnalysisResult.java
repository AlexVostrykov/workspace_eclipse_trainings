package buybacksAnalysis;

import common.AnalysisResult;

public class BuybackAnalysisResult implements AnalysisResult{
    private BuybackStatus result;

    public BuybackStatus getResult() {
		return result;
	}

	public void setResult(BuybackStatus result) {
		this.result = result;
	}
	
	public static final double ISSUES_NEW = 0.0;
	public static final double CONSTANT = 0.3;
	public static final double BUYS_BACK = 0.7;
	public static final double BUYS_BACK_SERIOSLY = 1.0;

	public Double getFinalScore(){
		
		if(BuybackStatus.UNKNOWN == this.result){
			return Double.NaN;
		}
		else if(BuybackStatus.ISSUES_NEW == this.result){
			return ISSUES_NEW;
		}
		else if(BuybackStatus.CONSTANT == this.result){
			return CONSTANT;
		}
		else if(BuybackStatus.BUYS_BACK == this.result){
			return BUYS_BACK;
		}
		else if(BuybackStatus.BUYS_BACK_SERIOSLY == this.result){
			return BUYS_BACK_SERIOSLY;
		}
		
        return Double.NaN;
    }
}