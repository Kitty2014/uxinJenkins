package com.checkAuto.appium.rough;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class noxiachi {
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
         // set up appium
//         File classpathRoot = new File(System.getProperty("user.dir"));
//         File appDir = new File(classpathRoot, "apps/chake");
////         File app = new File(appDir, "checkauto.apk");
//         
//         File app = new File(appDir, "CheckAuto3.01.apk");
         
         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("device","Android");
         capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
         capabilities.setCapability("platformName", "4.3");
//         设备名称在设置中，点击关于手机，型号
//         capabilities.setCapability("deviceName","Android Emulator");
//         capabilities.setCapability("deviceName","Emulator-5554");
         capabilities.setCapability("deviceName","b305c246");
         capabilities.setCapability(CapabilityType.VERSION, "1.4");
//         capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
//         capabilities.setCapability("app", app.getAbsolutePath());
//         capabilities.setCapability("app-package", "com.youxinpai.checkauto.act");
//         capabilities.setCapability("app-activity", ".IndexActivity");
         
         capabilities.setCapability("noreset", "true");
         
         driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
     }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void newCheck(){
       /* WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<WebElement> textFieldsList = driver.findElements(By.tagName("textfield"));
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.findElement(By.name("Save")).click();*/
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]"))
//				.click();
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[3]"))
//				.click();
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]"))
//				.click();
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"))
//				.sendKeys("zhu106");
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]"))
//				.sendKeys("110500");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"))
				.click();
    	driver.findElement(
				By.xpath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]"))
				.click();
    	
    	
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	
    	
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	
    	driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
				.click();
    	
    	//点击车头carFront
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]"))
				.click();
    	
//    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_item1\")").click();
    	
    	
    	//点击拍照
    	System.out.println("初始化照相机开始拍照");
    	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]
    	//点击拍照
    	System.out.println("开始拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	//点击保存
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击下一页");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	//  2/5
    	System.out.println("点击有异常");
    	
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
    
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	/*//点击添加的瑕疵的坐标点
    	System.out.println("单击瑕疵点的坐标取得反向点");
    	driver.findElement(
    			By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
    	        .click();*/
    	
    	System.out.println("点击添加瑕疵");
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	
    	
    	
    	System.out.println("点击保存瑕疵点");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	System.out.println("widget.TextView 3个滑动页面");
    	
    	
    	System.out.println("点击 右侧栏滑动到第二个坐标点");
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_right_tag\")").click();
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_view2_tag\")").click();
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo_left\")").click();
    	
    	
    	System.out.println("添加瑕疵");
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
        System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	
    	System.out.println("保存瑕疵");
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_save\")").click();
    	
    	System.out.println("*********************");
    	
        System.out.println("点击 右侧栏滑动到第三个坐标点");
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_right_tag\")").click();
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_view3_tag\")").click();
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo_left\")").click();
    	
    	
    	System.out.println("添加瑕疵");
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
        System.out.println("点击添加瑕疵");
        
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")").click();
    	
    	
    	System.out.println("点击第一行第一列");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("保存瑕疵");
    	
    	
    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_save\")").click();
    	
    	
//    	driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo_left\")").click();
//    	
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[2]"))
//				.click();
    	
    	System.out.println("点击下一页 -----进入3/5");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入4/5");
    	System.out.println("");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入5/5");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入左前车身 1/17");
        driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
        
