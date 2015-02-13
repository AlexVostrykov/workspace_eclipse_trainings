package epsAnalysis;

public enum EpsEvalResult {
	EXCELLENT(0),
	GOOD(1),
	MEDIOCRE(2),
	BAD(3);
	
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private EpsEvalResult(int val){
		this.value = val;
	}
	
	
}
