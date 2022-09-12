package com.daicent;

import java.util.Random;
// Lấy giá trị ở Thread Four sang

import object.ShareData;
public class ThreadFive extends Thread {
	ShareData shareData;
	
	public ThreadFive(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			synchronized (shareData) {
				try {
					shareData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 double  result =Math.pow(shareData.getRad(), 2);
			 System.out.println("Thraed Five "+i+" => "+ result);
			 shareData.notify();
		}
	}
	
}