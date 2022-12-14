package com.daicent;

/*
 * 1. Mỗi Thread sẽ thực hiện một công việc hoàn toàn riêng biệt 
 * được quản lý bởi máy ảo Java (Java Virtual Machine)
 * 2. Mỗi một thread có thể chạy song song riêng biệt với nhau
 */
public class ThreadMultiThread {
	// Thread main => luồng chính
	public static void main(String[] args) {
		// Không có thread
		for (int i = 0; i < 10; i++) {
			System.out.println("No Thread 1=> " + i);
		}
		System.out.println("1. Start");

		// Cách 1: Khởi tạo 1 luồng
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread 1=> " + i);
				}
			}
		});
		thread.start();
		System.out.println("2. End");

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread number 2=> " + i);
				}
			}
		});
		thread2.start();

		// Cách 2: Khởi tạo 1 luồng
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread ==> 3=> " + i);
				}
			}
		}).start();
		// Cách 3 : lambda
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread <=> 4=> " + i);
			}
		}).start();
	}
}
