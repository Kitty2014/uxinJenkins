package com.checkAuto.appium.rough;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.checkAuto.appium.utils.AppiumServer;
import com.checkAuto.appium.utils.CommonUtils;

import io.appium.java_client.android.AndroidDriver;

public class MakeMyTrip {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		AppiumServer.stop();
//		AppiumServer.start();
		
		CommonUtils.loadConfigProp("makemytrip.properties");
		CommonUtils.setCapabilities();
		
		driver = CommonUtils.getDriver();
		//Go to the Menu List -1 左侧菜单栏列表
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.makemytrip:id/home_side_menu"))).click();
		
		//get all the services -2
		WebElement services = driver.findElement(By.id("com.makemytrip:id/slide_view_root_layout"));
		
		List<WebElement> items = services.findElements(By.id("com.makemytrip:id/menu_txv"));
		
		for(WebElement service : items){
			System.out.println(service.getText());
			
		}
		//click on Flights - 3
		items.get(0).click();
		
		
		driver.findElement(By.id("com.makemytrip:id/twowaybutton")).click();
		
		//Twoway and select fromcity -4
		driver.findElement(By.id("com.makemytrip:id/from_code")).click();
		driver.hideKeyboard();
		
		WebElement list =driver.findElement(By.id("com.makemytrip:id/toFroListCity"));
		
		list.findElements(By.id("com.makemytrip:id/cityName"));
		
		List<WebElement> city = list.findElements(By.id("com.makemytrip:id/cityName"));//循环变量是固定的
		
		for(int i=0; i<city.size(); i++){
			//如果是以startsWith 后的关键字 就直接点击
			if(city.get(i).getText().startsWith("Dubai")){
				
				city.get(i).click();
				break;
			}
		}
		//select Tocity -5
		driver.findElement(By.id("com.makemytrip:id/to_code")).click();
		driver.hideKeyboard();
        list =driver.findElement(By.id("com.makemytrip:id/toFroListCity"));//List使用相同的WebElement 变量 不需要数据类型
		 
		city = list.findElements(By.id("com.makemytrip:id/cityName"));
		
		for(int i=0; i<city.size(); i++){
			
			if(city.get(i).getText().startsWith("Goa")){
				
				city.get(i).click();
				break;
			}
		}
		//select Departure Month -6
		driver.findElement(By.id("com.makemytrip:id/from_day")).click();
		
		int i =1;
		while(!driver.findElement(By.id("com.makemytrip:id/title")).getText().contains("Dec")){
			
			driver.findElement(By.id("com.makemytrip:id/calViewNextMonth")).click();
			
			if(driver.findElement(By.id("com.makemytrip:id/title")).getText().contains("Dec")){
				System.out.println("Month choosed");
				break;
				
			}
			i++;
		}
		
		//Select FromDate -7
		List<WebElement> date = driver.findElements(By.id("com.makemytrip:id/date"));
		
		for(int x=0; x<date.size(); x++ ){
			
			if(date.get(x).getText().equals("15")){
				date.get(x).click();
				break;
			}
		}
		//Select ToDate -8
		date = driver.findElements(By.id("com.makemytrip:id/date"));
		
		for(int x=0; x<date.size(); x++ ){
			//选择性点击
			if(date.get(x).getText().equals("20")){
				date.get(x).click();
				break;
			}
		}
		int adult_counter = Integer.parseInt(driver.findElement(By.id("com.makemytrip:id/adults_counter_value")).getText());
		
		System.out.println(adult_counter);
		//not adult
		for(int a=2; a<adult_counter+3;a++){
			driver.findElement(By.id("com.makemytrip:id/adults_plus_counts")).click();
		}
		//not child
		for(int a=1; a<adult_counter+2;a++){
			driver.findElement(By.id("com.makemytrip:id/child_plus_counts")).click();
		}
		
		//not infants
		for(int a=1; a<adult_counter+1;a++){
			driver.findElement(By.id("com.makemytrip:id/infants_plus_counts")).click();
		}
		
		
		driver.findElement(By.id("android:id/text1")).click();
		
		WebElement dialog = driver.findElement(By.id("android:id/select_dialog_listview"));//class 类里面的resource-id索引
		
		dialog.findElements(By.id("android:id/text1")).get(1).click();
		
		driver.findElement(By.id("com.makemytrip:id/search_flights")).click();
		
		
		
	}

}
