package com.daicent;

import java.util.Random;

import object.ShareData;

public class ThreadThree extends Thread {
	ShareData shareData = new ShareData();
	
	public ThreadThree(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		Random random= new Random();
		for(int i=0;i<10;i++) {
			int rad = random.nextInt(5);
			shareData.add(rad);
		}
	}
	
}
