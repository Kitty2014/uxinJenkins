package com.checkAuto.appium.base;

public class Constants {
	
	public static final String HOME_SIDE_MENU = "com.makemytrip:id/home_side_menu";

	public static final String LAYOUT = "com.makemytrip:id/slide_view_root_layout";

	public static final String MENU_ITEMS = "com.makemytrip:id/menu_txv";

	public static final String TWO_WAY_BUTTON = "com.makemytrip:id/twowaybutton";

	public static final String FROM_CITY = "com.makemytrip:id/from_code";
	public static final String TO_CITY = "com.makemytrip:id/to_code";
	public static final String TO_FOR_CITY_LIST = "com.makemytrip:id/toFroListCity";
	public static final String CITY_NAME = "com.makemytrip:id/cityName";

	public static final String FROM_DAY = "com.makemytrip:id/from_day";

	public static final String NEXT_MONTH = "com.makemytrip:id/calViewNextMonth";

	public static final String CAL_TITLE = "com.makemytrip:id/title";
	public static final String SELECT_FROMDATE = "com.makemytrip:id/date";

	public static final String SELECT_TO_DATE = "com.makemytrip:id/date";

	public static final String LOGIN_BUTTON = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/bt_login\")";
	
	
	
	
	
	public static final String LISTVIEW_SWIPE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/colorlayout\")";
	
	
	

	// public static final String
	// NEW_ADD_DETECTION="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_adddetection\")";

	public static final String NEW_ADD_DETECTION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_adddetection\")";

	public static final String ALL_DEALER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/bt_all_dealer\")";

