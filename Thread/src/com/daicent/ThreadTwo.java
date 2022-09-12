package com.daicent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// Cách 6:
public class ThreadTwo extends Thread{
	List<Character> list= new ArrayList<>();
	// Thread sau 2s sinh ngẫu nhiên các ký tự từ a->z
	// => lưu vào ArrayList
	@Override
	public void run() {
		Random random= new Random();
		for(int i=0;i<10;i++) {
			int limit= (int)'z' - (int)'a';
			int rad= random.nextInt(limit)+ (int)'a';
			
			list.add((char)rad);
			System.out.println("Thread Two "+i+" =>"+(char)rad);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
