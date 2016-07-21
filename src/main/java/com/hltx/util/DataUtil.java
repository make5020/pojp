package com.hltx.util;

import java.math.BigDecimal;

public class DataUtil {

	public static BigDecimal getBigDecimal(Object o) {
		try{
		if (o == null)
			return new BigDecimal(0);
		if (o instanceof BigDecimal) {
			return (BigDecimal) o;
		}else if(o instanceof Integer){ 
			return new BigDecimal((Integer)o);
		}else if(o instanceof Double){ 
			return new BigDecimal((Double)o);
		}else if(o instanceof Long){ 
			return new BigDecimal((Long)o);
		}else if(o instanceof String){ 
			return new BigDecimal((String)o);
		}else {
			return new BigDecimal(0);
		}
		}catch(Exception e){
			return new BigDecimal(0);
		}
	}

	
	
}
