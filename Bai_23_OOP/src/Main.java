import javax.print.Doc;

import abstracthinh.Diem;
import abstracthinh.Hinh;
import abstracthinh.HinhChuNhat;
import abstracthinh.HinhTron;
import abstracthinh.ToaDo;
import interfacemaytinh.MayTinhCasinoFX500;
import interfacemaytinh.MayTinhVinaCal500;
import interfacemaytinh.PhanMemMayTinh;
import interfacemaytinh.SapXepChen;
import interfacemaytinh.SapXepChon;
import kethuaconguoihocsinh.HocSinh;
import kethuaconguoihocsinh.ConNguoi;
import kethuaconnguoi.NguoiBaLan;
import kethuaconnguoi.NguoiMy;
import kethuaconnguoi.NguoiVietNam;
import kethuadatang.BabyDog;
import kethuabac.Bird;
import kethuabac.Cat;
import kethuadon.Dog;
import overloadingmymath.MyMath;
import phuongtiendichuyen.MayBay;
import phuongtiendichuyen.OTo;
import phuongtiendichuyen.PhuongTienDiChuyen;
import phuongtiendichuyen.XeDap;
import public_protected_private.Code;
import quanlybophim.BoPhim;
import quanlybophim.HangSanXuat;
import quanlyhoadon.HoaDonCaPhe;
import quanlymaytinh.HangSXMayTinh;
import quanlymaytinh.MayTinh;
import quanlymaytinh.QuocGia;
import quanlysach.Author;
import quanlysach.Book;
import quanlysinhvien.LopHoc;
import quanlysinhvien.SinhVien;
import classmydate.MyDate;

public class Main {

	public static void main(String[] args) {
		// MyDate: package classmydate: class MyDate
		System.out.println("______ MyDate ______");
		int d;
		MyDate md = new MyDate(3, 4, 2001);
		md.printDay();
		md.printMonth();
		md.printYear();
		md.printDate();
		System.out.println("Day = " + md.getDay());
		md.setDay(30);
		System.out.println("Day = " + md.getDay());
		md.setDay(31);
		System.out.println("Day = " + md.getDay());
		md.setMonth(20);
		System.out.println("Month = " + md.getMonth());
		md.setYear(0);
		System.out.println("Year = " + md.getYear());

		MyDate md1 = new MyDate(19, 10, 2025);
		MyDate md2 = new MyDate(11, 6, 2020);
		MyDate md3 = new MyDate(19, 10, 2025);
		System.out.println("md1: " + md1);
		System.out.println("md2: " + md2);
		System.out.println("md3: " + md3);

		if (md1 == md3) {
			System.out.println("md1==md3");
		} else {
			System.out.println("md1!=md3");
		}
		System.out.println("md1 so với md2: " + md1.equals(md2));
		System.out.println("md1 so với md3: " + md1.equals(md3));

		System.out.println("Hashcode md1: " + md1.hashCode());
		System.out.println("Hashcode md2: " + md2.hashCode());
		System.out.println("Hashcode md3: " + md3.hashCode());

		// HoaDonCaPhe: package quanlyhoadon: class HoaDonCaPhe
		System.out.println("______ HÓA ĐƠN CÀ PHÊ ______");
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyên", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyên 2", 100000, 5.5);
		System.out.println("Tổng tiền Trung Nguyên : " + hd.tinhTongTien() + " VNĐ");
		System.out.println("Tổng tiền Trung Nguyên 2 : " + hd2.tinhTongTien() + " VNĐ");
		System.out.println("Kiểm tra khối lượng Trung Nguyên >2 kg: " + hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Kiểm tra khối lượng Trung Nguyên >1 kg: " + hd.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiểm tra tổng tiền Trung Nguyên lớn hơn 500K: " + hd.kiemTraTongTienLonHon500K());
		System.out.println("Giảm giá của Hóa Đơn Trung Nguyên: " + hd.giamGia(10));
		System.out.println("Giảm giá của Hóa Đơn Trung Nguyên 1: " + hd2.giamGia(10) + "VNĐ");
		System.out.println("Giá sau khi giảm của Hóa ĐơnTrung Nguyên: " + hd.giaSauGiam(10));
		System.out.println("Giá sau khi giảm của Hóa Đơn Trung Nguyên 1: " + hd2.giaSauGiam(10) + "VNĐ");

