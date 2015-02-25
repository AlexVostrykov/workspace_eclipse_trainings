package common;

public class StarRatingResult implements AnalysisResult {
	private double points;
	private double totalPoints;
	
	public double getPoints() {
		return points;
	}
	
	public void setPoints(double points) {
		this.points = points;
	}
	
	public double getTotalPoints() {
		return totalPoints;
	}
	
	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public Double getFinalScore() {
		if(this.totalPoints == 0.0) return Double.NaN;
		
		return this.getPoints() / this.getTotalPoints();
	}
}
