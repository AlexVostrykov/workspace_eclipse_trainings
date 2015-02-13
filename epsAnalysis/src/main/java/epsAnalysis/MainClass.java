package epsAnalysis;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
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
	
	//TODO: investigate what happens with Bombardier - somehow sigma went to perfect range.
	
	public static void main(String[] args) {
		System.out.println("Hello!");
		
		EpsAnalyzer analyzer = new EpsAnalyzer();
		analyzer.analyze(getTestDataForMattelInc());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForBritishPetroleum());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForCocaColaInc());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForHarleyDevidson());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForNovaGold());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForMacDonalds());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForPfizer());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForBombardier());
		
		System.out.println("Analysis is done!");
		
		analyzer.analyze(getTestDataForEnerplusCorp());
		
		System.out.println("Analysis is done!");
	}
}
