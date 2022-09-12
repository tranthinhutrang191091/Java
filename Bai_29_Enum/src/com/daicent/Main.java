package com.daicent;

public class Main {
	public static void main(String[] args) {
		System.out.println("\t1. THỜI KHÓA BIỂU");
		ThoiKhoaBieu tkb_t2= new ThoiKhoaBieu(Day.Monday, "Toán, Lý, Hóa");
		ThoiKhoaBieu tkb_t3= new ThoiKhoaBieu(Day.Tuesday, "Văn, Sử, Địa");
		ThoiKhoaBieu tkb_t4= new ThoiKhoaBieu(Day.Wednesday, "Lý, Sinh, Hóa");
		ThoiKhoaBieu tkb_t5= new ThoiKhoaBieu(Day.Thurday, "GDCD, Thể Dục, Văn");
		ThoiKhoaBieu tkb_t6= new ThoiKhoaBieu(Day.Friday, "Anh, Sử,Toán");
		System.out.println(tkb_t2);
		System.out.println(tkb_t3);
		System.out.println(tkb_t4);
		System.out.println(tkb_t5);
		System.out.println(tkb_t6);
		
		System.out.println("\t2. SỐ NGÀY");
		int x= Thang.Tháng_một.soNgay();
		System.out.println("Tháng 1 có: "+x+" ngày");
		
	}
}
