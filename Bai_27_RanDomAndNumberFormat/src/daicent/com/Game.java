package daicent.com;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi có tài khoản có quyền đặt cược số tiền
 * số tiền cược <= số tiền đang có
 * Luật chơi: 
 * 1. Có 3 viên xúc xắc random ra 3 điểm (từ 1 đến 6)
 * 2. Kết quả= tổng 3 điểm
 * Nếu tổng =3 hoặc 18 => cái ăn hết, ng chơi thua
 * Nếu 4<= tổng <=10 =>xỉu=> người chơi đặt Xỉu thì ng chơi thắng
 * 						=> đặt Tài thì ng chơi thua
 * Nếu 11<= tổng <=17 => tài =>. người chơi đặt Tài thì ng chơi thắng
 * 						=> đặt Xỉu thì ng chơi thua
 * 
 */
public class Game {
	public static void main(String[] args) {
		double taiKhonNguoiChoi = 5000;
		Scanner sc = new Scanner(System.in);
		// Format tiền tệ
		//Locale lc= new Locale("vi","VN");
		//NumberFormat numFormat = NumberFormat.getInstance(lc);
		Locale lc= new Locale("en","US");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(lc);
		int luaChon = 1;
		do {
			System.out.println("------Mời bạn lựa chọn-----");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn phím bất kỳ thoát.");
			System.out.print("Chọn: ");
			
			luaChon = sc.nextInt();

			if (luaChon == 1) {
				double datCuoc = 0;
				System.out.println("****BẮT ĐẦU CHƠI****");
				System.out.println("Tài Khoản Của Bạn: "+ numFormat.format(taiKhonNguoiChoi));
				do {
					System.out.print("Đặt cược: ");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhonNguoiChoi);
				int luaChonTaiXiu = 0;
				do {
					System.out.print("Chọn (2) <->Tài hoặc (3) <-> Xỉu : ");
					luaChonTaiXiu = sc.nextInt();
					if(luaChonTaiXiu==2) {
						System.out.println("=> Bạn chọn Tài");
					}else if(luaChonTaiXiu==3) {
						System.out.println("=> Bạn chọn Xỉu");
					}
					
				} while (luaChonTaiXiu != 2 && luaChonTaiXiu != 3);
				// Tung xúc xắc
				Random xucXac1= new Random();
				Random xucXac2= new Random();
				Random xucXac3= new Random();
				int a1= xucXac1.nextInt(5)+1;
				int a2= xucXac2.nextInt(5)+1;
				int a3 =xucXac3.nextInt(5)+1;
				
				int tongDiem= a1+a2+a3;
				System.out.println("Kết Quả Xúc Xắc 1: "+ a1);
				System.out.println("Kết Quả Xúc Xắc 2: "+ a2);
				System.out.println("Kết Quả Xúc Xắc 3: "+ a3);

				System.out.println("Kết Quả Tổng Điểm: "+ tongDiem);
				if(tongDiem==3|| tongDiem==18) {
					taiKhonNguoiChoi-=datCuoc;
					System.out.println("****** Nhà cái ăn hết, bạn đã thua! ");
					System.out.println("****** Tiền của bạn hiện tại: " + numFormat.format(taiKhonNguoiChoi));
				
				}else if(tongDiem>=4&& tongDiem<=10) {
					System.out.println("****** XỈU ********** ");
					if(luaChonTaiXiu==3) {
						taiKhonNguoiChoi+=datCuoc;
						System.out.println("****** Bạn đã thắng! ");
						System.out.println("****** Tiền của bạn hiện tại: " + numFormat.format(taiKhonNguoiChoi));
					
					}else {
						taiKhonNguoiChoi-=datCuoc;
						System.out.println("****** Nhà cái ăn hết, bạn đã thua! ");
						System.out.println("****** Tiền của bạn hiện tại: " + numFormat.format(taiKhonNguoiChoi));
					
					}
				}
				else {
					System.out.println("****** TÀI ********** ");
					if(luaChonTaiXiu==3) {
						taiKhonNguoiChoi-=datCuoc;
						System.out.println("****** Nhà cái ăn hết, bạn đã thua! ");
						System.out.println("****** Tiền của bạn hiện tại: " + numFormat.format(taiKhonNguoiChoi));
					
					}else {
						taiKhonNguoiChoi+=datCuoc;
						System.out.println("****** Bạn đã thắng! ");
						System.out.println("****** Tiền của bạn hiện tại: " + numFormat.format(taiKhonNguoiChoi));
					
					}
				}
				
				
				
				
			}
		} while (luaChon == 1);

	}
}
