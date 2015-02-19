package testdata;

import java.util.ArrayList;
import java.util.List;

import epsAnalysis.CompanyAnnualData;

public class TestDataProvider {
	
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
	public static List<CompanyAnnualData> getTestDataByTicker(String ticker){ 
		if("MAT".equals(ticker)) return getTestDataForMattelInc();
   	 	if("CCE".equals(ticker)) return getTestDataForCocaColaInc();
   	 	if("HOG".equals(ticker)) return getTestDataForHarleyDevidson();
   	 	if("BP".equals(ticker)) return getTestDataForBritishPetroleum();
   	 	if("NG".equals(ticker)) return getTestDataForNovaGold();
   	 	if("PFE".equals(ticker)) return getTestDataForPfizer();
   	 	if("ERF".equals(ticker)) return getTestDataForEnerplusCorp();
   	 	if("MCD".equals(ticker)) return getTestDataForMacDonalds();
   	 	if("BBD.B".equals(ticker)) return getTestDataForBombardier();
   	 
   	 	if("TAC".equals(ticker)) return getTestDataForTransAlta();
	    if("T".equals(ticker)) return getTestDataForATnT();
	     if("UL".equals(ticker)) return getTestDataForUnilever();
        if("ADP".equals(ticker)) return getTestDataForADP();
        if("JNJ".equals(ticker)) return getTestDataForJnJ();
        if("PG".equals(ticker)) return getTestDataForPG();
       if("SO".equals(ticker)) return getTestDataForSouthernCo();
       if("HD".equals(ticker)) return getTestDataForHomeDepot();
       if("MON".equals(ticker)) return getTestDataForMonsanto();
       if("PSEC".equals(ticker)) return getTestDataForProspectCapital();
       if("AB".equals(ticker)) return getTestDataForAllianceBernstein();
       if("CAG".equals(ticker)) return getTestDataForConAgraFoods();
       if("WU".equals(ticker)) return getTestDataForWesternUnion();
       if("VGR".equals(ticker)) return getTestDataForVectorGroup();
       if("BUD".equals(ticker)) return getTestDataForAncheuserBusch();
       if("LTS".equals(ticker)) return getTestDataForLightstreamResources();
       if("GII.UN".equals(ticker)) return getTestDataForGlobalDiversifiedGradeIncomeTrustII();
       if("AGNC".equals(ticker)) return getTestDataForAGNC();
       if("SCU".equals(ticker)) return getTestDataForSecondCup();
       if("M".equals(ticker)) return getTestDataForMosaicCapitalCorp();
       if("BB".equals(ticker)) return getTestDataForBlackBerryLtd();
       if("GM".equals(ticker)) return getTestDataForGM();
       if("RGSE".equals(ticker)) return getTestDataForRealGoodSolarInc();
       if("TOT".equals(ticker)) return getTestDataForTotalSA();
       if("GE".equals(ticker)) return getTestDataForGeneralElectricCo();
       if("VALU".equals(ticker)) return getTestDataForValueLine();
       if("AV".equals(ticker)) return getTestDataForAvivaPlc();
       if("TSLA".equals(ticker)) return getTestDataForTeslaMotorsInc();
       if("F".equals(ticker)) return getTestDataForFordMotorCo();
       if("VLKAY".equals(ticker)) return getTestDataForVolkswagenAG();
       if("HMC".equals(ticker)) return getTestDataForHondaMotorCo();
       if("NSANY".equals(ticker)) return getTestDataForNissanMotorCo();
       if("TM".equals(ticker)) return getTestDataForToyotaMotorCorp();
       if("BAMXF".equals(ticker)) return getTestDataForBMW();
       if("AYA".equals(ticker)) return getTestDataForAmayaInc();
       if("HEINY".equals(ticker)) return getTestDataForHeineken();
       if("ALL".equals(ticker)) return getTestDataForAllstate();
       if("MCY".equals(ticker)) return getTestDataForMercuryGeneralCorp();
       if("PGR".equals(ticker)) return getTestDataForProgressiveCorp();
       
       
       return null;
   }
	
