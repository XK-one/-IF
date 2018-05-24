package com.wyk.ifelse.sdk.test;

import com.wyk.ifelse.IfElse01.ShareListener;

public class Image extends ShareItem {

	String imagePath;
	
	public Image() {
		
	}
	public Image(String imagePath) {
		super(Constant.TYPE_IMAGE);
		this.imagePath = (imagePath != null && imagePath != "")? imagePath : "default";
	}
	@Override
	public void doShare(ShareListener listener) { 
		//TODO
	}

}
