package com.checkAuto.appium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase {
	
	
	public AndroidDriver driver;
	public WebDriverWait wait;
	
	public ScreenBase(AndroidDriver driver){
		
		this.driver = driver;
		loadElements();
	}


	public void loadElements(){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//显示等待
	public void waitforElement(long duration , String locator){
		
		wait = new WebDriverWait(driver,duration);//从运行时里面读取duration 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		
		
	}
	
	public void hidekeyboard(){
		
		driver.hideKeyboard();
	}
}
