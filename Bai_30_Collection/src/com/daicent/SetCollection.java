package com.daicent;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import object.Student;
import object.days;

/*
 * 1. Set là một interface kế thừa Collection interface trong java. 
 * 2. Một Collection không thể chứa các phần tử trùng lặp.
 *- HashSet lưu trữ các phần tử của nó trong bảng băm, 
 *là cách thực hiện tốt nhất, 
 *tuy nhiên nó không đảm bảo về thứ tự các phần tử được chèn vào.
 *- TreeSet lưu trữ các phần tử của nó trong một cây, 
 *sắp xếp các phần tử của nó dựa trên các giá trị của chúng, 
 *về cơ bản là chậm hơn HashSet.
 *- LinkedHashSet được triển khai dưới dạng bảng băm 
 *với có cấu trúc dữ liệu danh sách liên kết, 
 *sắp xếp các phần tử của nó dựa trên thứ tự chúng 
 *được chèn vào tập hợp (thứ tự chèn).
 *- EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum.
 */
public class SetCollection {
	public static void main(String[] args) {
		// Khởi tạo setHashSet là HashSet
		Set<String> setHashSet = new HashSet<String>();
		setHashSet.add("trần");
		setHashSet.add("thị");
		setHashSet.add("như");
		setHashSet.add("trang");
		System.out.println("Số phần tử của setHashSet: " + setHashSet.size());
		System.out.println("Các phần tử của setHashSet: " + setHashSet);
		System.out.println("setHashSet có chứa 'trang' không? " + setHashSet.contains("trang"));
		System.out.println("setHashSet có chứa 'ốc' không? " + setHashSet.contains("ốc"));
		System.out.println("Duyệt phần tử trong setHashSet với Iterator: ");
        Iterator<String> iterator = setHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print((String) iterator.next()+", ");
        }
        System.out.println("\nDuyệt phần tử trong setHashSet với for: ");
        for (String element : setHashSet) {
            System.out.print(element+", ");
        }
        // xóa phần tử 'trang' khỏi setHashSet
        setHashSet.remove("trang");
        System.out.println("\nsetHashSet sau khi xóa 'trang': "+ setHashSet);
        // Chuyển đổi Set thành List
        List<String> arrayList = new ArrayList<String>();
        // chuyển đổi setHashSet thành arrayList
        arrayList.addAll(setHashSet);
        System.out.println("arrayList: "+arrayList);
        
        
        // xóa setHashSet
        setHashSet.clear();
        // kiểm tra setHashSet trống hay ko
        System.out.println("setHashSet có trống không? " + setHashSet.isEmpty());
        
        // Create setStudent
        Set<Student> setStudent = new HashSet<Student>();
        // Create students
        Student student1 = new Student("1", "trần thị như trang", 1990,9.8f);
        Student student2 = new Student("2", " như trang", 1990,8.9f);
        Student student3 = new Student("4", "ốc", 1990,10.0f);
        
        Student student4 = new Student("3", "ốc", 1990,10.0f);
        
        // Add objects to setStudent
        setStudent.add(student1);
        setStudent.add(student2);
        setStudent.add(student3);
        setStudent.add(student4);
        // Show listStudent
        for (Student student : setStudent) {
            System.out.println(student);
        }
        
        
        
        
        
        
		// Khởi tạo setTreeSet là TreeSet
		Set<String> setTreeSet = new TreeSet<String>();
		setTreeSet.add("trần");
		setTreeSet.add("thị");
		setTreeSet.add("như");
		setTreeSet.add("trang");
		System.out.println("Số phần tử của setTreeSet: " + setTreeSet.size());
		System.out.println("Các phần tử của setTreeSet: " + setTreeSet);
		System.out.println("setTreeSet có chứa 'trang' không? " + setTreeSet.contains("trang"));
		System.out.println("setTreeSet có chứa 'ốc' không? " + setTreeSet.contains("ốc"));

		// Khởi tạo setLinkedHashSet là LinkedHashSet
		Set<String> setLinkedHashSet = new LinkedHashSet<String>();
		setLinkedHashSet.add("trần");
		setLinkedHashSet.add("thị");
		setLinkedHashSet.add("như");
		setLinkedHashSet.add("trang");
		System.out.println("Số phần tử của setLinkedHashSet: " + setLinkedHashSet.size());
		System.out.println("Các phần tử của setLinkedHashSet: " + setLinkedHashSet);
		System.out.println("setLinkedHashSet có chứa 'trang' không? " + setLinkedHashSet.contains("trang"));
		System.out.println("setLinkedHashSet có chứa 'ốc' không? " + setLinkedHashSet.contains("ốc"));
		
		// Khởi tạo setEnumSet là EnumSet
		Set<days> setEnumSet = EnumSet.of(days.MONDAY, days.FRIDAY);
		System.out.println("Số phần tử của setEnumSet: " + setEnumSet.size());
		System.out.println("Các phần tử của setEnumSet: " + setEnumSet);
		System.out.println("setEnumSet có chứa 'trang' không? " + setEnumSet.contains(days.MONDAY));
		System.out.println("setEnumSet có chứa 'ốc' không? " + setEnumSet.contains(days.SATURDAY));
		Set<days> setEnumSet2 = EnumSet.allOf(days.class);
		System.out.println("Các phần tử của setEnumSet2: " + setEnumSet2);
		Set<days> setEnumSet3 = EnumSet.noneOf(days.class);
		System.out.println("Các phần tử của setEnumSet3: " + setEnumSet3);
		
		
	}
}
