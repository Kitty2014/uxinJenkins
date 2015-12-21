package com.checkAuto.appium.screens.nativeapp.makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import com.checkAuto.appium.base.Constants;
import com.checkAuto.appium.base.ScreenBase;

public class BookingFlights extends ScreenBase {

	@AndroidFindBy(id = Constants.HOME_SIDE_MENU)
	public WebElement home_side_menu;//菜单栏

	@AndroidFindBys({ @AndroidFindBy(id = Constants.LAYOUT),
			@AndroidFindBy(id = Constants.MENU_ITEMS) })//嵌套子元素 @AndroidFindBys
	public List<WebElement> menuItems;//复子元素

	@AndroidFindBy(id = Constants.TWO_WAY_BUTTON)
	public WebElement twoWayButton;

	@AndroidFindBy(id = Constants.FROM_CITY)
	public WebElement fromCalendar;

	@AndroidFindBys({ @AndroidFindBy(id = Constants.TO_FOR_CITY_LIST),
			@AndroidFindBy(id = Constants.CITY_NAME) })
	public List<WebElement> cityName;
	
	
	@AndroidFindBy(id = Constants.TO_CITY)
	public WebElement toCalendar;
	
	
	
	
	@AndroidFindBy(id = Constants.FROM_DAY)
	public WebElement fromDay;
	
	@AndroidFindBy(id = Constants.CAL_TITLE)
	public WebElement calTitle;
	
	@AndroidFindBy(id = Constants.NEXT_MONTH)
	public WebElement nextMonth;
	
	
//	@AndroidFindBys({ @AndroidFindBy(id = Constants.SELECT_FROMDATE),
//		@AndroidFindBy(id = Constants.MENU_ITEMS) })//嵌套子元素 @AndroidFindBys
	@AndroidFindBy(id = Constants.SELECT_FROMDATE)
    public List<WebElement> fromDate ;//复子元素
	
	
//	@AndroidFindBys({ @AndroidFindBy(id = Constants.SELECT_TO_DATE),
//		@AndroidFindBy(id = Constants.MENU_ITEMS) })//嵌套子元素 @AndroidFindBys
	@AndroidFindBy(id = Constants.SELECT_TO_DATE)
    public List<WebElement> toDate ;//复子元素
	
	
	
//构造函数
	public BookingFlights(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void getServices() {

		waitforElement(10, Constants.HOME_SIDE_MENU);//显示等待 ScreenBase类 参数化后只能是常量

		home_side_menu.click();

		// get all the services -2
		/*
		 * WebElement services =
		 * driver.findElement(By.id("com.makemytrip:id/slide_view_root_layout"
		 * ));
		 * 
		 * List<WebElement> items =
		 * services.findElements(By.id("com.makemytrip:id/menu_txv"));
		 */

		for (WebElement service : menuItems) {
			System.out.println(service.getText());

		}
	}

	public void gotoFlights() {
		menuItems.get(0).click();//点击左侧菜单栏

	}
//pass it from runtime
	public void selectFromCity(String fromCity) {
		twoWayButton.click();
		fromCalendar.click();
//		hidekeyboard();
		driver.hideKeyboard();
		

		for (int i = 0; i < cityName.size(); i++) {

			if (cityName.get(i).getText().startsWith(fromCity)) {

				cityName.get(i).click();
				break;
			}
		}

	}

	public void selectToCity(String toCity) {
		toCalendar.click();
//		hidekeyboard();
		driver.hideKeyboard();
		

		for (int i = 0; i < cityName.size(); i++) {

			if (cityName.get(i).getText().startsWith(toCity)) {

				cityName.get(i).click();
				break;
			}
		}

	}
	
	public void  selectMonth(String month) {
		
		fromDay.click();
		
        while(!calTitle.getText().contains(month)){
			
			nextMonth.click();
			
			if(calTitle.getText().contains(month)){
				System.out.println("Month choosed");
				break;
				
			}
		
		}
        
		
	}
	
//	int adult_counter = Integer.parseInt(driver.findElement(By.id("com.makemytrip:id/adults_counter_value")).getText());
	public void selectFromDate(String FromDate) {
      List<WebElement> date = fromDate;
//      int adult_counter = Integer.parseInt(driver.findElement(By.id("com.makemytrip:id/adults_counter_value")).getText());
		for(int x=0; x<date.size(); x++ ){
			
			if(date.get(x).getText().equals(FromDate)){
				date.get(x).click();
				break;
			}
		
	}
	}
	
	public void selectToDate(String ToDate) {
	      List<WebElement> date = toDate;
			
			for(int x=0; x<date.size(); x++ ){
				
				if(date.get(x).getText().equals(ToDate)){
					date.get(x).click();
					break;
				}
			
		}
		}

}
