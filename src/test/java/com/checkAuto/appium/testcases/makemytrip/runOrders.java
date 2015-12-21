package com.checkAuto.appium.testcases.makemytrip;

import java.util.Hashtable;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.checkAuto.appium.base.TestBase;
import com.checkAuto.appium.screens.nativeapp.makemytrip.BookingFlights;
import com.checkAuto.appium.screens.nativeapp.makemytrip.Generate_orders;
import com.checkAuto.appium.utils.TestUtils;



public class runOrders extends TestBase {
	
	
	@BeforeTest
	public void init(){
		
		orders = new Generate_orders(driver);//创建对象后传递driver

	}
	
	@Test(priority=1,enabled=false)
	public void getBaseInfo() throws InterruptedException{
		
		
		orders.into();
		
		orders.baseInfo();
		
	}
	
	
	@Test(priority=2,enabled=false)
	public void getCertificate_shoot(){
		
		orders.certificate_shoot();
		
	}
	
	
	@Test(priority=3)
	public void getCarShoot() throws InterruptedException{
		
		orders.into();
		orders.credentials_shoot();
//		orders.car_detection();
		
		orders.car_front_start();
		//左前45
		orders.carFront1_5();
		orders.flaw();
		
		orders.carFront2_5();
		
		orders.carFront3_5();
		orders.flaw();
		
		orders.carFront4_5();
		orders.flaw();
		
		orders.carFront5_5();
		
		
		orders.nx();
		//左前座椅
		orders.left_front_body_1_18();
		//左前门内饰
		orders.left_front_body_2_18();
		//仪表
		orders.left_front_body_3_18();
		orders.flaw();
		//左前翼子板
		orders.left_front_body_4_18();
		
		//左前车轮
		orders.left_front_body_5_18();
		
		//左前减震器
		orders.left_front_body_6_18();
		orders.flaw();
		//左前车门
		orders.left_front_body_7_18();
		orders.flaw();
		//左前车门骨架
		orders.left_front_body_8_18();
		orders.flaw();
		//左前车门内饰
		orders.left_front_body_9_18();
		orders.flaw();
		//左A柱下部
		orders.left_front_body_10_18();
		orders.flaw();
		//左A柱上部
		orders.left_front_body_11_18();
		orders.flaw();
		//左B柱
		orders.left_front_body_12_18();
		orders.flaw();
		//左前车门裙边
		orders.left_front_body_13_18();
		orders.flaw();
		//驾驶席区域
		orders.left_front_body_14_18();
		orders.flaw();
		//方向盘
		orders.left_front_body_15_18();
		orders.flaw();
		//仪表板
		orders.left_front_body_16_18();
		orders.flaw();
		//中控
		orders.left_front_body_17_18();
		orders.flaw();
		//变速杆
		orders.left_front_body_18_18();
		orders.nx();
		
		//机电检查
		
		 orders.electromechanicalCheck();
		 orders.nx();
		 
		 System.out.println("----------------左后车身---------------------");
		 orders.left_rear_car_body_1_13();
		 orders.left_rear_car_body_2_13();
		 orders.flaw();
		 
		 orders.left_rear_car_body_3_13();
		 orders.flaw();
		 
		 orders.left_rear_car_body_4_13();
		 
		 orders.flaw();
		 orders.left_rear_car_body_5_13();
		 
		 orders.flaw();
		 
		 orders.left_rear_car_body_6_13();
		 orders.flaw();
		 orders.left_rear_car_body_7_13();
		 orders.flaw();
		 orders.left_rear_car_body_8_13();
		 orders.flaw();
		 orders.left_rear_car_body_9_13();
		 orders.flaw();
		 orders.left_rear_car_body_10_13();
		 orders.flaw();
		 orders.left_rear_car_body_11_13();
		 System.out.println("--------🈚️第二轮left_rear_car_body_12_13---------");
		 orders.left_rear_car_body_12_13();
		 System.out.println("--------🈚️第二轮left_rear_car_body_13_13---------");
		 orders.left_rear_car_body_13_13();
		 
		 orders.nx();
		 
		 System.out.println("---------------后备箱---------------------");
		 System.out.println("后备箱");
		 orders.trunck_1_13();
		 System.out.println("--------🈚️第二轮trunck_2_13---------");
		 
		 orders.trunck_2_13();
		 orders.flaw();
		 
		 orders.trunck_3_13();
		 
		 orders.flaw();
		 
		 orders.trunck_4_13();
		 orders.flaw();
		 orders.trunck_5_13();
		 orders.flaw();
		 orders.trunck_6_13();
		 orders.flaw();
		 orders.trunck_7_13();
		 orders.flaw();
		 orders.trunck_8_13();
		 orders.flaw();
		 orders.trunck_9_13();
		 orders.flaw();
		 orders.trunck_10_13();
		 orders.flaw();
		 orders.trunck_11_13();
		 orders.flaw();
		 orders.trunck_12_13();
		 orders.flaw();
		 orders.trunck_13_13();
		 
		 orders.nx();
		 System.out.println("--------工具检查---------");
		 
		 orders.toolCheck();
	     orders.nx();
		 
	     System.out.println("--------右后车身---------");
		 
	     orders.right_rear_car_body_1_11();
	     orders.flaw();
	     orders.right_rear_car_body_2_11();
	     System.out.println("--------🈚️第二轮right_rear_car_body_3_11---------");
	     orders.right_rear_car_body_3_11();
	     System.out.println("--------🈚️第二轮right_rear_car_body_4_11---------");
	     orders.right_rear_car_body_4_11();
	     orders.flaw();
	     orders.right_rear_car_body_5_11();
	     orders.flaw();
	     orders.right_rear_car_body_6_11();
	     orders.flaw();
	     orders.right_rear_car_body_7_11();
	     orders.flaw();
	     orders.right_rear_car_body_8_11();
	     orders.flaw();
	     orders.right_rear_car_body_9_11();
	     orders.flaw();
	     orders.right_rear_car_body_10_11();
	     orders.flaw();
	     orders.right_rear_car_body_11_11();
	     orders.nx();
	     
	     System.out.println("----------右前车身---------------");
	     
	     orders.right_front_car_body_1_13();
	     orders.flaw();
	     orders.right_front_car_body_2_13();
	     orders.flaw();
	     orders.right_front_car_body_3_13();
	     orders.flaw();
	     orders.right_front_car_body_4_13();
	     orders.flaw();
	     orders.right_front_car_body_5_13();
	     orders.flaw();
	     orders.right_front_car_body_6_13();
	     orders.flaw();
	     orders.right_front_car_body_7_13();
	     orders.flaw();
	     orders.right_front_car_body_8_13();
	     orders.flaw();
	     orders.right_front_car_body_9_13();
	     orders.flaw();
	     orders.right_front_car_body_10_13();
	     System.out.println("--------🈚️第二轮right_front_car_body_11_13---------");
	     orders.right_front_car_body_11_13();
	     System.out.println("--------🈚️第二轮right_front_car_body_12_13---------");
	     orders.right_front_car_body_12_13();
	     orders.flaw();
	     orders.right_front_car_body_13_13();
	     orders.nx();
	     
	     System.out.println("--------------发动机舱---------------------");
	     orders.engine_compartment_1_17();
	     System.out.println("--------🈚️第二轮engine_compartment_2_17---------");
	     orders.engine_compartment_2_17();
	     orders.flaw();
	     orders.engine_compartment_3_17();
	     orders.flaw();
	     orders.engine_compartment_4_17();
	     orders.flaw();
	     orders.engine_compartment_5_17();
	     orders.flaw();
	     orders.engine_compartment_6_17();
	     orders.flaw();
	     orders.engine_compartment_7_17();
	     orders.flaw();
	     orders.engine_compartment_8_17();
	     orders.flaw();
	     orders.engine_compartment_9_17();
	     orders.flaw();
	     orders.engine_compartment_10_17();
	     orders.flaw();
	     orders.engine_compartment_11_17();
	     orders.flaw();
	     orders.engine_compartment_12_17();
	     orders.flaw();
	     orders.engine_compartment_13_17();
	     orders.flaw();
	     orders.engine_compartment_14_17();
	     orders.flaw();
	     orders.engine_compartment_15_17();
	     orders.flaw();
	     orders.engine_compartment_16_17();
	     System.out.println("--------🈚️第二轮engine_compartment_17_17---------");
	     orders.engine_compartment_17_17();
	     
	     orders.nx();
		 
	     System.out.println("---------------机油检查-------------------");
		 
	     orders.engineOil();
	     orders.nx();
	     System.out.println("---------------改装说明-------------------");
	     
	     orders.repackingInstructions();
	     orders.nx();
		 
		 
	     System.out.println("---------------漆面修复概况  漆面检测-------------------");
		 
	     
	     
		
	     //漆面修复概况
	     orders.paintRepairOverview1();
	     
	     orders.paintRepairOverview2();
	     
	     orders.nx();
	        
	     //漆面复合评价
	     orders.optionpaint1();
	     orders.nx();
		
	     
	     //评级
	     orders.comprehensive_condition_ratings();
		
		
		
		
		
		
		
		
		/*//左前车身
		
		//左前座椅
		orders.leftFrontCarBody_1_18();
		//左前门内饰
		orders.left_front_body_2_18();
		
		orders.left_front_body_3_18();
		orders.nx();
		
		System.out.println("发动机舱check项");
        orders.electromechanicalCheck();
        orders.nx();
        
        //左后车身
        orders.left_rear_car_body_1_13();
        orders.left_rear_car_body_2_13();
        
        orders.nx();
        
        //后备箱
        orders.trunck_1_13();
        orders.nx();
        
        //工具检查
        orders.toolCheck();
        orders.nx();
        
        
        //右后车身
        //右前车门
        orders.right_rear_car_body_1_11();
        orders.nx();
        
        //右前车身
        orders.nx();
        
        //发动机舱
        //发动机全景
        orders.engine_compartment_1_17();
        orders.nx();
        
        
        
        //机油检查
        orders.engineOil();
        orders.nx();
        
        
        //改装说明
        orders.repackingInstructions();
        orders.nx();
        
        //漆面修复概况
        orders.nx();
        
        //漆面复合评价
        orders.optionpaint1();
        orders.nx();
        
        
        
        //评级
        orders.comprehensive_condition_ratings();*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //
        
        
        
		
		
		
		
		
		
		
		
		
		//仪表
		
		
		
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
//		
//		orders.into();
//		orders.credentials_shoot();
//		orders.car_detection();
		
	}
	
	
	
/*//	@Test(priority=2)
	@Test(dataProvider="getData",priority=2)
	public void searchFlights(Map<String, Object> h) throws InterruptedException{
		
		mmt.gotoFlights();
		mmt.selectFromCity(h.get("fromCity").toString());
		System.out.println("Reading from Excel :" + h.get("fromCity").toString() );
		
		mmt.selectToCity(h.get("toCity").toString());
		System.out.println("Reading from Excel :" + h.get("toCity").toString());
		
		
		mmt.selectMonth(h.get("month").toString());
		
		System.out.println("Reading from Excel :" + h.get("month").toString() );
		
		mmt.selectFromDate(h.get("FromDate").toString());
		
		System.out.println("Reading from Excel :" + h.get("FromDate").toString() );
		
		mmt.selectFromDate(h.get("ToDate").toString());
		
		System.out.println("Reading from Excel :" + h.get("ToDate").toString() );
		
		Thread.sleep(10000);
		
	}*/
	
	
	@DataProvider
//	public void getData(){

	public static Object[][] getData(){
		
		return TestUtils.getData("BookingTickets");
	}

		
	}
	

