package com.ims.utility;


import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonUtility {

	
	public static <E> String getJsonFromObject(E elem){
		Gson gson = new Gson();
		return gson.toJson(elem, elem.getClass());
	}

	public static <E> E getObjectFromJson(String json, Class<E> clazz){
		Gson gson = new Gson();
		
		return gson.fromJson(json,clazz);
	}
}
