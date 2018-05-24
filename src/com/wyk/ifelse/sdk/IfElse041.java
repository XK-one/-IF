package com.wyk.ifelse.sdk;

import java.util.HashMap;
import java.util.Map;

import com.wyk.ifelse.sdk.IfElse04.Image;
import com.wyk.ifelse.sdk.IfElse04.ImageText;
import com.wyk.ifelse.sdk.IfElse04.Link;
import com.wyk.ifelse.sdk.IfElse04.ShareItem;
import com.wyk.ifelse.sdk.IfElse04.Text;

public class IfElse041 {

	private Map<Integer,Class<? extends IfElse04.ShareItem>> shareMaps = new HashMap<Integer,Class<? extends IfElse04.ShareItem>>();
	private void init() {
		shareMaps.put(IfElse04.TYPE_LINK, Link.class);
		shareMaps.put(IfElse04.TYPE_TEXT, Text.class);
		shareMaps.put(IfElse04.TYPE_IMAGE, Image.class);
		shareMaps.put(IfElse04.TYPE_IMAGE_TEXT, ImageText.class);
	}
	
	
	public IfElse04.ShareItem createShareItem(int type){
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
	
	//这个异常应该给用户去处理
	/*public void  doError(int state, String msg) {
		if(state == ShareListener.STATE_FAIL){ 
			System.out.println(msg); 
		}else if(state == ShareListener.STATE_SUCC) {
			System.out.println("分享成功： " + msg); 
		}else {
			System.out.println("分享失败： " + msg); 
		}
	}*/
		

}
