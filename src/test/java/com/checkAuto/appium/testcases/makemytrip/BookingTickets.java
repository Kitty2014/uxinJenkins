//package com.checkAuto.appium.testcases.makemytrip;
//
//import java.util.Hashtable;
//import java.util.Map;
//
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.checkAuto.appium.base.TestBase;
//import com.checkAuto.appium.screens.nativeapp.makemytrip.BookingFlights;
//import com.checkAuto.appium.utils.TestUtils;
//
//
//
//public class BookingTickets extends TestBase {
//	
//	
//	@BeforeTest
//	public void init(){
//		
//		mmt = new BookingFlights(driver);//创建对象后传递driver
//
//	}
//	
//	@Test(priority=1)
//	public void getService(){
//		
//		mmt.getServices();
//		
//	}
//	
////	@Test(priority=2)
//	@Test(dataProvider="getData",priority=2)
//	public void searchFlights(Map<String, Object> h) throws InterruptedException{
//		
//		mmt.gotoFlights();
//		mmt.selectFromCity(h.get("fromCity").toString());
//		System.out.println("Reading from Excel :" + h.get("fromCity").toString() );
//		
//		mmt.selectToCity(h.get("toCity").toString());
//		System.out.println("Reading from Excel :" + h.get("toCity").toString());
//		
//		
//		mmt.selectMonth(h.get("month").toString());
//		
//		System.out.println("Reading from Excel :" + h.get("month").toString() );
//		
//		mmt.selectFromDate(h.get("FromDate").toString());
//		
//		System.out.println("Reading from Excel :" + h.get("FromDate").toString() );
//		
//		mmt.selectFromDate(h.get("ToDate").toString());
//		
//		System.out.println("Reading from Excel :" + h.get("ToDate").toString() );
//		
//		Thread.sleep(10000);
//		
//	}
//	
//	
//	@DataProvider
////	public void getData(){
//
//	public static Object[][] getData(){
//		
//		return TestUtils.getData("BookingTickets");
//	}
//
//		
//	}
//	
//
