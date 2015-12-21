package com.checkAuto.appium.testcases;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.checkAuto.appium.base.TestBase;
import com.checkAuto.appium.screens.nativeapp.SelendroidHomeScreen;
import com.checkAuto.appium.screens.nativeapp.WebViewInteractionScreen;
import com.checkAuto.appium.utils.CommonUtils;

public class SelendroidHomeScreenValidationTest extends TestBase{

	
	
	
	@Test
	public void validateHomeScreenTest(){
		
		homeScreen = new SelendroidHomeScreen(driver);
		homeScreen.typeData("Hi Appium");
		homeScreen.validateTextView();
		homeScreen.startWebView();
	
		
	}



}
