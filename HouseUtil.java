package com.dpzf.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class HouseUtil {
	
	public static final String PATH = "src/main/webapp/data/";
	
	/**
	 * 付费方式
	 * @return
	 */
	public static JSONObject payway(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "押一付一");
		json.put("option2", "押一付二");
		json.put("option3", "押一付三");
		json.put("option4", "押二付一");
		json.put("option5", "押二付二");
		json.put("option6", "押二付三");
		json.put("option7", "半年付");
		json.put("option8", "年付");
		json.put("option9", "面议");
		jsonArr.put(json);
		jsonObj.put("payway", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 出租方式
	 * @return
	 */
	public static JSONObject rentway(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "整套出租");
		json.put("option2", "单间出租");
		json.put("option3", "床位出租");
		jsonArr.put(json);
		jsonObj.put("rentway", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 房屋配置
	 * @return
	 */
	public static JSONObject facility(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "床");
		json.put("option2", "衣柜");
		json.put("option3", "沙发");
		json.put("option4", "电视");
		json.put("option5", "冰箱");
		json.put("option6", "洗衣机");
		json.put("option7", "空调");
		json.put("option8", "热水器");
		json.put("option9", "宽带");
		json.put("option10", "暖气");
		jsonArr.put(json);
		jsonObj.put("facility", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 单间房室
	 * @return
	 */
	public static JSONObject room(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "主卧");
		json.put("option2", "次卧");
		json.put("option3", "隔断");
		jsonArr.put(json);
		jsonObj.put("room", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 性别要求
	 * @return
	 */
	public static JSONObject gender(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "限男生");
		json.put("option2", "限女生");
		json.put("option3", "男女不限");
		jsonArr.put(json);
		jsonObj.put("gender", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 房屋朝向
	 * @return
	 */
	public static JSONObject direction(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "东");
		json.put("option2", "西");
		json.put("option3", "南");
		json.put("option4", "北");
		json.put("option5", "南北");
		json.put("option6", "东西");
		json.put("option7", "东南");
		json.put("option8", "西南");
		json.put("option9", "东北");
		json.put("option10", "西北");
		jsonArr.put(json);
		jsonObj.put("direction", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 房屋装潢
	 * @return
	 */
	public static JSONObject decoration(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "毛坯");
		json.put("option2", "简单装");
		json.put("option3", "中等装");
		json.put("option4", "精装修");
		json.put("option5", "豪华装");
		jsonArr.put(json);
		jsonObj.put("decoration", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 房屋类型
	 * @return
	 */
	public static JSONObject housetype(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("option1", "普通住宅");
		json.put("option2", "商住两用");
		json.put("option3", "公寓");
		json.put("option4", "平房");
		json.put("option5", "别墅");
		json.put("option5", "其他");
		jsonArr.put(json);
		jsonObj.put("housetype", jsonArr);
		return jsonObj;
	}
	
	
	public static void main(String[] args) throws IOException{
		FileUtils.writeStringToFile(new File(PATH + "payway.json"), payway().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "rentway.json"), rentway().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "facility.json"), facility().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "room.json"), room().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "gender.json"), gender().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "direction.json"), direction().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "decoration.json"), decoration().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "housetype.json"), housetype().toString(), "UTF-8");
	}

}
