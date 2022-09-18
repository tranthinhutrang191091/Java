package com.daicent;

import object.ShareData;

public class WaitNotifyThread {
	public static void main(String[] args) {
		ShareData shareDate= new ShareData();
		ThreadFour threadFour= new ThreadFour(shareDate);
		ThreadFive threadFive = new ThreadFive(shareDate);
		
		threadFour.start();
		threadFive.start();
	}
	
}
