package com.archer.xjson;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class JSONCache {

	static final ConcurrentHashMap<Class<?>, Field[]> FILED_CACHE = 
			new ConcurrentHashMap<>();
	
	public static Field[] get(Class<?> cls) {
		return FILED_CACHE.getOrDefault(cls, null);
	}
	
	public static void save(Class<?> cls, Field[] fields) {
		FILED_CACHE.put(cls, fields);
	}
}
