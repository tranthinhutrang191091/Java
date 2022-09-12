package quanlymaytinh;

import classmydate.MyDate;

public class MayTinh {
	private String tenMayTinh;
	private HangSXMayTinh hangSX;
	private MyDate ngaySX;
	private double giaBan;
	private double thơiGianBH;

	public MayTinh(String tenMayTinh, HangSXMayTinh hangSX, MyDate ngaySX, double giaBan, double thơiGianBH) {

		this.tenMayTinh = tenMayTinh;
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.giaBan = giaBan;
		this.thơiGianBH = thơiGianBH;
	}

	public String getTenMayTinh() {
		return this.tenMayTinh;
	}

	public void setTenMayTinh(String tenMayTinh) {
		this.tenMayTinh = tenMayTinh;
	}

	public HangSXMayTinh getHangSX() {
		return this.hangSX;
	}

	public void setHangSX(HangSXMayTinh hangSX) {
		this.hangSX = hangSX;
	}

	public MyDate getNgaySX() {
		return this.ngaySX;
	}

	public void setNgaySX(MyDate ngaySX) {
		this.ngaySX = ngaySX;
	}

	public double getGiaBan() {
		return this.giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public double getThơiGianBH() {
		return this.thơiGianBH;
	}

	public void setThơiGianBH(double thơiGianBH) {
		this.thơiGianBH = thơiGianBH;
	}

	@Override
	public String toString() {
		return "|Tên: " + this.tenMayTinh + "\t" + this.hangSX + "NgàySX :" + this.ngaySX + "\t|Giá Bán: " + this.giaBan
				+ "\t|Thời Gian BH: " + this.thơiGianBH + " tháng\t|";
	}
	public boolean kiemTraGiaThapHon(MayTinh mt) {
		return this.giaBan<mt.giaBan;
	}
	public String layTenQuocGia() {
		return this.hangSX.layTenQuocGia();
	}

}
