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
	
	/*
	 * Must return:
	 * - EPS mark/conclusion: sigma/median delta.
	 * - EPS Growth Rate: calculated if EPS Mark is satisfactory.
	 * plus find out constants/thresholds.
	 */
	//TODO: implement this logic with appropriate constants
	public int analyze(List<CompanyAnnualData> data){
		
		System.out.println("Analysis for " + data.get(0).getTicker());
		
		double percentPositiveEPS = getPercentageOfPositiveEPS(data);
		System.out.println("% of positive EPS is " + percentPositiveEPS);
		
		List<DeltaEps> deltas = calcDeltas(data);
		
		List<Double> x = new ArrayList<Double>();
		for (DeltaEps dt : deltas) {
			x.add(dt.getDelta());
		}
		
		double percentPositiveDeltas = getPercentageOfPositiveDeltas(deltas);
		System.out.println("% of Positive Deltas is " + percentPositiveDeltas);
		
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
		
		return 0;
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
