package fundamentalAnalysisTests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import testdata.TestDataProvider;
import epsAnalysis.CompanyAnnualData;
import epsAnalysis.EpsAnalysisResult;
import epsAnalysis.EpsAnalyzer;

public class EpsAnalyzerTest {
	
	private final double COMPARISON_DELTA = 0.0;
	
	@Test
	public void testAnalyze1(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteEvil();

		EpsAnalyzer a = new EpsAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertNotNull(finalScore);
		
		Assert.assertEquals(finalScore.doubleValue(), EpsAnalysisResult.BAD, COMPARISON_DELTA);
	}
	
	@Test
	public void testAnalyze2(){
		List<CompanyAnnualData> x = TestDataProvider.getTestDataForAbsoluteSuperCompany();

		EpsAnalyzer a = new EpsAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertNotNull(finalScore);
		
		Assert.assertEquals(finalScore.doubleValue(), EpsAnalysisResult.GOOD, COMPARISON_DELTA);
	}
	
	@Test
	public void testAnalyze3(){
		List<CompanyAnnualData> x = null;

		EpsAnalyzer a = new EpsAnalyzer();
		
		Double finalScore = a.analyze(x).getFinalScore();
		
		Assert.assertNotNull(finalScore);
		
		Assert.assertEquals(finalScore.doubleValue(), Double.NaN, COMPARISON_DELTA);
	}
}
