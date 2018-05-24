package com.wyk.ifelse.sdk.test;

import com.wyk.ifelse.IfElse01.ShareListener;

public class ImageText extends ShareItem {

	public String imagePath;
	public String content;
	
	public ImageText(String imagePath, String content){
		super(Constant.TYPE_IMAGE_TEXT);
		this.imagePath = (imagePath != null && imagePath != "")? imagePath : "default";
		this.content = (content != null && content != "")? content : "default";
	}
	public ImageText() {
		
	}
	
	@Override
	public void doShare(ShareListener listener) { 
		
		if(listener == null) {
			return;
		}
		if(imagePath == "default" || content == "default") { 
			listener.onCallback(ShareListener.STATE_FAIL, "分享信息不完整"); 
			return;
		}
		listener.onCallback(ShareListener.STATE_SUCC, "链接 分享成功4 : IMAGE_PATH=" + imagePath + ",CONTENT=" + content); 
	}

}