	// 第一个索引值 神州租车
	public static final String INDEX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]";

	public static final String SECOND_HAND_CHECK = "new UiSelector().resourceId(\"android:id/button3\").text(\"二手车检测\")";

	public static final String CHOOSE_CONFIRM = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]";
	public static final String BASE_INFO = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]";

	// 车牌号"new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_carnum\")"
	public static final String LICENSE_PLATE_NUMBER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_carnum\")";

	// 车辆类型
	public static final String VEHICLE_TYPE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\")";

	// 搜索框"com.youxinpai.checkauto.act:id/edit_search";

	public static final String EDIT_SEARCH = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/edit_search\")";

	// com.youxinpai.checkauto.act:id/searchdealer

	// 搜索按钮
	public static final String SEARCH_BUTTON = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/searchdealer\")";

	// 搜索框第一个索引
	public static final String SEARCH_INDEX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]";
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]

	// 基本信息UIAutomator
	public static final String BASIC_INFO = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/lin_basicinfo\")";

	// 车牌号区域下拉框
	public static final String CAR_NUM_AREA_LIST = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/sp_province\")";

	// 车牌号区域号
	public static final String CAR_NUM_AREA_LIST_INDEX = "new UiSelector().resourceId(\"android:id/text1\").text(\"京\")";

	// 车牌号区域号
	public static final String CAR_TYPE_INPUT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\")";

	public static final String CAR_TYPE_INDEX1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]";

	// 公户
	public static final String CAR_PUBLISER_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_carpubliser\")";

	// 私户
	public static final String CAR_OWNER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_carowner\")";

	// com.youxinpai.checkauto.act:id/rb_firsthand_y
	// 一手
	public static final String FIRSTHAND_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_firsthand_y\")";
	// 二手
	public static final String FIRSTHAND_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_firsthand_n\")";

	// 请选择原始购车发票 com.youxinpai.checkauto.act:id/tv_sourcerecipt
	public static final String ORIGINAL_CAR_INVOICE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_sourcerecipt\")";

	// 现在 购车发票的列表 有 丢失 有发票未验证
	public static final String ORIGINAL_CAR_INVOICE_INDEX1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]";

	// 过户票com.youxinpai.checkauto.act:id/rb_guohu_y
	// com.youxinpai.checkauto.act:id/rb_guohu_n
	public static final String TRANSFER_USER_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_guohu_y\")";
	// 过户票丢失
	public static final String TRANSFER_USER_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_guohu_n\")";

	// 上次过户日期
	public static final String TRANSFER_DATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_guohudate\")";

	// 过户次数
	public static final String TRANSFER_TIMES_INPUT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_guohucishu\")";

	public static final String TRANSFER_TIMES = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]";

	//

	// 原始购车价
	public static final String ORIGINAL_PRICE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_source_price\")";

	// 使用性质
	public static final String USING_NATURE_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_usingnature\")";

	// 非营运 营运 营转非 租赁 租赁公司非营运 2
	public static final String USING_NATURE_INDEX = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]";

	// VIN
	public static final String VIN_CODE_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_vin\")";

	// 请选择车型车系
	public static final String MODELS_CARS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_models_cars\")";

	// 选择品牌车系
	public static final String MODELS_CARS_1 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"保时捷\")";
	// com.youxinpai.checkauto.act:id/text
	public static final String MODELS_CARS_1_2 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"卡宴\")";

	// public static final String
	// MODELS_CARS_1_2_3="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"2015款2.8自动35FSI舒适型四驱\")";
	public static final String MODELS_CARS_1_2_3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]";

	// GUOBIAO
	public static final String GUOBIAO_NUM = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_guobiao\")";

	// 出厂日期
	// 出厂日期
	public static final String PRODUCTION_DATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_productiondate\")";

	public static final String PRODUCTION_DATE_1 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.EditText[1]";

	public static final String PRODUCTION_DATE_2 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[2]/android.widget.EditText[1]";

	public static final String PRODUCTION_DATE_3 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[3]/android.widget.EditText[1]";

	// 发动机号
	public static final String ENGINE_NUM = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_engine\")";

	// 注册日期
	public static final String REGISTER_DATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_registerdate\")";

	// 确定android:id/button1 .text(\"下一项\")
	public static final String CONFIRM_YES = "new UiSelector().resourceId(\"android:id/button1\").text(\"确定\")";

	// 交强险com.youxinpai.checkauto.act:id/rb_jiaoqiangxian_y
	public static final String JIAOQIANGXIAN_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_jiaoqiangxian_y\")";

	public static final String JIAOQIANGXIAN_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_jiaoqiangxian_n\")";

	// 交强险到期日
	public static final String ASSURANCE_DATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_foassurancedateyear\")";

	// 商业险
	public static final String COMMERCIAL_INSURANCE_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_syxian_y\")";
	public static final String COMMERCIAL_INSURANCE_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_syxian_n\")";

	public static final String COMMERCIAL_INSURANCE_EXPIRE_DATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_businessdateyear\")";

	public static final String COMMERCIAL_INSURANCE_PRICE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_shangyexian_price\")";

	// 年检

	public static final String NIANJIAN_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_nianjian_y\")";
	public static final String NIANJIAN_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_nianjian_n\")";
	// 年检到期日
	public static final String NIANJIAN_EXPIRE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_nianjiandateyear\")";

	// 车船税

	public static final String TRAVEL_TAX_Y = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_chechuanshui_y\")";

	public static final String TRAVEL_TAX_N = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rb_chechuanshui_n\")";

	// 请选择库存地 输入框
	public static final String CAR_INVENTORY_INPUT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carinventory\")";

	// 省选项
	public static final String CAR_INVENTORY_PROVINCE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/sp_provinces\")";

	// 省 列表
	public static final String CAR_INVENTORY_PROVINCE_INDEX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\").text(\"北京\")";

	// 市选项
	public static final String CAR_INVENTORY_CITY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/city_hot_text\").text(\"北京\")";
	// 市 列表
	public static final String CAR_INVENTORY_CITY_INDEX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\").text(\"北京\")";

	// 车身颜色"new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carcolor\")";
	public static final String CHOOSE_CAR_COLOR = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carcolor\")";
	// 颜色
	// 选择项 白色CHOOSE_WHITE_COLOR
	public static final String CHOOSE_WHITE_COLOR = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";

	// 燃油类型"new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_fueltype\")";
	public static final String FUEL_TYPE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_fueltype\")";

	// 选择项 电动 相对布局 android.widget.RelativeLayout需要是到List CHOOSE_ELECTRIC
	public static final String CHOOSE_ELECTRIC = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[4]/android.widget.ImageView[1]";

	// 排气量1com.youxinpai.checkauto.act:id/sp_l
	public static final String DISPLACEMENT1 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/sp_l\")";
	public static final String DISPLACEMENT1_INDEX = "new UiSelector().resourceId(\"android:id/text1\").text(\"1\")";

	// 排气量2

	public static final String DISPLACEMENT2 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/sp_ml\")";

	public static final String DISPLACEMENT2_INDEX = "new UiSelector().resourceId(\"android:id/text1\").text(\"5\")";

	// 车钥匙CAR_KEY
	public static final String CAR_KEY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carkeys\")";

	// 选择项 2把
	public static final String CAR_KEY_2 = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]";

	public static final String SALES_PERSION_MAIL = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_superiorname\")";

	// 保存信息按钮
	public static final String SAVE_INFO = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save\").text(\"保存信息\")";

	// 证件拍照
	public static final String CREDENTIALS_SHOOT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/lin_zhengjian\")";

	// 行驶证正面必拍
	public static final String PICTURES_LIST1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]

	 public static final String CLICK_CAMERA ="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")";

	// 右侧箭头➡️
	public static final String RIGHT_NEXT_ARROW = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/next_page\")";
	// 左侧箭头
	public static final String LEFT_NEXT_ARROW = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/up_page\")";

	// 全部证件
	public static final String ALL_CREDENTIALS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_all_photo\")";

	// 退出拍照
	public static final String EXIT_TAKE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_cancle_photo\")";

	// 退出拍照 是
	public static final String EXIT_YES = "new UiSelector().resourceId(\"android:id/button1\").text(\"是\")";

	// 添加遮挡
	public static final String ADD_COVER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_rephotograph_left\")";

	// 删除遮挡
	public static final String REMOVE_COVER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/remove_cover\")";

	// 重新拍照
	public static final String RETAKE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_rephotograph\")";

	// 右上角保存按钮
	public static final String SAVE_PICTURE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")";

	// 行驶证副证必拍

	
	// 删除瑕疵com.youxinpai.checkauto.act:id/tv_del

	public static final String FIRST_ROW_COLUMN = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 第二组右侧增加栏
	public static final String RIGHT_INCREASE_BUTTON = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_right_tag\")";

	// 右侧导向按钮 com.youxinpai.checkauto.act:id/tv_right_tag
	// 左侧导向按钮com.youxinpai.checkauto.act:id/tv_left_tag
	// 中间添加照片按钮
	public static final String PLUS_MIDDLE_BUTTON = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_view2_tag\")";

	public static final String PLUS_THIRD_BUTTON = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_view3_tag\")";

	// 越野车
	public static final String CHOOSE_VEHICLE_TYPE = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[1]";

	// 公户
	public static final String HOLDER = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";

	// 使用性质
	public static final String USE_PROPERTIES = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.TextView[2]";

	// 点击运营
	public static final String OPERATIONS = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";

	// 输入VIN 码
	public static final String VIN = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.EditText[1]";

	// 手动选择车系
	public static final String CHOOSE_CAR_MODEL = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.TextView[2]";
	// UiSelector不稳定
	// public static final String
	// CHOOSE_CAR_MODEL="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_models_cars\")";

	// com.youxinpai.checkauto.act:id/rel_item1 车头住框
	// com.youxinpai.checkauto.act:id/iv_item1 车头图标的resource-id
	public static final String CAR_FRONT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_item1\")";

	public static final String CAR_FRONT_45 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前45度\")";

	// 发动机盖
	public static final String ENGINE_COVER = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机盖\")";

	// 前风挡玻璃
	public static final String FRONT_WINDSHIELD = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"前风挡玻璃\")";
	// 车头正视区域
	public static final String FRONT_FACING_AREA = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车头正视区域\")";
	// 车辆前底盘
	public static final String FRONT_CHASSIS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车辆前底盘\")";

	
	
	public static final String LEFT_FRONT_CAR_BODY_1_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前座椅\")";
	public static final String LEFT_FRONT_CAR_BODY_2_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前门内饰\")";
	public static final String LEFT_FRONT_CAR_BODY_3_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"仪表\")";
	public static final String LEFT_FRONT_CAR_BODY_4_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前翼子板\")";
	public static final String LEFT_FRONT_CAR_BODY_5_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车轮\")";
	public static final String LEFT_FRONT_CAR_BODY_6_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前减震器\")";
	public static final String LEFT_FRONT_CAR_BODY_7_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车门\")";
	public static final String LEFT_FRONT_CAR_BODY_8_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车门骨架\")";
	public static final String LEFT_FRONT_CAR_BODY_9_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车门内饰\")";
	public static final String LEFT_FRONT_CAR_BODY_10_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左A柱下部\")";
	public static final String LEFT_FRONT_CAR_BODY_11_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左A柱上部\")";
	public static final String LEFT_FRONT_CAR_BODY_12_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左B柱\")";
	public static final String LEFT_FRONT_CAR_BODY_13_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车门裙边\")";
	public static final String LEFT_FRONT_CAR_BODY_14_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"驾驶席区域\")";
	public static final String LEFT_FRONT_CAR_BODY_15_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"方向盘\")";
	public static final String LEFT_FRONT_CAR_BODY_16_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"仪表板\")";
	public static final String LEFT_FRONT_CAR_BODY_17_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"中控\")";
	public static final String LEFT_FRONT_CAR_BODY_18_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"变速杆\")";
	
	
	
	public static final String GRID_VIEW_SWIPE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/gv_view\")";
	
	
	
