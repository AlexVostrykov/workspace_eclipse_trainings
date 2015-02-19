package buybacksAnalysis;

public class BuybackAnalysisResult{
    private boolean result;

    public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public double getFinalScore(){
        return result ? 1.0 : 0.0;
    }
}