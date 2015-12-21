package com.checkAuto.appium.testcases;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.checkAuto.appium.base.TestBase;
import com.checkAuto.appium.screens.nativeapp.WebViewInteractionScreen;
import com.checkAuto.appium.utils.CommonUtils;

public class WebViewScreenValidationTest extends TestBase {
	
	

	
	
	@Test
	public void validateWebViewScreen(){
		
		WebViewInteractionScreen webview = new WebViewInteractionScreen(driver);
		webview.validateWebViewText();
		
	}

}
