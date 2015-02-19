package common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import epsAnalysis.CompanyAnnualData;


public class DataExtractor
{
    static Class noparams[] = {};
    
    public static Double extractDouble(CompanyAnnualData data, String methodName){
        if(null == methodName) throw new IllegalArgumentException("methodName cannot be null");
        if(null == data) throw new IllegalArgumentException("data cannot be null");
        if("".equals(methodName)) throw new IllegalArgumentException("methodName cannot be empty.");
       
        Class cls = data.getClass();
        
        try{
        	Method method = cls.getDeclaredMethod(methodName, noparams);
			return (Double) method.invoke(data, null);
        }
        catch(IllegalAccessException illegalEx){}
        catch(InvocationTargetException excInvoke){}
        catch(NoSuchMethodException e){}
        
        
        return Double.NaN;
    }
    
    public static List<Double> extractDoubles(List<CompanyAnnualData> data, String methodName){
    	if(data == null || data.size() == 0) return null;
    	
    	List<Double> x = new ArrayList<Double>();
		for (CompanyAnnualData dt : data) {
			x.add(DataExtractor.extractDouble(dt, methodName));
		}
		
    	return x;
    }
}
