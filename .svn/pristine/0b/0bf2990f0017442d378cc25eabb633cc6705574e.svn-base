package com.checkAuto.appium.screens.nativeapp.makemytrip;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.checkAuto.appium.base.TestBase;
import com.checkAuto.appium.screens.nativeapp.makemytrip.Generate_orders;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class checkAuto_9_9_UiSelector extends TestBase{
//    private AndroidDriver driver;

//   
//    @BeforeTest
//	public void init(){
//		
//		orders = new Generate_orders(driver);//创建对象后传递driver
//
//	}
//    @Test
    public void newCheck() throws InterruptedException{
 

    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/bt_login\")").click();
    	
    	Thread.sleep(6000);
   
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_adddetection\")").click();
    	
    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]"))
    	.click();
    	
   /* //全部商家
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
    	
    	//全部经销商	//点击第1个
    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]")).click();
    	
    //点击确定
//    	driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
    	*/
    	
    	
    	
//    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.EditText[1]")).sendKeys("英菲尼迪经销商4");
//    	
    	
//    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.Button[1]"))
//    	.click();
    	
//    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]"))
//    	.click();
//    	
//    	driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
//    	
//    	Thread.sleep(30000);
    	
//    	第一个索引值                 //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]
//    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]"))
//    	.click();
    	
//    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]")).click();
//    	
    	//确定                       "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]"
    	driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
    	.click();
    	
 
    	
    	//点击基本信息
    	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]
    	driver.findElement(//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]
    			By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]"))
    			.click();

    	
    	System.out.println("输入车牌号");

    	
    	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]"))
    	.click();
    	
    	driver.scrollTo("津");
	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"津\")").click();
    	
    	//车牌号
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_carnum\")")
    	.sendKeys("CH0133");
    	
       
       //车辆类型

    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\")")
    	.click();
       
       //选择车辆类型  选择越野车 List类型  需要重写实例 
       driver.findElement(
    		   By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[1]"))
    		   .click();
       
       
       
       //选择所有人  公户

       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_carpubliser\")")
   	   .click();
       
       //是否一手车 否

       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_firsthand_n\")")
   	   .click();
       
       //过户票 you
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_guohu_y\")")
   	   .click();
       //s上次过户日期
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_guohudate\")")
   	   .click();
       
       //点击确定
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
       .click();
       
       //过户次数
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_guohucishu\")")
   	   .click();
       
       //2次
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]"))
       .click();
       
       
       //使用性质
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_usingnature\")")
   	   .click();
       
    
       
       //点击 营运                    //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"))
       .click();
       
       //VIN 码  需要满足5位,6位的VIN码不能为纯字母,12、15、16、17位的不能为纯数字或字母
                                    //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.RelativeLayout[1]/android.widget.EditText[1]
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).
       sendKeys("CH133");
       
       
       //手动选择车系
//       com.youxinpai.checkauto.act:id/tv_models_cars
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_models_cars\")").click();

     /* //阿斯顿马丁
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[6]")).click();
       
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]"))
       .click();
   
       
       //豪华型
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]")).click();
       */
       
//       driver.scrollTo("车船税");
       //阿尔法罗密欧
    /*   driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[5]")).click();
       //kashiqi
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]"))
       .click();
   
       
       //豪华型
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]")).click();*/
       
       
       /*//卡宴
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[8]")).click();
       
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]"))
       .click();
   
       
       //豪华型
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
      */
      
     //别克
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[9]")).click();
       
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[7]"))
       .click();
   
       
       //豪华型
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]")).click();
       
       
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_guobiao\")")
       .sendKeys("YFND000911");
       
       
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_productiondate\")").click();
                                    //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
       .click();
       
       
       
       //输入发动机号
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_engine\")")
       .sendKeys("YFND00009000");
       
      
    
