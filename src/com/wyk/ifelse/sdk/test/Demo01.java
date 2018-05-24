package com.wyk.ifelse.sdk.test;

import java.util.HashMap;
import java.util.Map;

import com.wyk.ifelse.sdk.IfElse04;

public class Demo01 {

	private Map<Integer,Class<? extends ShareItem>> shareMaps = new HashMap<Integer,Class<? extends ShareItem>>();
	private void init() {
		shareMaps.put(IfElse04.TYPE_LINK, Link.class);
		shareMaps.put(IfElse04.TYPE_TEXT, Text.class);
		shareMaps.put(IfElse04.TYPE_IMAGE, Image.class);
		shareMaps.put(IfElse04.TYPE_IMAGE_TEXT, ImageText.class);
		shareMaps.put(IfElse04.TYPE_LINK, Link.class);
	}
	
	public ShareItem createShareItem(int type){
		if(shareMaps.size() == 0) {
			init();
		}
		try {
		Class<? extends ShareItem> cls = shareMaps.get(type);
		return cls.newInstance(); 
		}catch (IllegalAccessException e) {
			//e.printStackTrace();
			System.out.println("IllegalAccessException");
			return new DefaultShareItem();
		}catch (InstantiationException e) {
			//e.printStackTrace();
			System.out.println("InstantiationException");
			return new DefaultShareItem();
		} 
	}
}
