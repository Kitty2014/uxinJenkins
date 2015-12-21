package com.checkAuto.appium.screens.nativeapp.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import com.checkAuto.appium.base.Constants;
import com.checkAuto.appium.base.ScreenBase;

public class Generate_orders extends ScreenBase {

	@AndroidFindBy(uiAutomator = Constants.LOGIN_BUTTON)
	public WebElement login_button;// 登陆按钮
	
	
	@AndroidFindBy(uiAutomator = Constants.LISTVIEW_SWIPE)
	public WebElement listview_swipe;
	
	

	@AndroidFindBy(uiAutomator = Constants.NEW_ADD_DETECTION)
	public WebElement new_add_detection;

	@AndroidFindBy(uiAutomator = Constants.ALL_DEALER)
	public WebElement all_dealer;

	@AndroidFindBy(xpath = Constants.INDEX1)
	public WebElement index1;

	@AndroidFindBy(uiAutomator = Constants.SECOND_HAND_CHECK)
	public WebElement second_hand_check;

	@AndroidFindBy(xpath = Constants.CHOOSE_CONFIRM)
	public WebElement choose_confirm;

	@AndroidFindBy(xpath = Constants.BASE_INFO)
	public WebElement baseinformation;

	@AndroidFindBy(uiAutomator = Constants.LICENSE_PLATE_NUMBER)
	public WebElement license_plate_number;

	@AndroidFindBy(uiAutomator = Constants.VEHICLE_TYPE)
	public WebElement vehicle_type;

	@AndroidFindBy(uiAutomator = Constants.EDIT_SEARCH)
	public WebElement edit_search;

	@AndroidFindBy(uiAutomator = Constants.SEARCH_BUTTON)
	public WebElement search_button;

	@AndroidFindBy(xpath = Constants.SEARCH_INDEX1)
	public WebElement search_index1;

	@AndroidFindBy(uiAutomator = Constants.BASIC_INFO)
	public WebElement basic_info;

	@AndroidFindBy(uiAutomator = Constants.CAR_NUM_AREA_LIST)
	public WebElement car_num_area_list;

	@AndroidFindBy(uiAutomator = Constants.CAR_NUM_AREA_LIST_INDEX)
	public WebElement car_num_area_list_index;

	@AndroidFindBy(uiAutomator = Constants.CAR_TYPE_INPUT)
	public WebElement car_type_input;

	@AndroidFindBy(xpath = Constants.CAR_TYPE_INDEX1)
	public WebElement car_type_index1;

	// 公户
	@AndroidFindBy(uiAutomator = Constants.CAR_PUBLISER_)
	public WebElement car_publiser_;

	// 私户

	@AndroidFindBy(uiAutomator = Constants.CAR_OWNER)
	public WebElement car_owner;

	// 一手
	@AndroidFindBy(uiAutomator = Constants.FIRSTHAND_Y)
	public WebElement firsthand_y;

	// 二手
	@AndroidFindBy(uiAutomator = Constants.FIRSTHAND_N)
	public WebElement firsthand_n;

	// 请选择原始购车发票
	@AndroidFindBy(uiAutomator = Constants.ORIGINAL_CAR_INVOICE)
	public WebElement original_car_invoice;

	// 现在 购车发票的列表 有 丢失 有发票未验证

	@AndroidFindBy(xpath = Constants.ORIGINAL_CAR_INVOICE_INDEX1)
	public WebElement original_car_invoice_index1;

	// 过户票
	@AndroidFindBy(uiAutomator = Constants.TRANSFER_USER_Y)
	public WebElement transfer_user_y;

	@AndroidFindBy(uiAutomator = Constants.TRANSFER_USER_N)
	public WebElement transfer_user_n;

	@AndroidFindBy(uiAutomator = Constants.TRANSFER_DATE)
	public WebElement transfer_date;

	@AndroidFindBy(uiAutomator = Constants.TRANSFER_TIMES_INPUT)
	public WebElement transfer_times_input;

	@AndroidFindBy(xpath = Constants.TRANSFER_TIMES)
	public WebElement transfer_times;

	// 原始购车价
	@AndroidFindBy(uiAutomator = Constants.ORIGINAL_PRICE)
	public WebElement original_price;

	// 使用性质
	@AndroidFindBy(uiAutomator = Constants.USING_NATURE_)
	public WebElement using_nature_;

	// 非营运 营运 营转非 租赁 租赁公司非营运 2
	@AndroidFindBy(xpath = Constants.USING_NATURE_INDEX)
	public WebElement using_nature_index;

	// VIN
	@AndroidFindBy(uiAutomator = Constants.VIN_CODE_)
	public WebElement vin_code_;

	// //请选择车型车系
	@AndroidFindBy(uiAutomator = Constants.MODELS_CARS)
	public WebElement models_cars;

	// 选择品牌车系
	@AndroidFindBy(uiAutomator = Constants.MODELS_CARS_1)
	public WebElement models_cars_1;

	@AndroidFindBy(uiAutomator = Constants.MODELS_CARS_1_2)
	public WebElement models_cars_1_2;

	@AndroidFindBy(xpath = Constants.MODELS_CARS_1_2_3)
	public WebElement models_cars_1_2_3;

	// 国标码
	@AndroidFindBy(uiAutomator = Constants.GUOBIAO_NUM)
	public WebElement guobiao_num;

	@AndroidFindBy(uiAutomator = Constants.PRODUCTION_DATE)
	public WebElement production_date;

	@AndroidFindBy(xpath = Constants.PRODUCTION_DATE_1)
	public WebElement production_date_1;

	@AndroidFindBy(xpath = Constants.PRODUCTION_DATE_2)
	public WebElement production_date_2;

	@AndroidFindBy(xpath = Constants.PRODUCTION_DATE_3)
	public WebElement production_date_3;

	@AndroidFindBy(uiAutomator = Constants.ENGINE_NUM)
	public WebElement engine_num;

	@AndroidFindBy(uiAutomator = Constants.REGISTER_DATE)
	public WebElement register_date;

	@AndroidFindBy(uiAutomator = Constants.CONFIRM_YES)
	public WebElement confirm_yes;

	// 交强险
	@AndroidFindBy(uiAutomator = Constants.JIAOQIANGXIAN_Y)
	public WebElement jiaoqiangxian_y;

	@AndroidFindBy(uiAutomator = Constants.JIAOQIANGXIAN_N)
	public WebElement jiaoqiangxian_n;

	// 交强险到期日
	@AndroidFindBy(uiAutomator = Constants.ASSURANCE_DATE)
	public WebElement assurance_date;

	// 商业险
	@AndroidFindBy(uiAutomator = Constants.COMMERCIAL_INSURANCE_Y)
	public WebElement commercial_insurance_y;

	// 商业险 无
	@AndroidFindBy(uiAutomator = Constants.COMMERCIAL_INSURANCE_N)
	public WebElement commercial_insurance_n;

	// 商业险到期日期
	@AndroidFindBy(uiAutomator = Constants.COMMERCIAL_INSURANCE_EXPIRE_DATE)
	public WebElement commercial_insurance_expire_date;

	// 商业险 金额
	@AndroidFindBy(uiAutomator = Constants.COMMERCIAL_INSURANCE_PRICE)
	public WebElement commercial_insurance_price;

	// 年检
	@AndroidFindBy(uiAutomator = Constants.NIANJIAN_Y)
	public WebElement nianjian_y;

	@AndroidFindBy(uiAutomator = Constants.NIANJIAN_N)
	public WebElement nianjian_n;

	@AndroidFindBy(uiAutomator = Constants.NIANJIAN_EXPIRE)
	public WebElement nianjian_expire;

	// 车船税
	@AndroidFindBy(uiAutomator = Constants.TRAVEL_TAX_Y)
	public WebElement travel_tax_y;

	@AndroidFindBy(uiAutomator = Constants.TRAVEL_TAX_N)
	public WebElement travel_tax_n;

	// 库存地
	@AndroidFindBy(uiAutomator = Constants.CAR_INVENTORY_INPUT)
	public WebElement car_inventory_input;

	// 省
	@AndroidFindBy(uiAutomator = Constants.CAR_INVENTORY_PROVINCE_INDEX)
	public WebElement car_inventory_province_index;

	@AndroidFindBy(uiAutomator = Constants.CAR_INVENTORY_PROVINCE)
	public WebElement car_inventory_province;

	// 市
	@AndroidFindBy(uiAutomator = Constants.CAR_INVENTORY_CITY)
	public WebElement car_inventory_city;

	@AndroidFindBy(uiAutomator = Constants.CAR_INVENTORY_CITY_INDEX)
	public WebElement car_inventory_city_index;

	// 车身颜色

	@AndroidFindBy(uiAutomator = Constants.CHOOSE_CAR_COLOR)
	public WebElement choose_car_color;

	// 选择项 白色
	@AndroidFindBy(xpath = Constants.CHOOSE_WHITE_COLOR)
	public WebElement choose_white_color;

	// 燃油类型

	@AndroidFindBy(uiAutomator = Constants.FUEL_TYPE)
	public WebElement fuel_type;

	// 选择项 电动 相对布局 android.widget.RelativeLayout需要是到List CHOOSE_ELECTRIC
	@AndroidFindBy(xpath = Constants.CHOOSE_ELECTRIC)
	public WebElement choose_electric;

	// 排气量1com.youxinpai.checkauto.act:id/sp_l

	@AndroidFindBy(uiAutomator = Constants.DISPLACEMENT1)
	public WebElement displacement1;

	@AndroidFindBy(uiAutomator = Constants.DISPLACEMENT1_INDEX)
	public WebElement displacement1_index;

	// 排气量
	@AndroidFindBy(uiAutomator = Constants.DISPLACEMENT2)
	public WebElement displacement2;

	@AndroidFindBy(uiAutomator = Constants.DISPLACEMENT2_INDEX)
	public WebElement displacement2_index;

	// 车钥匙CAR_KEY
	@AndroidFindBy(uiAutomator = Constants.CAR_KEY)
	public WebElement car_key;

	@AndroidFindBy(xpath = Constants.CAR_KEY_2)
	public WebElement car_key_2;

	@AndroidFindBy(uiAutomator = Constants.SALES_PERSION_MAIL)
	public WebElement sales_persion_mail;

	@AndroidFindBy(uiAutomator = Constants.SAVE_INFO)
	public WebElement save_info;

	@AndroidFindBy(uiAutomator = Constants.CREDENTIALS_SHOOT)
	public WebElement credentials_shoot;
	
	
	@AndroidFindBy(uiAutomator = Constants.CLICK_CAMERA)
	public WebElement click_camera;
	

	@AndroidFindBy(xpath = Constants.PICTURES_LIST1)
	public WebElement pictures_list1;

	@AndroidFindBy(uiAutomator = Constants.RIGHT_NEXT_ARROW)
	public WebElement right_next_arrow;

	@AndroidFindBy(uiAutomator = Constants.LEFT_NEXT_ARROW)
	public WebElement left_next_arrow;

	@AndroidFindBy(uiAutomator = Constants.ALL_CREDENTIALS)
	public WebElement all_credentials;

	@AndroidFindBy(uiAutomator = Constants.EXIT_TAKE)
	public WebElement exit_take;

	@AndroidFindBy(uiAutomator = Constants.EXIT_YES)
	public WebElement exit_yes;

	// @AndroidFindBy(uiAutomator = Constants.ADD_COVER)
	// public WebElement add_cover;

	@AndroidFindBy(uiAutomator = Constants.REMOVE_COVER)
	public WebElement remove_cover;

	@AndroidFindBy(uiAutomator = Constants.RETAKE)
	public WebElement retake;

	@AndroidFindBy(uiAutomator = Constants.SAVE_PICTURE)
	public WebElement save_picture;

	@AndroidFindBy(xpath = Constants.CHOOSE_VEHICLE_TYPE)
	public WebElement choose_vehicle_type;

	@AndroidFindBy(xpath = Constants.HOLDER)
	public WebElement holder;

	@AndroidFindBy(xpath = Constants.USE_PROPERTIES)
	public WebElement use_properties;

	@AndroidFindBy(xpath = Constants.OPERATIONS)
	public WebElement operations;

	@AndroidFindBy(xpath = Constants.VIN)
	public WebElement vin;

	@AndroidFindBy(xpath = Constants.CHOOSE_CAR_MODEL)
	public WebElement choose_car_model;

