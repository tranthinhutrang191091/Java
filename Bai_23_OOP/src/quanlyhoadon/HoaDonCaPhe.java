package quanlyhoadon;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}

	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
		return (this.khoiLuong > khoiLuong) ? true : false;
	}

	public boolean kiemTraTongTienLonHon500K() {
		return (this.tinhTongTien() > 500000) ? true : false;
	}
	public double giamGia(double x) {
		if(this.tinhTongTien()>500000) {
			return (x*this.tinhTongTien()/100);
		}else {
			return 0;
		}
	}

	public double giaSauGiam(double x) {
		if(this.tinhTongTien()>500000) {
			return this.tinhTongTien()-this.giamGia(x);
		}else {
			return this.tinhTongTien();
		}
	}
}
