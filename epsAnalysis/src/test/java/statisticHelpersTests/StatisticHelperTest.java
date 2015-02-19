package statisticHelpersTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import statisticHelpers.StatisticHelper;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StatisticHelperTest {
	
	/*
	 * Testing StatisticHelper.getPercentageOfPositiveValues()
	 */
	//Tests on empty input
	@Test
	public void testGetPercentageOfPositiveValues1(){
		List<Double> x = new ArrayList<Double>();
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 0.0);
	}
	
	//Tests on null input
	@Test
	public void testGetPercentageOfPositiveValues2(){
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(null), 0.0);
	}
	
	// All values are null and NaN.
	@Test
	public void testGetPercentageOfPositiveValues3(){
		List<Double> x = new ArrayList<Double>();
		x.add(Double.NaN);
		x.add(null);
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 0.0);
	}
	
	// Just one positive value.
	@Test
	public void testGetPercentageOfPositiveValues4(){
		List<Double> x = new ArrayList<Double>();
		x.add(100500.00);
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 100.0);
	}
	
	// Just one positive value and one negative.
	@Test
	public void testGetPercentageOfPositiveValues5(){
		List<Double> x = new ArrayList<Double>();
		x.add(100500.00);
		x.add(-1.0);
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 50.0);
	}
	
	// Just one positive value and one null.
	@Test
	public void testGetPercentageOfPositiveValues6(){
		List<Double> x = new ArrayList<Double>();
		x.add(100500.00);
		x.add(null);
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 50.0);
	}
	
	// Just one positive value and then null, negative and NaN.
	@Test
	public void testGetPercentageOfPositiveValues7(){
		List<Double> x = new ArrayList<Double>();
		x.add(100500.00);
		x.add(null);
		x.add(Double.NaN);
		x.add(-1.00);
		
		Assert.assertEquals(StatisticHelper.getPercentageOfPositiveValues(x), 25.0);
	}
	
	
	/*
	 * Testing StatisticHelper.getRidOfExtremes()
	 */
	
	// Just empty array list. Should be null.
	@Test
	public void testGetRidOfExtremes1(){
		List<Double> x = new ArrayList<Double>();
		
		Assert.assertEquals(StatisticHelper.getRidOfExtremes(x), null);
	}
	
	// Just empty array list. Should be null.
	@Test
	public void testGetRidOfExtremes2(){
		Assert.assertEquals(StatisticHelper.getRidOfExtremes(null), null);
	}
	
	// All values are the same, should remove just one of them.
	@Test
	public void testGetRidOfExtremes3(){
		List<Double> x = new ArrayList<Double>();
		x.add(1.0);
		x.add(1.0);
		x.add(1.0);
		
		List<Double> r = StatisticHelper.getRidOfExtremes(x);
		Assert.assertNotNull(r);
		Assert.assertEquals(r.size(), x.size() - 1);
		
		for(int i = 0; i < r.size(); i++){
			Assert.assertEquals(r.get(i).doubleValue(), 1.0);
		}
	}
	
	// Just one value. Should return empty array.
	@Test
	public void testGetRidOfExtremes4(){
		List<Double> x = new ArrayList<Double>();
		x.add(1.0);
		
		List<Double> r = StatisticHelper.getRidOfExtremes(x);
		Assert.assertNotNull(r);
		Assert.assertEquals(r.size(), 0);
	}
	
	//Just two different values. Must get rid of two values. Returns emtpy.
	@Test
	public void testGetRidOfExtremes5(){
		List<Double> x = new ArrayList<Double>();
		x.add(1.0);
		x.add(-1.0);
		
		List<Double> r = StatisticHelper.getRidOfExtremes(x);
		Assert.assertNotNull(r);
		Assert.assertEquals(r.size(), 0);
	}
	
	// Normal case. Must get rid of two values.
	@Test
	public void testGetRidOfExtremes6(){
		List<Double> x = new ArrayList<Double>();
		x.add(1.0);
		x.add(-1.0);
		x.add(0.0);
		x.add(0.5);
		
		List<Double> r = StatisticHelper.getRidOfExtremes(x);
		Assert.assertNotNull(r);
		Assert.assertEquals(r.size(), x.size() - 2);
		
		for(Double d: r){
			Assert.assertNotNull(d);
			Assert.assertEquals(d.doubleValue() == 0.0 || d.doubleValue() == 0.5, true);
		}
	}
}
