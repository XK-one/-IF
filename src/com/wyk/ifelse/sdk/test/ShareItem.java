package com.wyk.ifelse.sdk.test;

import java.util.List;

import com.wyk.ifelse.IfElse01.ShareListener;

public abstract class ShareItem {

	int type;
	//List<String> args;
	public ShareItem(int type) { 
		this.type = type;
	}
	public ShareItem() {
	} 
	public void isCanShare(ShareListener listener) {
		if(listener == null){
			return;
		}
		doShare(listener);
	}
	abstract void doShare(ShareListener listener);
	/*public void setList(List args) {
		this.args = args;
	}*/

}
