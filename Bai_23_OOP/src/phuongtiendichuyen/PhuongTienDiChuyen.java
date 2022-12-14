package phuongtiendichuyen;

import quanlybophim.HangSanXuat;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hsx;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hsx) {

		this.loaiPhuongTien = loaiPhuongTien;
		this.hsx = hsx;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHsx() {
		return hsx;
	}

	public void setHsx(HangSanXuat hsx) {
		this.hsx = hsx;
	}
	public String layTenHangSanXuat() {
		return this.hsx.toString();
	}
	public void batDau() {
		System.out.println("Bắt đầu...");
	}
	public void tangToc() {
		System.out.println("Tăng Tốc...");
	}
	public void dungLai() {
		System.out.println("Dừng lại...");
	}
	public abstract double layVanToc();
}
