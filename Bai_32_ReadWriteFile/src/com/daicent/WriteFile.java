package com.daicent;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFile {
	public static void main(String[] args) {
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam1.txt",
					"UTF-8");
			printWriter.println("Xin chào!");
			printWriter.println("Trần Thị Như Trang");
			printWriter.print("Trần Thị Như Trang 1");
			printWriter.println("Trần Thị Như Trang 2");
			Student student1 = new Student("001", "Trần Thị Như Trang", 1991, 9.8f);
			Student student2 = new Student("002", "Trần  Trang", 1990, 7.8f);
			printWriter.println(student1);
			printWriter.println(student2);
			printWriter.flush();
			printWriter.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {

			e.printStackTrace();
		}
		
	}
}
