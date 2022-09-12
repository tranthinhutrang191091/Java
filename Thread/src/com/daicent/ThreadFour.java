package com.daicent;

import java.util.Random;

import object.ShareData;

public class ThreadFour extends Thread {
	ShareData shareData;

	public ThreadFour(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			// ĐỒng bộ trên biến shareData
			synchronized (shareData) {
				try {
					// luồng đợi
					shareData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int rad = random.nextInt(100);
				shareData.setRad(rad);
				System.out.println("Thread Four " + i + " => rad = " + rad);
				
				shareData.notify();
			}

		}
	}

}