	@AndroidFindBys({
			@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/lv_carbrand\")"),
			@AndroidFindBy(className = "android.widget.ListView") })
	public WebElement chainElementView;

	// com.youxinpai.checkauto.act:id/text
	// com.youxinpai.checkauto.act:id/lv_carbrand
	@AndroidFindBy(uiAutomator = Constants.TOP_TEXT)
	public WebElement top_text;

	@AndroidFindBy(uiAutomator = Constants.SELECT_VEHICLE_BRAND)
	public WebElement select_vehicle_brand;

	@AndroidFindBy(uiAutomator = Constants.SELECT_CAR_SERIES)
	public WebElement select_car_series;

	@AndroidFindBy(xpath = Constants.SELECT_CAR_TYPE)
	public WebElement select_car_type;

	@AndroidFindBy(xpath = Constants.VEHICLE_BRAND)
	public WebElement vehicle_brand;

	@AndroidFindBy(xpath = Constants.COLLECTION_TYPE)
	public WebElement collection_type;

	@AndroidFindBy(xpath = Constants.GUOBIAO_NO)
	public WebElement guobiao_no;

	@AndroidFindBy(xpath = Constants.GUOBIAO_NO_NAME)
	public WebElement guobiao_no_name;

	@AndroidFindBy(uiAutomator = Constants.ENGINE_NO)
	public WebElement engine_no;

	@AndroidFindBy(xpath = Constants.PREVENT_VKB_EXCEPTION)
	public WebElement prevent_VKB_exception;

	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.Button[1]
	@AndroidFindBy(xpath = Constants.SCROLL_TO_DATESCREEN)
	public WebElement scroll_to_datescreen;

	@AndroidFindBy(xpath = Constants.CONFIRM_CURRENT_DATE)
	public WebElement confirm_current_date;

	// @AndroidFindBy(xpath = Constants.CONFIRM_CURRENT_DATE)
	// public WebElement confirm_current_date;

	// 交强险到期日期
	@AndroidFindBy(uiAutomator = Constants.FOASSURANCE)
	public WebElement forassurance;

	// 库存地
	@AndroidFindBy(uiAutomator = Constants.INVENTORY)
	public WebElement inventory;

	@AndroidFindBy(xpath = Constants.CHOOSE_INVENTORY)
	public WebElement choose_inventory;

	@AndroidFindBy(xpath = Constants.CHOOSE_BEIJING)
	public WebElement choose_beijing;

	@AndroidFindBy(xpath = Constants.CONFIRM_INVENTORY)
	public WebElement confirm_inventory;

	@AndroidFindBy(xpath = Constants.CHOOSE_ELECTRIC)
	public WebElement choose_electri;

	// @AndroidFindBy(xpath = Constants.SAVE_INFO)

	// 证件拍照
	@AndroidFindBy(xpath = Constants.CREDENTIALS_TAKE_PICTURE)
	public WebElement credentials_take_picture;

	//
	@AndroidFindBy(xpath = Constants.FRONT_SHOOT)
	public WebElement front_shoot;

	@AndroidFindBy(xpath = Constants.CLICK_SHOOT)
	public WebElement click_shoot;

	@AndroidFindBy(xpath = Constants.YES)
	public WebElement yes;

	@AndroidFindBy(uiAutomator = Constants.REG_CERTIFICATE)
	public WebElement reg_certificate;

	@AndroidFindBy(xpath = Constants.EXIT_SHOOT)
	public WebElement exit_shoot;

	@AndroidFindBy(xpath = Constants.EXIT_SHOOT_YES)
	public WebElement exit_shoot_yes;

	@AndroidFindBy(uiAutomator = Constants.NO_EXCEPTION)
	public WebElement no_exception;

	@AndroidFindBy(uiAutomator = Constants.HEAD_BACK)
	public WebElement head_back;

	@AndroidFindBy(uiAutomator = Constants.CAR_FRONT)
	public WebElement car_front;

	// 左前45度
	@AndroidFindBy(uiAutomator = Constants.CAR_FRONT_45)
	public WebElement car_front_45;

	@AndroidFindBy(uiAutomator = Constants.SHOOT_CLICK)
	public WebElement shoot_click;

	@AndroidFindBy(uiAutomator = Constants.SHOOT_CLICK_2)
	public WebElement shoot_click_2;
	
	
	@AndroidFindBy(uiAutomator = Constants.SHOOT_CLICK_3)
	public WebElement shoot_click_3;
	
	
	
