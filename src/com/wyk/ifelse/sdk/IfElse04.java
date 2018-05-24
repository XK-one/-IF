package com.wyk.ifelse.sdk;

import java.util.List;

import com.wyk.ifelse.IfElse01.ShareListener;

public class IfElse04 {
	
	public static final int TYPE_LINK = 0;
	public static final int TYPE_TEXT = 1;
	public static final int TYPE_IMAGE = 2;
	public static final int TYPE_IMAGE_TEXT = 3;
	
	public abstract class ShareItem{
		int type;
		List<String> args;
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
		
		
	
	}
	
	//分享链接
	public class Link extends ShareItem{
		String mLink;
		String mTitle;
		String mContent;
		public Link(String link,String title,String content) {
			super(TYPE_LINK);
			this.mLink = (link !=null && link !="")? link : "default";
			this.mTitle = (link != null && link != "")? link : "default";
			this.mContent = (link != null && link != "")? link : "default";
		}
		@Override
		public void doShare(ShareListener listener) {
			//TODO
		}
	}
	
	//分享图片
	public class Image extends ShareItem{
		String imagePath;
		public Image(String imagePath) {
			super(TYPE_IMAGE);
			this.imagePath = (imagePath != null && imagePath != "")? imagePath : "default";
		}
		@Override
		public void doShare(ShareListener listener) { 
			//TODO
		}
	}
	
	//分享文字
	public class Text extends ShareItem{
		String content;
		public Text(String content){
			super(TYPE_TEXT);
			this.content = (content != null && content != "")? content : "default";
		}
		@Override
		public void doShare(ShareListener listener) { 
			//TODO
		}
	}
	
	//分享图文
	public class ImageText extends ShareItem{
		String imagePath;
		String content;
		public ImageText(String imagePath, String content){
			super(TYPE_IMAGE_TEXT);
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
			listener.onCallback(ShareListener.STATE_SUCC, "链接 分享成功4");
		}
	}

	
	
////////////////////////////////////////////////////////////////////////////////
	
	//分享的操作
	public void share(ShareItem item,ShareListener listener) {
		if(item == null) {
			if(listener != null) { 
				listener.onCallback(ShareListener.STATE_FAIL, "ShareItem 不能为 null"); 
			}
			return;
		}
		if(listener == null) {
			listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					System.out.println("ShareListener is null"); 
				}
			};
		}
		shareImpl(item, listener); 
	}
	
	public void shareImpl(ShareItem item,ShareListener listener) {
		item.doShare(listener); 
	}
	
}
