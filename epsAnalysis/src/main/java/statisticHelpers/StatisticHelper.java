package statisticHelpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StatisticHelper {
	
	private static List<Double> getRidOfExtremes(List<Double> data){
		// Step 1: define max + min.
		double max, min;
		max = Double.MIN_VALUE;
		min = Double.MAX_VALUE;
		
		int maxIndex = -1;
		int minIndex = -1;
	
		int i = 0;
		for (Double val : data) {
			if(val >= max){
				max = val;
				maxIndex = i;
			}
			
			if(val <= min){
				min = val;
				minIndex = i;
			}
			
			i++;
		}
		
		// Step 2: refine the array, get rid of max and min.
		List<Double> refinedArray = new ArrayList<Double>();
		for(i = 0; i < data.size(); i++){
			if(i == maxIndex || i == minIndex) continue;
			
			refinedArray.add(data.get(i));
		}
		
		return refinedArray;
	}
	
	
	public static double getSmartAverage(List<Double> data, boolean getRidOfExtremesFirst){
		// Step 1: get rid of extremes if needed.
		List<Double> refinedArray = getRidOfExtremesFirst ? getRidOfExtremes(data) : data;
		
		// Step 2: calc avg
		double avg = 0.0;
		
		for(int i = 0; i < refinedArray.size(); i++){
			avg += refinedArray.get(i);
		}
		
		avg /= refinedArray.size();
		
		return avg;
	}
	
	public static double getSmartMedian(List<Double> data){
		return getSmartMedian(data, true);
	}
	
	public static double getSmartMedian(List<Double> data, boolean getRidOfExtremesFirst){
		// Sanity checks...
		
		// Step 1: get rid of extremes if needed.
		List<Double> refinedArray = getRidOfExtremesFirst ? getRidOfExtremes(data) : data;
		
		// Step 2: sort
		Collections.sort(refinedArray);
		
		// Step 3: find median
		double median;
		if(refinedArray.size() % 2 == 1){
			median = refinedArray.get(refinedArray.size() / 2);
		}
		else{
			int ind1 = refinedArray.size() / 2 - 1;
			int ind2 = refinedArray.size() / 2;
			median = 0.5*refinedArray.get(ind1) + 0.5*refinedArray.get(ind2);
		}
		
		return median;
	}
	
	
	public static double getSmartVariance(List<Double> data){
		
		// Step 1: get rid of extremes
		List<Double> refinedArray = getRidOfExtremes(data);
		
		// Step 2: calc median
		double m = getSmartMedian(refinedArray, false);
		/* getSmartAverage(refinedArray, false);*/
		
		// Step 3: calc variance
		double variance = 0.0;
		
		for(int i = 0; i < refinedArray.size(); i++){
			variance += (refinedArray.get(i) - m)*(refinedArray.get(i) - m);
		}
		
		variance /= (refinedArray.size() - 1);
		
		return variance;
	}


	public static double getPercentageOfPositiveValues(List<Double> x) {
		double result = 0;
		
		for (Double d : x) {
			result += (d > 0) ? 1 : 0;
		}
		
		return 100.0* result / x.size();
	}
}
