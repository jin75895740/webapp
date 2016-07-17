package com.poly.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
*@author 作者 fantasyBaby
*@version 创建时间:2016年5月9日下午5:41:56
*类说明
*/
public class DateUtil {

		//将timestamp时间格式转化为字符串
	
	public static String parseString(Timestamp s){
		 String str = "";
		 DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 str = sdf.format(s);
		 return str;
	}
}