		// Quản Lý Sách: package quanlysach:  class:  Book, Author
		// package classmydate: class MyDate
		System.out.println("______ QUẢN LÝ SÁCH ______");
		MyDate ngay1 = new MyDate(15, 5, 1990);
		MyDate ngay2 = new MyDate(1, 9, 1996);
		MyDate ngay3 = new MyDate(13, 6, 1960);

		Author tacGia1 = new Author("Trần Trang", ngay1);
		Author tacGia2 = new Author("Trần Hoàng", ngay2);
		Author tacGia3 = new Author("Nguyễn Trang", ngay3);

		Book sach1 = new Book("Lập trình C", 5000, tacGia1, 2023);
		Book sach2 = new Book("Lập trình Java", 15000, tacGia2, 1000);
		Book sach3 = new Book("Lập trình C#", 75000, tacGia3, 2021);

		sach1.printNameBook();
		sach2.printNameBook();
		sach3.printNameBook();
		System.out.println(sach2);

		System.out.println("So sánh năm xuất bản sách 1 và sách 3: " + sach1.checkSameYear(sach3));
		System.out.println("Sách 1 giảm 10%: " + sach1.priceAfterDiscount(10));
		System.out.println("Sách 2 giảm 20%: " + sach2.priceAfterDiscount(20));
		System.out.println("Sách 3 giảm 50%: " + sach3.priceAfterDiscount(50));

		// Quản lý Phim: package quanlybophim class: HangSanXuat, BoPhim
		// package classmaydate: class MyDate
		System.out.println("______ QUẢN LÝ PHIM ______");

		MyDate ngay4 = new MyDate(16, 5, 2020);
		MyDate ngay5 = new MyDate(1, 9, 2021);
		MyDate ngay6 = new MyDate(13, 6, 2022);
		HangSanXuat hsx1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hsx2 = new HangSanXuat("Hãng B", "Hàn Quốc");
		HangSanXuat hsx3 = new HangSanXuat("Hãng C", "Mỹ");

