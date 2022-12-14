package com.daicent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import object.Student;

/*
 * 1. Map được sử dụng để lưu trữ 
 * và truy xuất dữ liệu theo cặp key và value. 
 * 2. Mỗi cặp key và value được gọi là mục nhập (entry). 
 * 3. Chỉ chứa các giá trị key duy nhất. 
 * 4. Rất hữu ích nếu bạn phải tìm kiếm, 
 * cập nhật hoặc xóa các phần tử trên dựa vào các key
 * - HashMap: có sắp xếp
 * - LinkedHashMap
 * - HashTable
 * - TreeMap
 * 
 * 
 * 
 */
public class MapCollection {
	public static void main(String[] args) {
		// Khởi tạo 1 mapHashMap
        Map<Integer, String> mapHashMap = new HashMap<Integer, String>();
        // Hàm  put(Object key, Object value):chèn một mục nhập trong map hiện tại
        mapHashMap.put(100, "trần");
        mapHashMap.put(103, "trang");
        mapHashMap.put(101, "thị");
        mapHashMap.put(102, "như");
        
     // Create mapStudent
        Map<Integer,Student> mapStudent = new HashMap<Integer,Student>();
        // Create students
        Student student1 = new Student("1", "trần thị như trang", 1990,9.8f);
        Student student2 = new Student("2", " như trang", 1990,8.9f);
        Student student3 = new Student("3", "ốc", 1990,10.0f);
        
        Student student4 = new Student("3", "ốc", 1990,10.0f);
        
        // Add objects to mapStudent
        mapStudent.put(1,student1);
        mapStudent.put(2,student2);
        mapStudent.put(3, student3);
        
        mapStudent.put(3,student4);
        // Show listStudent
        Set<Integer> setStudent = mapStudent.keySet();
        for (Integer key : setStudent) {
            System.out.println(key + " " + mapStudent.get(key));
        }
        
        
        // show mapHashMap
        System.out.println("mapHashMap: "+ mapHashMap);
        
        // Hàm getKey(): lấy key
        // Hàm getValue(): lấy value
        // sử dụng Generic
        System.out.println("mapHashMap: ");
        Set<Integer> set = mapHashMap.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + mapHashMap.get(key));
        }
        // KHÔNG sử dụng Generic
        System.out.println("mapHashMap: ");
        Set set1 = mapHashMap.keySet();
        for (Object key : set) {
            System.out.println(key + " " + mapHashMap.get(key));
        }
        
        // Khởi tạo 1 mapLinkedHashMap
        Map<Integer, String> mapLinkedHashMap = new LinkedHashMap<Integer, String>();
        // Hàm putAll(Map map)
        mapLinkedHashMap.putAll(mapHashMap);
        System.out.println("mapLinkedHashMap: "+ mapLinkedHashMap);
        
        
	}
}
