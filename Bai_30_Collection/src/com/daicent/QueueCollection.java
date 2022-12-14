package com.daicent;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * các phần tử được lưu trữ và truy cập theo cách 
 * nhập trước, xuất trước.
 */
public class QueueCollection {
	public static void main(String[] args) {
		// LinkedList triển khai queueLinkedList
		Queue<String> queueLinkedList = new LinkedList<>();
		// Chèn phần tử chỉ định vào queueLinkedList bằng phương thức offer
		// offer() - Chèn phần tử đã chỉ định vào hàng đợi
		queueLinkedList.offer("trần");
		queueLinkedList.offer("thị");
		queueLinkedList.offer("như");
		// add() - Chèn phần tử đã chỉ định vào hàng đợi
		queueLinkedList.add("trang");
		System.out.println("queueLinkedList: " + queueLinkedList);
		// Truy cập các phần tử trong queueLinkedList
		// peek() - Trả về đầu của hàng đợi
		System.out.println("Truy cập phần tử: " + queueLinkedList.peek());
		// element() - Trả về phần đầu của hàng đợi
		System.out.println("Truy cập phần tử: " + queueLinkedList.element());
		// remove() - Trả về và xóa phần đầu của hàng đợi
		queueLinkedList.remove();
		System.out.println("queueLinkedList: " + queueLinkedList);
		// poll() - Trả về và loại bỏ phần đầu của hàng đợi
		queueLinkedList.poll();
		System.out.println("queueLinkedList: " + queueLinkedList);

		// Array triển khai Queue
		Queue<String> queueArrayDeque = new ArrayDeque<>();

		// Priority Queue triển khai priorityQueue
		Queue<String> priorityQueue = new PriorityQueue<>();
		// Chèn phần tử chỉ định vào queueLinkedList bằng phương thức offer
		// offer() - Chèn phần tử đã chỉ định vào hàng đợi
		queueLinkedList.offer("trần");
		queueLinkedList.offer("thị");
		queueLinkedList.offer("như");
		
		

	}
}
