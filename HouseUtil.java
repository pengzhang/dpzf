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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "押一付一");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "押一付二");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "押一付三");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "押二付一");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "押二付二");
		jsonArr.put(json5);
		
		JSONObject json6 = new JSONObject();
		json6.put("option", "押二付三");
		jsonArr.put(json6);
		
		JSONObject json7 = new JSONObject();
		json7.put("option", "半年付");
		jsonArr.put(json7);
		
		JSONObject json8 = new JSONObject();
		json8.put("option", "年付");
		jsonArr.put(json8);
		
		JSONObject json9 = new JSONObject();
		json9.put("option", "面议");
		jsonArr.put(json9);
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "整套出租");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "单间出租");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "床位出租");
		jsonArr.put(json3);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "床");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "衣柜");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "沙发");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "电视");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "冰箱");
		jsonArr.put(json5);
		
		JSONObject json6 = new JSONObject();
		json6.put("option", "空调");
		jsonArr.put(json6);
		
		JSONObject json7 = new JSONObject();
		json7.put("option", "热水器");
		jsonArr.put(json7);
		
		JSONObject json8 = new JSONObject();
		json8.put("option", "宽带");
		jsonArr.put(json8);
		
		JSONObject json9 = new JSONObject();
		json9.put("option", "暖气");
		jsonArr.put(json9);
		
		JSONObject json10 = new JSONObject();
		json10.put("option", "洗衣机");
		jsonArr.put(json10);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "主卧");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "次卧");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "隔断");
		jsonArr.put(json3);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "限男生");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "限女生");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "男女不限");
		jsonArr.put(json3);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "东");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "南");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "西");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "北");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "东西");
		jsonArr.put(json5);
		
		JSONObject json6 = new JSONObject();
		json6.put("option", "南北");
		jsonArr.put(json6);
		
		JSONObject json7 = new JSONObject();
		json7.put("option", "东南");
		jsonArr.put(json7);
		
		JSONObject json8 = new JSONObject();
		json8.put("option", "西南");
		jsonArr.put(json8);
		
		JSONObject json9 = new JSONObject();
		json9.put("option", "东北");
		jsonArr.put(json9);
		
		JSONObject json10 = new JSONObject();
		json10.put("option", "西北");
		jsonArr.put(json10);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "毛坯");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "简单装");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "中等装");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "精装修");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "豪华装");
		jsonArr.put(json5);
		
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
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "普通住宅");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "商住两用");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "公寓");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "平房");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "别墅");
		jsonArr.put(json5);
		
		JSONObject json6 = new JSONObject();
		json6.put("option", "其他");
		jsonArr.put(json6);
		
		jsonObj.put("housetype", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 人员类型
	 * @return
	 */
	public static JSONObject persontype(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "租房客");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "房东");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "中介");
		jsonArr.put(json3);
		
		jsonObj.put("persontype", jsonArr);
		return jsonObj;
	}
	
	/**
	 * 举报类型
	 * @return
	 */
	public static JSONObject reporttype(){
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		
		JSONObject json1 = new JSONObject();
		json1.put("option", "抢劫");
		jsonArr.put(json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("option", "偷盗");
		jsonArr.put(json2);
		
		JSONObject json3 = new JSONObject();
		json3.put("option", "性侵犯");
		jsonArr.put(json3);
		
		JSONObject json4 = new JSONObject();
		json4.put("option", "暴力威胁");
		jsonArr.put(json4);
		
		JSONObject json5 = new JSONObject();
		json5.put("option", "房租问题");
		jsonArr.put(json5);
		
		JSONObject json6 = new JSONObject();
		json6.put("option", "房屋问题");
		jsonArr.put(json6);
		
		JSONObject json7 = new JSONObject();
		json7.put("option", "房屋配置问题");
		jsonArr.put(json7);
		
		JSONObject json8 = new JSONObject();
		json8.put("option", "其他");
		jsonArr.put(json8);
		
		jsonObj.put("reporttype", jsonArr);
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
		FileUtils.writeStringToFile(new File(PATH + "persontype.json"), persontype().toString(), "UTF-8");
		FileUtils.writeStringToFile(new File(PATH + "reporttype.json"), reporttype().toString(), "UTF-8");
	}

}