	 private static List<CompanyAnnualData> getTestDataForWesternUnion(){
         String ticker = "WU";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.48, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.43, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.69, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.84, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.36, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.21, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.24, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.11, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.19, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.98, ticker);
         res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker);
         //res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForVectorGroup(){
         String ticker = "VGR";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.89, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.39, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.32, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.80, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.58, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.27, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.60, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.80, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.48, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.68, ticker);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
         res.add(y2004);

         return res;
    }
    private static List<CompanyAnnualData> getTestDataForGM(){
        String ticker = "GM";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.65, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.38, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.92, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 4.58, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.89, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 113.18, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -53.47, ticker);
        res.add(y2008);
	 
        //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.11, ticker);
        //res.add(y2007);
	 
        //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.65, ticker);
        //res.add(y2006);
	 
        //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.36, ticker);
        //res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForRealGoodSolarInc(){
        String ticker = "RGSE";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -1.00, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.38, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -1.77, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.08, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.07, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.09, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.86, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.01, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.03, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.02, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForTotalSA(){
        String ticker = "TOT";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.51, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 5.14, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 6.24, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 7.05, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 6.26, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 5.42, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 6.56, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 8.48, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 6.71, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 6.13, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 5.30, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForGeneralElectricCo(){
        String ticker = "GE";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.31, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.27, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.29, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.23, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.06, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.01, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.72, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.17, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.00, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.54, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.59, ticker);
        res.add(y2004);

        return res;
   }

    private static List<CompanyAnnualData> getTestDataForLightstreamResources(){
         String ticker = "LTS";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, -6.51, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, -7.07, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.76, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.11, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.26, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.34, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.70, ticker);
         res.add(y2008);
	 
         //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.80, ticker);
         //res.add(y2007);
	 
         //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.48, ticker);
         //res.add(y2006);
	 
         //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.68, ticker);
         //res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
         //res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForGlobalDiversifiedGradeIncomeTrustII(){
         String ticker = "GII.UN";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.20, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.20, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.21, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.62, ticker);
         res.add(y2011);
	 
         //CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.26, ticker);
         //res.add(y2010);
	 
         //CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.34, ticker);
         //res.add(y2009);
	 
         //CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.70, ticker);
         //res.add(y2008);
	 
         //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.80, ticker);
         //res.add(y2007);
	 
         //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.48, ticker);
         //res.add(y2006);
	 
         //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.68, ticker);
         //res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
         //res.add(y2004);

         return res;
    }

	
	 private static List<CompanyAnnualData> getTestDataForSouthernCo(){
         String ticker = "SO";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.34, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.87, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.67, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.55, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.36, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.06, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.25, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.28, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.10, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.13, ticker);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.06	, ticker);
         res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForHomeDepot(){
         String ticker = "HD";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.76, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.47, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.01, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.57	, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.34, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.37, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.79	, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.72	, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.26	, ticker);
         res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.06	, ticker);
         //res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForMonsanto(){
         String ticker = "MON";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.22	, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.60, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.79, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.96, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.01	, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 3.80, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.62, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.79	, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.25	, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.47	, ticker);
         res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.06	, ticker);
         //res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForPG(){
         String ticker = "PG";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 4.01, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.86, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.66, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.93, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.11, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.26, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.64, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.04, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.64, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.66, ticker);
         res.add(y2005);
	 
         //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.06	, ticker);
         //res.add(y2004);

         return res;
    }
	
	private static List<CompanyAnnualData> getTestDataForHeineken(){
        String ticker = "HEINY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.18, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.19, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.56, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.25, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.28, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.04, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.22, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.83, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.24, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.78, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.55, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAllstate(){
        String ticker = "ALL";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 6.19, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.81, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.68, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.51, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.71, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.58, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -3.07, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 7.77, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 7.84, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.64	, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 4.54	, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForMercuryGeneralCorp(){
        String ticker = "MCY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.23, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.04, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.13, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.49, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.78, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 7.32, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -4.42, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.34, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.92, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 4.63, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.55, ticker);
        //res.add(y2004);

        return res;
   }
   
	private static List<CompanyAnnualData> getTestDataForJnJ(){
        String ticker = "JNJ";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 6.03, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.81, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.86, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.49, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.78, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.40, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 4.57, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.63, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.73, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.46, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.84	, ticker);
        res.add(y2004);

        return res;
   }
	private static List<CompanyAnnualData> getTestDataForMacDonalds(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.09, "MCD");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 5.55, "MCD");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 5.36, "MCD");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 5.27, "MCD");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.58, "MCD");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.11, "MCD");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.76, "MCD");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.98, "MCD");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.83, "MCD");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.04, "MCD");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.79, "MCD");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForPfizer(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.62, "PFE");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.19, "PFE");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.94	, "PFE");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.27, "PFE");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.02, "PFE");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.23, "PFE");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.20, "PFE");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.17	, "PFE");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.66	, "PFE");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.09	, "PFE");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.49, "PFE");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForBombardier(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.25, "BBD.B");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.31	, "BBD.B");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.32	, "BBD.B");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.42, "BBD.B");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.39	, "BBD.B");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.56, "BBD.B");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.16, "BBD.B");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.14		, "BBD.B");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.13	, "BBD.B");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, -0.06, "BBD.B");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, -0.05, "BBD.B");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForEnerplusCorp(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.86, "ERF");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.24		, "ERF");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.80, "ERF");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.61, "ERF");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.71, "ERF");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.53, "ERF");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 5.53, "ERF");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.66, "ERF");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.47, "ERF");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.95, "ERF");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.60, "ERF");
		 res.add(y2004);
		 
		 return res;
	}

	
	 private static List<CompanyAnnualData> getTestDataForUnilever(){
         String ticker = "UL";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.79, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.66, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.54, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.46	, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.46	, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.17, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.73, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.31, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.60, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.24, ticker);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.62, ticker);
         res.add(y2004);
	 
         return res;
    }

    private static List<CompanyAnnualData> getTestDataForADP(){
         String ticker = "ADP";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.14, ticker);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.89, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.82, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.52, ticker);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.40, ticker);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.63, ticker);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.34, ticker);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.04, ticker);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.68, ticker);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.79	, ticker);
         res.add(y2005);
	 
         return res;
    }
    
	private static List<CompanyAnnualData> getTestDataForATnT(){
        String ticker = "T";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.27, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.39, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.25, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.66, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 3.35, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.12, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.16, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.94, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.89, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.42, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.77, ticker);
        res.add(y2004);
	 
        return res;
   }
	private static List<CompanyAnnualData> getTestDataForMattelInc(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.10, "MAT");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.58, "MAT");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.22, "MAT");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.18, "MAT");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.86, "MAT");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.45, "MAT");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.05, "MAT");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.54, "MAT");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.53, "MAT");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.01, "MAT");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.35, "MAT");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForCocaColaInc(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.63, "CCE");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.44, "CCE");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.25, "CCE");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.29, "CCE");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.83, "CCE");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.48, "CCE");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, -9.05, "CCE");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.46, "CCE");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, -2.41, "CCE");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.08, "CCE");
		 res.add(y2005);
		 