//       driver.scrollToExact("有");
//       com.youxinpai.checkauto.act:id/btn_registerdate
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_registerdate\")").click();
 
       //点击确定日期 当前日期
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
       .click();
       
      
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_jiaoqiangxian_n\").text(\"无\")").click();
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_syxian_n\").text(\"无\")").click();
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_nianjian_n\").text(\"无\")").click();
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_chechuanshui_n\").text(\"无\")").click();
       
       
       
       
       //点击车存地
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carinventory\")").click();
       
       
       //省
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/sp_provinces\")").click();
       
       //市
       
       driver.scrollTo("天津");
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\").text(\"天津\")").click();
       
       
       /*driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[2]")).click();
     
       driver.scrollTo("齐齐哈尔");
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\").text(\"齐齐哈尔\")").click();
       */
       //点击确定
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
       
       //车辆颜色
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carcolor\")").click();
       //选择颜色 
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"))
       .click();
       
       
       
       driver.scrollTo("车钥匙");
       
       
       //燃油类型
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_fueltype\")").click();
      
       
       //点击选项  电动
       
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[4]/android.widget.ImageView[1]"))
       .click();
       
       
//     点击排气量选项 可省略
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]/android.widget.Spinner[1]"))
       .click();
       
       driver.findElement(By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[4]")).click();
       

//    		   "//android.widget.ListView[1]/android.widget.CheckedTextView[4]"
       
     //点击车钥匙 
       
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carkeys\")").click();
       
       
      
       //2把钥匙
       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]"))
       .click();
       
       //点击保存信息 
      
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save\")").click();
//       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"))
//       .click();
       System.out.println("***********完成基本信息填写**************");
       
       
       
       
       
       
       
       //证件拍照
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
       .click();
       
       //点击行驶证正面(必拍)
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"))
       .click();
       
       System.out.println("进去拍照界面，准备点击相机");
       System.out.println("点击拍照按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
//       com.youxinpai.checkauto.act:id/take_photo
//       com.youxinpai.checkauto.act:id/btn_save_photo
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
       System.out.println("点击保存按钮");

//行驶证副证 必拍
       
       
       
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
      
       //行驶证副证背面
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
       
       
       //行驶证车辆照片
       
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
       //登记证第一页 必拍
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
     //登记证第二页 必拍
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
       
       
       //登记证第三页
       
       System.out.println("点击拍照按钮");//和上面得一样调同样的拍照按钮

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
       
       System.out.println("点击保存按钮");

       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
       
       
       //点击下一步
       
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/next_page\")").click();
       
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_cancle_photo\")").click();
       
       
       
     //点击确认按钮
//       driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
       driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\").text(\"是\")").click();
       //点击返回按钮
       driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
       
       System.out.println("*********完 成证件拍照***************");
  
       
       
    	
       
     	//点击车头carFront
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]"))
				.click();
   	
//   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_item1\")").click();
   	
   	
   	//点击拍照
   	System.out.println("初始化照相机开始拍照 1/5");
   
   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();
   	
   	System.out.println("开始拍照");
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
   	
   	
   	//点击保存
   	System.out.println("点击保存");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
   	
   	
   	System.out.println("点击下一页");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();
   	
   	
//   	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"))
//				.click();
   	
   	//  2/5
   	System.out.println("车头🚗2/5 点击无异常");
   
   	
   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入3/5");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击无异常 -----进入4/5");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	
   	System.out.println("点击无异常 -----进入5/5");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击无异常 -----进入左前车身 1/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	
   	System.out.println("点击无异常 -----进入左前车身 2/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击无异常 -----进入左前车身 3/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击无异常 -----进入左前车身 4/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击无异常 -----进入左前车身 5/18");
   	
   	System.out.println("5/18初始化照相机开始拍照");
   	
   	
   	System.out.println("点击拍照按钮");
