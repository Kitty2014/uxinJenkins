package com.checkAuto.appium.base;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.checkAuto.appium.screens.nativeapp.SelendroidHomeScreen;
import com.checkAuto.appium.screens.nativeapp.WebViewInteractionScreen;
import com.checkAuto.appium.screens.nativeapp.makemytrip.BookingFlights;
import com.checkAuto.appium.screens.nativeapp.makemytrip.Generate_orders;
import com.checkAuto.appium.screens.nativeapp.makemytrip.checkAuto_9_9_UiSelector;
import com.checkAuto.appium.utils.AppiumServer;
import com.checkAuto.appium.utils.CommonUtils;
import com.checkAuto.appium.utils.ExcelReader;

public class TestBase {
	

	public static AndroidDriver driver;
	public SelendroidHomeScreen homeScreen;
	public WebViewInteractionScreen webview;
	
	public checkAuto_9_9_UiSelector checkAuto;
	
	public BookingFlights mmt;
	
	public Generate_orders orders;
	
	public static ExcelReader excel =new ExcelReader(System.getProperty("user.dir") + "/src/test/resources/properties/testdata.xlsx");
	
	
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException{
		
		if(driver==null){
	
//		AppiumServer.stop();
		AppiumServer.start();
		CommonUtils.loadConfigProp("checkAuto_Android.properties");
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws IOException{
		
		driver.quit();
		AppiumServer.stop();
		
	}

}
