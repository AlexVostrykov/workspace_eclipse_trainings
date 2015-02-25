package fundamentalAnalysisTests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import buybacksAnalysis.BuybackAnalysisResult;
import buybacksAnalysis.BuybackAnalyzer;
import epsAnalysis.CompanyAnnualData;
import testdata.TestDataProvider;

public class BuybackAnalyzerTest {

	/*
	 * Testing BuybackAnalyzer.analyze
	 */
	
	// Normal case - Evil/DeepestShit company.
	@Test
	public void testAnalyze1(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteEvil();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertEquals(finalScore, BuybackAnalysisResult.ISSUES_NEW);
	}
	
	// Normal case - Sweetest/Best ever company.
	@Test
	public void testAnalyze2(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteSuperCompany();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore(), 1.0);
	}
	
	// Normal case - TSLA, 2014 - deep shit company.
	@Test
	public void testAnalyze3(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataByTicker("TSLA");
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore(), 0.0);
	}
	
	//TODO: rewrite with something more durable. No data about shares.
//	@Test
//	public void testAnalyze4(){
//		List<CompanyAnnualData> x = TestDataProvider.getTestDataByTicker("AV");
//		
//		BuybackAnalyzer a = new BuybackAnalyzer();
//		
//		Assert.assertEquals(a.analyze(x).getFinalScore(), 0.0);
//	}
	
	// Normal case - exactly 80 percent of data are declining.
	@Test
	public void testAnalyze5(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataFor80BuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore(), BuybackAnalysisResult.BUYS_BACK_SERIOSLY);
	}
	
	// Normal case - less than 80 percent of data are declining.
	@Test
	public void testAnalyze6(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataFor60BuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore(), BuybackAnalysisResult.BUYS_BACK);
	}
	
	// Normal case - less than 80 percent of data are declining.
	@Test
	public void testAnalyze7(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForConstantBuybackTest();
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		Assert.assertEquals(a.analyze(x).getFinalScore(), BuybackAnalysisResult.CONSTANT);
	}
}
