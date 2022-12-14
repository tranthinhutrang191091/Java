package com.daicent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Cách 5:  Runnable Interface
public class ThreadOne implements Runnable{
	List<Integer> list = new ArrayList<>();
	
	// Thread sau 1s sinh ngẫu nhiên 1 số từ 0->100
	// => lưu kết quả vào ArrayList
	@Override
	public void run() {
		Random random= new Random();
		for(int i=0;i<10;i++) {
			int rad= random.nextInt(100);
			list.add(rad);
			System.out.println("Thread One "+i+" =>"+rad);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
