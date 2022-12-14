package com.daicent;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import object.Student;

/*
 * 1. Thừa lớp AbstractSequentialList 
 * triển khai của List, Queue Interface trong Collections 
 * nên nó sẽ có một vài đặc điểm và phương thức tương đồng 
 * với List, Queue.
 * 2. Sử dụng cấu trúc danh sách liên kết kép Doubly 
 * để lưu trữ các phần tử
 * 
 * 3. có thể chứa các phần tử trùng lặp
 * 4. duy trì thứ tự của phần tử được thêm vào
 * 5. non-synchronized 
 * => thao tác nhanh 
 * vì không cần phải dịch chuyển 
 * nếu bất kỳ phần tử nào bị xoá khỏi danh sách
 * có thể được sử dụng như list , stack  hoặc queue 
 */
public class LinkedListCollection {
	public static void main(String[] args) {
		// khai báo 1 LinkedList có tên là linkedList
		// có kiểu là String
		LinkedList<String> linkedList = new LinkedList<String>();
		// Hàm add(Object o): thêm các phần tử vào cuối linkedList
		linkedList.add("trần");
		linkedList.add("thị");
		linkedList.add("như");
		linkedList.add("trang");
		// Hàm add(int index, Object element): add vào vị trí index
		linkedList.add(1,"ốc");
		linkedList.add("ốc");
		linkedList.add("nhi");
		// Hàm addFirst(Object o): add vào vị trí đầu 
		linkedList.addFirst("ngọc");
		// Hàm addLast(Object o): add vào vị trí cuối 
		linkedList.addLast("nhi");
        // hiển thị các phần tử của linkedList
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(linkedList);
        // Hàm int size(): trả lại số lượng các phần tử 
        System.out.println("Số phần tử có trong list là: "+ linkedList.size());
        // Hàm contains(Object o): kiểm tra phần tử có trong list
        Object obj="trang";
        System.out.println("Kiểm tra '"+obj+"' có không: "+ linkedList.contains(obj));
        // Hàm remove(Object o): xóa phần tử o đầu tiên
        linkedList.remove(obj);
        System.out.println("Các phần tử có trong list sau khi xóa là: ");
        System.out.println(linkedList);
        // Hàm getFirst():trả về phần tử đầu tiên trong một danh sách
        System.out.println("Phần tử đầu tiên của list là: "+linkedList.getFirst());
        // Hàm getLast()
        System.out.println("Phần tử cuối của list là: "+linkedList.getLast());
        // Hàm int indexOf(Object o): trả ra index đầu tiên của phần tử, -1 nếu ko có
        System.out.println("Kiểm tra 'nhi' đầu tiên ở vị trí: "+ linkedList.indexOf("nhi"));
        // Hàm int lastIndexOf(Object o): trả ra index đầu tiên của phần tử, -1 nếu ko có
        System.out.println("Kiểm tra 'trang' cuối cùng ở vị trí: "+ linkedList.lastIndexOf("trang"));
        System.out.println("Kiểm tra 'nhi' cuối cùng ở vị trí: "+ linkedList.lastIndexOf("nhi"));
        
        // sử dụng vòng lặp for - hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i)+",");
        }
        // sử dụng vòng lặp for cải tiến - hiển thị các phần tử của list
        System.out.println("\nCác phần tử có trong list là: ");
        for (String str : linkedList) {
            System.out.print(str+",");
        }
        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<String> iterator = linkedList.iterator();
        System.out.println("\nCác phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.print((String) iterator.next()+",");
        }
        // sử dụng ListIterator - hiển thị các phần tử của list
        ListIterator<String> listIterator = linkedList.listIterator();
        System.out.println("\nCác phần tử có trong list là: ");
        while (listIterator.hasNext()) {
            System.out.print((String) listIterator.next()+",");
        }
        // Hàm toArray() chuyển list thành mảng
        // kết quả của phương thức này sẽ trả về mảng arr
        Object[] arr = linkedList.toArray();
        System.out.println("\nMảng array: "+Arrays.toString(arr));
        // clear list
        linkedList.clear();
        System.out.println("\nCác phần tử có trong list là: ");
        System.out.println(linkedList);
        
        // Hàm allAll(Colection c):
        linkedList.add("trần");
		linkedList.add("thị");
		linkedList.add("như");
		linkedList.add("trang");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(linkedList);
        System.out.println("listA:"+ listA);
        
        // Hàm retainAll(Colection c):
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("thị");
        listB.add("ốc");
        System.out.println("listB:"+ listB);
        // xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.println("listA sau khi xóa:"+ listA);
        
        // Hàm removeAll(Colection c)
        // xóa những phần tử thuộc listB  khỏi listA
        listA.removeAll(listB);
        System.out.println("listA sau khi xóa listB:"+ listA);
        
        // Create linkedStudent
        LinkedList<Student> linkedStudent = new LinkedList<Student>();
        // Create students
        Student student1 = new Student("1", "trần thị như trang", 1990,9.8f);
        Student student2 = new Student("2", " như trang", 1990,8.9f);
        Student student3 = new Student("3", "ốc", 1990,10.0f);
        Student student4 = new Student("3", "ốc", 1990,10.0f);
        
        // Add objects to listStudent
        linkedStudent.add(student1);
        linkedStudent.add(student2);
        linkedStudent.add(student3);
        linkedStudent.add(student4);
        // Show listStudent
        for (Student student : linkedStudent) {
            System.out.println(student);
        }
        
	}
}
