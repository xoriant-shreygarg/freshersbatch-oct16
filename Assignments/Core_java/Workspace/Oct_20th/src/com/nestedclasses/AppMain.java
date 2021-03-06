package com.nestedclasses;

import java.util.Date;
import java.util.HashMap;

class DataWrapper{
	@Override
	public String toString() {
		return "DataWrapper [value=" + value + ", timestamp=" + timestamp + "]";
	}

	String value;
	Date timestamp;
	
	public DataWrapper(String value, Date date) {
		super();
		this.value = value;
		this.timestamp = date;
	}
	
}
class MyApp{

	static class Cache{
		static HashMap<String, DataWrapper> data = new HashMap<>();
		public static void add(String key, String value){
			data.put(key, new DataWrapper(value, new Date()));
		}
		public static DataWrapper get(String key){
			return data.get(key);
		}
	}
	
	public void addToCache(String key, String value){
		Cache.data.put(key, new DataWrapper(value, new Date()));
	}
	
	public DataWrapper getFromCache(String key){
		return Cache.data.get(key);
	}
	
}

public class AppMain {

	public static void main(String[] args) {
		MyApp app = new MyApp();
		app.addToCache("a", "a");
		app.addToCache("b", "b");
		app.addToCache("c", "c");
		app.addToCache("d", "d");
		app.addToCache("e", "e");
		
		System.out.println(app.getFromCache("b"));
	}

}
