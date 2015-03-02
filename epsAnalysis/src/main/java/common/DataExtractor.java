package common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//import epsAnalysis.CompanyAnnualData;
//import epsAnalysis.EpsAnalyzer.DeltaEps;


public class DataExtractor
{
    static Class noparams[] = {};
    
    /*public static List<Double> extractDoubles(List<CompanyAnnualData> data, String methodName){
    	if(data == null || data.size() == 0) return null;
    	
    	List<Double> x = new ArrayList<Double>();
		for (CompanyAnnualData dt : data) {
			x.add(DataExtractor.extractDouble(dt, methodName));
		}
		
    	return x;
    }*/
    
    public static <T> Double extractDouble(T obj, String methodName){
    	if(null == methodName) throw new IllegalArgumentException("methodName cannot be null");
        if(null == obj) throw new IllegalArgumentException("obj cannot be null");
        if("".equals(methodName)) throw new IllegalArgumentException("methodName cannot be empty.");
       
        Class cls = obj.getClass();
        
        try{
        	Method method = cls.getDeclaredMethod(methodName, noparams);
			return (Double) method.invoke(obj, null);
        }
        catch(IllegalAccessException illegalEx){}
        catch(InvocationTargetException excInvoke){}
        catch(NoSuchMethodException e){}
        
        
        return Double.NaN;
    }
    
    public static <T> List<Double> extractDoubles(List<T> data, String methodName){
    	if(null == methodName) throw new IllegalArgumentException("methodName cannot be null");
        if(null == data) throw new IllegalArgumentException("data cannot be null");
        if("".equals(methodName)) throw new IllegalArgumentException("methodName cannot be empty.");
       
        List<Double> result = new ArrayList<Double>();
        
		for (T dt : data) {
			result.add(DataExtractor.extractDouble(dt, methodName));
		}
		
		return result;
    }
}