//	@AndroidFindBy(uiAutomator = Constants.TAKE_PHOTO_)
//	public WebElement take_photo_;

	@AndroidFindBy(uiAutomator = Constants.SAVE_PHOTO_)
	public WebElement save_photo_;

	@AndroidFindBy(uiAutomator = Constants.ADD_FLAW_)
	public WebElement add_flaw_;

	@AndroidFindBy(uiAutomator = Constants.NX_ITEM)
	public WebElement nx_item;

	@AndroidFindBy(uiAutomator = Constants.IMG_SWIPE)
	public WebElement img_swipe;

	// 发动机盖
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COVER)
	public WebElement engine_cover;

	// 前风挡玻璃
	@AndroidFindBy(uiAutomator = Constants.FRONT_WINDSHIELD)
	public WebElement front_windshield;

	// 车头正视区域
	@AndroidFindBy(uiAutomator = Constants.FRONT_FACING_AREA)
	public WebElement front_facing_area;

	// 车辆前底盘
	@AndroidFindBy(uiAutomator = Constants.FRONT_CHASSIS)
	public WebElement front_chassis;

	
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_1_18)
	public WebElement left_front_body_1_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_2_18)
	public WebElement left_front_body_2_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_3_18)
	public WebElement left_front_body_3_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_4_18)
	public WebElement left_front_body_4_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_5_18)
	public WebElement left_front_body_5_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_6_18)
	public WebElement left_front_body_6_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_7_18)
	public WebElement left_front_body_7_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_8_18)
	public WebElement left_front_body_8_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_9_18)
	public WebElement left_front_body_9_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_10_18)
	public WebElement left_front_body_10_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_11_18)
	public WebElement left_front_body_11_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_12_18)
	public WebElement left_front_body_12_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_13_18)
	public WebElement left_front_body_13_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_14_18)
	public WebElement left_front_body_14_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_15_18)
	public WebElement left_front_body_15_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_16_18)
	public WebElement left_front_body_16_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_17_18)
	public WebElement left_front_body_17_18;
	@AndroidFindBy(uiAutomator = Constants.LEFT_FRONT_CAR_BODY_18_18)
	public WebElement left_front_body_18_18;
	
	
	
	@AndroidFindBy(uiAutomator = Constants.GRID_VIEW_SWIPE)
	public WebElement grid_view_swipe;
	
	

	// 左后车身
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_1_13)
	public WebElement left_rear_car_body_1_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_2_13)
	public WebElement left_rear_car_body_2_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_3_13)
	public WebElement left_rear_car_body_3_13;

	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_4_13)
	public WebElement left_rear_car_body_4_13;

	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_5_13)
	public WebElement left_rear_car_body_5_13;

	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_6_13)
	public WebElement left_rear_car_body_6_13;

	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_7_13)
	public WebElement left_rear_car_body_7_13;

	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_8_13)
	public WebElement left_rear_car_body_8_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_9_13)
	public WebElement left_rear_car_body_9_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_10_13)
	public WebElement left_rear_car_body_10_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_11_13)
	public WebElement left_rear_car_body_11_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_12_13)
	public WebElement left_rear_car_body_12_13;
	@AndroidFindBy(uiAutomator = Constants.LEFT_REAR_CAR_BODY_13_13)
	public WebElement left_rear_car_body_13_13;

	// 后备箱Trunk

	@AndroidFindBy(uiAutomator = Constants.TRUNCK_1_13)
	public WebElement trunck_1_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_2_13)
	public WebElement trunck_2_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_3_13)
	public WebElement trunck_3_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_4_13)
	public WebElement trunck_4_13;
	@AndroidFindBy(xpath = Constants.TRUNCK_5_13)
	public WebElement trunck_5_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_6_13)
	public WebElement trunck_6_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_7_13)
	public WebElement trunck_7_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_8_13)
	public WebElement trunck_8_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_9_13)
	public WebElement trunck_9_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_10_13)
	public WebElement trunck_10_13;
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_11_13)
	public WebElement trunck_11_13;
	
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_12_13)
	public WebElement trunck_12_13;
	
	@AndroidFindBy(uiAutomator = Constants.TRUNCK_13_13)
	public WebElement trunck_13_13;
	
	
	// 右后车身

	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_1_11)
	public WebElement right_rear_car_body_1_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_2_11)
	public WebElement right_rear_car_body_2_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_3_11)
	public WebElement right_rear_car_body_3_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_4_11)
	public WebElement right_rear_car_body_4_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_5_11)
	public WebElement right_rear_car_body_5_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_6_11)
	public WebElement right_rear_car_body_6_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_7_11)
	public WebElement right_rear_car_body_7_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_8_11)
	public WebElement right_rear_car_body_8_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_9_11)
	public WebElement right_rear_car_body_9_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_10_11)
	public WebElement right_rear_car_body_10_11;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_REAR_CAR_BODY_11_11)
	public WebElement right_rear_car_body_11_11;
	
	
	
	//右前车身
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_1_13)
	public WebElement right_front_car_body_1_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_2_13)
	public WebElement right_front_car_body_2_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_3_13)
	public WebElement right_front_car_body_3_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_4_13)
	public WebElement right_front_car_body_4_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_5_13)
	public WebElement right_front_car_body_5_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_6_13)
	public WebElement right_front_car_body_6_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_7_13)
	public WebElement right_front_car_body_7_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_8_13)
	public WebElement right_front_car_body_8_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_9_13)
	public WebElement right_front_car_body_9_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_10_13)
	public WebElement right_front_car_body_10_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_11_13)
	public WebElement right_front_car_body_11_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_12_13)
	public WebElement right_front_car_body_12_13;
	@AndroidFindBy(uiAutomator = Constants.RIGHT_FRONT_CAR_BODY_13_13)
	public WebElement right_front_car_body_13_13;
	

	// 发动机舱

	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_1_17)
	public WebElement engine_compartment_1_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_2_17)
	public WebElement engine_compartment_2_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_3_17)
	public WebElement engine_compartment_3_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_4_17)
	public WebElement engine_compartment_4_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_5_17)
	public WebElement engine_compartment_5_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_6_17)
	public WebElement engine_compartment_6_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_7_17)
	public WebElement engine_compartment_7_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_8_17)
	public WebElement engine_compartment_8_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_9_17)
	public WebElement engine_compartment_9_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_10_17)
	public WebElement engine_compartment_10_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_11_17)
	public WebElement engine_compartment_11_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_12_17)
	public WebElement engine_compartment_12_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_13_17)
	public WebElement engine_compartment_13_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_14_17)
	public WebElement engine_compartment_14_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_15_17)
	public WebElement engine_compartment_15_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_16_17)
	public WebElement engine_compartment_16_17;
	@AndroidFindBy(uiAutomator = Constants.ENGINE_COMPARTMENT_17_17)
	public WebElement engine_compartment_17_17;

	// @AndroidFindBy(uiAutomator =Constants.SURE)
	// public WebElement sure;
	//

	@AndroidFindBy(uiAutomator = Constants.UN_DETECTION)
	public WebElement un_detection;

	@AndroidFindBy(uiAutomator = Constants.UPLOAD_REPORT)
	public WebElement upload_report;

	@AndroidFindBy(uiAutomator = Constants.TAKE_PHOTO_START)
	public WebElement take_photo_start;

	@AndroidFindBy(uiAutomator = Constants.CAR_FRONT_)
	public WebElement car_front_;

	@AndroidFindBy(uiAutomator = Constants.ABNORMAL_YES)
	public WebElement abnormal_yes;

	@AndroidFindBy(uiAutomator = Constants.TAKE_PHOTO)
	public WebElement take_photo;

	@AndroidFindBy(xpath = Constants.SAVE_PHOTO)
	public WebElement save_photo;

	@AndroidFindBy(uiAutomator = Constants.NEXT_PAGE)
	public WebElement next_page;

	

	@AndroidFindBy(uiAutomator = Constants.ADD_FLAW)
	public WebElement add_flaw;

	@AndroidFindBy(xpath = Constants.FIRST_ROW_COLUMN)
	public WebElement first_row_column;

	@AndroidFindBy(uiAutomator = Constants.SAVE_FLAW)
	public WebElement save_flaw;

	@AndroidFindBy(uiAutomator = Constants.RIGHT_INCREASE_BUTTON)
	public WebElement right_increase_button;

	@AndroidFindBy(uiAutomator = Constants.PLUS_MIDDLE_BUTTON)
	public WebElement plus_middle_button;

	@AndroidFindBy(uiAutomator = Constants.PLUS_THIRD_BUTTON)
	public WebElement plus_third_button;

	//
	// @AndroidFindBy(uiAutomator =Constants.CAR_FRONT)
	// public WebElement car_front;
	// @AndroidFindBy(uiAutomator =Constants.ADD_CONFIGURATION)
	// public WebElement add_configuration;

	// 机油检查
	@AndroidFindBy(uiAutomator = Constants.ENG_OIL_YES)
	public WebElement eng_oil_yes;

	@AndroidFindBy(uiAutomator = Constants.LIQUED_YES)
	public WebElement liqued_yes;

	@AndroidFindBy(uiAutomator = Constants.BRAKE_OIL_EXCEPTION)
	public WebElement brake_oil_exception;

	@AndroidFindBy(uiAutomator = Constants.ASSESS_OIL_EXCEPTION)
	public WebElement asess_oil_exception;

	@AndroidFindBy(uiAutomator = Constants.BATTERY_CHECK)
	public WebElement battery_check;

	@AndroidFindBy(uiAutomator = Constants.BELT_CHECK)
	public WebElement belt_check;

	// 漆面修复历史

	@AndroidFindBy(uiAutomator = Constants.PAINT_REPAIR_HISTORY_)
	public WebElement paint_repaire_history_;

	// 当前状况说明
	@AndroidFindBy(uiAutomator = Constants.CURRENTSTATE_PAINT_)
	public WebElement currentstate_paint_;

	// 修复整备说明
	@AndroidFindBy(uiAutomator = Constants.REPAIR_DESCRIBE_)
	public WebElement repaire_describe_;

	@AndroidFindBy(uiAutomator = Constants.EDIT_MILE)
	public WebElement edit_mile;

	@AndroidFindBy(uiAutomator = Constants.SURE)
	public WebElement sure;

	@AndroidFindBy(uiAutomator = Constants.NEW_SHOOT)
	public WebElement new_shoot;

	@AndroidFindBy(uiAutomator = Constants.START_CHECK)
	public WebElement start_check;

	@AndroidFindBy(uiAutomator = Constants.ENGIN_CHECK)
	public WebElement engine_check;

	@AndroidFindBy(uiAutomator = Constants.TURN_CHECK)
	public WebElement turn_check;

	@AndroidFindBy(uiAutomator = Constants.SMOKE)
	public WebElement smoke;

	@AndroidFindBy(uiAutomator = Constants.OPERATION)
	public WebElement operation;

	@AndroidFindBy(uiAutomator = Constants.ELECTRIC)
	public WebElement electric;

	@AndroidFindBy(uiAutomator = Constants.ROAD_TEST)
	public WebElement road_test;

	@AndroidFindBy(uiAutomator = Constants.SAVE_TONEXT)
	public WebElement save_tonext;

	@AndroidFindBy(uiAutomator = Constants.NX)
	public WebElement nx;

	@AndroidFindBy(uiAutomator = Constants.SPEEDBOX)
	public WebElement speedbox;

	@AndroidFindBy(uiAutomator = Constants.SPARE_TIRE)
	public WebElement spare_tire;

	@AndroidFindBy(uiAutomator = Constants.TOOLS)
	public WebElement tools;

	@AndroidFindBy(uiAutomator = Constants.WHETHER_MODIFICATION)
	public WebElement whether_modification;

	@AndroidFindBy(xpath = Constants.PAINT_REPAIR_HISTORY)
	public WebElement paint_repair_hisory;
	@AndroidFindBy(xpath = Constants.PARTIAL_PAINT)
	public WebElement partial_paint;
	@AndroidFindBy(xpath = Constants.CURRENTSTATE_PAINT)
	public WebElement currentstate_paint;
	@AndroidFindBy(xpath = Constants.GENERAL_QUALITY)
	public WebElement general_quality;
	@AndroidFindBy(xpath = Constants.REPAIR_DESCRIBE)
	public WebElement repair_decribe;
	@AndroidFindBy(xpath = Constants.REPAIR_PART)
	public WebElement repair_part;
	@AndroidFindBy(uiAutomator = Constants.CAR_DESCRIBE)
	public WebElement car_describe;

	@AndroidFindBy(uiAutomator = Constants.COMPREHENSIVE_CONDITION_RATINGS)
	public WebElement comprehensive_condition_ratings;

	@AndroidFindBy(uiAutomator = Constants.MAINTENANCE_COSTS_RATINGS)
	public WebElement maintenance_costs_ratings;

	// **********************************************************************************************************
	// **********************************************************************************************************
	// **********************************************************************************************************

	// 划伤
	@AndroidFindBy(uiAutomator = Constants.CK3_WGHS)
	public WebElement ck3_wghs;
	@AndroidFindBy(xpath = Constants.CK3_WGHS1)
	public WebElement ck3_wghs1;
	@AndroidFindBy(xpath = Constants.CK3_WGHS2)
	public WebElement ck3_wghs2;
	@AndroidFindBy(xpath = Constants.CK3_WGHS3)
	public WebElement ck3_wghs3;
	@AndroidFindBy(xpath = Constants.CK3_WGHS4)
	public WebElement ck3_wghs4;

	// 凹坑CK3_WGAK CK3_WGAK
	@AndroidFindBy(uiAutomator = Constants.CK3_WGAK)
	public WebElement ck3_wgak;
	@AndroidFindBy(xpath = Constants.CK3_WGAK1)
	public WebElement ck3_wgak1;
	@AndroidFindBy(xpath = Constants.CK3_WGAK2)
	public WebElement ck3_wgak2;
	@AndroidFindBy(xpath = Constants.CK3_WGAK3)
	public WebElement ck3_wgak3;

	// 变形痕迹
	@AndroidFindBy(uiAutomator = Constants.CK3_WGBX)
	public WebElement ck3_wgbx;
	@AndroidFindBy(xpath = Constants.CK3_WGBX1)
	public WebElement ck3_wgbx1;
	@AndroidFindBy(xpath = Constants.CK3_WGBX2)
	public WebElement ck3_wgbx2;
	@AndroidFindBy(xpath = Constants.CK3_WGBX3)
	public WebElement ck3_wgbx3;

	// 色差 CK3_WGSC
	@AndroidFindBy(uiAutomator = Constants.CK3_WGSC)
	public WebElement ck3_wgsc;
	// @AndroidFindBy(xpath =Constants.CK3_WGSC_1)
	// public WebElement ck3_wgsc_1;
	@AndroidFindBy(xpath = Constants.CK3_WGSC1)
	public WebElement ck3_wgsc1;
	@AndroidFindBy(xpath = Constants.CK3_WGSC2)
	public WebElement ck3_wgsc2;
	@AndroidFindBy(xpath = Constants.CK3_WGSC3)
	public WebElement ck3_wgsc3;

	// 生锈痕迹
	@AndroidFindBy(uiAutomator = Constants.CK3_WGXS)
	public WebElement ck3_wgxs;
	@AndroidFindBy(xpath = Constants.CK3_WGXS1)
	public WebElement ck3_wgxs1;
	@AndroidFindBy(xpath = Constants.CK3_WGXS2)
	public WebElement ck3_wgxs2;
	@AndroidFindBy(xpath = Constants.CK3_WGXS3)
	public WebElement ck3_wgxs3;

	// 修补痕迹CK3_WGXB1
	@AndroidFindBy(uiAutomator = Constants.CK3_WGXB)
	public WebElement ck3_wgxb;
	@AndroidFindBy(xpath = Constants.CK3_WGXB1)
	public WebElement ck3_wgxb1;
	@AndroidFindBy(xpath = Constants.CK3_WGXB2)
	public WebElement ck3_wgxb2;
	@AndroidFindBy(xpath = Constants.CK3_WGXB3)
	public WebElement ck3_wgxb3;

	// 破裂CK3_WGPL1
	@AndroidFindBy(uiAutomator = Constants.CK3_WGPL)
	public WebElement ck3_wgpl;
	@AndroidFindBy(xpath = Constants.CK3_WGPL1)
	public WebElement ck3_wgpl1;

	// 掉漆CK3_WGDQ1
	@AndroidFindBy(uiAutomator = Constants.CK3_WGDQ)
	public WebElement ck3_wgdq;
	@AndroidFindBy(xpath = Constants.CK3_WGDQ1)
	public WebElement ck3_wgdq1;
	@AndroidFindBy(xpath = Constants.CK3_WGDQ2)
	public WebElement ck3_wgdq2;
	@AndroidFindBy(xpath = Constants.CK3_WGDQ3)
	public WebElement ck3_wgdq3;

	// 丢件
	@AndroidFindBy(uiAutomator = Constants.CK3_WGDS)
	public WebElement ck3_wgds;
	@AndroidFindBy(xpath = Constants.CK3_WGDS1)
	public WebElement ck3_wgds1;

	// 漆面异常CK3_QMYC1
	@AndroidFindBy(uiAutomator = Constants.CK3_QMYC)
	public WebElement ck3_qmyc;
	@AndroidFindBy(xpath = Constants.CK3_QMYC1)
	public WebElement ck3_qmyc1;
	@AndroidFindBy(xpath = Constants.CK3_QMYC2)
	public WebElement ck3_qmyc2;
	@AndroidFindBy(xpath = Constants.CK3_QMYC3)
	public WebElement ck3_qmyc3;

	// 玻璃检查CK3_BL

	@AndroidFindBy(uiAutomator = Constants.CK3_BL)
	public WebElement ck3_bl;
	@AndroidFindBy(xpath = Constants.CK3_BL1)
	public WebElement ck3_bl1;
	@AndroidFindBy(xpath = Constants.CK3_BL2)
	public WebElement ck3_bl2;
	@AndroidFindBy(xpath = Constants.CK3_BL3)
	public WebElement ck3_bl3;
	@AndroidFindBy(xpath = Constants.CK3_BL4)
	public WebElement ck3_bl4;
	@AndroidFindBy(xpath = Constants.CK3_BL5)
	public WebElement ck3_bl5;

	// 后续还有子选项

	// 更换CK3_WGGH
	@AndroidFindBy(uiAutomator = Constants.CK3_WGGH)
	public WebElement ck3_wggh;
	@AndroidFindBy(xpath = Constants.CK3_WGGH_1)
	public WebElement ck3_wggh_1;
	@AndroidFindBy(xpath = Constants.CK3_WGGH1)
	public WebElement ck3_wggh1;

	// 胶条异常CK3_JT
	@AndroidFindBy(uiAutomator = Constants.CK3_JT)
	public WebElement ck3_jt;
	@AndroidFindBy(xpath = Constants.CK3_JT1)
	public WebElement ck3_jt1;
	@AndroidFindBy(xpath = Constants.CK3_JT2)
	public WebElement ck3_jt2;
	@AndroidFindBy(xpath = Constants.CK3_JT3)
	public WebElement ck3_jt3;

	// 水泡CK3_SPDZ1 CK3_SPZY1
	@AndroidFindBy(uiAutomator = Constants.CK3_SPDZ)
	public WebElement ck3_spdz;
	@AndroidFindBy(xpath = Constants.CK3_SPDZ1)
	public WebElement ck3_spdz1;
	@AndroidFindBy(xpath = Constants.CK3_SPDZ2)
	public WebElement ck3_spdz2;
	@AndroidFindBy(xpath = Constants.CK3_SPDZ3)
	public WebElement ck3_spdz3;

	// 水泡 CK3_SPZY1
	@AndroidFindBy(uiAutomator = Constants.CK3_SPZY)
	public WebElement ck3_spzy;
	@AndroidFindBy(xpath = Constants.CK3_SPZY1)
	public WebElement ck3_spzy1;
	@AndroidFindBy(xpath = Constants.CK3_SPZY2)
	public WebElement ck3_spzy2;
	@AndroidFindBy(xpath = Constants.CK3_SPZY3)
	public WebElement ck3_spzy3;
	
	// 水泡 CK3_SPHBX
	@AndroidFindBy(uiAutomator = Constants.CK3_SPHBX)
	public WebElement ck3_sphbx;
	@AndroidFindBy(xpath = Constants.CK3_SPHBX1)
	public WebElement ck3_sphbx1;
	@AndroidFindBy(xpath = Constants.CK3_SPHBX2)
	public WebElement ck3_sphbx2;
	@AndroidFindBy(xpath = Constants.CK3_SPHBX3)
	public WebElement ck3_sphbx3;
	
	// 水泡 CK3_SPMB
	@AndroidFindBy(uiAutomator = Constants.CK3_SPMB)
	public WebElement ck3_spmb;
	@AndroidFindBy(xpath = Constants.CK3_SPMB1)
	public WebElement ck3_spmb1;
	@AndroidFindBy(xpath = Constants.CK3_SPMB2)
	public WebElement ck3_spmb2;
	
	

	// 晃动CK3_NSHD1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSHD)
	public WebElement ck3_nshd;
	@AndroidFindBy(xpath = Constants.CK3_NSHD1)
	public WebElement ck3_nshd1;

	// 板件间隙CK3_BJJX
	@AndroidFindBy(uiAutomator = Constants.CK3_BJJX)
	public WebElement ck3_bjjx;
	@AndroidFindBy(xpath = Constants.CK3_BJJX1)
	public WebElement ck3_bjjx1;

	// 灯组检测CK3_DZJC1
	@AndroidFindBy(uiAutomator = Constants.CK3_DZJC)
	public WebElement ck3_dzjc;
	@AndroidFindBy(xpath = Constants.CK3_DZJC1)
	public WebElement ck3_dzjc1;

	// 剐蹭CK3_GC1
	@AndroidFindBy(uiAutomator = Constants.CK3_GC)
	public WebElement ck3_gc;
	@AndroidFindBy(xpath = Constants.CK3_GC1)
	public WebElement ck3_gc1;
	@AndroidFindBy(xpath = Constants.CK3_GC2)
	public WebElement ck3_gc2;
	@AndroidFindBy(xpath = Constants.CK3_GC3)
	public WebElement ck3_gc3;

	// 托底 CK3_DPTD 只有一个 CK3_DPTD
	@AndroidFindBy(uiAutomator = Constants.CK3_DPTD)
	public WebElement ck3_dptd;
	@AndroidFindBy(xpath = Constants.CK3_DPTD1)
	public WebElement ck3_dptd1;

	// 滴漏 CK3_DPLY 只有一个
	@AndroidFindBy(uiAutomator = Constants.CK3_DPLY)
	public WebElement ck3_dply;
	@AndroidFindBy(xpath = Constants.CK3_DPLY1)
	public WebElement ck3_dply1;
	@AndroidFindBy(xpath = Constants.CK3_DPLY2)
	public WebElement ck3_dply2;
	@AndroidFindBy(xpath = Constants.CK3_DPLY3)
	public WebElement ck3_dply3;

	// 钣金痕迹 CK3_GJBJ
	@AndroidFindBy(uiAutomator = Constants.CK3_GJBJ)
	public WebElement ck3_gjbj;
	@AndroidFindBy(xpath = Constants.CK3_GJBJ1)
	public WebElement ck3_gjbj1;
	@AndroidFindBy(xpath = Constants.CK3_GJBJ2)
	public WebElement ck3_gjbj2;
	@AndroidFindBy(xpath = Constants.CK3_GJBJ3)
	public WebElement ck3_gjbj3;
	@AndroidFindBy(xpath = Constants.CK3_GJBJ4)
	public WebElement ck3_gjbj4;
	
	// 凹陷 CK3_NSTX1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSTX)
	public WebElement ck3_nstx;
	@AndroidFindBy(xpath = Constants.CK3_NSTX1)
	public WebElement ck3_nstx1;
	@AndroidFindBy(xpath = Constants.CK3_NSTX2)
	public WebElement ck3_nstx2;
	@AndroidFindBy(xpath = Constants.CK3_NSTX3)
	public WebElement ck3_nstx3;
	@AndroidFindBy(xpath = Constants.CK3_NSTX4)
	public WebElement ck3_nstx4;
	@AndroidFindBy(xpath = Constants.CK3_NSTX5)
	public WebElement ck3_nstx5;
	@AndroidFindBy(xpath = Constants.CK3_NSTX6)
	public WebElement ck3_nstx6;

	// 轮胎异常CK3_CLLT
	@AndroidFindBy(uiAutomator = Constants.CK3_CLLT)
	public WebElement ck3_cllt;
	@AndroidFindBy(xpath = Constants.CK3_CLLT1)
	public WebElement ck3_cllt1;
	@AndroidFindBy(xpath = Constants.CK3_CLLT2)
	public WebElement ck3_cllt2;
	@AndroidFindBy(xpath = Constants.CK3_CLLT3)
	public WebElement ck3_cllt3;
	@AndroidFindBy(xpath = Constants.CK3_CLLT4)
	public WebElement ck3_cllt4;
	@AndroidFindBy(xpath = Constants.CK3_CLLT5)
	public WebElement ck3_cllt5;

	// 轮毂异常CK3_CLLG
	@AndroidFindBy(uiAutomator = Constants.CK3_CLLG)
	public WebElement ck3_cllg;
	@AndroidFindBy(xpath = Constants.CK3_CLLG1)
	public WebElement ck3_cllg1;
	@AndroidFindBy(xpath = Constants.CK3_CLLG2)
	public WebElement ck3_cllg2;
	@AndroidFindBy(xpath = Constants.CK3_CLLG3)
	public WebElement ck3_cllg3;

	// 减震器 CK3_JZLY CK3_JZLY1 1 CK3_JZLY1 2 CK3_JZJT1 3 CK3_ZJBX1
	@AndroidFindBy(uiAutomator = Constants.CK3_JZLY)
	public WebElement ck3_jzly;
	@AndroidFindBy(xpath = Constants.CK3_JZLY1)
	public WebElement ck3_jzly1;
	@AndroidFindBy(xpath = Constants.CK3_JZJT1)
	public WebElement ck3_jzjt1;
	@AndroidFindBy(xpath = Constants.CK3_ZJBX1)
	public WebElement ck3_zjbx1;

	// 污渍 CK3_NSWZ CK3_NSWZ1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSWZ)
	public WebElement ck3_nswz;
	@AndroidFindBy(xpath = Constants.CK3_NSWZ1)
	public WebElement ck3_nswz1;
	@AndroidFindBy(xpath = Constants.CK3_NSWZ2)
	public WebElement ck3_nswz2;
	@AndroidFindBy(xpath = Constants.CK3_NSWZ3)
	public WebElement ck3_nswz3;

	// 磨损CK3_NSMS
	@AndroidFindBy(uiAutomator = Constants.CK3_NSMS)
	public WebElement ck3_nsms;
	@AndroidFindBy(xpath = Constants.CK3_NSMS1)
	public WebElement ck3_nsms1;
	@AndroidFindBy(xpath = Constants.CK3_NSMS2)
	public WebElement ck3_nsms2;
	@AndroidFindBy(xpath = Constants.CK3_NSMS3)
	public WebElement ck3_nsms3;

	// 破损CK3_NSPS2
	@AndroidFindBy(uiAutomator = Constants.CK3_NSPS)
	public WebElement ck3_nsps;
	@AndroidFindBy(xpath = Constants.CK3_NSPS1)
	public WebElement ck3_nsps1;
	@AndroidFindBy(xpath = Constants.CK3_NSPS2)
	public WebElement ck3_nsps2;
	@AndroidFindBy(xpath = Constants.CK3_NSPS3)
	public WebElement ck3_nsps3;
	@AndroidFindBy(xpath = Constants.CK3_NSPS4)
	public WebElement ck3_nsps4;

	// 烧烫CK3_NSST
	@AndroidFindBy(uiAutomator = Constants.CK3_NSST)
	public WebElement ck3_nsst;
	@AndroidFindBy(xpath = Constants.CK3_NSST1)
	public WebElement ck3_nsst1;
	@AndroidFindBy(xpath = Constants.CK3_NSST2)
	public WebElement ck3_nsst2;
	@AndroidFindBy(xpath = Constants.CK3_NSST3)
	public WebElement ck3_nsst3;

	// 拆卸痕迹 CK3_GJCX CK3_GJCX1
	@AndroidFindBy(uiAutomator = Constants.CK3_GJCX)
	public WebElement ck3_gjcx;
	@AndroidFindBy(xpath = Constants.CK3_GJCX1)
	public WebElement ck3_gjcx1;
	@AndroidFindBy(xpath = Constants.CK3_GJCX2)
	public WebElement ck3_gjcx2;
	@AndroidFindBy(xpath = Constants.CK3_GJCX3)
	public WebElement ck3_gjcx3;

	// 爆裂 CK3_QNBL1
	@AndroidFindBy(uiAutomator = Constants.CK3_QNBL)
	public WebElement ck3_qnbl;
	@AndroidFindBy(xpath = Constants.CK3_QNBL1)
	public WebElement ck3_qnbl1;

	// 花屏CK3_NSHP1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSHP)
	public WebElement ck3_nshp;
	@AndroidFindBy(xpath = Constants.CK3_NSHP1)
	public WebElement ck3_nshp1;

	// 故障灯CK3_NSGZ1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSGZ)
	public WebElement ck3_nsgz;
	@AndroidFindBy(xpath = Constants.CK3_NSGZ1)
	public WebElement ck3_nsgz1;

	// 排气管锈裂CK3_DPXL
	@AndroidFindBy(uiAutomator = Constants.CK3_DPXL)
	public WebElement ck3_dpxl;
	@AndroidFindBy(xpath = Constants.CK3_DPXL1)
	public WebElement ck3_dpxl1;

	// 下垂CK3_NSXC1
	@AndroidFindBy(uiAutomator = Constants.CK3_NSXC)
	public WebElement ck3_nsxc;
	@AndroidFindBy(xpath = Constants.CK3_NSXC1)
	public WebElement ck3_nsxc1;

	// 安装孔CK3_WGAZ1
	@AndroidFindBy(uiAutomator = Constants.CK3_WGAZ)
	public WebElement ck3_wgaz;
	@AndroidFindBy(xpath = Constants.CK3_WGAZ1)
	public WebElement ck3_wgaz1;

	// 天窗CK3_TCYC
	@AndroidFindBy(uiAutomator = Constants.CK3_TCYC)
	public WebElement ck3_tcyc;
	@AndroidFindBy(xpath = Constants.CK3_TCYC1)
	public WebElement ck3_tcyc1;
	@AndroidFindBy(xpath = Constants.CK3_TCYC2)
	public WebElement ck3_tcyc2;

	// 打磨痕迹CK3_DMHJ1
	@AndroidFindBy(uiAutomator = Constants.CK3_DMHJ)
	public WebElement ck3_dmhj;
	@AndroidFindBy(xpath = Constants.CK3_DMHJ1)
	public WebElement ck3_dmhj1;

	// 锈蚀不清 CK3_CJXS1
	@AndroidFindBy(uiAutomator = Constants.CK3_CJXS)
	public WebElement ck3_cjxs;
	@AndroidFindBy(xpath = Constants.CK3_CJXS1)
	public WebElement ck3_cjxs1;

	// 缺损CK3_CJQS CK3_CJQS1
	@AndroidFindBy(uiAutomator = Constants.CK3_CJQS)
	public WebElement ck3_cjqs;
	@AndroidFindBy(xpath = Constants.CK3_CJQS1)
	public WebElement ck3_cjqs1;

	// 事故变形CK3_CJSG CK3_CJSG1
	@AndroidFindBy(uiAutomator = Constants.CK3_CJSG)
	public WebElement ck3_cjsg;
	@AndroidFindBy(xpath = Constants.CK3_CJSG1)
	public WebElement ck3_cjsg1;

	// 篡改嫌疑CK3_CJCG
	@AndroidFindBy(uiAutomator = Constants.CK3_CJCG)
	public WebElement ck3_cjcg;
	@AndroidFindBy(xpath = Constants.CK3_CJCG)
	public WebElement ck3_cjcg1;
	
	
	
	@AndroidFindBy(uiAutomator = Constants.HAVE_DEFECT)
	public WebElement have_defect;
	@AndroidFindBy(uiAutomator = Constants.LITTLE_DEFECT)
    public WebElement little_defect;
	@AndroidFindBy(uiAutomator = Constants.NO_DEFECT)
    public WebElement no_defect;
	
	@AndroidFindBy(uiAutomator = Constants.SKELETON_DEFECT)
    public WebElement skeleton_defect;
	

	// 漆面修复概况 漆面检测
	@AndroidFindBy(xpath = Constants.QIMIAN1)
	public WebElement ck3_qimian1;
	@AndroidFindBy(xpath = Constants.QIMIAN2)
	public WebElement ck3_qimian2;
	@AndroidFindBy(xpath = Constants.QIMIAN3)
	public WebElement ck3_qimian3;
	@AndroidFindBy(xpath = Constants.QIMIAN4)
	public WebElement ck3_qimian4;
	@AndroidFindBy(xpath = Constants.QIMIAN5)
	public WebElement ck3_qimian5;
	@AndroidFindBy(xpath = Constants.QIMIAN6)
	public WebElement ck3_qimian6;
	@AndroidFindBy(xpath = Constants.QIMIAN7)
	public WebElement ck3_qimian7;
	@AndroidFindBy(xpath = Constants.QIMIAN8)
	public WebElement ck3_qimian8;
	@AndroidFindBy(xpath = Constants.QIMIAN9)
	public WebElement ck3_qimian9;
	@AndroidFindBy(xpath = Constants.QIMIAN10)
	public WebElement ck3_qimian10;
	@AndroidFindBy(xpath = Constants.QIMIAN11)
	public WebElement ck3_qimian11;
	@AndroidFindBy(xpath = Constants.QIMIAN12)
	public WebElement ck3_qimian12;
	@AndroidFindBy(xpath = Constants.QIMIAN13)
	public WebElement ck3_qimian13;
	@AndroidFindBy(xpath = Constants.QIMIAN14)
	public WebElement ck3_qimian14;
	@AndroidFindBy(xpath = Constants.QIMIAN15)
	public WebElement ck3_qimian15;
	@AndroidFindBy(xpath = Constants.QIMIAN16)
	public WebElement ck3_qimian16;
	@AndroidFindBy(xpath = Constants.QIMIAN17)
	public WebElement ck3_qimian17;

	// 漆面修复概况 骨架检测
	@AndroidFindBy(xpath = Constants.GUJIA)
	public WebElement ck3_gujia;

	@AndroidFindBy(xpath = Constants.GUJIA1)
	public WebElement ck3_gujia1;
	@AndroidFindBy(xpath = Constants.GUJIA2)
	public WebElement ck3_gujia2;
	@AndroidFindBy(xpath = Constants.GUJIA3)
	public WebElement ck3_gujia3;
	@AndroidFindBy(xpath = Constants.GUJIA4)
	public WebElement ck3_gujia4;
	@AndroidFindBy(xpath = Constants.GUJIA5)
	public WebElement ck3_gujia5;
	@AndroidFindBy(xpath = Constants.GUJIA6)
	public WebElement ck3_gujia6;
	@AndroidFindBy(xpath = Constants.GUJIA7)
	public WebElement ck3_gujia7;
	@AndroidFindBy(xpath = Constants.GUJIA8)
	public WebElement ck3_gujia8;
	@AndroidFindBy(xpath = Constants.GUJIA9)
	public WebElement ck3_gujia9;
	@AndroidFindBy(xpath = Constants.GUJIA10)
	public WebElement ck3_gujia10;

	// 生锈痕迹 CK3_DPXS 只有一个

	@AndroidFindBy(xpath = Constants.CK3_DPXS)
	public WebElement ck3_dpxs;

	@AndroidFindBy(xpath = Constants.CK3_DPXS1)
	public WebElement ck3_dpxs1;

	@AndroidFindBy(xpath = Constants.CK3_DPXS2)
	public WebElement ck3_dpxs2;

	@AndroidFindBy(xpath = Constants.CK3_DPXS3)
	public WebElement ck3_dpxs3;

	// 凹陷 CK3_NSOX

	@AndroidFindBy(xpath = Constants.CK3_NSOX)
	public WebElement ck3_nsox;

	@AndroidFindBy(xpath = Constants.CK3_NSOX1)
	public WebElement ck3_nsox1;

	@AndroidFindBy(xpath = Constants.CK3_NSOX2)
	public WebElement ck3_nsox2;

	@AndroidFindBy(xpath = Constants.CK3_NSOX3)
	public WebElement ck3_nsox3;

	// 发动机舱 17/18
	@AndroidFindBy(xpath = Constants.OIL_CHECK)
	public WebElement oil_check;

	@AndroidFindBy(xpath = Constants.ANTIFREEZE_CHECK)
	public WebElement antifreeze_check;

	@AndroidFindBy(xpath = Constants.BRAKE_FLUID_CHECK)
	public WebElement brake_fluid_check;

	@AndroidFindBy(xpath = Constants.BOOST_OIL_CHECK)
	public WebElement boost_oil_check;

	// 18/18
	@AndroidFindBy(xpath = Constants.SHOOT18_18)
	public WebElement shoot18_18;

	// /////////////////////
	// 基本信息
	@AndroidFindBy(xpath = Constants.BASIC_INFO_2)
	public WebElement basic_info_2;

	// 车牌号第一个车牌位置选择框

	@AndroidFindBy(xpath = Constants.CAR_PROVINCE_box)
	public WebElement car_province_box;

	@AndroidFindBy(uiAutomator = Constants.CAR_PROVINCE)
	public WebElement car_province;

	// 输入字母数字组合 6-7车牌号
	@AndroidFindBy(uiAutomator = Constants.CAR_NUM)
	public WebElement car_num;

	// 车辆类型选择框
	@AndroidFindBy(uiAutomator = Constants.CAR_TYPE_BOX)
	public WebElement car_type_box;

	// 选择车辆类型 选择越野车
	@AndroidFindBy(xpath = Constants.CAR_TYPE)
	public WebElement car_type;

	// 选择所有人 公户

	@AndroidFindBy(xpath = Constants.CAR_PUBLISER)
	public WebElement car_publiser;

	@AndroidFindBy(xpath = Constants.USING_NATURE_BOX)
	public WebElement using_nature_box;

	@AndroidFindBy(xpath = Constants.USING_NATURE)
	public WebElement using_nature;

	public Generate_orders(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void into() throws InterruptedException {

		Thread.sleep(3000);
		login_button.click();
		Thread.sleep(5000);
		new_add_detection.click();
		// all_dealer.click();

		// Thread.sleep(5000);
		index1.click();
		second_hand_check.click();

		/*
		 * edit_search.sendKeys("克莱斯勒北京测试卖家"); search_button.click();
		 * search_index1.click(); confirm_yes.click();
		 */

		// 点击 基本信息 参数化
		basic_info.click();
		car_num_area_list.click();
		car_num_area_list_index.click();
		car_num.sendKeys("LLY1049");
		// 车辆类型
		car_type_box.click();
		car_type.click();
		// 所有人 公户
		car_publiser_.click();
		// 是否一手车
		firsthand_n.click();

		// 过户票
		transfer_user_y.click();

		// 上次过户日期
		transfer_date.click();
		confirm_yes.click();

		// 过户次数
		transfer_times_input.click();

		transfer_times.click();

		// 使用性质
		using_nature_.click();

		using_nature_index.click();
		// VIN 输入
		vin_code_.sendKeys("LLY049");

		// 车型车系
		models_cars.click();
		// int w1idth = driver.manage().window().getSize().width;
		// int h1eight = driver.manage().window().getSize().height;
		// driver.swipe(w1idth/2, h1eight*3/10, w1idth/2, h1eight/10, 1000);
		// Thread.sleep(2000);
		models_cars_1.click();
		Thread.sleep(2000);
		models_cars_1_2.click();
		models_cars_1_2_3.click();

		// 国标码
		guobiao_num.sendKeys("FWL000002");

		Thread.sleep(6000);

		// 需要滑动
		// driver.scrollTo("出场日期");
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 5 / 10, width / 2, height / 10, 1000);

		// 出场日期
		Thread.sleep(2000);
		System.out.println("---------------------------");
		production_date.click();
		System.out.println("--------------Debug-------------");
		confirm_yes.click();

		// 发动机号
		engine_num.sendKeys("LYW00002");

		// 注册日期
		register_date.click();
		confirm_yes.click();

		// 交强险
		jiaoqiangxian_n.click();

		// 商业险
		commercial_insurance_n.click();
		driver.swipe(width / 2, height * 6 / 10, width / 2, height / 10, 1000);
		// 年检
		nianjian_n.click();
		driver.swipe(width / 2, height * 6 / 10, width / 2, height / 10, 1000);
		// 车船税
		travel_tax_n.click();

		// 库存地
		car_inventory_input.click();
		car_inventory_city.click();

		/*
		 * car_inventory_province.click(); car_inventory_province_index.click();
		 * 
		 * car_inventory_city.click(); car_inventory_city_index.click();
		 * 
		 * confirm_yes.click();
		 */

		// 车身颜色
		choose_car_color.click();
		choose_white_color.click();

		// 燃油类型
		System.out.println("******************");
		fuel_type.click();
		choose_electric.click();

		/*
		 * int w = driver.manage().window().getSize().width; int h =
		 * driver.manage().window().getSize().height; driver.swipe(w/2, h*6/10,
		 * w/2, h/10, 1000);
		 */

		displacement1.click();
		displacement1_index.click();

		displacement2.click();
		displacement2_index.click();
		// driver.scrollTo("保存信息");

		// 车钥匙
		car_key.click();
		// 2
		car_key_2.click();
		driver.swipe(width / 2, height * 6 / 10, width / 2, height / 10, 1000);
		sales_persion_mail.sendKeys("qa@xin.com");

		save_info.click();
	}

	public void credentials_shoot() throws InterruptedException {
		
		credentials_shoot.click();

		pictures_list1.click();

		// 行驶证正面
		click_camera.click();
		Thread.sleep(2000);
		save_picture.click();

		// 行驶证副证(必拍)
		click_camera.click();
		Thread.sleep(2000);
		save_picture.click();
		// 行驶证副证背面
		right_next_arrow.click();

		// 行驶证车辆照片
		right_next_arrow.click();

		// 登记证第一页 必拍
		click_camera.click();
		Thread.sleep(2000);
		save_picture.click();

		// 登记证第二页 必拍
		click_camera.click();
		Thread.sleep(2000);
		save_picture.click();

		// 登记证第三页
		right_next_arrow.click();
		// 登记证第四页
		right_next_arrow.click();

		// 登记证第五页
		right_next_arrow.click();
		// 登记证第六页
		right_next_arrow.click();
		// 商业保险单据上部
		right_next_arrow.click();
		// 商业保险单下部
		right_next_arrow.click();
		// 保险单批单
		right_next_arrow.click();
		// 交强险单据上部
		right_next_arrow.click();
		// 交强险单据下部
		right_next_arrow.click();

		// 交强险批单
		right_next_arrow.click();

		// 车辆发票
		right_next_arrow.click();
		// 购置税第一页
		right_next_arrow.click();
		// 购置税第二页
		right_next_arrow.click();
		// 气瓶证第一页
		right_next_arrow.click();
		// 气瓶证第二页
		right_next_arrow.click();
		// 进口商检单
		right_next_arrow.click();
		// 货运资格证
		right_next_arrow.click();
		// 车船税票
		right_next_arrow.click();
		// 退出拍照
		exit_shoot.click();
		exit_shoot_yes.click();
		head_back.click();

	}

	public void new_add_detection1() {
		new_add_detection.click();

	}

	public void car_detection() throws InterruptedException {

		/*
		 * Thread.sleep(3000); login_button.click(); Thread.sleep(5000);
		 * new_add_detection.click();
		 * 
		 * // Thread.sleep(5000); // index1.click(); // choose_confirm.click();
		 * 
		 * edit_search.sendKeys("北京现场测试公司"); search_button.click();
		 * Thread.sleep(2000); search_index1.click(); confirm_yes.click();
		 */

		car_front_.click();
		take_photo_start.click();
		Thread.sleep(2000);

		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();

		next_page.click();
		// 车头2/5
		no_exception.click();

		// 车头3/5
		no_exception.click();
		//
		no_exception.click();
		// 5/5
		no_exception.click();
		// 1/18
		no_exception.click();
		// 2/18
		no_exception.click();
		// 3/18
		no_exception.click();
		// 4/18
		no_exception.click();
		// 5/18
		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();
		// 6/18
		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 7/18
		no_exception.click();

		// 8/18
		no_exception.click();
		// 9/18
		no_exception.click();

		// 10/18
		no_exception.click();
		// 11/18
		no_exception.click();
		// 12/18
		no_exception.click();
		// 13/18
		no_exception.click();
		// 14/18
		no_exception.click();
		// 15/18
		no_exception.click();
		// 仪表16/18

		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		edit_mile.sendKeys("3");

		next_page.click();

		// 17/18

		no_exception.click();
		// 18/18
		no_exception.click();
		// 机电检查
		start_check.click();
		engine_check.click();
		turn_check.click();
		smoke.click();
		operation.click();
		electric.click();
		road_test.click();
		speedbox.click();

		save_tonext.click();

		// 左后车门1/13
		no_exception.click();

		// 左后车身 2/13
		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 左后车身 3/13
		no_exception.click();

		// 左后车身 4/13 左后车门内饰
		no_exception.click();

		// 左后车身 5/13 左B柱铰链
		no_exception.click();
		// 左后车身 6/13 左C柱上部
		no_exception.click();

		// 左后车身 7/13 左C柱
		no_exception.click();

		// 左后车身 8/13 左后车门裙边
		no_exception.click();

		// 左后车身 9/13 仪表台
		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 左后车身 10/13 左后座椅
		no_exception.click();

		// 左后车身 11/13 左后翼子板
		no_exception.click();

		// 左后车身 12/13 左后车轮
		no_exception.click();

		// 左后车身 13/13 左后减震器
		no_exception.click();

		// 后备箱 1/14 后风挡玻璃
		no_exception.click();

		// 后备箱 2/14 后备箱盖
		no_exception.click();

		// 后备箱 3/14 车尾正视区域
		no_exception.click();

		// 后备箱 4/14 车尾正视区域

		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 后备箱 5/14 车尾正视区域
		spare_tire.click();
		tools.click();
		save_tonext.click();

		// 后备箱 6/14 后备箱
		no_exception.click();

		// 后备箱 7/14 后备箱盖内部
		no_exception.click();
		// 后备箱 8/14 后备箱左铰链
		no_exception.click();
		// 后备箱 9/14 左后翼子板内衬
		no_exception.click();

		// 后备箱 10/14 后围板
		no_exception.click();
		// 后备箱 11/14 后备箱底板
		no_exception.click();
		// 后备箱 12/14 右后翼子板内衬
		no_exception.click();
		// 后备箱 13/14 后备箱右铰链
		no_exception.click();
		// 后备箱 14/14 车辆后底盘
		no_exception.click();
		// 后备箱 1/11 右后45度
		take_photo_start.click();
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 右后车身 2/11 右后翼子板
		no_exception.click();
		// 右后车身 3/11 右后车轮
		no_exception.click();
		// 右后车身 4/11 右后减震器
		no_exception.click();
		// 右后车身 5/11 右后车门
		no_exception.click();
		// 右后车身 6/11 右后车门骨架
		no_exception.click();
		// 右后车身 7/11 右后车门内饰
		no_exception.click();
		// 右后车身 8/11 右B柱铰链
		no_exception.click();
		// 右后车身 9/11 右C柱上部
		no_exception.click();
		// 右后车身 10/11 右C柱
		no_exception.click();
		// 右后车身 11/11 右后车门裙边
		no_exception.click();

		// 右前车身 1/12 右前车门
		no_exception.click();

		// 右前车身 2/12 右前车门骨架
		no_exception.click();
		// 右前车身 3/12 右前车门内饰
		no_exception.click();
		// 右前车身 4/12 右A柱下部
		no_exception.click();
		// 右前车身 5/12 右A柱上部
		no_exception.click();
		// 右前车身 6/12 右B柱
		no_exception.click();
		// 右前车身 7/12 右前车门裙边
		no_exception.click();
		// 右前车身 8/12 副驾驶席区域
		no_exception.click();
		// 右前车身 9/12 车顶内饰
		no_exception.click();
		// 右前车身 10/12 右前翼子板
		no_exception.click();
		// 右前车身 11/12 右前车轮
		no_exception.click();
		// 右前车身 12/12 右前减震器
		no_exception.click();

		// 车顶 1/1
		no_exception.click();

		// 发动机舱 1/18 发动机全景
		take_photo_start.click();
		Thread.sleep(2000);
		take_photo.click();
		Thread.sleep(2000);
		save_photo.click();
		next_page.click();

		// 发动机舱 2/18 发动机舱
		no_exception.click();
		// 发动机舱 3/18 发动机盖内侧
		no_exception.click();
		// 发动机舱 4/18 发动机盖左侧铰链
		no_exception.click();
		// 发动机舱 5/18 左侧减震器支架
		no_exception.click();
		// 发动机舱 6/18 左侧发动机翼子板架
		no_exception.click();
		// 发动机舱 7/18 左侧水箱框架
		no_exception.click();
		// 发动机舱 8/18 左前梁头
		no_exception.click();
		// 发动机舱 9/18 水箱框架
		no_exception.click();
		// 发动机舱 10/18 前横梁
		no_exception.click();
		// 发动机舱 11/18 右前纵梁
		no_exception.click();
		// 发动机舱 12/18 右侧水箱框架
		no_exception.click();
		// 发动机舱 13/18 右侧减震器支架
		no_exception.click();
		// 发动机舱 14/18 右侧发动机翼子板架
		no_exception.click();
		// 发动机舱 15/18 发动机盖右侧铰链
		no_exception.click();
		// 发动机舱 16/18 防火墙
		no_exception.click();
		// 发动机舱 17/18 车架号
		no_exception.click();
		// 发动机舱 18/18 检测列表
		eng_oil_yes.click();
		liqued_yes.click();
		brake_oil_exception.click();
		asess_oil_exception.click();
		battery_check.click();
		belt_check.click();

		save_tonext.click();

		// 改装说明 1/1
		whether_modification.click();
		save_tonext.click();

		// 漆面修复概况 1/2
		nx.click();

		// 漆面修复概况 2/2
		nx.click();

		// 漆面复合评价1/1
		paint_repaire_history_.click();
		partial_paint.click();

		// 当前状况说明

		currentstate_paint_.click();

		general_quality.click();

		// 修复整备说明
		repaire_describe_.click();
		repair_part.click();

		car_describe.sendKeys("QA Test");

		// 评级
		save_tonext.click();

		comprehensive_condition_ratings.click();
		driver.scrollTo("维护成本评级");
		maintenance_costs_ratings.click();

		save_tonext.click();
		head_back.click();

		// 点击返回
		// driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();

		// 点击未完成检测
		driver.findElement(
				By.xpath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]"))
				.click();
		// 点击上传
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.Button[2]"))
				.click();
		Thread.sleep(15000);
		// 点击返回
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]"))
				.click();

	}

	public void baseInfo() throws InterruptedException {

		System.out.println("进入 基本信息  选项------开始填写基本信息");
		baseinformation.click();

		System.out.println("车牌号 选项------先选择车籍地以及车牌号");

		license_plate_number.sendKeys("a139105");

		System.out.println("车辆类型 选项------先点击然后选取车辆类型");
		vehicle_type.click();
		choose_vehicle_type.click();

		System.out.println("所有人 选项------选择公户或者私户");
		holder.click();
		use_properties.click();
		System.out.println("使用性质 选项------");
		operations.click();

		System.out.println("VIN码 选项------");
		vin.sendKeys("131105");

		System.out.println("车型车系 选项------");
		choose_car_model.click();
		driver.scrollTo("大众");
		select_vehicle_brand.click();
		select_car_series.click();
		select_car_type.click();

		System.out.println("国标码 选项------");
		guobiao_no.sendKeys("93X88105");
		// driver.hideKeyboard();
		top_text.click();

		Thread.sleep(8000);
		System.out.println("出厂日期 选项------");
		production_date.click();
		// production_date_1.sendKeys("2015");
		// production_date_2.sendKeys("1");
		// production_date_3.sendKeys("05");
		confirm_current_date.click();

		System.out.println("发动机号 选项------");
		engine_no.sendKeys("LNBSCCBH93X88105");
		// top_text.click();
		//
		System.out.println("注册日期选项------");
		scroll_to_datescreen.click();
		confirm_current_date.click();
		System.out.println("开始翻页------");

		driver.scrollTo("燃油类型");
		System.out.println("交强险到期日期 ------ ");
		forassurance.click();
		confirm_current_date.click();

		System.out.println("库存地");

		inventory.click();
		choose_inventory.click();

		choose_beijing.click();

		confirm_inventory.click();

		System.out.println("车身颜色------");
		choose_car_color.click();

		choose_white_color.click();
		System.out.println("燃油类型------");
		fuel_type.click();

		choose_electri.click();

		System.out.println("车钥匙------");
		car_key.click();

		car_key_2.click();
		System.out.println("✅基本信息保存");
		save_info.click();

		// driver.scrollTo("燃油类型");

	}

	public void certificate_shoot() {

		credentials_take_picture.click();
		// car_front.click();
		front_shoot.click();

		click_shoot.click();
		save_picture.click();
		click_shoot.click();
		save_picture.click();

		yes.click();

		reg_certificate.click();// 登记证
		click_shoot.click();
		save_picture.click();
		click_shoot.click();
		save_picture.click();
		exit_shoot.click();
		exit_shoot_yes.click();
		head_back.click();

	}

