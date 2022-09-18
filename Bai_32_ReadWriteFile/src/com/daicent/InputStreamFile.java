package com.daicent;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class InputStreamFile {
	public static void main(String[] args) {
		// Đọc 1 object
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\student.data");

		try {
			InputStream inputStream = new FileInputStream(file1);
			ObjectInputStream objStream = new ObjectInputStream(inputStream);
			Student student = (Student) objStream.readObject();
			System.out.println(student);
			System.out.println(student.getScoreAverage());
			objStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Cách 2: Lưu cả list object
		File file2 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\student2.data");
		ListStudent listStudent = new ListStudent();
		listStudent.readListStudent(file2);
		listStudent.loadListStudent();
		System.out.println("Xong");
		
	}

}
