package com.wyk.ifelse;

import com.wyk.ifelse.IfElse01.ShareItem;
import com.wyk.ifelse.IfElse01.ShareListener; 

public class IfElse02 {
	
	private static final int TYPE_LINK = 0;
	private static final int TYPE_TEXT = 1;
	private static final int TYPE_IMAGE = 2;
	private static final int TYPE_IMAGE_TEXT = 3;
	
	//外接口
	public void share(ShareItem item,ShareListener listener) {
		if(item == null) {
			if(listener != null) {
				listener.onCallback(ShareListener.STATE_FAIL, "ShareItem 不能为 null"); 
			}
			return;
		}
		if(listener == null){
			listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					//System.out.println("state : " + state + ", msg : " + msg); 
				}
			};
		}
		
		shareImpl(item,listener); 
	}
	
	//内接口
	public void shareImpl(ShareItem item,ShareListener listener){
		if(item != null ) {
			listener.onCallback(ShareListener.STATE_SUCC, "ShareItem 不等于 null");
		}else {
			listener.onCallback(ShareListener.STATE_FAIL, "ShareItem 为 null");
		}
		
		/*if (item.type == TYPE_LINK) {
	        // 分享链接
	        if (!TextUtils.isEmpty(item.link) && !TextUtils.isEmpty(item.title)) {
	            doShareLink(item.link, item.title, item.content, listener);
	        } else {
	            listener.onCallback(ShareListener.STATE_FAIL, "分享信息不完整");
	        }
	    } else if (item.type == TYPE_IMAGE) {
	        // 分享图片
	        if (!TextUtils.isEmpty(item.imagePath)) {
	            doShareImage(item.imagePath, listener);
	        } else {
	            listener.onCallback(ShareListener.STATE_FAIL, "分享信息不完整");
	        }
	    } else if (item.type == TYPE_TEXT) {
	        // 分享文本
	        if (!TextUtils.isEmpty(item.content)) {
	            doShareText(item.content, listener);
	        } else {
	            listener.onCallback(ShareListener.STATE_FAIL, "分享信息不完整");
	        }
	    } else if (item.type == TYPE_IMAGE_TEXT) {
	        // 分享图文
	        if (!TextUtils.isEmpty(item.imagePath) && !TextUtils.isEmpty(item.content)) {
	            doShareImageAndText(item.imagePath, item.content, listener);
	        } else {
	            listener.onCallback(ShareListener.STATE_FAIL, "分享信息不完整");
	        }
	    } else {
	        listener.onCallback(ShareListener.STATE_FAIL, "不支持的分享类型");
	    }*/
	}
	

}
