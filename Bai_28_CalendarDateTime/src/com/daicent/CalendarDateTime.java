package com.daicent;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class CalendarDateTime {
	public static void main(String[] args) {

		// Hàm currentTimeMillis(): lấy thời gian hiện tại
		System.out.println("\t1. Hàm currentTimeMillis()");
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println("Test");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("Thời gian trước khi chạy for: " + timeStart);
		System.out.println("Thời gian sau khi chạy for: " + timeEnd);
		System.out.println("Thời gian mls: " + (timeEnd - timeStart) + " mls");
		System.out.println("Thời gian mls: " + (timeEnd - timeStart) / 1000 + " s");

		// Class TimeUnit: chuyển đổi giờ phút giây....
		System.out.println("\t2. Class TimeUnit");
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + " s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + " s");
		System.out.println("1,3h = " + TimeUnit.MINUTES.toSeconds((long) (1.3 * 60)) + " s");
		System.out.println("90000s = " + TimeUnit.SECONDS.toDays(9000) + " ngày");
		System.out.println("30h = " + TimeUnit.HOURS.toDays(30) + " ngày");

		// java.sql.Date
		System.out.println("\t3. java.sql.Date");
		Date day = new Date(System.currentTimeMillis());
		System.out.println("Bây giờ là: " + day.getDate() + "/" + (day.getMonth() + 1) + "/" + (day.getYear() + 1900));

		// Calendar
		System.out.println("\t4. Calendar");
		Calendar calendar = Calendar.getInstance();
		System.out.println("Hôm nay là: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
				+ calendar.get(Calendar.YEAR));
		calendar.add(Calendar.HOUR, 30);
		System.out.println("Thêm 30h là: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1)
				+ "-" + calendar.get(Calendar.YEAR));

		calendar.add(Calendar.DATE, 14);
		System.out.println("Thêm 14 ngày là: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1)
				+ "-" + calendar.get(Calendar.YEAR));
		calendar.add(Calendar.MONTH, 2);
		System.out.println("Thêm 2 tháng là: " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1)
				+ "-" + calendar.get(Calendar.YEAR));

		// DateFormat
		System.out.println("\t5. DateFormat");
		DateFormat dateFormat = new SimpleDateFormat();
		System.out.println(dateFormat.format(day));
		
		dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
		System.out.println(dateFormat.format(day));
		
		

	}
}
