package com.daicent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListStudent {
	private ArrayList<Student> listStudent;

	public ListStudent() {
		this.listStudent= new ArrayList<Student>();
	}

	public ListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public void addStudent(Student student) {
		this.listStudent.add(student);
	}
	public void loadListStudent() {
		for(Student student : listStudent) {
			System.out.println(student);
		}
	}
	public boolean checkListStudentNull() {
		return this.listStudent.isEmpty();
	}
	public int countStudent() {
		return this.listStudent.size();
	}
	public void removeAllStudent() {
		this.listStudent.removeAll(listStudent);
	}
	public boolean checkStudent(Student student) {
		return this.listStudent.contains(student);
	}
	public boolean removeStudent(Student student) {
		return this.listStudent.remove(student);
	}
	public void saveListStudent(File file) {
		try {
			OutputStream outputStream = new FileOutputStream(file);
			ObjectOutputStream objStream= new ObjectOutputStream(outputStream);
			for (Student student: listStudent) {
				objStream.writeObject(student);
				
			}
			objStream.flush();
			objStream.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void readListStudent(File file) {
		try {
			InputStream inputStream= new FileInputStream(file);
			ObjectInputStream objStream = new ObjectInputStream(inputStream);
			Student student=null;
			while (true) {
				Object obj=objStream.readObject();
				if(obj!=null) {
					student=(Student)objStream.readObject();
					this.listStudent.add(student);
				}else {
					break;
				}
			}
			objStream.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void searchStudent(String name) {
		int cout=0;
		for(Student student: this.listStudent) {
			if(student.getFullName().indexOf(name)>=0) {
				System.out.println(student);
				cout++;
			}
		}
		if(cout==0) {
			System.out.println("Haven't student name: "+ name);
		}	
	}
	public void sortStudentScoreAverage() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getScoreAverage()<student2.getScoreAverage()) {
					return 1;
				}else if(student1.getScoreAverage()>student2.getScoreAverage()) {
					return -1;
				}else {
				return 0;
				}
				
			}
		});
	}
}
