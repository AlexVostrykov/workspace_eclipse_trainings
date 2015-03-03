package common;

import java.util.List;

import epsAnalysis.CompanyAnnualData;

/**
 * @author avostrykov
 * The convention of sanity checks for any class which implements this interface
 * is to return UNKNOWN (NaN for getFinalScore()) result in case null, not enough data etc.
 */
public interface FundamentalCriterionAnalyzer {
	public AnalysisResult analyze(List<CompanyAnnualData> data);
}
