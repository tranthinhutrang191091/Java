package com.daicent;

import object.ShareData;

// Đồng bộ luồng -> an toàn dữ liệu
public class SynchoronizationThread {
	public static void main(String[] args) {
		ShareData shareData= new ShareData();
		ThreadThree threadThree1 = new ThreadThree(shareData);
		ThreadThree threadThree2 = new ThreadThree(shareData);
		ThreadThree threadThree3 = new ThreadThree(shareData);
		ThreadThree threadThree4 = new ThreadThree(shareData);
		ThreadThree threadThree5 = new ThreadThree(shareData);
		threadThree1.start();
		threadThree2.start();
		threadThree3.start();
		threadThree4.start();
		threadThree5.start();
		
		
	}
}
