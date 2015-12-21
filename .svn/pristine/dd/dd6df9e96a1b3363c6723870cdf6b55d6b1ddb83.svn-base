package com.checkAuto.appium.rough;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import com.checkAuto.appium.screens.nativeapp.SelendroidHomeScreen;
import com.checkAuto.appium.screens.nativeapp.WebViewInteractionScreen;
import com.checkAuto.appium.utils.CommonUtils;

public class SelendroidHomeScreenTest {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws IOException {


		
		CommonUtils.loadConfigProp("selendroidtestapp.properties");
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		
		SelendroidHomeScreen homeScreen = new SelendroidHomeScreen(driver);
		homeScreen.typeData("Hi Appium");
		homeScreen.validateTextView();
		WebViewInteractionScreen webview = homeScreen.startWebView();
		webview.validateWebViewText();
		
	}

}
