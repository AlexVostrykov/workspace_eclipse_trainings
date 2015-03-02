package common;

public interface AnalysisResult {
	/**
	 * Returns final score of the analysis. Must be [0..1].
	 * @return Double within [0..1]. Can be NaN if the final score cannot be calculated. Can be null if no attempt to calc was done.
	 */
	public Double getFinalScore();
}
