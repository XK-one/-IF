package com.wyk.ifelse.sdk;

import com.wyk.ifelse.sdk.IfElse03.ShareItem;
/**
 * @author Administrator
 *
 * 作用： 提供给用户使用的接口
 */
public class IfElse031 {
	
	public ShareItem createLinkShareItem(String link,String title,String content) {
		return new IfElse03.Link(link,title,content);
	}
	
	public ShareItem createImageShareItem(String imagePath) {
		return new IfElse03.Image(imagePath); 
	}
	
	public ShareItem createTextShareItem(String content) { 
		return new IfElse03.Text(content); 
	}
	
	public ShareItem createImageTextShareItem(String imagePath, String content) { 
		return new IfElse03.ImageText(imagePath,content);
	}
	

}
