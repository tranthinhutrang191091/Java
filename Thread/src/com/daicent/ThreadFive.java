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
		int result=0;
		for(int i=0;i<10;i++) {
			synchronized (shareData) {
				if(i==19) {
					stop();
				}
				shareData.notifyAll();
				try {
					shareData.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			 result =shareData.getRad()*shareData.getRad();
			 System.out.println("Thraed Five "+i+" => "+ result);
			 
		}
	}
	
}
