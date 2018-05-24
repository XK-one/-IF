package com.wyk.ifelse.sdk.test;

import com.wyk.ifelse.IfElse01.ShareListener;

public class Link extends ShareItem {

	String mLink;
	String mTitle;
	String mContent;
	public Link() { 
		
	}
	public Link(String link,String title,String content) {
		super(Constant.TYPE_LINK);
		this.mLink = (link !=null && link !="")? link : "default";
		this.mTitle = (link != null && link != "")? link : "default";
		this.mContent = (link != null && link != "")? link : "default";
	}
	@Override
	public void doShare(ShareListener listener) {
		//TODO
	}

}