//   	com.youxinpai.checkauto.act:id/tv_takephoto
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();
	
   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
   	
   	System.out.println("点击保存");   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();

   	System.out.println("点击下一页 ----");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();
   	
   	System.out.println("左前车身 6/18初始化照相机开始拍照");

   	System.out.println("初始化相机📷");
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();
   	
   	
    driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
   	
   	System.out.println("点击保存");   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 7/18 *****左前车门骨架");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 8/18 *****左前车门内饰");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 9/18*****左A柱下部");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 10/18*****左A柱上部");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 11/18*****左B 柱");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	
   	System.out.println("点击下一页 -----进入左前车身 12/18*****左前车门裙边");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	
   	System.out.println("点击下一页 -----进入左前车身 13/18*****驾驶席区域");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 14/18*****方向盘");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 15/18*****仪表板");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("点击下一页 -----进入左前车身 16/18*****中控");
   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();
   	
    driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
   	
   	System.out.println("点击保存");   	
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
   	
   
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"))
				.sendKeys("30");
   	
   	
   	
   	
// 
   	System.out.println("点击添加车辆配置");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]"))
				.click();
   	
   	System.out.println("勾选座椅通风");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[1]"))
   			.click();
   	
   	
   	System.out.println("膝部气囊");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[2]"))
   			.click();
   	
   	System.out.println("气帘");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[3]"))
   			.click();
   	
   	System.out.println("大灯随动");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[4]"))
   			.click();
   	
   	System.out.println("氖气大灯");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[5]"))
   			.click();
   	
   	System.out.println("定速巡航");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[6]"))
   			.click();
   	
   	System.out.println("方向盘电加热");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[7]"))
   			.click();
   	
   	System.out.println("停车辅助");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[8]"))
   			.click();
   	
   	System.out.println("全车影像");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[9]"))
   			.click();
   	
   	System.out.println("点击确定");
   	driver.findElement(
   			By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
   			.click();
   	
   	System.out.println("点击下一步");
   	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();
	
	
	
   	
   	System.out.println("17/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("18/18");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   
   	
   	System.out.println("变速箱 1/1 -----1启动机检测");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----2发动机检查");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----3转向助力检测");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----4排烟");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----5运转");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	
   	System.out.println("变速箱 1/1 -----6内控电器");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----7是否路试");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("变速箱 1/1 -----8变速箱");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("保存并下一步");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
   	
   	
   	
   	System.out.println("左后车身 1/13 -----无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	
   	System.out.println("左后车身 2/13 -----初始化照相机开始拍照");
   	System.out.println("点击拍照按钮");
//	com.youxinpai.checkauto.act:id/tv_takephoto
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();

	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
	
	System.out.println("点击保存");   	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();

	System.out.println("点击下一页 ----");
driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();


   	
   	System.out.println("左后车身3/13 -----点击无异常******左后车门骨架");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身4/13 -----点击无异常******左后车门内饰");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身5/13 -----点击无异常******左B 柱铰链");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
 
   	System.out.println("左后车身6/13 -----点击无异常******左C柱上部");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 7/13 -----点击无异常******左C柱");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 8/13 -----点击无异常******左后车门裙边");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 9/13 -----初始化照相机开始拍照 仪表台");
   	System.out.println("点击拍照按钮");
