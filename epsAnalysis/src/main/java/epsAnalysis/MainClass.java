package epsAnalysis;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import buybacksAnalysis.BuybackAnalyzer;
import statisticHelpers.StatisticHelper;
import testdata.TestDataProvider;
import common.DataExtractor;

public class MainClass {

   

    
    /* The list of tickers it supports:
	 * MAT, CCE, BP, HOG, NG
	 * PFE, BBD.B, ERF, MCD
     * TAC, T, UL, ADP, JNJ
     * PG, SO, HD, MON, PSEC
     * AB, CAG, WU, VGR, BUD
     * LTS, GII.UN, AGNC, SCU
     * M, BB, GM, RGSE, TOT
     * GE, VALU, AV, TSLA, F
     * VLKAY, HMC, BAMXF, NSANY, TM
     * AYA, HEINY, ALL, MCY, PGR
    */
    private static final String TICKER = "PGR";
	
	public static void main(String[] args) {
		System.out.println("Analyzing: " + TICKER);
		
		List<CompanyAnnualData> x = TestDataProvider.getTestDataByTicker(TICKER);
		
		BuybackAnalyzer a = new BuybackAnalyzer();
		
		System.out.println(a.analyze(x).getFinalScore());
		
		/*
		
		EpsAnalyzer analyzer = new EpsAnalyzer();
		EpsAnalysisResult r = analyzer.analyze(TestDataProvider.getTestDataByTicker(TICKER));
		if(r != null){
			System.out.println("RESULT IS " + r.getEpsMark() + ";  final score is: " + r.getFinalScore());
		}*/
		
//		List<Double> x = new ArrayList<Double>();
//		x.add(Double.NaN);
//		x.add(null);
//		System.out.println("Null+NaN test:" + StatisticHelper.getPercentageOfPositiveValues(x));
		
		System.out.println("Analysis is done!");
//		System.out.println("Test of DataExtractor:");
//		System.out.println("Result of extraction: " + DataExtractor.extractDouble(getTestDataByTicker(TICKER).get(1), "getEps"));
	}
}
