package common;

import java.util.List;

import epsAnalysis.CompanyAnnualData;

public interface FundamentalCriterionAnalyzer {
	public AnalysisResult analyze(List<CompanyAnnualData> data);
}
