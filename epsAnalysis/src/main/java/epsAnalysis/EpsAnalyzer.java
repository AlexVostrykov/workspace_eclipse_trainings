package epsAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import statisticHelpers.StatisticHelper;

public class EpsAnalyzer {
	
	private class DeltaEps{
		private int year;
		private double delta;
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getDelta() {
			return delta;
		}
		public void setDelta(double delta) {
			this.delta = delta;
		}
		
		public DeltaEps(int year, double delta) {
			super();
			this.year = year;
			this.delta = delta;
		}
	}
	
	public List<DeltaEps> calcDeltas(List<CompanyAnnualData> data){
		if(data == null || data.size() <= 1) return null;
		
		// step 1: sort.
		Collections.sort(data);
		
		// step 2: calc deltas.
		List<DeltaEps> deltas = new ArrayList<EpsAnalyzer.DeltaEps>();
		
		for(int i = 0; i < data.size() - 1; i++){
			double thisDelta = data.get(i).getEps() - data.get(i + 1).getEps();
			deltas.add(new DeltaEps(data.get(i).getYear(), thisDelta));
		}
		
		return deltas;
	};
	
	private final double EPS_EXCELLENT = 95;
	private final double EPS_GOOD = 80;
	private final double EPS_MEDIOCRE = 60;
	
	private final double DELTAS_EXCELLENT = 95.0;
	private final double DELTAS_GOOD = 70.0;
	private final double DELTAS_MEDIOCRE = 50.0;
	
	// This is the subject to change easily:
	private final double SIGMA_EXCELLENT = 2.05;
	private final double SIGMA_GOOD = 10.0;
	private final double SIGMA_MEDIOCRE = 30.00;
	
	/*
	 * Must return:
	 * - EPS mark/conclusion: sigma/median delta.
	 * - EPS Growth Rate: calculated if EPS Mark is satisfactory.
	 * plus find out constants/thresholds.
	 */
	//TODO: implement this logic with appropriate constants
	public EpsAnalysisResult analyze(List<CompanyAnnualData> data){
		EpsAnalysisResult result = new EpsAnalysisResult();
		
		System.out.println("Analysis for " + data.get(0).getTicker());
		
		double percentPositiveEPS = getPercentageOfPositiveEPS(data);
		System.out.println("% of positive EPS is " + percentPositiveEPS);
		
		if(percentPositiveEPS >= EPS_EXCELLENT){
			result.setEpsMark(EpsEvalResult.EXCELLENT);
		}
		else if(percentPositiveEPS >= EPS_GOOD){
			result.setEpsMark(EpsEvalResult.GOOD);
		}
		else if(percentPositiveEPS >= EPS_MEDIOCRE){
			result.setEpsMark(EpsEvalResult.MEDIOCRE);
		}
		else{
			result.setEpsMark(EpsEvalResult.BAD);
			return result;
		}
		
		List<DeltaEps> deltas = calcDeltas(data);
		
		List<Double> x = new ArrayList<Double>();
		for (DeltaEps dt : deltas) {
			x.add(dt.getDelta());
		}
		
		double percentPositiveDeltas = getPercentageOfPositiveDeltas(deltas);
		System.out.println("% of Positive Deltas is " + percentPositiveDeltas);
		
		if(percentPositiveDeltas >= DELTAS_EXCELLENT){
			result.setEpsMark(EpsEvalResult.EXCELLENT);
		}
		else if(percentPositiveDeltas >= DELTAS_GOOD){
			result.setEpsMark(EpsEvalResult.GOOD);
		}
		else if(percentPositiveDeltas >= DELTAS_MEDIOCRE){
			result.setEpsMark(EpsEvalResult.MEDIOCRE);
		}
		else{
			result.setEpsMark(EpsEvalResult.BAD);
			return result;
		}
		
		System.out.println("So far result is " + result.getEpsMark());
		
		double mean = StatisticHelper.getSmartMedian(x);
		System.out.println("Median is " + mean);
		
		double variance = StatisticHelper.getSmartVariance(x);
		System.out.println("Variance is " + variance);
		
		double standardDeviation = Math.sqrt(variance);
		System.out.println("Standard Deviation is " + standardDeviation);
		
//		double avg = StatisticHelper.getSmartAverage(x, true);
//		System.out.println("Smart Avg is " + avg);
		
		double myEPSMetric = standardDeviation / mean;
		System.out.println("FINAL EPS CONCLUSION is " + myEPSMetric);
		
		return result;
	}
	
	public double getPercentageOfPositiveEPS(List<CompanyAnnualData> data){
		
		//TODO: automate this process of getting an array of values
		List<Double> x = new ArrayList<Double>();
		for (CompanyAnnualData dt : data) {
			x.add(dt.getEps());
		}
		
		return StatisticHelper.getPercentageOfPositiveValues(x);
	}
	
	public double getPercentageOfPositiveDeltas(List<DeltaEps> deltas){
		List<Double> x = new ArrayList<Double>();
		for (DeltaEps dt : deltas) {
			x.add(dt.getDelta());
		}
		
		return  StatisticHelper.getPercentageOfPositiveValues(x);
	}
}