//		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.35, "MAT");
//		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForBritishPetroleum(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.97, "BP");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 7.39, "BP");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.63, "BP");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 8.06, "BP");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, -1.19, "BP");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 5.25, "BP");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 6.69, "BP");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 6.47, "BP");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 6.63, "BP");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 6.18, "BP");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 4.25, "BP");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForHarleyDevidson(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.85, "HOG");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.28, "HOG");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.72, "HOG");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.55, "HOG");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.62, "HOG");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.24, "HOG");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.79, "HOG");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.74, "HOG");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.93, "HOG");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.41, "HOG");
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 3.00, "HOG");
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForNovaGold(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.13, "NG");
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.20, "NG");
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.10, "NG");
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.63, "NG");
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, -0.93, "NG");
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.40, "NG");
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.48, "NG");
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, -0.45, "NG");
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, -0.29, "NG");
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, -0.08, "NG");
		 res.add(y2005);
		 
		 return res;
	}
	private static List<CompanyAnnualData> getTestDataForAncheuserBusch(){
        String ticker = "BUD";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.46, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 8.72, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.45, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.63, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.50, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.9, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.93, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 5.23, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.04, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.78, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForProspectCapital(){
        String ticker = "PSEC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.06, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.07, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.67, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.38, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.32, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.11, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.17, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.06, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.83, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.24, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAllianceBernstein(){
        String ticker = "AB";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.86, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.71, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.51, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.90, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.32, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.80, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.79, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.32, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.82, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.02, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForConAgraFoods(){
        String ticker = "CAG";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.70, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.85, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.12, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.88, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.62, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.15, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.90, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.51, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.03, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.23, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker);
        //res.add(y2004);

        return res;
   }

  
   private static List<CompanyAnnualData> getTestDataForAGNC(){
        String ticker = "AGNC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.09, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.28, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.17, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 5.02, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 7.89, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 6.78, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.36, ticker);
        res.add(y2008);
	 
        //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.80, ticker);
        //res.add(y2007);
	 
        //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.48, ticker);
        //res.add(y2006);
	 
        //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.68, ticker);
        //res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForSecondCup(){
        String ticker = "SCU";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -2.56, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.74, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.95, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.34, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.94, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.16, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.96, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.84, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.05, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.05, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForMosaicCapitalCorp(){
        String ticker = "M";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.30, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.30, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.38, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.51, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.07	, ticker);
        res.add(y2010);
	 
        //CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.16, ticker);
        //res.add(y2009);
	 
        //CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.96, ticker);
        //res.add(y2008);
	 
        //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.84, ticker);
        //res.add(y2007);
	 
        //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.05, ticker);
        //res.add(y2006);
	 
        //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.05, ticker);
        //res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForBlackBerryLtd(){
        String ticker = "BB";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -11.18, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -1.23, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.22, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 6.34, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.31, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 3.30, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.26, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.11, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.65, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.36, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker);
        //res.add(y2004);

        return res;
   }

   

   private static List<CompanyAnnualData> getTestDataForValueLine(){
        String ticker = "VALU";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.69, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.67, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.70, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.79, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, -2.32, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.30, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.56, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.47, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.35, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.14, ticker);
        res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.59, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAvivaPlc(){
        String ticker = "AV";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.39, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.29, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.26, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.11, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.99, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.75, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.74, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.97, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.73, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.46, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.11, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForTeslaMotorsInc(){
        String ticker = "TSLA";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -1.64, ticker, (long) 124000000);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.62, ticker, (long) 119000000);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -3.69, ticker, (long) 107000000);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -2.53, ticker, (long) 100000000);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, -3.04, ticker, (long) 51000000);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.70, ticker, (long) 78000000);
        res.add(y2009);
	 
        //CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.74, ticker);
        //res.add(y2008);
	 
        //CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.97, ticker);
        //res.add(y2007);
	 
        //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.73, ticker);
        //res.add(y2006);
	 
        //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.46, ticker);
        //res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.11, ticker);
        //res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForFordMotorCo(){
        String ticker = "F";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.52, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.76, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.42, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 4.94, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.66, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.86, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -6.46, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, -1.38, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, -6.72, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.05, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.73, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForVolkswagenAG(){
        String ticker = "VLKAY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.96, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.26, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 9.28, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 6.62, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 3.04, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.48, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.38, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.07, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.41, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.58, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.35, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForHondaMotorCo(){
        String ticker = "HMC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 318.54, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 203.71, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 117.34, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 295.67, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 147.91, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, 75.50, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 331.12	, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 323.92	, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 323.54	, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 261.00, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForNissanMotorCo(){
        String ticker = "NSANY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 185.64, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 163.40, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 163.34, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 152.62, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 20.79, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, -113.69, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 234.82, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 223.15, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 255.41, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 248.57, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForToyotaMotorCorp(){
        String ticker = "TM";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 1149.84, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 607.56, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 180.40, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 260.32, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 133.58, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, -278.26, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 1082.79, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 1021.39, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 841.19, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 712.37, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForBMW(){
        String ticker = "BAMXF";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 8.88, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 8.10, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 8.47, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 7.45, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.91, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.31, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.49, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.78, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.38, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.33, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 3.30, ticker);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAmayaInc(){
        String ticker = "AYA";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.12, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.33, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.11, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.04, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.01, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.04, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.05, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, -0.24, ticker);
        res.add(y2007);
	 
        //CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.38, ticker);
        //res.add(y2006);
	 
        //CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.33, ticker);
        //res.add(y2005);
	 
        //CompanyAnnualData y2004 = new CompanyAnnualData(2004, 3.30, ticker);
        //res.add(y2004);

        return res;
   }
   

   private static List<CompanyAnnualData> getTestDataForProgressiveCorp(){
        String ticker = "PGR";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.03, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.93, ticker);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.48, ticker);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.59, ticker);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.61, ticker);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.57, ticker);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.10, ticker);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.65, ticker);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.10, ticker);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.75	, ticker);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.91	, ticker);
        res.add(y2004);

        return res;
   }
	

	 private static List<CompanyAnnualData> getTestDataForTransAlta(){
        String ticker = "TAC";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.27, ticker);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.27, ticker);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.61, ticker);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.31, ticker);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1, ticker);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.9, ticker);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.18, ticker);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.53, ticker);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.22, ticker);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.01, ticker);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.88, ticker);
	     res.add(y2004);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataForAbsoluteEvil(){
		 String ticker = "EVIL";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
	     long initial = 1000000;
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.27, ticker, 11*initial);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.27, ticker, 10*initial);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.61, ticker, 9*initial);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, -1.31, ticker, 8*initial);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, -1, ticker, 7*initial);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.9, ticker, 6*initial);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.18, ticker, 5*initial);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, -1.53, ticker, 4*initial);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, -0.22, ticker, 3*initial);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, -1.01, ticker, 2*initial);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, -0.88, ticker, initial);
	     res.add(y2004);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataForAbsoluteSuperCompany(){
		 String ticker = "SUPERCOOL";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
	     long initial = 1000000;
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1024.00, ticker, 1*initial);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, 512.00, ticker, 2*initial);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, 256.00, ticker, 3*initial);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 128.00, ticker, 4*initial);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 64.00, ticker, 5*initial);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 32.00, ticker, 6*initial);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, 16.00, ticker, 7*initial);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, 8.00, ticker, 8*initial);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.00, ticker, 9*initial);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.00, ticker, 10*initial);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.00, ticker, 11*initial);
	     res.add(y2004);
		 
	     return res;
	 }
}
