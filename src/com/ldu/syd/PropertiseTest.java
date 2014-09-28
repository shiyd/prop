package com.ldu.syd;

import java.io.InputStream;
import java.util.Properties;

public class PropertiseTest {
	public static void main(String[] args)
	{
	Properties pr=new Properties();
		try {
			//FileInputStream io=new FileInputStream("D:/pp.properties");
			InputStream io=ClassLoader.getSystemResourceAsStream("pp.properties");
			pr.load(io);
			System.out.println(pr.getProperty("name"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
