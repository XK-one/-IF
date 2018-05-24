package com.wyk.ifelse.sdk.test;

import com.wyk.ifelse.IfElse01.ShareListener;

public class Text extends ShareItem {

	String content;
	public Text() {
		
	}
	public Text(String content){
		super(Constant.TYPE_TEXT);
		this.content = (content != null && content != "")? content : "default";
	}
	@Override
	public void doShare(ShareListener listener) { 
		//TODO
	}
}
