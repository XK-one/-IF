package com.wyk.ifelse.sdk.test;

import com.wyk.ifelse.IfElse01.ShareListener;

public class DefaultShareItem extends ShareItem {
	
	public DefaultShareItem() {
		super(-1); 
		System.out.println("捕获到了异常"); 
	}

	@Override
	void doShare(ShareListener listener) {
		//TODO
	}
}
