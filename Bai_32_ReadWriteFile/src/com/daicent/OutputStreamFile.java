package com.daicent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class OutputStreamFile {
	public static void main(String[] args) {
		Student student1 = new Student("001", "Trần Thị Như Trang", 1991, 9.8f);
		Student student2 = new Student("002", "Trần  Trang", 1990, 7.5f);
		Student student3 = new Student("003", "Như Trang", 1999, 5.5f);
		Student student4 = new Student("004", "Trần Thị Trang", 1992, 9.0f);
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\student.data");
		
		// Cách 1: lưu từng object
		try {
			OutputStream outputStream = new FileOutputStream(file1);
			ObjectOutputStream objOutStream = new ObjectOutputStream(outputStream);
			objOutStream.writeObject(student1);
			objOutStream.flush();
			objOutStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Cách 2: Lưu cả list object
		File file2 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\student2.data");
		
		ListStudent listStudent = new ListStudent();
		listStudent.addStudent(student1);
		listStudent.addStudent(student2);
		listStudent.addStudent(student3);
		listStudent.addStudent(student4);
		listStudent.saveListStudent(file2);
		listStudent.loadListStudent();
	
		System.out.println("Xong!");
	}
}