//	
//	public static final String LEFT_FRONT_CAR_BODY_3_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"方向盘\")";
//	
//	public static final String LEFT_FRONT_CAR_BODY_3_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"方向盘\")";
//	public static final String LEFT_FRONT_CAR_BODY_3_18 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"方向盘\")";

	// 左后车身

	public static final String LEFT_REAR_CAR_BODY_1_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后排座椅\")";

	public static final String LEFT_REAR_CAR_BODY_2_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"仪表台\")";
	public static final String LEFT_REAR_CAR_BODY_3_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后车门\")";
	public static final String LEFT_REAR_CAR_BODY_4_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后车门骨架\")";
	public static final String LEFT_REAR_CAR_BODY_5_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后车门内饰\")";

	public static final String LEFT_REAR_CAR_BODY_6_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左B柱铰链\")";
	public static final String LEFT_REAR_CAR_BODY_7_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左C柱上部\")";
	public static final String LEFT_REAR_CAR_BODY_8_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左C柱\")";
	public static final String LEFT_REAR_CAR_BODY_9_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后车门裙边\")";

	public static final String LEFT_REAR_CAR_BODY_10_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后座椅\")";
	public static final String LEFT_REAR_CAR_BODY_11_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后翼子板\")";
	public static final String LEFT_REAR_CAR_BODY_12_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后车轮\")";
	public static final String LEFT_REAR_CAR_BODY_13_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后减震器\")";

	// 后备箱Trunk
	public static final String TRUNCK_1_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱\")";
	public static final String TRUNCK_2_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后风挡玻璃\")";
	public static final String TRUNCK_3_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱盖\")";
	public static final String TRUNCK_4_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车尾正视区域\")";
	public static final String TRUNCK_5_13 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout[5]";
	public static final String TRUNCK_6_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱盖内部\")";
	public static final String TRUNCK_7_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱左铰链\")";
	public static final String TRUNCK_8_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左后翼子板内衬\")";
	public static final String TRUNCK_9_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后围板\")";
	public static final String TRUNCK_10_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱底板\")";
	public static final String TRUNCK_11_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后翼子板内衬\")";
	public static final String TRUNCK_12_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"后备箱右铰链\")";
	public static final String TRUNCK_13_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车辆后底盘\")";

	// 工具检查

	public static final String SPARE_TIRE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rbn_strunk_yes\")";

	public static final String TOOLS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rbn_tools_normal\")";

	// 右后车身
	public static final String RIGHT_REAR_CAR_BODY_1_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后45度\")";
	public static final String RIGHT_REAR_CAR_BODY_2_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后翼子板\")";
	public static final String RIGHT_REAR_CAR_BODY_3_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后车轮\")";
	public static final String RIGHT_REAR_CAR_BODY_4_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后减震器\")";
	public static final String RIGHT_REAR_CAR_BODY_5_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后车门\")";
	public static final String RIGHT_REAR_CAR_BODY_6_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后车门骨架\")";
	public static final String RIGHT_REAR_CAR_BODY_7_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后车门内饰\")";
	public static final String RIGHT_REAR_CAR_BODY_8_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右B柱铰链\")";
	public static final String RIGHT_REAR_CAR_BODY_9_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右C柱上部\")";
	public static final String RIGHT_REAR_CAR_BODY_10_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右C柱\")";
	public static final String RIGHT_REAR_CAR_BODY_11_11 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右后车门裙边\")";

	// 右前车身
	public static final String RIGHT_FRONT_CAR_BODY_1_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前车门\")";
	public static final String RIGHT_FRONT_CAR_BODY_2_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前车门骨架\")";
	public static final String RIGHT_FRONT_CAR_BODY_3_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前车门内饰\")";
	public static final String RIGHT_FRONT_CAR_BODY_4_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右A柱下部\")";
	public static final String RIGHT_FRONT_CAR_BODY_5_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右A柱上部\")";
	public static final String RIGHT_FRONT_CAR_BODY_6_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右B柱\")";
	public static final String RIGHT_FRONT_CAR_BODY_7_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前车门裙边\")";
	public static final String RIGHT_FRONT_CAR_BODY_8_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"副驾驶席区域\")";
	public static final String RIGHT_FRONT_CAR_BODY_9_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车顶内饰\")";
	public static final String RIGHT_FRONT_CAR_BODY_10_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前翼子板\")";
	public static final String RIGHT_FRONT_CAR_BODY_11_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前车轮\")";
	public static final String RIGHT_FRONT_CAR_BODY_12_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前减震器\")";
	public static final String RIGHT_FRONT_CAR_BODY_13_13 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车顶\")";

	// 发动机舱Engine compartment
	public static final String ENGINE_COMPARTMENT_1_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机全景\")";
	public static final String ENGINE_COMPARTMENT_2_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机舱\")";
	public static final String ENGINE_COMPARTMENT_3_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机盖内侧\")";
	public static final String ENGINE_COMPARTMENT_4_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机盖左侧铰链\")";
	public static final String ENGINE_COMPARTMENT_5_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左侧减震器支架\")";
	public static final String ENGINE_COMPARTMENT_6_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左侧发动机翼子板架\")";
	public static final String ENGINE_COMPARTMENT_7_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左侧水箱框架\")";
	
	
	public static final String ENGINE_COMPARTMENT_8_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前梁头\")";
	public static final String ENGINE_COMPARTMENT_9_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"水箱框架\")";
	public static final String ENGINE_COMPARTMENT_10_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"前横梁\")";
	public static final String ENGINE_COMPARTMENT_11_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右前纵梁\")";
	public static final String ENGINE_COMPARTMENT_12_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右侧水箱框架\")";
	public static final String ENGINE_COMPARTMENT_13_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右侧减震器支架\")";
	public static final String ENGINE_COMPARTMENT_14_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"右侧发动机翼子板架\")";
	public static final String ENGINE_COMPARTMENT_15_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"发动机盖右侧铰链\")";
	public static final String ENGINE_COMPARTMENT_16_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"防火墙\")";
	public static final String ENGINE_COMPARTMENT_17_17 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"车架号\")";

	// 机油液检查
	public static final String ENG_OIL_YES = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rbn_enginroom_oil_yes\")";
	// 防冻液检查
	public static final String LIQUED_YES = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rbn_enginroom_liqued_yes\")";
	// 刹车油检查
	public static final String BRAKE_OIL_EXCEPTION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_brakeoi_exception_yes\")";
	// 助力油检查
	public static final String ASSESS_OIL_EXCEPTION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_assessoil_exception_yes\")";
	// 电池检查
	public static final String BATTERY_CHECK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_battery_exception_yes\")";
	// 皮带检查
	public static final String BELT_CHECK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_belt_exception_yes\")";

	// 1/1 改装说明

	public static final String WHETHER_MODIFICATION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_unmodified\")";

	// 漆面修复历史android.widget.TextView
	public static final String PAINT_REPAIR_HISTORY = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]";
	// 局部喷漆
	public static final String PARTIAL_PAINT = "//android.widget.ListView[1]/android.widget.CheckedTextView[5]";
	// 当前状况说明
	public static final String CURRENTSTATE_PAINT = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[1]";
	public static final String GENERAL_QUALITY = "//android.widget.ListView[1]/android.widget.CheckedTextView[3]";
	// 修复整备说明
	public static final String REPAIR_DESCRIBE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]";
	public static final String REPAIR_PART = "//android.widget.ListView[1]/android.widget.CheckedTextView[4]";

	// 补充说明
	public static final String CAR_DESCRIBE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_chekuang\")";

	// 评级

	// 综合车况评级

	public static final String COMPREHENSIVE_CONDITION_RATINGS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_comratea\")";

	// 维护成本
	public static final String MAINTENANCE_COSTS_RATINGS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_maintainb\")";

	// public static final String leftFrontCarBody_2_18 =
	// "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_name\").text(\"左前车门内饰\")";

	// com.youxinpai.checkauto.act:id/edt_mileage
	public static final String EDIT_MILE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/edt_mileage\")";

	public static final String SURE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_sure\")";

	// 启动机检测

	public static final String START_CHECK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_startcheck_exception\")";

	// 发动机检测
	public static final String ENGIN_CHECK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_engincheck_exception\")";
	// 转向助力检测
	public static final String TURN_CHECK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_turncheck_exception\")";
	// 排烟
	public static final String SMOKE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_paiyan_exception\")";
	// 运转
	public static final String OPERATION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_yunzhuan_exception\")";
	/*
	 * // 严重异响 public static final String ABNORMAL_SOUND =
	 * "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_yixiang_exception\")"
	 * ; // 严重抖动 public static final String SHAKING =
	 * "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_zuogong_exception\")"
	 * ;
	 */
	// 内控电器
	public static final String ELECTRIC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_electric_exception\")";
	// 是否路试
	public static final String ROAD_TEST = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_roadtest_exception\")";
	// 变速箱
	public static final String SPEEDBOX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rdbtn_speedbox_exception\")";

	// 默认第一次进去 没有遮罩图片层
	public static final String SHOOT_CLICK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_img_show\")";

	public static final String SHOOT_CLICK_ = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]";

	public static final String SHOOT_CLICK_2 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_new_view2_tag\")";

	public static final String SHOOT_CLICK_3 = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_new_view3_tag\")";

	// 拍照按钮
	public static final String TAKE_PHOTO = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")";
	
	// 添加瑕疵
		public static final String ADD_FLAW = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")";
		

	// 保存按钮
	public static final String SAVE_PHOTO_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")";
	// 保存瑕疵
	public static final String SAVE_FLAW = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_save\")";

	
	// 添加瑕疵

	public static final String ADD_FLAW_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add\")";

	// 下一项

	public static final String NX_ITEM = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_next\")";

	public static final String SAVE_PHOTO_GN_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.gaoneng.act:id/tv_save\")";

	public static final String IMG_SWIPE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/iv_new_view1_tag\")";

	// com.youxinpai.checkauto.act:id/rel_item1

	// 有异常com.youxinpai.checkauto.act:id/tv_abnormal_yes
	// 无异常

	// com.youxinpai.checkauto.act:id/tv_save_tonext

	// 发动机舱 17/18

	// 保存并下一步com.youxinpai.checkauto.act:id/tv_save_tonext
	// "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_right_tag\")";
	// 发动机舱 18/18 返回有个小Bug

	// 表显里程com.youxinpai.checkauto.act:id/edt_mileage

	// 添加配置com.youxinpai.checkauto.act:id/tv_add_configuration

	public static final String ADD_CONFIGURATION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_add_configuration\")";

	// 重新拍照com.youxinpai.checkauto.act:id/tv_update
	public static final String NEW_SHOOT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_update\")";

	// 下一项com.youxinpai.checkauto.act:id/tv_last_page

	// 变速箱 1/1

	// 正常checkbox的com.youxinpai.checkauto.act:id/rdbtn_startcheck_exception

	// 异常com.youxinpai.checkauto.act:id/rdbtn_startcheck_unexception

	// com.youxinpai.checkauto.act:id/tv_save_tonext
	public static final String SAVE_TONEXT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_save_tonext\")";
	// com.youxinpai.checkauto.act:id/tv_next_page
	// com.youxinpai.checkauto.act:id/tv_save_tonext
	// 下一项com.youxinpai.checkauto.act:id/tv_next_page
	public static final String NX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_next_page\")";

	// public static final String
	// HEAD_BACK1="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/head_back\")";
	// com.youxinpai.checkauto.act:id/rel_maintaina
	// com.youxinpai.checkauto.act:id/rel_maintainb
	// com.youxinpai.checkauto.act:id/rel_maintainc
	// com.youxinpai.checkauto.act:id/rel_maintaind
	// com.youxinpai.checkauto.act:id/tv_save_tonext

	// 顶部左上角 返回按钮
	public static final String HEAD_BACK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/head_back\")";

	public static final String UN_DETECTION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_unfinisheddetection\")";

	public static final String UPLOAD_REPORT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_upload\")";

	// **********************************************************************************************************
	// **********************************************************************************************************
	// **********************************************************************************************************

	// 划伤
	public static final String CK3_WGHS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"划伤\")";
	public static final String CK3_WGHS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGHS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGHS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_WGHS4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";

	// 凹坑CK3_WGAK
	public static final String CK3_WGAK = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"凹坑\")";
	// public static final String CK3_WGAK =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_WGAK1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGAK2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGAK3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 变形痕迹
	public static final String CK3_WGBX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"变形痕迹\")";
	// public static final String CK3_WGBX =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_WGBX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGBX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGBX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 变形痕迹 驾驶席区域 CK3_NSBX1
	public static final String CK3_NSBX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"变形痕迹\")";
	// public static final String CK3_WGBX =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_NSBX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSBX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSBX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 色差
	public static final String CK3_WGSC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"色差\")";
	// public static final String CK3_WGSC =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]";
	// public static final String CK3_WGSC_1 =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_WGSC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGSC2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGSC3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 生锈痕迹CK3_WGXS1 CK3_GJXS1
	public static final String CK3_WGXS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"生锈痕迹\")";
	public static final String CK3_WGXS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]
	public static final String CK3_WGXS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGXS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 生锈痕迹CK3_WGXS1 第二组
	public static final String CK3_DPXS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"生锈痕迹\")";
	public static final String CK3_DPXS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_DPXS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_DPXS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 修补痕迹CK3_WGXB1
	public static final String CK3_WGXB = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"修补痕迹\")";
	public static final String CK3_WGXB1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGXB2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGXB3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 破裂CK3_WGPL1
	public static final String CK3_WGPL = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"破裂\")";
	public static final String CK3_WGPL1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 掉漆CK3_WGDQ1
	public static final String CK3_WGDQ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"掉漆\")";
	public static final String CK3_WGDQ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_WGDQ2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_WGDQ3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 丢件
	public static final String CK3_WGDS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"丢件\")";
	public static final String CK3_WGDS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 漆面异常CK3_QMYC1
	public static final String CK3_QMYC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"漆面异常\")";
	public static final String CK3_QMYC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_QMYC2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_QMYC3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 玻璃检查CK3_BL
	public static final String CK3_BL = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"玻璃检查\")";
	public static final String CK3_BL1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_BL2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_BL3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_BL4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";
	public static final String CK3_BL5 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[5]";

	// 更换 CK3_WGGH
	public static final String CK3_WGGH = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"更换\")";
	// public static final String CK3_WGGH =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_WGGH_1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]";
	public static final String CK3_WGGH1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]

	// 胶条异常CK3_JT
	public static final String CK3_JT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"胶条异常\")";
	// public static final String CK3_JT =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_JT1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public static final String CK3_JT2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_JT3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]/android.widget.TextView[1]";

	// 水泡CK3_SPDZ1 CK3_SPZY1
	public static final String CK3_SPDZ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"水泡\")";
	public static final String CK3_SPDZ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_SPDZ2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_SPDZ3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 水泡 CK3_SPZY1
	public static final String CK3_SPZY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"水泡\")";
	public static final String CK3_SPZY1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_SPZY2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_SPZY3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 水泡 CK3_SPHBX
	public static final String CK3_SPHBX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"水泡\")";
	public static final String CK3_SPHBX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_SPHBX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_SPHBX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 水泡 CK3_SPMB
	public static final String CK3_SPMB = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"水泡\")";
	public static final String CK3_SPMB1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_SPMB2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
		
		
	// 晃动CK3_NSHD1
	public static final String CK3_NSHD = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"晃动\")";
	public static final String CK3_NSHD1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 板件间隙
	public static final String CK3_BJJX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"板件间隙\")";
	public static final String CK3_BJJX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 灯组检测CK3_DZJC1
	public static final String CK3_DZJC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"灯组检测\")";
	public static final String CK3_DZJC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 剐蹭CK3_GC1
	public static final String CK3_GC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"剐蹭\")";
	public static final String CK3_GC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_GC2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_GC3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 托底 CK3_DPTD 只有一个
	// public static final String CK3_DPTD =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public static final String CK3_DPTD = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"托底\")";
	public static final String CK3_DPTD1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 滴漏 CK3_DPLY 只有一个
	public static final String CK3_DPLY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"滴漏\")";
	// public static final String CK3_DPLY =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_DPLY1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_DPLY2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_DPLY3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 钣金痕迹 CK3_GJBJ
	public static final String CK3_GJBJ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"钣金痕迹\")";
	public static final String CK3_GJBJ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_GJBJ2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_GJBJ3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_GJBJ4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";

	// 凹陷 CK3_NSTX1
	public static final String CK3_NSTX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"凹陷\")";
	public static final String CK3_NSTX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSTX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSTX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_NSTX4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";
	public static final String CK3_NSTX5 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[5]";
	public static final String CK3_NSTX6 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[6]";
	
	
	
	
	// 轮胎异常CK3_CLLT
	public static final String CK3_CLLT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"轮胎异常\")";
	// public static final String CK3_CLLT =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public static final String CK3_CLLT1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_CLLT2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_CLLT3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_CLLT4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";
	public static final String CK3_CLLT5 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[5]";

	// 轮毂异常CK3_CLLG
	public static final String CK3_CLLG = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"轮毂异常\")";
	// public static final String CK3_CLLG =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_CLLG1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_CLLG2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_CLLG3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 减震器 CK3_JZLY CK3_JZLY1 1CK3_JZLY1 2 CK3_JZJT1 3 CK3_ZJBX1
	public static final String CK3_JZLY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"减震器\")";
	public static final String CK3_JZLY1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_JZJT1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_ZJBX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 污渍 CK3_NSWZ CK3_NSWZ1
	public static final String CK3_NSWZ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"污渍\")";
	public static final String CK3_NSWZ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSWZ2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSWZ3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 磨损CK3_NSMS
	public static final String CK3_NSMS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"磨损\")";
	// public static final String CK3_NSMS =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_NSMS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSMS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSMS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 破损CK3_NSPS2
	public static final String CK3_NSPS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"破损\")";
	public static final String CK3_NSPS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSPS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSPS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";
	public static final String CK3_NSPS4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[4]";

	// 烧烫
	public static final String CK3_NSST = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"烧烫\")";
	public static final String CK3_NSST1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_NSST2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_NSST3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 拆卸痕迹 CK3_GJCX CK3_GJCX1
	public static final String CK3_GJCX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"拆卸痕迹\")";
	// public static final String CK3_GJCX =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]";
	public static final String CK3_GJCX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_GJCX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";
	public static final String CK3_GJCX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]";

	// 爆裂 CK3_QNBL1
	public static final String CK3_QNBL = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"爆裂\")";
	public static final String CK3_QNBL1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 花屏CK3_NSHP1
	public static final String CK3_NSHP = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"花屏\")";
	public static final String CK3_NSHP1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 故障灯CK3_NSGZ1
	public static final String CK3_NSGZ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"故障灯\")";
	public static final String CK3_NSGZ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 排气管锈裂CK3_DPXL
	public static final String CK3_DPXL = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"排气管锈裂\")";
	// public static final String CK3_DPXL =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]";
	public static final String CK3_DPXL1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 下垂CK3_NSXC1
	public static final String CK3_NSXC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"下垂\")";
	public static final String CK3_NSXC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 安装孔CK3_WGAZ1
	public static final String CK3_WGAZ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"安装孔\")";
	public static final String CK3_WGAZ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 天窗CK3_TCYC
	public static final String CK3_TCYC = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"天窗\")";
	public static final String CK3_TCYC1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";
	public static final String CK3_TCYC2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]";

	// 打磨痕迹CK3_DMHJ1
	public static final String CK3_DMHJ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"打磨痕迹\")";
	public static final String CK3_DMHJ1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 锈蚀不清 CK3_CJXS1
	public static final String CK3_CJXS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"锈蚀不清\")";
	// public static final String CK3_CJXS =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public static final String CK3_CJXS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 缺损CK3_CJQS CK3_CJQS1
	public static final String CK3_CJQS = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"缺损\")";

	// public static final String CK3_CJQS =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_CJQS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 事故变形CK3_CJSG CK3_CJSG1
	public static final String CK3_CJSG = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"事故变形\")";

	// public static final String CK3_CJSG =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_CJSG1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]";

	// 篡改嫌疑CK3_CJCG
	public static final String CK3_CJCG = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/textview\").text(\"篡改嫌疑\")";
	// public static final String CK3_CJCG =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]";

	public static final String CK3_CJCG1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 漆面修复概况 漆面检测
	
	public static final String HAVE_DEFECT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_have_defect\")";
	
	
	public static final String LITTLE_DEFECT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_little_defect\")";
	
	
	public static final String NO_DEFECT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_no_defect\")";
	
	
	public static final String SKELETON_DEFECT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_new_gujia\")";
	

	public static final String QIMIAN1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";
	public static final String QIMIAN2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]";
	public static final String QIMIAN3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[3]";
	public static final String QIMIAN4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[4]";
	public static final String QIMIAN5 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[5]";
	public static final String QIMIAN6 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[6]";
	public static final String QIMIAN7 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[7]";
	public static final String QIMIAN8 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[8]";
	public static final String QIMIAN9 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[9]";
	public static final String QIMIAN10 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[10]";
	public static final String QIMIAN11 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[11]";
	public static final String QIMIAN12 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[12]";
	public static final String QIMIAN13 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[13]";
	public static final String QIMIAN14 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[14]";
	public static final String QIMIAN15 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[15]";
	public static final String QIMIAN16 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[16]";
	public static final String QIMIAN17 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[17]";

	// 漆面修复概况 骨架检测
	public static final String GUJIA = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[2]";

	public static final String GUJIA1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";
	public static final String GUJIA2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]";
	public static final String GUJIA3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[3]";
	public static final String GUJIA4 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[4]";
	public static final String GUJIA5 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[5]";
	public static final String GUJIA6 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[6]";
	public static final String GUJIA7 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[7]";
	public static final String GUJIA8 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[8]";
	public static final String GUJIA9 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[9]";
	public static final String GUJIA10 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[10]";

	// // 减震器变形 CK3_ZJBX
	//
	// public static final String CK3_ZJBX =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	// public static final String CK3_ZJBX1 =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// 锈蚀痕迹CK3_FHBXS
	public static final String CK3_FHBXS = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";

	public static final String CK3_FHBXS1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	// 剩余2个 锈蚀痕迹
	public static final String CK3_FHBXS2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]";

	public static final String CK3_FHBXS3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]/android.widget.TextView[1]";

	//  CK3_GJBJ CK3_GJBJ钣金痕迹

	// public static final String
	// CK3_GJBJ1="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	//
	// 凹陷 CK3_NSOX 第一个选项的 索引值会变 但是子选项的Index 不变 后期做成外键做索引变更初始值
	public static final String CK3_NSOX = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";
	public static final String CK3_NSOX1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public static final String CK3_NSOX2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	public static final String CK3_NSOX3 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[2]/android.widget.LinearLayout[3]/android.widget.TextView[1]";

	// 色差
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]"

	// 17/18Antifreeze Brake Fluid Boost oil
	public static final String OIL_CHECK = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";
	public static final String ANTIFREEZE_CHECK = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";
	public static final String BRAKE_FLUID_CHECK = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";
	public static final String BOOST_OIL_CHECK = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";

	// 18/18
	public static final String SHOOT18_18 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	// ////////////////////////////////
	// 基本信息
	public static final String BASIC_INFO_2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]";

	// 车牌号第一个车牌位置选择框
	public static final String CAR_PROVINCE_box = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]";

	public static final String CAR_PROVINCE = "new UiSelector().resourceId(\"android:id/text1\").text(\"川\")";

	// 输入字母数字组合 6-7车牌号
	public static final String CAR_NUM = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_carnum\")";

	// com.youxinpai.checkauto.act:id/et_carnum
	// 车辆类型选择框
	public static final String CAR_TYPE_BOX = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_cartype\")";

	// 选择车辆类型 选择越野车

	public static final String CAR_TYPE = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[1]";

	// 选择所有人 公户
	public static final String CAR_PUBLISER = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";

	// 使用性质
	public static final String USING_NATURE_BOX = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.TextView[2]";
	// 点击 营运
	public static final String USING_NATURE = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";

	// VIN 码 需要满足5位,6位的VIN码不能为纯字母,12、15、16、17位的不能为纯数字或字母
	public static final String VIN_CODE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.EditText[1]";

	// 手动选择车系

	// 手动选择品牌车系 大众

	// 豪华型

	// 输入发动机号

	// 输入注册日期

	// 点击确定日期 当前日期

	// 点击确定日期 当前日期

	// 选择车辆库存地

	// 选择地 北京 四川

	// 点击确定

	// 车辆颜色

	// 选择颜色 白色

	// 燃油类型

	// 点击选项 电动

	// 点击排气量选项 可省略

	// 点击车钥匙

	// 2把钥匙

	// 点击保存信息

	// 证件拍照

	// 点击行驶证正面(必拍)

	// 手动选择品牌车系
	public static final String SELECT_VEHICLE_BRAND = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"大众\")";

	// com.youxinpai.checkauto.act:id/text lv_carseries
	public static final String SELECT_CAR_SERIES = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"Routan\")";

	// public static final String
	// SELECT_CAR_TYPE="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/text\").text(\"大众Routan-3.6-A/MT(283HP)[200809]\")";
	// UiSelector对于中英文混合不稳定 ,建议选用xpath

	public static final String SELECT_CAR_TYPE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.TextView[1]";
	public static final String VEHICLE_BRAND = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.TextView[1]";

	// com.youxinpai.checkauto.act:id/tv_top
	public static final String TOP_TEXT = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_top\")";
	//
	public static final String COLLECTION_TYPE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[10]/android.widget.TextView[1]";

	// 国标码
	// public static final String
	// GUOBIAO_NO="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_guobiao\")";

	// com.youxinpai.checkauto.act:id/text

	//
	public static final String GUOBIAO_NO = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.EditText[1]";

	// 本来想点击文字选项来规避VKB 问题 发现无效
	public static final String GUOBIAO_NO_NAME = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.TextView[1]";

	// 发动机号
	// driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_engine\")")
	// .sendKeys("LNBSDQ113008");

	// public static final String
	// ENGINE_NO="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]/android.widget.EditText[1]";

	// 防止VKB异常
	public static final String PREVENT_VKB_EXCEPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.TextView[1]";
	// com.youxinpai.checkauto.act:id/et_engine

	public static final String ENGINE_NO = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/et_engine\")";

	// 交强险到期日期foassurancedateyear
	// public static final String
	// ASSURANCE_DATE="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_registerdate\")";
	public static final String FOASSURANCE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_foassurancedateyear\")";
	//
	public static final String SCROLL_TO_DATESCREEN = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.Button[1]";

	// 库存地
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.TextView[2]
	// com.youxinpai.checkauto.act:id/tv_carinventory

	public static final String INVENTORY = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_carinventory\")";

	// 选择列表按钮
	public static final String CHOOSE_INVENTORY = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	public static final String CHOOSE_BEIJING = "//android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]";

	public static final String CONFIRM_INVENTORY = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]";

	// public static final String SAVE_INFO =
	// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]";
	// 证件拍照的xpath
	// com.youxinpai.checkauto.act:id/rel_zhengjian resource-id
	public static final String CREDENTIALS_TAKE_PICTURE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";

	// 行驶证 正面(必拍)
	//
	public static final String FRONT_SHOOT = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";

	// 公共的拍照按钮 右侧主拍照按钮
	// public static final String
	// CLICK_SHOOT="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")";

	public static final String CLICK_SHOOT = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.Button[1]";

	// 是否跳过行驶证副证背面拍摄
	public static final String YES = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	// 登记证 0/6

	public static final String REG_CERTIFICATE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/masking_bottom2\")";

	// 取消拍照按钮
	// com.youxinpai.checkauto.act:id/btn_cancle_photo
	public static final String EXIT_SHOOT = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]";

	// 退出拍摄
	public static final String EXIT_SHOOT_YES = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	// 登记证 0/6

	public static final String CAR_FRONT_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/rel_item1\")";

	// 初始化拍照 1/5
	public static final String TAKE_PHOTO_START = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_takephoto\")";

	// 有异常
	public static final String ABNORMAL_YES = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_yes\")";

	// 保存按钮 左侧保存按钮
	public static final String SAVE_PHOTO = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]";
	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]
	// 公共的下一项
	public static final String NEXT_PAGE = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_last_page\").text(\"下一项\")";

	// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]

	// public static final String
	// ABNORMAL_YES="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_yes\")";

	// public static final String
//	 CLICK_CAMERA="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]";
//	// 左侧拍照按钮com.youxinpai.checkauto.act:id/take_photo_left
//	// 右侧拍照按钮com.youxinpai.checkauto.act:id/take_photo
//	//
//
//	// public static final String
//	 CLICK_CAMERA="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/take_photo\")";

	// 右上角保存按钮
	// public static final String
	// SAVE_PICTURE="new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/btn_save_photo\")";

	// 漆面修复历史
	public static final String PAINT_REPAIR_HISTORY_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/spn_paint_repair\")";

	// 当前状况说明

	public static final String CURRENTSTATE_PAINT_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/spn_present\")";
	// 修复整备说明
	public static final String REPAIR_DESCRIBE_ = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/spn_repair\")";

	public static final String NO_EXCEPTION = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/tv_abnormal_no\")";

	// public static final String CONFIRM_CURRENT_DATE = null;

	public static final String CONFIRM_CURRENT_DATE = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	

}
