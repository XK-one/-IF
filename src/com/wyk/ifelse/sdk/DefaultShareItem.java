package com.wyk.ifelse.sdk;

import com.wyk.ifelse.IfElse01.ShareListener;
import com.wyk.ifelse.sdk.IfElse04.ShareItem;

public class DefaultShareItem extends ShareItem {
	
	public DefaultShareItem(IfElse04 ifElse04) {
		ifElse04.super(-1);
		// TODO Auto-generated constructor stub
	}
	public DefaultShareItem() {
		this(new IfElse04());
		System.out.println("捕获到了异常"); 
	}

	@Override
	void doShare(ShareListener listener) {
		//TODO
	}

}
