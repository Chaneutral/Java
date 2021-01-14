package io4;

import java.io.FileInputStream;
import java.util.Properties;

public class PorpEx {

	//bad code
	public static void main(String[] args)throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\zzz\\job.properties.txt"));
		System.out.println(prop);
		
		String str = prop.getProperty("/menu");
			
		System.out.println(str);
		
		
	}
	
}
