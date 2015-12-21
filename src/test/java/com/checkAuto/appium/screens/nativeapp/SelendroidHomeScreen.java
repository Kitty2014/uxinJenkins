package com.checkAuto.appium.screens.nativeapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.checkAuto.appium.base.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelendroidHomeScreen extends ScreenBase{
	
	
	
	public SelendroidHomeScreen(AndroidDriver driver){
		
		super(driver);
	}
	
	

	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement textField;
	@AndroidFindBy(id="io.selendroid.testapp:id/visibleButtonTest")
	public WebElement displayBtn;
	@AndroidFindBy(id="io.selendroid.testapp:id/visibleTextView")
	public WebElement visibleText;
	@AndroidFindBy(id="io.selendroid.testapp:id/buttonStartWebview")
	public WebElement startWebView;
	
	
	public SelendroidHomeScreen typeData(String data){
		
		textField.sendKeys(data);
		
		return this;
		
	}
	
	public SelendroidHomeScreen validateTextView(){
		
		displayBtn.click();
		System.out.println(visibleText.getText());
		Assert.assertEquals(visibleText.getText(), "Text is sometimes displayed");
		
		
		return this;
	}
	
	
	public WebViewInteractionScreen startWebView(){
		
		startWebView.click();
		
		return new WebViewInteractionScreen(driver);
	}
	

}
