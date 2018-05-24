package com.wyk.ifelse;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.wyk.ifelse.IfElse01.ShareItem;
import com.wyk.ifelse.IfElse01.ShareListener;
import com.wyk.ifelse.sdk.IfElse03;
import com.wyk.ifelse.sdk.IfElse031;
import com.wyk.ifelse.sdk.IfElse04;
import com.wyk.ifelse.sdk.IfElse041;
import com.wyk.ifelse.sdk.test.Constant;
import com.wyk.ifelse.sdk.test.Demo01;
import com.wyk.ifelse.sdk.test.ImageText;

/** 
 * @author Administrator
 *	
 * 作用：测试IF优化的主类
 */
public class Main {

		public static void main(String[] args) {
			//test1();
			//test2();
			//test3();
			test4();
			
			
		}
		public static void test1() {
			//第一种情况(原始的if-else嵌套)
			//IfElse01.ShareItem item = new IfElse01.ShareItem();
			ShareItem item = IfElse01.createShareItem(); 
			ShareListener listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					//TODO
					System.out.println("state : " + state + ", msg : " + msg); 
				}
			};
			IfElse01.share(item,listener);
		}
		
		public static void test2() {
			//第二种情况(内外接口的方式来减少if-else)
			ShareItem item = IfElse01.createShareItem(); 
			ShareListener listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					//TODO
					System.out.println("state : " + state + ", msg : " + msg); 
				}
			};
			IfElse02 ifElse02 = new IfElse02();
			ifElse02.share(item, listener); 
		}
		
		public static void test3() {
			//第三种情况(多态,缺点：多个类对外开放,可以单独一个类来提供这些类，然后提供方法出来让使用者获取)
			ShareListener listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					//TODO
					System.out.println("state : " + state + ", msg : " + msg); 
				}
			};
			/*IfElse03 ifElse03 = new IfElse03();
			IfElse03.ShareItem item1 = new IfElse03.Link("http://www.baidu.com","标题","内容");
			ifElse03.share(item1, listener);*/
			IfElse031 ifElse031 = new IfElse031();  
			com.wyk.ifelse.sdk.IfElse03.ShareItem linkShareItem = ifElse031.createLinkShareItem("http://www.baidu.com","标题","内容");
			linkShareItem.doShare(listener);
		}
		
		public static void test4() { 
			//第四种情况(封装成SDK的形式 + 使用map来维护多个类)，缺点，
			ShareListener listener = new ShareListener() {
				@Override
				public void onCallback(int state, String msg) {
					//TODO
					System.out.println("state : " + state + ", msg : " + msg); 
				}
			};
			///////////////////////////////////////////////////////////////////////////
			/*IfElse041 ifElse041 = new IfElse041();
			//ifElse041.doShare(IfElse04.TYPE_IMAGE_TEXT, listener);
			com.wyk.ifelse.sdk.IfElse04.ShareItem shareItem = ifElse041.createShareItem(IfElse04.TYPE_IMAGE_TEXT);
			shareItem.isCanShare(listener);*/
			/////////////////////////////////////////////////////////////////////////
			
			Demo01 demo01 = new Demo01();
			com.wyk.ifelse.sdk.test.ShareItem shareItem1 = demo01.createShareItem(Constant.TYPE_IMAGE_TEXT); 
			/**设置参数 方法1,缺点：还得用户熟悉设置参数的步骤*/
			/*String[] args = new String[]{"http://www.sohu.com","内容"}; 
			shareItem1.setList(Arrays.asList(args));*/
			/**设置参数 方法2, 缺点：不人性化,还得用户转*/
			ImageText imageText = (ImageText)shareItem1;
			imageText.imagePath = "http://www.kugou.com";
			imageText.content = "内容";
			imageText.isCanShare(listener);
			
		}
}