//        System.out.println("点击无异常 -----进入左前车身 1/17");
//    	driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
//				.click();
    	
    	System.out.println("点击无异常 -----进入左前车身 2/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入左前车身 3/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入左前车身 4/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入左前车身 5/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("初始化照相机开始拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	
    	System.out.println("点击下一页 ----");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	
    	System.out.println("初始化照相机开始拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    
    	
    	
    	System.out.println("点击下一页 -----进入左前车身 7/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 8/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 9/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 10/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 11/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 12/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 13/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 14/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 15/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 16/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 17/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击下一页 -----进入左前车身 8/17");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	
    	System.out.println("初始化照相机开始拍照 发动机舱 -----进入左前车身 1/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击下一页");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 3/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 4/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 5/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 6/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 7/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 8/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 9/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 10/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 11/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 12/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 13/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	
    	System.out.println("点击无异常 -----进入发动机舱 14/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 15/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 16/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("发动机舱 17/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("点击无异常 -----进入发动机舱 3/18");
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
    	
    	System.out.println("点击保存并下一步");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
    	
    	
    	System.out.println("初始化照相机开始拍照 拍摄仪表 -----");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
        System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("发动机舱-----18/18");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"))
				.sendKeys("30");
    	
    	System.out.println("调用hideKeyboard方法隐藏键盘");
    	driver.hideKeyboard();
    	
    	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]
    	
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
    
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
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
    	
    	System.out.println("变速箱 1/1 -----6严重异响");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("变速箱 1/1 -----7严重抖动");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("变速箱 1/1 -----8内控电器");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("变速箱 1/1 -----9是否路试");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("变速箱 1/1 -----10变速箱");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
    	
    	System.out.println("保存并下一步");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("左后车身 1/13 -----无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 2/13 -----初始化照相机开始拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("左后车身 2/13 -----点击下一项");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	System.out.println("左后车身 3/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 4/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 5/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 6/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 7/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 8/13 -----点击无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 9/13 -----初始化照相机开始拍照 仪表台");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("点击保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	System.out.println("点击下一项");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
    	System.out.println("左后车身 10/13 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 11/13 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 12/13 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("左后车身 13/13 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 1/14 后风挡玻璃 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 2/14 后风挡玻璃 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 3/14 后风挡玻璃 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 4/14 -----初始化照相机开始拍照后备箱");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
    	
    	System.out.println("点击拍照");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("保存");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
    	
    	System.out.println("后备箱 4/14 -----点击 下一项");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
    	
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
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 7/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 8/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 9/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 10/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 11/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 12/14 -----点击 无异常");
    	driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
    	
    	System.out.println("后备箱 13/14 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("后备箱 14/14 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 1/11 -----初始化照相机开始拍照-----右后45度");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("点击拍照");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击下一项");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]"))
				.click();
		
		System.out.println("右后车身 2/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 3/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 4/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 5/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 6/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 7/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 8/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 9/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 10/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 11/11 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 1/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 2/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 3/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 4/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 5/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 6/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 7/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 8/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 9/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 10/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 11/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("右后车身 12/12 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("车顶 1/1 -----点击 无异常");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"))
				.click();
		
		System.out.println("改装说明 1/1 -----点击  有改装");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]"))
				.click();
		
		System.out.println("改装说明 1/1 -----点击  无改装");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"))
				.click();
		
		System.out.println("点击保存并下一步");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.click();
		
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
//		.sendKeys("该车质量外观看起来还不错  小喷漆");
		                 //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]
		
//		driver.hideKeyboard();
		
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
		
		
		
		
		//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]
		
		System.out.println("点击");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
		        .click();
		System.out.println();
		
		System.out.println("行驶证正面(必拍)");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
				.click();
		
		System.out.println("点击  拍照 -----行驶证正面(必拍)");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----行驶证副");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----副证背面");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----车辆照片");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		System.out.println("点击  拍照 -----登记证第一页(必拍)");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		System.out.println("点击  拍照 -----登记证第二页(必拍)");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----登记证第三页");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----登记证第四页");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		System.out.println("点击  拍照 -----登记证第五页");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----登记证第六页");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----商业保险单据上部");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("商业保险一致");
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
				.click();
		
		System.out.println("点击  拍照 -----商业保险单据下部");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		System.out.println("点击  拍照 -----保险单批单");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		System.out.println("点击  拍照 -----交强险单据上部");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("确定保险人是否与车辆所有人一致-----是");
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]"))
				.click();
		
		System.out.println("点击  拍照 -----交强险单据下部");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----交强险批单");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击  拍照 -----车辆发票");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		System.out.println("点击 保存");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();
		
		
		
		
//        System.out.println("");
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
//				.click();
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"))
//				.click();
//		driver.findElement(
//				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"))
//				.click();
//		
        
    }

   /* public class SwipeableWebDriver extends RemoteWebDriver implements HasTouchScreen {
        private RemoteTouchScreen touch;

        public SwipeableWebDriver(URL remoteAddress, Capabilities desiredCapabilities) {
            super(remoteAddress, desiredCapabilities);
            touch = new RemoteTouchScreen(getExecuteMethod());
        }

        public TouchScreen getTouch() {
            return touch;
        }
    }*/
}
