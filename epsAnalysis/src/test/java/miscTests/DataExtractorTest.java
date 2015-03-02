package miscTests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import common.DataExtractor;
import testdata.TestDataProvider;
import epsAnalysis.CompanyAnnualData;

public class DataExtractorTest {
	private final double COMPARISON_DELTA = 0.0;
	
	@Test
	public void testExtract1(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteEvil();
		
		double etalon = x.get(0).getEps();
		
		Double value = DataExtractor.extractDouble(x.get(0), "getEps");
		
		Assert.assertNotNull(value);
		
		Assert.assertEquals(value.doubleValue(), etalon, COMPARISON_DELTA);
	}
	
	@Test
	public void testExtract2(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteEvil();
		
		double etalon = x.get(0).getEps();
		
		Double value = DataExtractor.extractDouble(x.get(0), "getEps");
		
		Assert.assertNotNull(value);
		
		Assert.assertEquals(value.doubleValue(), etalon, COMPARISON_DELTA);
	}
}