//	com.youxinpai.checkauto.act:id/tv_takephoto
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();

	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
	
	System.out.println("点击保存");   	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();

	System.out.println("点击下一页 ----");
    driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();


   	
   	System.out.println("左后车身 10/13 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 11/13 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 12/13 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("左后车身 13/13 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 1/14 后风挡玻璃 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 2/14 后风挡玻璃 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 3/14 后风挡玻璃 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 4/14 -----初始化照相机开始拍照后备箱 先初始化📷");
   	System.out.println("点击拍照按钮");
//	com.youxinpai.checkauto.act:id/tv_takephoto
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();

	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
	
	System.out.println("点击保存");   	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();

	System.out.println("点击下一页 ----");
driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();


   	
   	System.out.println("后备箱 5/14 -----勾选备胎为正常");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("后备箱 5/14 -----勾选工具为正常");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
   	
   	System.out.println("后备箱 5/14 -----点击  保存并下一步");
   	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
   	
   	System.out.println("后备箱 6/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 7/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 8/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 9/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 10/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 11/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 12/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
   	System.out.println("后备箱 13/14 -----点击 无异常");
   	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
   	
	System.out.println("后备箱 14/14 -----点击 无异常");
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
	
		
    System.out.println("右后车身 1/11 -----初始化照相机开始拍照-----右后45度");
    System.out.println("点击拍照按钮");
//	com.youxinpai.checkauto.act:id/tv_takephoto
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();

	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
	
	System.out.println("点击保存");   	
	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();

	System.out.println("点击下一页 ----");
    driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();


		System.out.println("右后车身 2/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 3/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 4/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 5/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 6/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 7/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 8/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 9/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 10/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 11/11 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 1/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 2/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 3/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 4/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 5/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 6/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 7/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 8/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 9/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 10/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 11/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("右后车身 12/12 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("车顶 1/1 -----点击 无异常");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		
		
		
		System.out.println("发动机舱1/18");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")").click();
		System.out.println("点击下一项");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\")").click();
		
		System.out.println("发动机舱2/18*****发动机舱");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		
		System.out.println("发动机舱3/18*****发动机盖内侧");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱4/18*****发动机盖左侧铰链");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		
		System.out.println("发动机舱5/18*****左侧发动机减震器支架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱6/18*****左侧发动机翼子板架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱7/18*****左侧水箱框架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱8/18*****左前梁头");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱9/18*****水箱框架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱10/18*****前横梁");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱11/18*****右前纵梁");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱12/18*****右侧水箱框架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱13/18*****右侧减震器支架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱14/18*****右侧发动机翼子板架");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱15/18*****发动机盖右侧铰链");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱16/18*****防火墙");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱 17/18 车架号");
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")").click();
		
		System.out.println("发动机舱 18/18 检查列表项");
		System.out.println("机油液检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("防冻液检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("刹车油检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("助力油检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	
    	System.out.println("电池检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("皮带检查");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	
    	System.out.println("点击保存并下一步");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("----------------------------------");
	
//		System.out.println("改装说明 1/1 -----点击  有改装");
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]"))
//				.click();
		
		System.out.println("改装说明 1/1 -----点击  无改装");
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
//				.click();
		
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_unmodified\")").click();

		   
		
		System.out.println("点击保存并下一步");
		
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_save_tonext\")").click();

		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_next_page\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_next_page\")").click();
		
		
		
		System.out.println("漆面 1/1 ----- 漆面修复历史选项框");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("漆面 1/1 ----- 点击  局部喷漆");
		driver.findElement(
				By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[5]"))
				.click();
		
		System.out.println("漆面 1/1 ----- 当前状况说明选项框");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("漆面 1/1 ----- 点击  漆面质量一般");
		driver.findElement(
				By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[3]"))
				.click();
		
		System.out.println("漆面 1/1 ----- 修复整备说明选项框");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.Spinner[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("漆面 1/1 ----- 进行部分补漆");
		driver.findElement(
				By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[4]"))
				.click();
		
		System.out.println("填写补充说明");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.EditText[1]"))
				.sendKeys("QA Test");

		System.out.println("点击保存并下一步");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
		
		
		
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"))
//				.click();
		
		System.out.println("评级 1/1 -----设置  综合车况评级为A级");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("滑动屏幕页面");
		driver.scrollTo("维护成本评级");
		
		System.out.println("评级 1/1 -----设置  维护成本评级为+级");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("评级 1/1 -----点击 保存信息");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]"))
				.click();
		
		//点击返回
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
				
/*		//点击未完成检测
				driver.findElement(By.xpath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]"))
				.click();
		//点击上传	
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.Button[2]"))
				.click();
				Thread.sleep(15000);*/
				//点击返回
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
				
				
    }
       

}
