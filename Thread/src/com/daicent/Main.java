package com.daicent;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		ThreadOne threadOne= new ThreadOne();
		ThreadTwo threadTwo= new ThreadTwo();
		new Thread(threadOne).start();
		threadTwo.start();
		new Thread(threadOne).join();
		threadTwo.join();
		
		// Kết quả:
		System.out.println("Thread 1:");
		for (int s : threadOne.list) {
			System.out.print(s + "\t");
		}
		System.out.println("\nThread 2:");
		for (char s : threadTwo.list) {
			System.out.print(s + "\t");
		}
		
	}
}
