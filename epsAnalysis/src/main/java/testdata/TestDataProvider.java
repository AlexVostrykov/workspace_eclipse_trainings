package testdata;

import java.util.ArrayList;
import java.util.List;

import epsAnalysis.CompanyAnnualData;

public class TestDataProvider {
	
	public static final Long MILLION = 1000000L;
	
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
		if("CCE".equals(ticker)) return getTestDataForCocaColaInc();
		if("BP".equals(ticker)) return getTestDataForBritishPetroleum();
		if("MAT".equals(ticker)) return getTestDataForMattelInc();
   	 	
   	 	if("HOG".equals(ticker)) return getTestDataForHarleyDevidson();
   	 	
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
	 //										
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.48, ticker, MILLION*537);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.43, ticker, MILLION*560);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.69, ticker, MILLION*607);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.84, ticker, MILLION*634);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.36, ticker, MILLION*669);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.21, ticker, MILLION*701);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.24, ticker, MILLION*738);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.11, ticker, MILLION*773);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.19, ticker, MILLION*769);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.98, ticker, MILLION*777);
         res.add(y2005);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForVectorGroup(){
         String ticker = "VGR";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.89, ticker, MILLION*101);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.39, ticker, MILLION*96);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.32, ticker, MILLION*93);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.80, ticker, MILLION*91);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.58, ticker, MILLION*91);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.27, ticker, MILLION*89);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.60, ticker, MILLION*95);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.80, ticker, MILLION*86);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.48, ticker, MILLION*82);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.68, ticker, MILLION*72);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.10, ticker, MILLION*70);
         res.add(y2004);

         return res;
    }
    private static List<CompanyAnnualData> getTestDataForGM(){
        String ticker = "GM";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();				
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.65, ticker, MILLION*1687);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.38, ticker, MILLION*1676);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.92, ticker, MILLION*1675);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 4.58, ticker, MILLION*1668);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.89, ticker, MILLION*1624);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 113.18, ticker, MILLION*925);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -53.47, ticker, MILLION*579);
        res.add(y2008);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForRealGoodSolarInc(){
        String ticker = "RGSE";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();			
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -1.00, ticker, MILLION*43);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.38, ticker, MILLION*29);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -1.77, ticker, MILLION*27);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.08, ticker, MILLION*24);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.07, ticker, MILLION*18);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.09, ticker, MILLION*18);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.86, ticker, MILLION*15);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.01, ticker, MILLION*10);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.03, ticker, MILLION*10);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.02, ticker, MILLION*10);
        res.add(y2005);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForTotalSA(){
        String ticker = "TOT";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 // 										
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.51, ticker, MILLION*2279);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 5.14, ticker, MILLION*2272);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 6.24, ticker, MILLION*2267);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 7.05, ticker, MILLION*2257);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 6.26, ticker, MILLION*2244);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 5.42, ticker, MILLION*2237);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 6.56, ticker, MILLION*2247);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 8.48, ticker, MILLION*2274);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 6.71, ticker, MILLION*2312);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 6.13, ticker, MILLION*2362);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 5.30, ticker, MILLION*2427);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForGeneralElectricCo(){
        String ticker = "GE";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 // 										
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.31, ticker, MILLION*10134);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.27, ticker, MILLION*10289);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.29, ticker, MILLION*10564);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.23, ticker, MILLION*10620);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.06, ticker, MILLION*10678);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.01, ticker, MILLION*10615);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.72, ticker, MILLION*10098);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.17, ticker, MILLION*10218);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.00, ticker, MILLION*10394);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.54, ticker, MILLION*10611);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.59, ticker, MILLION*10445);
        res.add(y2004);

        return res;
   }

    private static List<CompanyAnnualData> getTestDataForLightstreamResources(){
         String ticker = "LTS";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();						
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, -6.51, ticker, MILLION*200);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, -7.07, ticker, MILLION*196);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.76, ticker, MILLION*115);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.11, ticker, MILLION*189);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.26, ticker, MILLION*185);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.34, ticker, MILLION*126);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.70, ticker, MILLION*110);
         res.add(y2008);
         return res;
    }

    private static List<CompanyAnnualData> getTestDataForGlobalDiversifiedGradeIncomeTrustII(){
         String ticker = "GII.UN";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.20, ticker, MILLION*10);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.20, ticker, MILLION*10);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.21, ticker, MILLION*10);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.62, ticker, MILLION*10);
         res.add(y2011);
         
         return res;
    }

	 private static List<CompanyAnnualData> getTestDataForSouthernCo(){
         String ticker = "SO";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();									
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.34, ticker, MILLION * 895);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.87, ticker, MILLION * 881);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.67, ticker, MILLION * 879);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.55, ticker, MILLION * 864);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.36, ticker, MILLION * 837);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.06, ticker, MILLION * 796);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.25, ticker, MILLION*775);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.28, ticker, MILLION*761);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.10, ticker, MILLION*748);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.13, ticker, MILLION*749);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.06	, ticker, MILLION*743);
         res.add(y2004);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForHomeDepot(){
         String ticker = "HD";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
         // 									
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.76, ticker, MILLION * 1434);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3, ticker, MILLION * 1511);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.47, ticker, MILLION * 1570);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.01, ticker, MILLION * 1658);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.57	, ticker, MILLION * 1692);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.34, ticker, MILLION * 1686);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.37, ticker, MILLION * 1856);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.79	, ticker, MILLION * 2062);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.72	, ticker, MILLION * 2147);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.26	, ticker, MILLION * 2216);
         res.add(y2005);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForMonsanto(){
         String ticker = "MON";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 // 									
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.22	, ticker, MILLION*525);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.60, ticker, MILLION*540);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.79, ticker, MILLION*540);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.96, ticker, MILLION*542);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.01	, ticker, MILLION*551);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 3.80, ticker, MILLION*555);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.62, ticker, MILLION*559);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.79	, ticker, MILLION*555);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.25	, ticker, MILLION*551);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.47	, ticker, MILLION*543);
         res.add(y2005);

         return res;
    }

    private static List<CompanyAnnualData> getTestDataForPG(){
         String ticker = "PG";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
         //					
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 4.01, ticker, MILLION*2905);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.86, ticker, MILLION*2931);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.66, ticker, MILLION*2941);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.93, ticker, MILLION*3002);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.11, ticker, MILLION*3099);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.26, ticker, MILLION*3154);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.64, ticker, MILLION*3317);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.04, ticker, MILLION*3399);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.64, ticker, MILLION*3286);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.66, ticker, MILLION*2726);
         res.add(y2005);
         
         return res;
    }
	
	private static List<CompanyAnnualData> getTestDataForHeineken(){
        String ticker = "HEINY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.18, ticker, MILLION*1152);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.19, ticker, MILLION*1152);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.56, ticker, MILLION*1152);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.25, ticker, MILLION*576);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.28, ticker, MILLION*1127);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.04, ticker, MILLION*980);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.22, ticker, MILLION*980);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.83, ticker, MILLION*980);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.24, ticker, MILLION*980);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.78, ticker, MILLION*980);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.55, ticker, MILLION*980);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAllstate(){
        String ticker = "ALL";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 // 									
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 6.19, ticker, MILLION*438);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.81, ticker, MILLION*470);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.68, ticker, MILLION*493);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.51, ticker, MILLION*523);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.71, ticker, MILLION*543);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.58, ticker, MILLION*541);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -3.07, ticker, MILLION*546);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 7.77, ticker, MILLION*597);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 7.84, ticker, MILLION*637);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.64	, ticker, MILLION*667);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 4.54	, ticker, MILLION*667);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForMercuryGeneralCorp(){
        String ticker = "MCY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.23, ticker, MILLION*55);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.04, ticker, MILLION*55);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.13, ticker, MILLION*55);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.49, ticker, MILLION*55);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.78, ticker, MILLION*55);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 7.32, ticker, MILLION*55);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -4.42, ticker, MILLION*55);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.34, ticker, MILLION*55);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.92, ticker, MILLION*55);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 4.63, ticker, MILLION*55);
        res.add(y2005);

        return res;
   }
   
	private static List<CompanyAnnualData> getTestDataForJnJ(){
        String ticker = "JNJ";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();								
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 6.03, ticker, MILLION*2871);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 4.81, ticker, MILLION*2877);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.86, ticker, MILLION*2813);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.49, ticker, MILLION*2775);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.78, ticker, MILLION*2789);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.40, ticker, MILLION*2789);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 4.57, ticker, MILLION*2836);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.63, ticker, MILLION*2913);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.73, ticker, MILLION*2963);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.46, ticker, MILLION*3009);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.84	, ticker, MILLION*2996);
        res.add(y2004);

        return res;
   }
	private static List<CompanyAnnualData> getTestDataForMacDonalds(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // 										
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.09, "MCD", MILLION * 993);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 5.55, "MCD", MILLION * 1006);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 5.36, "MCD", MILLION * 1020);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 5.27, "MCD", MILLION * 1045);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.58, "MCD", MILLION * 1080);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 4.11, "MCD", MILLION * 1107);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 3.76, "MCD", MILLION * 1146);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.98, "MCD", MILLION * 1212);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.83, "MCD", MILLION * 1252);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.04, "MCD", MILLION * 1274);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.79, "MCD", MILLION * 1274);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForPfizer(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // 										
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.62, "PFE", MILLION*6464);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.19, "PFE", MILLION*6895);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.94	, "PFE", MILLION*7508);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.27, "PFE", MILLION*7870);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.02, "PFE", MILLION*8074);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.23, "PFE", MILLION*7045);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.20, "PFE", MILLION*6750);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.17	, "PFE", MILLION*6939);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.66	, "PFE", MILLION*7274);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.09	, "PFE", MILLION*7411);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.49, "PFE", MILLION*7614);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForBombardier(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
					
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.74, "BBD.B", MILLION*1742);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.31	, "BBD.B", MILLION*1741);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.32	, "BBD.B", MILLION*1738);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.42, "BBD.B", MILLION*1746);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.39	, "BBD.B", MILLION*1755);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.56, "BBD.B", MILLION*1754);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.16, "BBD.B", MILLION*1806);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.14		, "BBD.B", MILLION*1714);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.13	, "BBD.B", MILLION*1915);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, -0.06, "BBD.B", MILLION*1800);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, -0.05, "BBD.B", MILLION*1800);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForEnerplusCorp(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // 										
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.86, "ERF", MILLION * 207);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.24	, "ERF", MILLION * 201);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.80, "ERF", MILLION * 196);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.61, "ERF", MILLION * 180);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.71, "ERF", MILLION * 178);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.53, "ERF", MILLION * 170);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 5.53, "ERF", MILLION * 161);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.66, "ERF", MILLION *128 );
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.47, "ERF", MILLION * 122);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.95, "ERF", MILLION * 109);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.60, "ERF", MILLION * 109);
		 res.add(y2004);
		 
		 return res;
	}

	
	 private static List<CompanyAnnualData> getTestDataForUnilever(){
         String ticker = "UL";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
         // 							
         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.79, ticker, MILLION * 2883);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.66, ticker);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.54, ticker);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.46	, ticker, MILLION *2908);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.46	, ticker, MILLION *2905);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.17, ticker, MILLION *2890);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.73, ticker, MILLION *2906);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.31, ticker, MILLION *11904);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.60, ticker, MILLION *11890);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.24, ticker, MILLION *3007);
         res.add(y2005);
	 
         CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.62, ticker, MILLION *3038);
         res.add(y2004);
	 
         return res;
    }

    private static List<CompanyAnnualData> getTestDataForADP(){
         String ticker = "ADP";
         List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();

         CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.14, ticker, MILLION*483);
         res.add(y2014);
	 
         CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.89, ticker, MILLION*487);
         res.add(y2013);
	 
         CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.82, ticker, MILLION*492);
         res.add(y2012);
	 
         CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.52, ticker, MILLION*498);
         res.add(y2011);
	 
         CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.40, ticker, MILLION*504);
         res.add(y2010);
	 
         CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.63, ticker, MILLION*506);
         res.add(y2009);
	 
         CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.34, ticker, MILLION*527);
         res.add(y2008);
	 
         CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.04, ticker, MILLION*558);
         res.add(y2007);
	 
         CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.68, ticker, MILLION*580);
         res.add(y2006);
	 
         CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.79	, ticker, MILLION*590);
         res.add(y2005);
	 
         return res;
    }
    
	private static List<CompanyAnnualData> getTestDataForATnT(){
        String ticker = "T";
        // 										
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.27, ticker, MILLION * 5221);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.39, ticker, MILLION * 5385);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.25, ticker, MILLION * 5821);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.66, ticker, MILLION * 5950);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 3.35, ticker, MILLION * 5938);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.12, ticker, MILLION * 5924);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.16, ticker, MILLION * 5958);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.94, ticker, MILLION * 6170);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.89, ticker, MILLION * 3892);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.42, ticker, MILLION * 3370);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.77, ticker, MILLION * 3370);
        res.add(y2004);
	 
        return res;
   }
	private static List<CompanyAnnualData> getTestDataForMattelInc(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.10, "MAT", MILLION * 342);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.58, "MAT", MILLION * 347);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.22, "MAT", MILLION * 346);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.18, "MAT", MILLION * 348);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.86, "MAT", MILLION * 365);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.45, "MAT", MILLION * 362);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.05, "MAT", MILLION * 363);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.54, "MAT", MILLION * 391);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.53, "MAT", MILLION * 386);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.01, "MAT", MILLION * 411);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.35, "MAT", MILLION * 423);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForCocaColaInc(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // shares 										
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.63, "CCE", MILLION * 252);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.44, "CCE", MILLION * 273);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.25, "CCE", MILLION * 301);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.29, "CCE", MILLION * 327);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.83, "CCE", MILLION * 340);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.48, "CCE", MILLION * 493);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, -9.05, "CCE", MILLION * 485);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.46, "CCE", MILLION * 488);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, -2.41, "CCE", MILLION * 475);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.08, "CCE", MILLION * 476);
		 res.add(y2005);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForBritishPetroleum(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.97, "BP", MILLION * 3102);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 7.39, "BP", MILLION * 3174);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 3.63, "BP", MILLION * 3193);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 8.06, "BP", MILLION * 3189);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, -1.19, "BP", MILLION * 3166);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, 5.25, "BP", MILLION * 3156);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 6.69, "BP", MILLION * 3160);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 6.47, "BP", MILLION * 3222);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 6.63, "BP", MILLION * 3366);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 6.18, "BP", MILLION * 3521);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 4.25, "BP", MILLION * 3637);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForHarleyDevidson(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // 									
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, 3.85, "HOG", MILLION * 218);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.28, "HOG", MILLION * 224);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.72, "HOG", MILLION * 229);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, 2.55, "HOG", MILLION * 235);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.62, "HOG", MILLION * 235);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.24, "HOG", MILLION * 234);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.79, "HOG", MILLION * 234);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, 3.74, "HOG", MILLION * 250);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.93, "HOG", MILLION * 265);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.41, "HOG", MILLION * 281);
		 res.add(y2005);
		 
		 CompanyAnnualData y2004 = new CompanyAnnualData(2004, 3.00, "HOG", MILLION * 281);
		 res.add(y2004);
		 
		 return res;
	}
	
	private static List<CompanyAnnualData> getTestDataForNovaGold(){
		 List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // 										
		 CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.13, "NG", MILLION * 317);
		 res.add(y2014);
		 
		 CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.20, "NG", MILLION * 313);
		 res.add(y2013);
		 
		 CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.10, "NG", MILLION * 304);
		 res.add(y2012);
		 
		 CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.63, "NG", MILLION * 236);
		 res.add(y2011);
		 
		 CompanyAnnualData y2010 = new CompanyAnnualData(2010, -0.93, "NG", MILLION * 214);
		 res.add(y2010);
		 
		 CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.40, "NG", MILLION * 173);
		 res.add(y2009);
		 
		 CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.48, "NG", MILLION * 106);
		 res.add(y2008);
		 
		 CompanyAnnualData y2007 = new CompanyAnnualData(2007, -0.45, "NG", MILLION * 100);
		 res.add(y2007);
		 
		 CompanyAnnualData y2006 = new CompanyAnnualData(2006, -0.29, "NG", MILLION * 92);
		 res.add(y2006);
		 
		 CompanyAnnualData y2005 = new CompanyAnnualData(2005, -0.08, "NG", MILLION * 67);
		 res.add(y2005);
		 
		 return res;
	}
	private static List<CompanyAnnualData> getTestDataForAncheuserBusch(){
        String ticker = "BUD";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
							
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 5.46, ticker);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 8.72, ticker, MILLION*1650);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.45, ticker, MILLION*1628);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.63, ticker, MILLION*1614);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 2.50, ticker, MILLION*1611);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.9, ticker, MILLION*1593);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.93, ticker, MILLION*1000);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 5.23, ticker, MILLION*613);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.04, ticker, MILLION*613);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.78, ticker, MILLION*603);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 2.02	, ticker, MILLION*483);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForProspectCapital(){
        String ticker = "PSEC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();								
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.06, ticker, MILLION * 300);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.07, ticker, MILLION * 207);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.67, ticker, MILLION * 114);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.38, ticker, MILLION * 86);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.32, ticker, MILLION * 59);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.11, ticker, MILLION * 32);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.17, ticker, MILLION * 24);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.06, ticker, MILLION * 16);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.83, ticker, MILLION * 7);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.24, ticker, MILLION *7 );
        res.add(y2005);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAllianceBernstein(){
        String ticker = "AB";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 // 					
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.86, ticker, MILLION*98);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.71, ticker, MILLION*97);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.51, ticker, MILLION*101);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.90, ticker, MILLION*103);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.32, ticker, MILLION*103);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.80, ticker, MILLION*93);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.79, ticker, MILLION*88);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.32, ticker, MILLION*87);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 3.82, ticker, MILLION*85);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.02, ticker, MILLION*82);
        res.add(y2005);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForConAgraFoods(){
        String ticker = "CAG";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.70, ticker, MILLION*428);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.85, ticker, MILLION*418);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.12, ticker, MILLION*418);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.88, ticker, MILLION*434);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.62, ticker, MILLION*444);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.15, ticker, MILLION*455);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.90, ticker, MILLION*490);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.51, ticker, MILLION*507);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.03, ticker, MILLION*520);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.23, ticker, MILLION*520);
        res.add(y2005);

        return res;
   }

  
   private static List<CompanyAnnualData> getTestDataForAGNC(){
        String ticker = "AGNC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();					
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.09, ticker, MILLION*358);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 3.28, ticker, MILLION*379);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 4.17, ticker, MILLION*304);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 5.02, ticker, MILLION*153);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 7.89, ticker, MILLION*36);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 6.78, ticker, MILLION*18);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.36, ticker, MILLION*15);
        res.add(y2008);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForSecondCup(){
        String ticker = "SCU";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -2.56, ticker, MILLION*10);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.74, ticker, MILLION*10);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.95, ticker, MILLION*10);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.34, ticker, MILLION*10);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.94, ticker, MILLION*10);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.16, ticker, MILLION*10);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.96, ticker, MILLION*10);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.84, ticker, MILLION*10);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.05, ticker, MILLION*10);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.05, ticker, MILLION*10);
        res.add(y2005);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForMosaicCapitalCorp(){
        String ticker = "M";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.30, ticker, MILLION*9);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.30, ticker, MILLION*8);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.38, ticker, MILLION*9);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.51, ticker, MILLION*7);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.07	, ticker, MILLION*5);
        res.add(y2010);
        return res;
   }

   private static List<CompanyAnnualData> getTestDataForBlackBerryLtd(){
        String ticker = "BB";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();						
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, -11.18, ticker, MILLION*525);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -1.23, ticker, MILLION*524);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 2.22, ticker, MILLION*524);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 6.34, ticker, MILLION*538);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.31, ticker, MILLION*570);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 3.30, ticker, MILLION*574);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.26, ticker, MILLION*575);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.11, ticker, MILLION*571);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.65, ticker, MILLION*584);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.36, ticker, MILLION*587);
        res.add(y2005);
        
        return res;
   }

   

   private static List<CompanyAnnualData> getTestDataForValueLine(){
        String ticker = "VALU";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.69, ticker, MILLION*10);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 0.67, ticker, MILLION*10);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 0.70, ticker, MILLION*10);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 3.79, ticker, MILLION*10);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, -2.32, ticker, MILLION*10);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 2.30, ticker, MILLION*10);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.56, ticker, MILLION*10);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.47, ticker, MILLION*10);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.35, ticker, MILLION*10);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.14, ticker, MILLION*10);
        res.add(y2005);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAvivaPlc(){
        String ticker = "AV";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();									
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.39, ticker, MILLION*1489);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.29, ticker, MILLION*1490);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.26, ticker, MILLION*1477);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 0.11, ticker, MILLION*1448);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.99, ticker, MILLION*1416);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.75, ticker, MILLION*1365);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.74, ticker, MILLION*1334);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 0.97, ticker, MILLION*1361);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.73, ticker, MILLION*1279);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.46, ticker, MILLION*1212);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.11, ticker, MILLION*1153);
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

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForFordMotorCo(){
        String ticker = "F";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1.52, ticker, MILLION*4045);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.76, ticker, MILLION*4087);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.42, ticker, MILLION*4015);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 4.94, ticker, MILLION*4111);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.66, ticker, MILLION*4178);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.86, ticker, MILLION*2992);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -6.46, ticker, MILLION*2273);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, -1.38, ticker, MILLION*1979);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, -6.72, ticker, MILLION*1879);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.05, ticker, MILLION*1846);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.73, ticker, MILLION*1846);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForVolkswagenAG(){
        String ticker = "VLKAY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.96, ticker, MILLION*2465);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 2.26, ticker, MILLION*2430);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 9.28, ticker, MILLION*1475);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 6.62, ticker, MILLION*2326);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 3.04, ticker, MILLION*2250);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.48, ticker, MILLION*2001);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 2.38, ticker, MILLION*1999);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 2.07, ticker, MILLION*1989);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 1.41, ticker, MILLION*1949);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 0.58, ticker, MILLION*1922);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.35, ticker, MILLION*1919);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForHondaMotorCo(){
        String ticker = "HMC";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 318.54, ticker, MILLION*1802);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 203.71, ticker, MILLION*1802);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 117.34, ticker, MILLION*1802);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 295.67, ticker, MILLION*1806);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 147.91, ticker, MILLION*1815);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, 75.50, ticker, MILLION*1815);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 331.12	, ticker, MILLION*1807);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 323.92	, ticker, MILLION*1829);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 323.54	, ticker, MILLION*1845);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 261.00, ticker, MILLION*1864);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForNissanMotorCo(){
        String ticker = "NSANY";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 185.64, ticker, MILLION*2096);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 163.40, ticker, MILLION*2096);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 163.34, ticker, MILLION*2090);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 152.62, ticker, null);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 20.79, ticker, MILLION*2036);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, -113.69, ticker, null);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 234.82, ticker, MILLION*2048);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 223.15, ticker, MILLION*2056);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 255.41, ticker, MILLION*2260);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 248.57, ticker, MILLION*2260);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForToyotaMotorCorp(){
        String ticker = "TM";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2013 = new CompanyAnnualData(2014, 1149.84, ticker, MILLION*1585);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2013, 607.56, ticker, MILLION*1584);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2012, 180.40, ticker, MILLION*1572);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2011, 260.32, ticker, MILLION*1568);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2010, 133.58, ticker, MILLION*1568);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2009, -278.26, ticker, MILLION*1570);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2008, 1082.79, ticker, MILLION*1589);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2007, 1021.39, ticker, MILLION*1606);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2006, 841.19, ticker, MILLION*1627);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2005, 712.37, ticker, MILLION*1648);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForBMW(){
        String ticker = "BAMXF";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 8.88, ticker, MILLION*602);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 8.10, ticker, MILLION*602);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 8.47, ticker, MILLION*602);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 7.45, ticker, MILLION*602);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 4.91, ticker, MILLION*602);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.31, ticker, MILLION*610);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.49, ticker, MILLION*602);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 4.78, ticker, MILLION*602);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.38, ticker, MILLION*602);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 3.33, ticker, MILLION*620);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 3.30, ticker, MILLION*622);
        res.add(y2004);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForAmayaInc(){
        String ticker = "AYA";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();	
	 
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 0.12, ticker, MILLION*106);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.33, ticker, MILLION*89);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, -0.11, ticker, MILLION*64);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, -0.04, ticker, MILLION*46	);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 0.01, ticker, MILLION*34);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.04, ticker, MILLION*15);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, 0.05, ticker, MILLION*15);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, -0.24, ticker, MILLION*8);
        res.add(y2007);

        return res;
   }

   private static List<CompanyAnnualData> getTestDataForProgressiveCorp(){
        String ticker = "PGR";
        List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
        
        CompanyAnnualData y2014 = new CompanyAnnualData(2014, 2.03, ticker, MILLION*597);
        res.add(y2014);
	 
        CompanyAnnualData y2013 = new CompanyAnnualData(2013, 1.93, ticker, MILLION*604);
        res.add(y2013);
	 
        CompanyAnnualData y2012 = new CompanyAnnualData(2012, 1.48, ticker, MILLION*608);
        res.add(y2012);
	 
        CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.59, ticker, MILLION*637);
        res.add(y2011);
	 
        CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1.61, ticker, MILLION*663);
        res.add(y2010);
	 
        CompanyAnnualData y2009 = new CompanyAnnualData(2009, 1.57, ticker, MILLION*672);
        res.add(y2009);
	 
        CompanyAnnualData y2008 = new CompanyAnnualData(2008, -0.10, ticker, MILLION*674);
        res.add(y2008);
	 
        CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.65, ticker, MILLION*710);
        res.add(y2007);
	 
        CompanyAnnualData y2006 = new CompanyAnnualData(2006, 2.10, ticker, MILLION*784);
        res.add(y2006);
	 
        CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.75	, ticker, MILLION*799);
        res.add(y2005);
	 
        CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.91	, ticker, MILLION*865);
        res.add(y2004);

        return res;
   }
	

	 private static List<CompanyAnnualData> getTestDataForTransAlta(){
        String ticker = "TAC";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 // shares 									
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.27, ticker, MILLION * 273);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.27, ticker, MILLION * 264);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.61, ticker, MILLION * 235);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 1.31, ticker, MILLION * 222);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 1, ticker, MILLION * 219);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 0.9, ticker, MILLION * 201);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, 1.18, ticker, MILLION * 199);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, 1.53, ticker, MILLION * 203);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, 0.22, ticker, MILLION * 201);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, 1.01, ticker, MILLION * 197);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, 0.88, ticker, MILLION * 197);
	     res.add(y2004);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataForAbsoluteEvil(){
		 String ticker = "EVIL";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
		 
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, -0.27, ticker, 11*MILLION);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, -0.27, ticker, 10*MILLION);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, -2.61, ticker, 9*MILLION);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, -1.31, ticker, 8*MILLION);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, -1, ticker, 7*MILLION);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, -0.9, ticker, 6*MILLION);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, -1.18, ticker, 5*MILLION);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, -1.53, ticker, 4*MILLION);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, -0.22, ticker, 3*MILLION);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, -1.01, ticker, 2*MILLION);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, -0.88, ticker, MILLION);
	     res.add(y2004);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataForAbsoluteSuperCompany(){
		 String ticker = "SUPERCOOL";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1024.00, ticker, 1*MILLION);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, 512.00, ticker, 2*MILLION);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, 256.00, ticker, 3*MILLION);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 128.00, ticker, 4*MILLION);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 64.00, ticker, 5*MILLION);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 32.00, ticker, 6*MILLION);
	     res.add(y2009);
		 
	     CompanyAnnualData y2008 = new CompanyAnnualData(2008, 16.00, ticker, 7*MILLION);
	     res.add(y2008);
		 
	     CompanyAnnualData y2007 = new CompanyAnnualData(2007, 8.00, ticker, 8*MILLION);
	     res.add(y2007);
		 
	     CompanyAnnualData y2006 = new CompanyAnnualData(2006, 4.00, ticker, 9*MILLION);
	     res.add(y2006);
		 
	     CompanyAnnualData y2005 = new CompanyAnnualData(2005, 2.00, ticker, 10*MILLION);
	     res.add(y2005);
		 
	     CompanyAnnualData y2004 = new CompanyAnnualData(2004, 1.00, ticker, 11*MILLION);
	     res.add(y2004);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataFor80BuybackTest(){
		 String ticker = "80";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1024.00, ticker, 1*MILLION);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, 512.00, ticker, 2*MILLION);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, 256.00, ticker, 3*MILLION);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 128.00, ticker, 6*MILLION);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 64.00, ticker, 5*MILLION);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 32.00, ticker, 6*MILLION);
	     res.add(y2009);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataFor60BuybackTest(){
		 String ticker = "60";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1024.00, ticker, 5*MILLION);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, 512.00, ticker, 6*MILLION);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, 256.00, ticker, 7*MILLION);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 128.00, ticker, 6*MILLION);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 64.00, ticker, 5*MILLION);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 32.00, ticker, 6*MILLION);
	     res.add(y2009);
		 
	     return res;
	 }
	 
	 public static List<CompanyAnnualData> getTestDataForConstantBuybackTest(){
		 String ticker = "80";
	     List<CompanyAnnualData> res = new ArrayList<CompanyAnnualData>();
	     
	     CompanyAnnualData y2014 = new CompanyAnnualData(2014, 1024.00, ticker, MILLION);
	     res.add(y2014);
		 
	     CompanyAnnualData y2013 = new CompanyAnnualData(2013, 512.00, ticker, MILLION);
	     res.add(y2013);
		 
	     CompanyAnnualData y2012 = new CompanyAnnualData(2012, 256.00, ticker, MILLION);
	     res.add(y2012);
		 
	     CompanyAnnualData y2011 = new CompanyAnnualData(2011, 128.00, ticker, MILLION);
	     res.add(y2011);
		 
	     CompanyAnnualData y2010 = new CompanyAnnualData(2010, 64.00, ticker, MILLION);
	     res.add(y2010);
		 
	     CompanyAnnualData y2009 = new CompanyAnnualData(2009, 32.00, ticker, MILLION);
	     res.add(y2009);
		 
	     return res;
	 }
}
