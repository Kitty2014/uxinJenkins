package com.checkAuto.appium.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	

	public static Properties prop = new Properties();

	
	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\selendroidtestapp.properties");
		prop.load(fis);
		
		System.out.println(Integer.parseInt(prop.getProperty("explicit.wait")));

		
		
	}

}
