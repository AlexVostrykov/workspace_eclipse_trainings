package fundamentalAnalysisTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import buybacksAnalysis.BuybackAnalysisResult;
import buybacksAnalysis.BuybackAnalyzer;
import epsAnalysis.CompanyAnnualData;
import testdata.TestDataProvider;

public class BuybackAnalyzerTest {
	
	private final double COMPARISON_DELTA = 0.0;

	/*
	 * Testing BuybackAnalyzer.analyze
	 */
	
	// Normal case - Evil/DeepestShit company.
	@Test
	public void testAnalyze1(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteEvil();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertNotNull(finalScore);
		
		Assert.assertEquals(finalScore.doubleValue(), BuybackAnalysisResult.ISSUES_NEW, COMPARISON_DELTA);
	}
	
	// Normal case - Sweetest/Best ever company.
	@Test
	public void testAnalyze2(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteSuperCompany();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertEquals(finalScore.doubleValue(), BuybackAnalysisResult.BUYS_BACK_SERIOSLY, COMPARISON_DELTA);
	}
	
	// Normal case - TSLA, 2014 - deep shit company.
	@Test
	public void testAnalyze3(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataByTicker("TSLA");
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), BuybackAnalysisResult.ISSUES_NEW, COMPARISON_DELTA);
	}

	@Test
	public void testAnalyze4(){
		List<CompanyAnnualData> x = new ArrayList<CompanyAnnualData>(2);
		x.add(null);
		x.add(new CompanyAnnualData(2008, .17, "SHT", 10L));
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), Double.NaN, COMPARISON_DELTA);
	}
	
	// Normal case - exactly 80 percent of data are declining.
	@Test
	public void testAnalyze5(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataFor80BuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), BuybackAnalysisResult.BUYS_BACK_SERIOSLY, COMPARISON_DELTA);
	}
	
	// Normal case - less than 80 percent of data are declining.
	@Test
	public void testAnalyze6(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataFor60BuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), BuybackAnalysisResult.BUYS_BACK, COMPARISON_DELTA);
	}
	
	// Normal case - less than 80 percent of data are declining.
	@Test
	public void testAnalyze7(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForConstantBuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), BuybackAnalysisResult.CONSTANT, COMPARISON_DELTA);
	}
	
	@Test
	public void testAnalyze8(){
		List<CompanyAnnualData> x = new ArrayList<CompanyAnnualData>(2);
		x.add(new CompanyAnnualData(2008, .17, "SHT", 10L));
		// should be UNKNOWN, because too few data.
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), Double.NaN, COMPARISON_DELTA);
	}
	
	@Test
	public void testAnalyze9(){
		List<CompanyAnnualData> x = new ArrayList<CompanyAnnualData>(3);
		x.add(new CompanyAnnualData(2008, .17, "SHT", 10L));
		x.add(new CompanyAnnualData(2007, 2.0, "SHT"));
		x.add(new CompanyAnnualData(2006, .02, "SHT"));
		// should be UNKNOWN, because too few data.
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore().doubleValue(), Double.NaN, COMPARISON_DELTA);
	}
}
