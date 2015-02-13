package epsAnalysis;

public class CompanyAnnualData implements Comparable<CompanyAnnualData>{
	private int year;
	private double eps;
	private String ticker;
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEps() {
		return eps;
	}
	
	public void setEps(double eps) {
		this.eps = eps;
	}
	
	public CompanyAnnualData(int year, double eps, String ticker) {
		super();
		this.year = year;
		this.eps = eps;
		this.ticker = ticker;
	}
	
	public int compareTo(CompanyAnnualData to) {
		return -(this.year - to.getYear()); // sort by year desc
	}
}