//	public void carCheck_takePicture() {
//		// 注意是否已经点击 初始化掉按钮
//		take_photo.click();
//		click_camera.click();
//
//		save_photo.click();
//		next_page.click();
//
//	}

	public void car_front_start() throws InterruptedException {
		/*Thread.sleep(3000);
		login_button.click();
		Thread.sleep(5000);
		new_add_detection.click();
		// all_dealer.click();

		// Thread.sleep(5000);
		index1.click();
		second_hand_check.click();
		*/
		
		car_front.click();
		// carCheck_takePicture();

	}

	// 左前45度
	public void carFront1_5() throws InterruptedException {
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		// 2 /5
		 engine_cover.click();

	}
	
	public void flaw() throws InterruptedException {
		Thread.sleep(2000);
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

	}

	public void carFront2_5() throws InterruptedException {
		System.out.println("******🚗车头  2/5 车辆前底盘 瑕疵点******");
		System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8掉漆[3] 9丢件[1]  10漆面异常[3]");
		ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap  3+1--->8掉漆[3] 9丢件[1]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		driver.scrollTo("漆面异常");

		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("剩余  10漆面异常[3]");
//		front_windshield.click();
		// item_next.click();
		front_windshield.click();

	}
	
	
	public void carFront3_5() throws InterruptedException {
		System.out.println("******🚗车头  3/5  前风挡玻璃 瑕疵点******");
		System.out.println("1玻璃检查[5] 2更换[1] 3胶条异常[2]");
		
		
		System.out.println("无第三个Tap");
		front_facing_area.click();
		
	}
	
	public void carFront4_5() throws InterruptedException {
		
		System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8水泡[1] 9破裂[1] 10丢件[1] 11晃动[1] 12板间间隙[1] 13灯组检测[2] 14掉漆[3] 15剐蹭[3]");
		
		ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		Thread.sleep(3000);
		// 第三个Tap
		System.out.println("第三个Tap 1+1+1+1--->8水泡[1] 9破裂[1] 10丢件[1] 11晃动[1]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		System.out.println("------------------执行滑动方法----------------------------------");
		
		
//		int wl = listview_swipe.getSize().width;
//		int hl = listview_swipe.getSize().height;
//		driver.swipe(wl * 8 / 10, hl / 2, wl * 1 / 10, hl / 2,1000);
		
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
//		driver.scrollTo("剐蹭");
//		int wl = listview_swipe.getSize().width;
//		int hl = listview_swipe.getSize().height;
//		driver.swipe(wl * 8 / 10, hl / 2, wl * 1 / 10, hl / 2,1000);
//		int w1idth = driver.manage().window().getSize().width;
//		int h1eight = driver.manage().window().getSize().height;
//		driver.swipe(w1idth/2, h1eight*3/10, w1idth/2, h1eight/10, 1000);
		
		
		
//		WebElement datePicker= driver.findElement(By.name("Date Picker"));
//		WebElement steppers= driver.findElement(By.name("Steppers"));
//		int startY=steppers.getLocation().y;
//		int endY=datePicker.getLocation().y;
//		System.out.println(startY +" -- "+ endY);
//		//act.press(datePicker, 30, 10).release().perform();
//		
//		//act.press(150, startY).moveTo(150, endY).release().perform();
//		act.press(steppers, 30, 10).moveTo(datePicker).release().perform();
		
//		ck3_spdz.click();
		
//		int wd = driver.manage().window().getSize().width;
//		int hg = driver.manage().window().getSize().height;
//		int wl = listview_swipe.getSize().width;
//		int hl = listview_swipe.getSize().height;
//        driver.swipe(wl/2, hl*6/10, wl/2, hl/10, 1000);
//		driver.swipe(wl/2, hl*3/10, wl/2, hl/10, 1000);
		driver.scrollTo("剐蹭");
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		ck3_nshd.click();
		ck3_nshd1.click();
		save_flaw.click();
		
		System.out.println("剩余 12板间间隙[1] 13灯组检测[2] 14掉漆[3] 15剐蹭[3]");
		front_chassis.click();
	}
	
	
	
	public void carFront5_5() throws InterruptedException {
		
		System.out.println("******🚗车头  5/5 车辆前底盘 瑕疵点******");
		System.out.println("6铂金痕迹[4-1=3] 7更换[1]");
		ck3_gjbj.click();
		ck3_gjbj2.click();
		add_flaw.click();
		
		
		ck3_gjbj3.click();
		add_flaw.click();
		
		ck3_gjbj4.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		
	}

	public void nx() {
		nx_item.click();

	}
	
	public void left_front_body_1_18() throws InterruptedException{
		left_front_body_1_18.click();
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		
		left_front_body_2_18.click();
		
		
	}
	
	public void left_front_body_2_18() throws InterruptedException{
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		left_front_body_3_18.click();
	}
	
	public void left_front_body_3_18() throws InterruptedException{
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		edit_mile.sendKeys("30");
		sure.click();
		
		
		
		left_front_body_4_18.click();
	}
	public void left_front_body_4_18() throws InterruptedException{
		System.out.println("左前翼子板");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8丢件[1] 9破裂[1] 10漆面异常[3] 11剐蹭[3] 12掉漆[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+1+2--->8丢件[1] 9破裂[1] 10漆面异常[3]");
		Thread.sleep(2000);
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		driver.scrollTo("掉漆");

		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		
		System.out.println("剩余  10漆面异常[3-2=1] 11剐蹭[3] 12掉漆[3]");
		
		left_front_body_5_18.click();
		
	}
	public void left_front_body_5_18() throws InterruptedException {
		System.out.println("左前车轮");
		System.out.println("有2个子选项 1.轮胎异常[5]  2. 轮毂异常[3]");
		System.out.println("左前车轮第一轮已经点击完毕 无第二轮");
		left_front_body_6_18.click();
		
		
	}
	public void left_front_body_6_18(){
		System.out.println("左前减震器");
		System.out.println("1.减震器异常[3]");
		System.out.println("左前减震器 第一轮已经点击完毕 无第二轮");
		left_front_body_7_18.click();
		
	}
	public void left_front_body_7_18() throws InterruptedException{
		System.out.println("******🚗车头  2/5 左前车门 瑕疵点******");
		System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[2] 9漆面异常[3] 10剐蹭[3] 11晃动[1] 12掉漆[3] 13丢件[1]");
		
		ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
//断点处
		Thread.sleep(3000);
		// 第三个Tap
		System.out.println("第三个 Tap 2+2--->8玻璃检查[2] 9漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		
		ck3_bl2.click();
		add_flaw.click();
		
		driver.scrollTo("丢件");
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		
		System.out.println("剩余 4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[2] 9漆面异常[3] 10剐蹭[3] 11晃动[1] 12掉漆[3] 13丢件[1]");
		
		left_front_body_8_18.click();
		
		
	}
	public void left_front_body_8_18() throws InterruptedException{
		System.out.println("左前车门骨架");
		System.out.println("5划伤[4] 6更换[1]");
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap  6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
	
		System.out.println("第二个Tap点击完成 第三轮无");
		left_front_body_9_18.click();
		
	
	}
	public void left_front_body_9_18() throws InterruptedException{
		System.out.println("左前车门内饰");
		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap  7水泡[2]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完成✅  🈚️第三轮");
		left_front_body_10_18.click();
		
		
	}
	public void left_front_body_10_18() throws InterruptedException{
		System.out.println("左A柱下部");
		System.out.println("左前车门骨架");
		System.out.println("4拆卸痕迹[3－2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4-3=1] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		Thread.sleep(3000);
		System.out.println("------------------------------");
//		driver.scrollTo("变速杆");
		
		left_front_body_10_18.click();
		
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		left_front_body_11_18.click();
		
		
	}
	public void left_front_body_11_18() throws InterruptedException{
		System.out.println("左A柱上部");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb2.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println(" 第三个Tap 1+3--->7修补痕迹[3-2=1] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余  9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		left_front_body_12_18.click();
		
	}
	public void left_front_body_12_18() throws InterruptedException{
		System.out.println("左B柱");
		System.out.println("4拆卸痕迹[3-2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3--->7更换[1] 8修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		add_flaw.click();
		
		ck3_wgxb3.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		left_front_body_13_18.click();
		
	}
	public void left_front_body_13_18() throws InterruptedException {
		System.out.println("左前车门裙边");
		
		System.out.println("左A柱上部");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6托底[1] 7破裂[1] 8更换[1] 9掉漆[3] 10修补痕迹[3] 11丢件[1] 12剐蹭[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+1+1-->5凹坑[3-2=1] 6托底[1] 7破裂[1] 8更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();

		
		Thread.sleep(3000);
		
		
		// 第三个Tap
		System.out.println("第三个Tap 3+1--->9掉漆[3] 10修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		driver.scrollTo("剐蹭");
	   
		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		save_flaw.click();
		
		System.out.println("剩余 10修补痕迹[3-1=2] 11丢件[1] 12剐蹭[3]");
		left_front_body_14_18.click();
		
	}
	public void left_front_body_14_18() throws InterruptedException{
		System.out.println("驾驶席区域");
		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2] 8晃动[1]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 2+1-->7水泡[2] 8晃动[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spzy.click();
		ck3_spzy1.click();
		add_flaw.click();
		
		ck3_spzy2.click();
		add_flaw.click();
		
		ck3_spzy3.click();
		add_flaw.click();
		
		
		ck3_nshd.click();
		ck3_nshd1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nstx.click();
		ck3_nstx3.click();
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		save_flaw.click();
		
		System.out.println("剩余   4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2] 8晃动[1]");
		left_front_body_15_18.click();
	}
	public void left_front_body_15_18() throws InterruptedException{
		System.out.println("方向盘");
		System.out.println("5丢件[1] 6爆裂[1] 7晃动[1]");
		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		ck3_qnbl.click();
		ck3_qnbl1.click();
		add_flaw.click();
		
		ck3_nshd.click();
		ck3_nshd1.click();
		save_flaw.click();
		System.out.println("第二个Tap 全部瑕疵点点击完毕 🈚️第三轮");
		left_front_body_16_18.click();
	}
	public void left_front_body_16_18() throws InterruptedException{
		
		System.out.println("仪表板");
		System.out.println("4破损[4-3=1] 5烧烫[2] 6花屏[1] 7故障灯[1]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_nshp.click();
		ck3_nshp1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7故障灯[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsgz.click();
		ck3_nsgz1.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕  🈚️第三轮");
		
		left_front_body_17_18.click();
		
	}
	public void left_front_body_17_18() throws InterruptedException{
		System.out.println("中控");
		System.out.println("5破损[4] 6烧烫[2] 7丢件[1]");
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 2+1-->6烧烫[2] 7丢件[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕  🈚️第三轮");
		
		left_front_body_18_18.click();
		
	}
	
	public void left_front_body_18_18() throws InterruptedException{
		System.out.println("变速杆");
		System.out.println("5丢件[1]");
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部");
		 
		
	}
	public void electromechanicalCheck(){
		
		start_check.click();
		engine_check.click();
		turn_check.click();
		smoke.click();
		operation.click();
		electric.click();
		road_test.click();
		speedbox.click();
		
		
	}
	public void left_rear_car_body_1_13() throws InterruptedException{
		
		System.out.println("后排座椅");
		left_rear_car_body_1_13.click();
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		left_rear_car_body_2_13.click();
		
	}
	public void left_rear_car_body_2_13() throws InterruptedException{
		System.out.println("仪表台");
		
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		left_rear_car_body_3_13.click();
		
	}
	
	public void left_rear_car_body_3_13() throws InterruptedException{
		
		System.out.println("左后车门");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[2] 9漆面异常[3] 10剐蹭[3] 11掉漆[3] 12丢件[1]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println(" 2+2--->8玻璃检查[2] 9漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		
		ck3_bl2.click();
		add_flaw.click();
		
		driver.scrollTo("丢件");
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3-2=1] 10剐蹭[3] 11掉漆[3] 12丢件[1]");
		
		left_rear_car_body_4_13.click();
		
	}
	public void left_rear_car_body_4_13() throws InterruptedException{
		
		System.out.println("左后车门骨架");
		
		System.out.println("5划伤[4] 6更换[1]");
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮全部瑕疵点点击完毕✅  🈚️第三轮");
		
		left_rear_car_body_5_13.click();
		
	}
	
	public void left_rear_car_body_5_13() throws InterruptedException {
		
		System.out.println("左后车门内饰");
		
		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7水泡[2]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		save_flaw.click();
		System.out.println("全部瑕疵点点击完毕✅  🈚️第三轮");
		
		left_rear_car_body_6_13.click();
		
	}
	
	public void left_rear_car_body_6_13() throws InterruptedException{
		System.out.println("左B柱铰链");
		
		System.out.println("4拆卸痕迹[3-2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4-3=1] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap   1+3--->7更换[1] 8修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		add_flaw.click();
		
		ck3_wgxb3.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
	
		System.out.println("------------------------------");
		left_rear_car_body_7_13.click();
		
	}
	
	public void left_rear_car_body_7_13() throws InterruptedException{
		
		System.out.println("左C柱上部");
		
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap   1+3---->7修补痕迹[3-2=1] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		
		left_rear_car_body_8_13.click();
		
	}
	public void left_rear_car_body_8_13() throws InterruptedException{
		System.out.println("左C柱");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap   1+3--->7修补痕迹[3] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		
		left_rear_car_body_9_13.click();
		
		
		
	}
	
	public void left_rear_car_body_9_13() throws InterruptedException{
		System.out.println("左后车门裙边");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6托底[1] 7破裂[1] 8更换[1] 9掉漆[3] 10修补痕迹[3] 11丢件[1] 12剐蹭[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+1+1-->5凹坑[3-2=1] 6托底[1] 7破裂[1] 8更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap   3+1--->9掉漆[3] 10修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		driver.scrollTo("剐蹭");
		
		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		save_flaw.click();
		
		System.out.println("剩余 10修补痕迹[3-1=2] 11丢件[1] 12剐蹭[3]");
		
		left_rear_car_body_10_13.click();
		
	}
	
	public void left_rear_car_body_10_13() throws InterruptedException{
		System.out.println("左后座椅");
		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[3]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7水泡[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_spdz3.click();
		save_flaw.click();
		System.out.println("第二轮全部瑕疵点点击完毕✅  🈚️ 第三轮");
		
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		left_rear_car_body_11_13.click();
		
		
	}
	
	public void left_rear_car_body_11_13() throws InterruptedException{
		System.out.println("左后翼子板");
        System.out.println("4色差[3－2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8丢件[1]  9破裂[1] 10漆面异常[3] 11剐蹭[3] 12掉漆[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
//断点处
		Thread.sleep(3000);
		// 第三个Tap
		System.out.println("第三个Tap 1+1+2--->8丢件[1]  9破裂[1] 10漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		driver.scrollTo("掉漆");
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		
		System.out.println("剩余 10漆面异常[3-2=1] 11剐蹭[3] 12掉漆[3]");
		left_rear_car_body_12_13.click();
		
	}
	public void left_rear_car_body_12_13() throws InterruptedException{
		System.out.println("左后车轮");
        System.out.println("有2个子选项 1.轮胎异常[5]  2. 轮毂异常[3]");
		System.out.println("🈚️第二轮");
		
		left_rear_car_body_13_13.click();
		
		
	}
	public void left_rear_car_body_13_13(){
		System.out.println("左后减震器");
		System.out.println("1.减震器异常[3]");
		System.out.println("🈚️第二轮");
		
	}
	
	public void trunck_1_13() throws InterruptedException{
		trunck_1_13.click();
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		
		trunck_2_13.click();
		
	}
	
	public void trunck_2_13() throws InterruptedException{
		System.out.println("1玻璃检查[5] 2更换[1] 3胶条异常[2]");
		
		System.out.println("🈚️第二轮");
		
		trunck_3_13.click();
		
	}
	public void trunck_3_13() throws InterruptedException{
		System.out.println("后备箱盖");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8掉漆[3] 9丢件[1] 10漆面异常[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1--> 6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		Thread.sleep(3000);
		// 第三个Tap
		System.out.println("// 第三个Tap 3+1--->8掉漆[3] 9丢件[1]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		driver.scrollTo("漆面异常");
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("剩余 10漆面异常[3]");
		
		trunck_4_13.click();
		
	}
	
	public void trunck_4_13() throws InterruptedException{
		System.out.println("车尾正视区域");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8水泡[1] 9丢件[1] 10破裂[1] 11晃动[1] 12板件间隙[1] 13灯组检测[2] 14掉漆[3] 15剐蹭[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		Thread.sleep(3000);
		// 第三个Tap
		
		System.out.println("// 第三个Tap 1+1+1+1--->8水泡[1] 9丢件[1] 10破裂[1] 11晃动[1]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		driver.scrollTo("剐蹭");
		
		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_nshd.click();
		ck3_nshd1.click();
		save_flaw.click();
		
		System.out.println("剩余 12板件间隙[1] 13灯组检测[2] 14掉漆[3] 15剐蹭[3]");
		
		trunck_5_13.click();
	}
	
	public void trunck_5_13() throws InterruptedException {
		System.out.println("后备箱");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[3] 6破损[4] 7污渍[3] 8胶条异常[2] 9磨损[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_sphbx.click();
		ck3_sphbx1.click();
		add_flaw.click();
		
		ck3_sphbx2.click();
		add_flaw.click();
		
		ck3_sphbx3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6破损[4]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap  3+1--->7污渍[3] 8胶条异常[2]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_nswz.click();
		ck3_nswz1.click();
		add_flaw.click();
		
		ck3_nswz2.click();
		add_flaw.click();
		
		ck3_nswz3.click();
		add_flaw.click();
		
		ck3_jt.click();
		ck3_jt1.click();
		save_flaw.click();
		
		System.out.println("剩余 8胶条异常[2-1=1] 9磨损[3]");
		trunck_6_13.click();
		
	}
	
    public void trunck_6_13() throws InterruptedException {
		System.out.println("后备箱盖内部");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1] 6破裂[1] 7胶条异常[2] 8破损[4] 9污渍[3] 10磨损[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_jt.click();
		ck3_jt1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap  1+3-->7胶条异常[2-1=1] 8破损[4]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_jt.click();
		ck3_jt2.click();
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap  3+1--->8破损[4-3=1] 9污渍[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		
		driver.scrollTo("磨损");
		
		ck3_nswz.click();
		ck3_nswz1.click();
		add_flaw.click();
		
		ck3_nswz2.click();
		add_flaw.click();
		
		ck3_nswz3.click();
		save_flaw.click();
		
		System.out.println("剩余 10磨损[3]");
		trunck_7_13.click();
	}
    
	public void trunck_7_13() throws InterruptedException {
		System.out.println("后备箱左铰链");
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3生锈痕迹[3] 4拆卸痕迹[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		trunck_8_13.click();
	}
	
    public void trunck_8_13() throws InterruptedException {
		System.out.println("左后翼子板内衬");
		System.out.println("4拆卸痕迹[3－2=1] 5水泡[3] 6更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_sphbx.click();
		ck3_sphbx1.click();
		add_flaw.click();
		
		ck3_sphbx2.click();
		add_flaw.click();
		
		ck3_sphbx3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		
		trunck_9_13.click();
	}
    
	public void trunck_9_13() throws InterruptedException {
		System.out.println("后围板");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		trunck_10_13.click();
	}
	
    public void trunck_10_13() throws InterruptedException {
    	System.out.println("后备箱底板");
    	System.out.println("4水泡[3-2=1] 5更换[1]");
    	ck3_sphbx.click();
    	ck3_sphbx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		trunck_11_13.click();
		
	}
	public void trunck_11_13() throws InterruptedException {
		System.out.println("右后翼子板内衬");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[3] 6更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_sphbx.click();
		ck3_sphbx1.click();
		add_flaw.click();
		
		ck3_sphbx2.click();
		add_flaw.click();
		
		ck3_sphbx3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
//		trunck_12_13();
		trunck_12_13.click();
	}
	
    public void trunck_12_13() throws InterruptedException {
		System.out.println("后备箱右铰链");
		System.out.println("4拆卸痕迹[3-2=1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		trunck_13_13.click();
	}
    public void trunck_13_13() throws InterruptedException {
		System.out.println("车辆后底盘");
		System.out.println("7钣金痕迹[4] 8更换[1]");
		ck3_gjbj.click();
		ck3_gjbj1.click();
		add_flaw.click();
		
		ck3_gjbj2.click();
		add_flaw.click();
		
		ck3_gjbj3.click();
		add_flaw.click();
		
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 3+1-->3生锈痕迹[3] 4排气管锈裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("剩余7铂金痕迹[4] 8更换[1]");
		
	}
    
    public void toolCheck(){
    	spare_tire.click();
    	tools.click();
    	
    }
    
    public void right_rear_car_body_1_11() throws InterruptedException{
    	System.out.println("右后45度");
    	right_rear_car_body_1_11.click();
    	shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		
		right_rear_car_body_2_11.click();
    	
    	
    }
    
    public void right_rear_car_body_2_11() throws InterruptedException{
    	System.out.println("右后翼子板");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8丢件[1] 9破裂[1] 10剐蹭[3] 11漆面异常[3] 12掉漆[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();
		

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+1+2--->8丢件[1] 9破裂[1] 10剐蹭[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		driver.scrollTo("掉漆");
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_gc.click();
		ck3_gc1.click();
		add_flaw.click();
		
		ck3_gc2.click();
		save_flaw.click();
    	
		System.out.println("剩余 10剐蹭[3-2=1] 11漆面异常[3] 12掉漆[3]");
		right_rear_car_body_3_11.click();
    }
    public void right_rear_car_body_3_11() throws InterruptedException {
    	System.out.println("右后车轮");
        System.out.println("有2个子选项 1.轮胎异常[5]  2. 轮毂异常[3]");
		System.out.println("第二轮🈚️");
		right_rear_car_body_4_11.click();
    	
    }
    public void right_rear_car_body_4_11(){
    	System.out.println("右后减震器异常");
    	System.out.println("第二轮🈚️");
		right_rear_car_body_5_11.click();
    	
    }
    public void right_rear_car_body_5_11() throws InterruptedException{
    	System.out.println("右后车门");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[2] 9漆面异常[3] 10剐蹭[3] 11掉漆[3] 12丢件[1]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 2+2--->8玻璃检查[2] 9漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		
		ck3_bl2.click();
		add_flaw.click();
		
		driver.scrollTo("玻璃检查");
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		System.out.println("剩余 9漆面异常[3-2=1] 10剐蹭[3] 11掉漆[3] 12丢件[1]");
		right_rear_car_body_6_11.click();
    }
    public void right_rear_car_body_6_11() throws InterruptedException{
    	System.out.println("右后车门骨架");
    	System.out.println("5划伤[4] 6更换[1]");
    	ck3_wghs.click();
    	ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		right_rear_car_body_7_11.click();
    }
    public void right_rear_car_body_7_11() throws InterruptedException{
    	System.out.println("右后车门内饰");
    	System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2]");
    	ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7水泡[2]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		right_rear_car_body_8_11.click();
    }
    public void right_rear_car_body_8_11() throws InterruptedException{
    	System.out.println("右B柱铰链");
    	System.out.println("4拆卸痕迹[3-2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
    	ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3-->7更换[1] 8修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		add_flaw.click();
		
		ck3_wgxb3.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		right_rear_car_body_9_11.click();
    }
    public void right_rear_car_body_9_11() throws InterruptedException{
    	System.out.println("右C柱上部");
    	System.out.println("4划伤[4－2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
    	ck3_wghs.click();
    	ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3-->7修补痕迹[3] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		right_rear_car_body_10_11.click();
    }
    public void right_rear_car_body_10_11() throws InterruptedException{
    	System.out.println("右C柱");
    	System.out.println("4划伤[4-2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
    	System.out.println("4划伤[4－2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
    	ck3_wghs.click();
    	ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3-->7修补痕迹[3] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		right_rear_car_body_11_11.click();
    }
    public void right_rear_car_body_11_11() throws InterruptedException{
    	System.out.println("右后车门裙边");
    	System.out.println("4划伤[4-2=2] 5凹坑[3] 6托底[1] 7破裂[1] 8更换[1] 9掉漆[3] 10修补痕迹[3] 11丢件[1] 12剐蹭[3]");
    	
    	ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+1+1-->5凹坑[3] 6托底[1] 7破裂[1] 8更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 3+1-->9掉漆[3] 10修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		driver.scrollTo("剐蹭");
	   
		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		save_flaw.click();
		
		System.out.println("剩余 10修补痕迹[3-1=2] 11丢件[1] 12剐蹭[3]");
    	
    }
    
	public void right_front_car_body_1_13() throws InterruptedException {
		right_front_car_body_1_13.click();
		
		shoot_click.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();
		
		
		System.out.println("右前车门");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[2] 9漆面异常[3] 10剐蹭[3] 11晃动[1] 12掉漆[3] 12丢件[1]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7破裂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 2+2--->8玻璃检查[2] 9漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		
		ck3_bl2.click();
		add_flaw.click();
		
		driver.scrollTo("丢件");
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		System.out.println("剩余 9漆面异常[3-2=1] 10剐蹭[3] 11晃动[1] 12掉漆[3] 12丢件[1]");
		right_front_car_body_2_13.click();
	}

	public void right_front_car_body_2_13() throws InterruptedException {
		System.out.println("右前车门骨架");
		System.out.println("5划伤[4] 6更换[1]");
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 6更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅ 🈚️第三轮");
		right_front_car_body_3_13.click();

	}

	public void right_front_car_body_3_13() throws InterruptedException{
		System.out.println("右前车门内饰");
		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7水泡[2]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		
		ck3_spmb.click();
		ck3_spmb1.click();
		add_flaw.click();
		
		ck3_spmb2.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕✅  🈚️第三轮");
		right_front_car_body_4_13.click();
	}

	public void right_front_car_body_4_13() throws InterruptedException{
		System.out.println("右A柱下部");
		System.out.println("4拆卸痕迹[3-2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4-3=1] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3---> 7更换[1] 8修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		add_flaw.click();
		
		ck3_wgxb3.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		right_front_car_body_5_13.click();
	}

	public void right_front_car_body_5_13() throws InterruptedException{
		System.out.println("右A柱上部");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6更换[1] 7修补痕迹[3] 8漆面异常[3] 9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+2-->5凹坑[3-2=1] 6更换[1] 7修补痕迹[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("1+3--->7修补痕迹[3-2=1] 8漆面异常[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wgxb.click();
		ck3_wgxb3.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		add_flaw.click();
		
		ck3_qmyc3.click();
		save_flaw.click();
		
		System.out.println("剩余  9胶条异常[2] 10剐蹭[3] 11掉漆[3]");
		right_front_car_body_6_13.click();

	}

	public void right_front_car_body_6_13() throws InterruptedException {
		System.out.println("右B柱");
		System.out.println("4拆卸痕迹[3-2=1] 5划伤[4] 6凹坑[3] 7更换[1] 8修补痕迹[3] 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs1.click();
		add_flaw.click();
		
		ck3_wghs2.click();
		add_flaw.click();
		
		ck3_wghs3.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+3-->5划伤[4-3=1] 6凹坑[3]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wghs.click();
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		add_flaw.click();
		
		ck3_wgak3.click();
		save_flaw.click();
		
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap 1+3--->7更换[1] 8修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();
		
		ck3_wgxb2.click();
		add_flaw.click();
		
		ck3_wgxb3.click();
		save_flaw.click();
		
		System.out.println("剩余 9漆面异常[3] 10胶条异常[2] 11剐蹭[3] 12掉漆[3]");
		right_front_car_body_7_13.click();

	}

	public void right_front_car_body_7_13() throws InterruptedException {
		System.out.println("右前车门裙边");
		System.out.println("左A柱上部");
		System.out.println("4划伤[4-2=2] 5凹坑[3] 6托底[1] 7破裂[1] 8更换[1] 9掉漆[3] 10修补痕迹[3] 11丢件[1] 12剐蹭[3]");
		ck3_wghs.click();
		ck3_wghs3.click();
		add_flaw.click();
		
		ck3_wghs4.click();
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		
		ck3_wgak2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1+1+1-->5凹坑[3-2=1] 6托底[1] 7破裂[1] 8更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();

		
		Thread.sleep(3000);
		
		
		// 第三个Tap
		System.out.println("第三个Tap 3+1--->9掉漆[3] 10修补痕迹[3]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		driver.scrollTo("剐蹭");
		
		ck3_wgdq.click();
		ck3_wgdq1.click();
		add_flaw.click();
		
		ck3_wgdq2.click();
		add_flaw.click();
		
		ck3_wgdq3.click();
		add_flaw.click();
		
		ck3_wgxb.click();
		ck3_wgxb1.click();
		save_flaw.click();
		
		System.out.println("剩余 10修补痕迹[3-1=2] 11丢件[1] 12剐蹭[3]");
		right_front_car_body_8_13.click();
	}

	public void right_front_car_body_8_13() throws InterruptedException {
		System.out.println("副驾驶席区域");

		System.out.println("4破损[4-3=1] 5烧烫[2] 6丢件[1] 7水泡[2] 8晃动[1]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 2+1-->7水泡[2] 8晃动[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_spzy.click();
		ck3_spzy1.click();
		add_flaw.click();
		
		ck3_spzy2.click();
		add_flaw.click();
		
		ck3_nshd.click();
		ck3_nshd1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		right_front_car_body_9_13.click();
	}

	public void right_front_car_body_9_13() throws InterruptedException {
		System.out.println("车顶内饰");
		
		System.out.println("4破损[4－3=1] 5烧烫[2] 6丢件[1] 7更换[1] 8下垂[1]");
		ck3_nsps.click();
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_nsst.click();
		ck3_nsst1.click();
		add_flaw.click();
		
		ck3_nsst2.click();
		add_flaw.click();
		
		ck3_wgds.click();
		ck3_wgds1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 1+1-->7更换[1] 8下垂[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_nsxc.click();
		ck3_nsxc1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		right_front_car_body_10_13.click();
	}

	public void right_front_car_body_10_13() throws InterruptedException {
		System.out.println("右前翼子板");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8丢件[1] 9破裂[1] 10漆面异常[3] 11剐蹭[3] 12掉漆[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap  1+1+2--->8丢件[1] 9破裂[1] 10漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgds.click();
		ck3_wgds1.click();
		add_flaw.click();
		
		driver.scrollTo("掉漆");
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		add_flaw.click();
		
		ck3_qmyc2.click();
		save_flaw.click();
		System.out.println("剩余  10漆面异常[3-2=1] 11剐蹭[3] 12掉漆[3]");
		
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		
		right_front_car_body_11_13.click();
	}

	public void right_front_car_body_11_13() throws InterruptedException {
		System.out.println("右前车轮");
        System.out.println("有2个子选项 1.轮胎异常[5]  2. 轮毂异常[3]");
		System.out.println("🈚️第二轮");
		right_front_car_body_12_13.click();

	}

	public void right_front_car_body_12_13() {
		System.out.println("右前减震器");
		System.out.println("1.减震器异常[3]");
		System.out.println("🈚️第二轮");
		right_front_car_body_13_13.click();
	}

	public void right_front_car_body_13_13() throws InterruptedException {
		System.out.println("车顶");
        System.out.println("4色差[3-2=1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8安装孔[1] 9天窗[2] 10漆面异常[3] 11掉漆[3]");
		
        ck3_wgsc.click();
		ck3_wgsc3.click();
		add_flaw.click();
		
		ck3_wgxs.click();
		ck3_wgxs1.click();
		add_flaw.click();
		
		ck3_wgxs2.click();
		add_flaw.click();
		
		ck3_wgxs3.click();
		save_flaw.click();

		System.out.println("滑动第二Tap 3+1-->6修补痕迹[3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,
				1000);
		// driver.swipe(startx, starty, endx, endy, duration);
		// 第二个Tap
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(3000);
		add_flaw.click();

		ck3_wgxb.click();
		ck3_wgxb1.click();
		add_flaw.click();

		ck3_wgxb2.click();
		add_flaw.click();

		ck3_wgxb3.click();
		add_flaw.click();

		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap  1+2+1--->8安装孔[1] 9天窗[2] 10漆面异常[3]");
		driver.swipe(width*8/10, height/2, width*1/10, height/2, 1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();

		ck3_wgaz.click();
		ck3_wgaz1.click();
		add_flaw.click();
		
		driver.scrollTo("掉漆");
		
		ck3_tcyc.click();
		ck3_tcyc1.click();
		add_flaw.click();
		
		ck3_tcyc2.click();
		add_flaw.click();
		
		ck3_qmyc.click();
		ck3_qmyc1.click();
		save_flaw.click();
		System.out.println("剩余 10漆面异常[3-1=2] 11掉漆[3]");

	}
	
	public void engine_compartment_1_17() throws InterruptedException{
		engine_compartment_1_17.click();
		shoot_click.click();
		take_photo.click();
		Thread.sleep(5000);
		save_photo_.click();
		
		engine_compartment_2_17.click();
		
	}
	
	public void engine_compartment_2_17() throws InterruptedException {
		System.out.println("发动机舱");
		System.out.println("1打磨痕迹[1] 2生锈痕迹[3] 3滴漏[3] ");
		System.out.println("🈚️第二轮");
		engine_compartment_3_17.click();
	}

	public void engine_compartment_3_17() throws InterruptedException {
		System.out.println("发动机盖内侧");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1] 6胶条异常[2]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_jt.click();
		ck3_jt1.click();
		add_flaw.click();
		
		ck3_jt2.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_4_17.click();

	}

	public void engine_compartment_4_17() throws InterruptedException {
		System.out.println("发动机盖左侧铰链");
		System.out.println("4拆卸痕迹[3-2=1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		
		
		engine_compartment_5_17.click();

	}

	public void engine_compartment_5_17() throws InterruptedException {
		
		System.out.println("左侧减震器支架");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		
		engine_compartment_6_17.click();
	}

	public void engine_compartment_6_17() throws InterruptedException {
		
		System.out.println("左侧发动机翼子板");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[2] 6更换[1] 7破损[4] 8胶条异常[2]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7破损[4]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap --->8胶条异常[2]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_jt.click();
		ck3_jt1.click();
		add_flaw.click();
		
		ck3_jt2.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		
		engine_compartment_7_17.click();

	}

	public void engine_compartment_7_17() throws InterruptedException {
		
		System.out.println("左侧水箱框架");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[2] 6破损[4] 7更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 3+1-->6破损[4-1=3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		Thread.sleep(3000);
		engine_compartment_8_17.click();

	}

	public void engine_compartment_8_17() throws InterruptedException {
		System.out.println("左前粱头");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_9_17.click();

	}

	public void engine_compartment_9_17() throws InterruptedException {
		System.out.println("水箱框架");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[2] 6破损[4] 7更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 3+1-->6破损[4-1=3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_10_17.click();

	}

	public void engine_compartment_10_17() throws InterruptedException {
		System.out.println("前横梁");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1] 6托底[1] 7破裂[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_wgpl.click();
		ck3_wgpl1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		
		int wd = driver.manage().window().getSize().width;
		int hg = driver.manage().window().getSize().height;
		driver.swipe(wd/2, hg*6/10, wd/2, hg/10, 1000);
		
		
		engine_compartment_11_17.click();

	}

	public void engine_compartment_11_17() throws InterruptedException {
		System.out.println("右前纵梁");
		System.out.println("4拆卸痕迹[3-2=1] 5更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_12_17.click();

	}

	public void engine_compartment_12_17() throws InterruptedException {
		
		System.out.println("右侧水箱框架");
		System.out.println("4拆卸痕迹[3-2=1] 5水泡[2] 6破损[4] 7更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 3+1-->6破损[4-1=3] 7更换[1]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_13_17.click();

	}
	
	public void engine_compartment_13_17() throws InterruptedException {
		
		System.out.println("右侧减震器支架");
		System.out.println("4拆卸痕迹[3－2=1] 5更换[1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_14_17.click();

	}
	
	public void engine_compartment_14_17() throws InterruptedException {
		System.out.println("右侧发动机翼子板架");
		System.out.println("4拆卸痕迹[3－2=1] 5水泡[2] 6更换[1] 7破损[4] 8胶条异常[2]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7破损[4]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_nsps.click();
		ck3_nsps1.click();
		add_flaw.click();
		
		ck3_nsps2.click();
		add_flaw.click();
		
		ck3_nsps3.click();
		add_flaw.click();
		
		ck3_nsps4.click();
		save_flaw.click();
		
		Thread.sleep(3000);

		// 第三个Tap
		System.out.println("第三个Tap --->8胶条异常[2]");
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_3.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
	   
		ck3_jt.click();
		ck3_jt1.click();
		add_flaw.click();
		
		ck3_jt2.click();
		save_flaw.click();
		
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_15_17.click();

	}
	
	public void engine_compartment_15_17() throws InterruptedException {
		
		System.out.println("发动机盖右侧铰链");
		System.out.println("4拆卸痕迹[3－2=1]");
		ck3_gjcx.click();
		ck3_gjcx3.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_16_17.click();

	}
	
	public void engine_compartment_16_17() throws InterruptedException {
		System.out.println("防火墙");
		System.out.println("4凹坑[3－2=1] 5更换[1] 6水泡[2] 7胶条异常[2]");
		ck3_wgak.click();
		ck3_wgak3.click();
		add_flaw.click();
		
		ck3_wggh.click();
		ck3_wggh1.click();
		add_flaw.click();
		
		ck3_spdz.click();
		ck3_spdz1.click();
		add_flaw.click();
		
		ck3_spdz2.click();
		save_flaw.click();
		
		System.out.println("滑动第二Tap 7胶条异常[2]");
		int width = img_swipe.getSize().width;
		int height = img_swipe.getSize().height;
		driver.swipe(width * 8 / 10, height / 2, width * 1 / 10, height / 2,1000);
		shoot_click_2.click();
		take_photo.click();
		Thread.sleep(5000);
		add_flaw.click();
		
		ck3_jt.click();
		ck3_jt1.click();
		add_flaw.click();
		
		ck3_jt2.click();
		save_flaw.click();
		System.out.println("第二轮瑕疵点全部点击完毕 🈚️第三轮");
		engine_compartment_17_17.click();

	}
	
	public void engine_compartment_17_17() throws InterruptedException {
		System.out.println("车架号");
		System.out.println("1锈蚀不清[1] 2缺损[1] 3事故变形[1] 4篡改嫌疑[1]");
		System.out.println("🈚️第二轮");

	}
	
	public void engineOil(){
		eng_oil_yes.click();
		liqued_yes.click();
		brake_oil_exception.click();
		asess_oil_exception.click();
		battery_check.click();
		belt_check.click();
		
		
	}
	
	public void repackingInstructions(){
		whether_modification.click();
		
	}
	
	public void paintRepairOverview1(){
		ck3_qimian1.click();
		have_defect.click();
		
		ck3_qimian2.click();
		have_defect.click();
		ck3_qimian3.click();
		have_defect.click();
		ck3_qimian4.click();
		have_defect.click();
		ck3_qimian5.click();
		have_defect.click();
		ck3_qimian6.click();
		have_defect.click();
		ck3_qimian7.click();
		have_defect.click();
		ck3_qimian8.click();
		have_defect.click();
		ck3_qimian9.click();
		have_defect.click();
		ck3_qimian10.click();
		have_defect.click();;
		ck3_qimian11.click();
		have_defect.click();
		ck3_qimian12.click();
		have_defect.click();
		ck3_qimian13.click();
		have_defect.click();
		ck3_qimian14.click();
		have_defect.click();
		ck3_qimian15.click();
		have_defect.click();
		ck3_qimian16.click();
		have_defect.click();
		ck3_qimian17.click();
		have_defect.click();
		skeleton_defect.click();
		
	}
	public void paintRepairOverview2(){
		
		ck3_gujia1.click();
		have_defect.click();
		ck3_gujia2.click();
		have_defect.click();
		ck3_gujia3.click();
		have_defect.click();
		ck3_gujia4.click();
		have_defect.click();
		ck3_gujia5.click();
		have_defect.click();
		ck3_gujia6.click();
		have_defect.click();
		ck3_gujia7.click();
		have_defect.click();
		ck3_gujia8.click();
		have_defect.click();
		ck3_gujia9.click();
		have_defect.click();
		ck3_gujia10.click();
		have_defect.click();
		
	}
	
	public void optionpaint1(){
		
		paint_repair_hisory.click();
		partial_paint.click();
		
		currentstate_paint.click();
		general_quality.click();
		
		repair_decribe.click();
		repair_part.click();
		
		car_describe.sendKeys("QA Test");
	}
	
	public void comprehensive_condition_ratings() throws InterruptedException{
		comprehensive_condition_ratings.click();
		driver.scrollTo("维护成本评级");
		maintenance_costs_ratings.click();
		nx_item.click();
		
		head_back.click();
		un_detection.click();
		upload_report.click();
		Thread.sleep(10000);
		
		head_back.click();
		
	}
   
	
	
    
    
    
    
    
    
    
	
	
	
	

	

	public void re_equip_instructions() {
		whether_modification.click();
		save_tonext.click();

	}

	public void comprehensive_condition_ratings_1_1() {
		comprehensive_condition_ratings.click();
		System.out.println("滑动屏幕页面");
		driver.scrollTo("维护成本评级");
		maintenance_costs_ratings.click();
		save_tonext.click();

	}

	public void basicInfo() {
		basic_info_2.click();

	}

	public void headBack() {
		head_back.click();

	}

}