		BoPhim boPhim1 = new BoPhim("Bố Già", 2020, hsx3, 6500, ngay4);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, hsx2, 7500, ngay5);
		BoPhim boPhim3 = new BoPhim("Cậ Vàng", 2022, hsx1, 9000, ngay6);

		System.out.println(boPhim1);
		System.out.println(boPhim2);
		System.out.println(boPhim3);

		System.out.println("Bộ Phim " + boPhim1.getTenPhim() + " giá vé rẻ hơn " + boPhim2.getTenPhim() + " : "
				+ boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("Bộ Phim " + boPhim2.getTenPhim() + " Hãng sản xuất: " + boPhim2.tenHangSanXuat());
		System.out.println(
				"Bộ Phim " + boPhim1.getTenPhim() + " Giảm 10% giá vé còn: " + boPhim1.giaSauKhuyenMai(10) + " VNĐ");
		System.out.println(
				"Bộ Phim " + boPhim2.getTenPhim() + " Giảm 20% giá vé còn: " + boPhim2.giaSauKhuyenMai(20) + " VNĐ");
		System.out.println(
				"Bộ Phim " + boPhim3.getTenPhim() + " Giảm 50% giá vé còn: " + boPhim3.giaSauKhuyenMai(50) + " VNĐ");

		// Quản lý Sinh Viên: class LopHoc, MyDate, SinhVien
		System.out.println("______ QUẢN LÝ SINH VIÊN ______");
		MyDate ngay7 = new MyDate(16, 5, 1990);
		MyDate ngay8 = new MyDate(1, 9, 1991);
		MyDate ngay9 = new MyDate(16, 5, 1990);

		LopHoc lop1 = new LopHoc("Lớp ĐH01", "Công nghệ thông tin");
		LopHoc lop2 = new LopHoc("Lớp ĐH02", "Khoa Học Máy TÍnh");
		LopHoc lop3 = new LopHoc("Lớp ĐH03", "An Ninh mạng");

		SinhVien sv1 = new SinhVien("001", "Ngọc", ngay7, 4, lop1);
		SinhVien sv2 = new SinhVien("002", "Trang", ngay8, 9, lop2);
		SinhVien sv3 = new SinhVien("003", "Nhi Ốc", ngay9, 10, lop3);

		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);

		System.out.println("Tên Khoa:");
		System.out.println("|SV1:" + sv1.getTenKhoa());
		System.out.println("|SV2:" + sv2.getTenKhoa());
		System.out.println("|SV3:" + sv3.getTenKhoa());
		System.out.println("Kiểm tra thi Đạt:");

		System.out.println("Kiểm tra thi đạt:");
		System.out.println("|SV1:" + sv1.kiemTraThiDat());
		System.out.println("|SV2:" + sv2.kiemTraThiDat());
		System.out.println("|SV3:" + sv3.kiemTraThiDat());

		System.out.println("Kiểm tra cùng ngày sinh:");
		System.out.println("|SV1 và SV2:" + sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("|SV1 và SV3:" + sv1.kiemTraCungNgaySinh(sv3));
		System.out.println("|SV2 và SV3:" + sv2.kiemTraCungNgaySinh(sv3));

		// Quản lý Máy Tính: package quanlymaytinh: class MayTinh, HangSXMayTinh, QuocGia
		//package classmydate: class MyDate
		System.out.println("______ QUẢN LÝ MÁY TÍNH ______");
		MyDate ngay10 = new MyDate(16, 5, 2020);
		MyDate ngay11 = new MyDate(1, 9, 2021);
		MyDate ngay12 = new MyDate(16, 5, 2022);

		QuocGia quocGia1 = new QuocGia("QG1", "Mỹ");
		QuocGia quocGia2 = new QuocGia("QG2", "Anh");
		QuocGia quocGia3 = new QuocGia("QG3", "Pháp");

		HangSXMayTinh hangSX1 = new HangSXMayTinh("Dell", quocGia1);
		HangSXMayTinh hangSX2 = new HangSXMayTinh("Lenovo", quocGia2);
		HangSXMayTinh hangSX3 = new HangSXMayTinh("Apple", quocGia3);

		MayTinh mt1 = new MayTinh("Mac1", hangSX3, ngay10, 1200, 12);
		MayTinh mt2 = new MayTinh("HP", hangSX2, ngay11, 1400, 13);
		MayTinh mt3 = new MayTinh("Intel", hangSX1, ngay12, 2000, 14);

		System.out.println(mt1);
		System.out.println(mt2);
		System.out.println(mt3);

		System.out.println("Kiểm tra giá bán rẻ hơn");
		System.out.println(mt1.getTenMayTinh() + " rẻ hơn " + mt2.getTenMayTinh() + ": " + mt1.kiemTraGiaThapHon(mt2));
		System.out.println(mt2.getTenMayTinh() + " rẻ hơn " + mt3.getTenMayTinh() + ": " + mt2.kiemTraGiaThapHon(mt3));
		System.out.println(mt1.getTenMayTinh() + " rẻ hơn " + mt3.getTenMayTinh() + ": " + mt1.kiemTraGiaThapHon(mt3));

		System.out.println("Tên Quốc Gia");
		System.out.println(mt1.getTenMayTinh() + " quốc gia " + mt1.layTenQuocGia());
		System.out.println(mt2.getTenMayTinh() + " quốc gia " + mt2.layTenQuocGia());
		System.out.println(mt3.getTenMayTinh() + " quốc gia " + mt3.layTenQuocGia());

		// Kế Thừa: package kethuaconnguoihocsinh class ConNguoi, HocSinh
		System.out.println("______ Kế Thừa Con Người và Học Sinh ______");
		ConNguoi cn = new ConNguoi("Ốc", 2022);
		cn.An();
		cn.Ngu();
		cn.Di();
		HocSinh hs1 = new HocSinh("Trang", 2000, "Lớp 1", "Trường 1");
		hs1.An();
		hs1.Ngu();
		hs1.Di();
		hs1.lamBaiTap();

		// Kế Thừa đơn: class Animal, Dog
		System.out.println("______ Kế Thừa Đơn: Animal, Dog______");
		Dog dog = new Dog();
		dog.Bark();
		dog.eat();

		// Kế Thừa đa tầng : package kethuadatang: class BabyDog
		// package kethuadon: class Animal, Dog
		System.out.println("______ Kế Thừa Đa Tầng: Animal, Dog, BabyDog______");
		BabyDog babyDog = new BabyDog();
		babyDog.Bark();
		babyDog.eat();
		babyDog.weep();

		// Kế Thừa theo bậc : package kethuabac: class Cat, Bird
		//package kethuadon: class Animal, Dog
		System.out.println("______ Kế Thừa Bậc: Animal, Dog, Cat, Bird______");
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.Bark();
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		Bird bird = new Bird();
		bird.eat();
		bird.fly();

		// Không có đa kế thừa : package kethuaconnguoi class NguoiMy, NguoiVietNam, NguoiBaLan,
		// package kethuaconguoihocsinh: class ConNguoi
		System.out.println(
				"______ Không có đa kế thừa : class ConNguoi, NguoiMy, NguoiVietNam, NguoiBaLan, Student______");
		NguoiVietNam nvn = new NguoiVietNam("Trang", 1990);
		nvn.Ngu();
		NguoiBaLan nbl = new NguoiBaLan("Toma", 1999);
		nbl.An();
		NguoiMy nm = new NguoiMy("Smit", 2000);
		nm.Di();

		// Ghi đè phương thức Overriding: package kethuadon class Animail,Dog
		// PACKAGE kethuabac: class Cat,Bird
		System.out.println("______ GHI ĐÈ PHƯƠNG THỨC OVERRIDING______");
		Dog dog2 = new Dog();
		dog2.eat();
		dog2.makeSound();
		dog2.sleep();
		Cat cat1 = new Cat();
		cat1.eat();
		cat1.makeSound();
		cat1.sleep();
		Bird bird1 = new Bird();
		bird1.eat();
		bird1.makeSound();
		bird1.sleep();

		// Ghi đè phương thức Overloading: package overloadingmymath: class MyMath
		System.out.println("______ GHI ĐÈ PHƯƠNG THỨC OVERLOADING______");
		MyMath mm = new MyMath();
		System.out.println("Min(5,5) = " + mm.timMin(5, 5));
		System.out.println("Min(5.5, 6.0)=" + mm.timMin(5.5, 6.0));
		System.out.println("Tong(5.0, 5.0) =" + mm.tinhTong(5.0, 5.0));
		double[] arr = new double[] { 1, 2, 3, 4, 5 };
		System.out.println("Tong(1,2,3,4,5) =" + mm.tinhTong(arr));

		// Lớp và phương thức trừu tượng Abstract: package abstracthinh: class ToaDo, Hinh, Diem, HinhTron,
		// HinhChuNhat
		System.out.println("______ CLASS Và METHOR TRỪU TƯỢNG - ABSTRACT ______");
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		// Hinh h = new Hinh(td1); Lỗi lớp trừu tượng không tạo đối tượng đc
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2, 10);
		Hinh h3 = new HinhChuNhat(td3, 5, 10);
		System.out.println("Diện tích điểm " + h1.toString() + " = " + h1.tinhDienTich());
		System.out.println("Diện tích hình tròn " + h2.toString() + " = " + h2.tinhDienTich());
		System.out.println("Diện tích hình chữ nhật " + h3.toString() + " = " + h3.tinhDienTich());

		/*
		 * Kế thừa và Abstract: package quanlybophim: class HangSanXuat, 
		 * package phuongtiendichuyen: class PhuongTienDiChuyen, MayBay, Oto, XeDap
		 */
		System.out.println("______ KẾ THỪA - ABSTRACT ______");
		HangSanXuat hsx4 = new HangSanXuat("Boing", "Mỹ");
		HangSanXuat hsx5 = new HangSanXuat("HonDa", "Nhật");
		HangSanXuat hsx6 = new HangSanXuat("Thống Nhất", "Việt Nam");

		PhuongTienDiChuyen p1 = new MayBay(hsx4, "Dầu");
		PhuongTienDiChuyen p2 = new OTo(hsx5, "Xăng");
		PhuongTienDiChuyen p3 = new XeDap(hsx6);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println("Lấy tên hãng sản xuất:");
		System.out.println("p1: " + p1.layTenHangSanXuat());
		System.out.println("p2: " + p2.layTenHangSanXuat());
		System.out.println("p3: " + p3.layTenHangSanXuat());

		p1.batDau();
		p2.tangToc();
		p3.dungLai();

		System.out.println("Lấy vận tốc:");
		System.out.println(p1 + " có vận tốc: " + p1.layVanToc() + "km/h");
		System.out.println(p2 + " có vận tốc: " + p2.layVanToc() + "km/h");
		System.out.println(p3 + " có vận tốc: " + p3.layVanToc() + "km/h");

		MayBay mb = (MayBay) p1;
		System.out.println(mb);
		mb.catCanh();
		mb.haCanh();

		/*
		 * Interface: class MayTinhInterface, MayTinhVinaCal500, MayTinhCasinoFX500
		 * SapXepInterface, SapXepChon, SapXepChen PhanMemMayTinh
		 */
		System.out.println("______ INTERFACE - MÁY TÍNH ______");
		MayTinhCasinoFX500 mfx500 = new MayTinhCasinoFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		System.out.println("5 + 3 = " + mfx500.cong(5, 3));
		System.out.println("4 x 5 = " + mvn500.nhan(4, 5));
		System.out.println("4 : 0 = " + mvn500.chia(4, 0));

		double[] arr1 = new double[] { 5, 1, 3, 4, 5, 8, 0 };
		double[] arr2 = new double[] { 6, 2, 7, 9, 2, 4, 5 };
		System.out.print("arr1 = ");
		Main.inMang(arr1);
		System.out.print("arr2 = ");
		Main.inMang(arr2);
		SapXepChen sxChen = new SapXepChen();
		SapXepChon sxChon = new SapXepChon();
		System.out.println("Sắp xếp tăng:");
		sxChen.sapXepTang(arr1);
		System.out.print("arr1 = ");
		Main.inMang(arr1);
		sxChon.sapXepTang(arr2);
		System.out.print("arr2 = ");
		Main.inMang(arr2);

		System.out.println("Sắp xếp giảm:");
		sxChen.sapXepGiam(arr1);
		System.out.print("arr1 = ");
		Main.inMang(arr1);
		sxChon.sapXepGiam(arr2);
		System.out.print("arr2 = ");
		Main.inMang(arr2);

		System.out.println("Phần mềm máy tính:");
		PhanMemMayTinh pmt = new PhanMemMayTinh();
		System.out.println("3+5 = " + pmt.cong(3, 5));
		double[] arr3 = new double[] { 5, 1, 6, 10, 5, 8, 0 };
		System.out.print("arr3 = ");
		Main.inMang(arr3);
		System.out.println("Sắp xếp giảm:");
		pmt.sapXepGiam(arr3);
		System.out.print("arr3 = ");
		Main.inMang(arr3);
		
		/*
		 * Public, protected, private: package public_protected_private
		 */
		System.out.println("______ Public, protected, private ______");
		Code cod1 = new Code();
		//cod1.a => không truy cập đc biến a trong class Code
		// cod1.b => không truy cập đc biến b trong class Code
		// cod1.c => => không truy cập đc biến c trong class Code
		cod1.d=10;
		
		
		
	}

	public static void inMang(double[] mang) {
		System.out.print("{");
		for (int i = 0; i < mang.length - 1; i++) {
			System.out.print(mang[i] + ", ");
		}
		System.out.println(mang[mang.length - 1] + "}");
	}
}
