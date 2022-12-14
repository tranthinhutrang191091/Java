package com.daicent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import object.ListStudent;
import object.Student;

/*
 * List là một interface trong java. 
 * Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index
 * 
 */
public class ListCollection {
	public static void main(String[] args) {
		// Khởi tạo đối tượng List kiểu dữ liệu String
		System.out.println("\t1. List");
		List<String> list = new ArrayList<String>();
		// Hàm add(Object o): chèn phần tử vào cuối list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		// Hàm add(int index,Object o):chèn các phần tử vào list tại chỉ số index
		list.add(1, "Python");
		// show list
		System.out.print("list: ");
		for (String s : list) {
			System.out.print(s + "\t");
		}
		// Hàm get(int index):lấy ra phần tử ở index
		System.out.println("\nPhần tử có index =2 là: " + list.get(2));
		// Hàm set(int index, Object o): gán phần tử cho vị trí chỉ định index
		list.set(1, "C#");
		System.out.println("list sau khi gán: ");
		for (String s : list) {
			System.out.print(s + "\t");
		}
		// Hàm remove(int index): xóa phần tử ở vị trí index
		list.remove(1);
		System.out.println("\nlist sau khi xóa: ");
		for (String s : list) {
			System.out.print(s + "\t");
		}
		// 1. Hàm ListIterator listIterator():
		// trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list
		// 2. Hàm boolean addAll(int index,Collection c):
		// chèn tất cả các yếu tố của c vào danh sách tại chỉ số index
		// 3. Hàm ListIterator listIterator(int index):
		// trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định

		// Khởi tạo đối tượng ArrayList bằng cách truyền array vào list
		System.out.println("\n\t2. ArrayList");
		// create new array
		String[] arr = { "Java", "C++", "PHP", "Python" };
		// convert array to List
		List<String> arrayList = Arrays.asList(arr);
		// show list
		System.out.print("array list: ");
		for (String s : arrayList) {
			System.out.print(s + "\t");
		}

		// ListIterator
		System.out.println("\n\t3. ListIterator");

		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("C++");
		list1.add("PHP");
		list1.add("Python");
		// Khởi tạo ListIterator
		ListIterator<String> listIterator = list1.listIterator();
		System.out.println("Duyệt phần tử trong ListIterator từ đầu đến cuối:");
		// Hàm boolean hasNext():trả về true
		// nếu list interator có tồn tại phần tử kế tiếp phần tử hiện tại
		// Hàm Object next(): trả về phần tử kế tiếp trong danh sách
		// và vị trí con trỏ tăng lên 1
		while (listIterator.hasNext()) {
			System.out.println("\t" + listIterator.next());
		}
		System.out.println("Duyệt phần tử trong ListIterator từ cuối đến đầu:");

		// Hàm boolean hasPrevious():
		// trả về true nếu list interator có tồn tại phần tử kế sau phần tử hiện tại
		// Hàm Object previous():
		// trả về phần tử kế sau trong danh sách và vị trí con trỏ giảm đi 1
		while (listIterator.hasPrevious()) {
			System.out.println("\t" + listIterator.previous());
		}
		
		// QUẢN LÝ LIST STUDENT
				System.out.println("\n\t5. LIST STUDENT");

		// QUẢN LÝ LIST STUDENT
		System.out.println("\n\t5. LIST STUDENT");
		Scanner sc = new Scanner(System.in);
		int option = 0;
		ListStudent listStudent = new ListStudent();
		do {
			System.out.println("\t--------MENU---------");
			System.out.println("\tSelection Function");
			System.out.println(
								"1.	Add Student\n" + 
								"2.	Load List Student\n" + 
								"3.	Check List Student Null\n"+ 
								"4.	Count Student in List Student\n" + 
								"5.	Remove All Student\n"+ 
								"6.	Check Student Have In List Student\n"+ 
								"7.	Remove Student In List Student With Code Student\n"+ 
								"8.	Search Name Student In List Student With Name Student\n"+ 
								"9.	Sort Student \n"+ 
								"0.	Exit! \n");
			System.out.print("=>Selection Function: ");

			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				System.out.print("Code Student: ");
				String codeStudent = sc.nextLine();
				System.out.print("Full Name: ");
				String fullName = sc.nextLine();
				System.out.print("Year Birth: ");
				int yearBirth = sc.nextInt();
				System.out.print("Score Average: ");
				float scoreAverage = sc.nextFloat();
				Student student = new Student(codeStudent, fullName, yearBirth, scoreAverage);
				listStudent.addStudent(student);
				break;
			case 2:
				if (listStudent.checkListStudentNull() == false) {
					System.out.println("List Student: ");
					listStudent.loadListStudent();
				}else {
					System.out.println("List Student: Null ");
				}
				break;
			case 3:
				if (listStudent.checkListStudentNull() == false) {
					System.out.println("List Student Not Null");
				} else
					System.out.println("List Student Null");
				break;
			case 4:
				System.out.println("Count Student: " + listStudent.countStudent());
				break;
			case 5:
				listStudent.removeAllStudent();
				System.out.println("Removed All!: ");
				break;
			case 6:
				System.out.print("Code Student: ");
				String codeStudent1=sc.nextLine();
				Student student1= new Student(codeStudent1);
				System.out.println("Check "+student1.toString()+": "+ 
				listStudent.checkStudent(student1));
				break;
			case 7:
				System.out.print("Code Student: ");
				String codeStudent2=sc.nextLine();
				Student student2= new Student(codeStudent2);
				listStudent.removeStudent(student2);
				System.out.println("Removed Student! ");
				break;
			case 8:
				System.out.print("Name Student: ");
				String nameStudent=sc.nextLine();
				listStudent.searchStudent(nameStudent);
				break;
			case 9:
				listStudent.sortStudentScoreAverage();
				listStudent.loadListStudent();
				break;
			}

		} while (option != 0);

	}
}
