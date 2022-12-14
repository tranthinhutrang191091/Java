package phuongtiendichuyen;

import quanlybophim.HangSanXuat;

public class MayBay extends PhuongTienDiChuyen {
	
	private String loaiNhienLieu;
	public MayBay( HangSanXuat hsx4, String loaiNhienLieu) {
		super("Máy Bay", hsx4);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}
	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	@Override
	public String toString() {
		return "Máy Bay [Loại nhiên liệu:" + loaiNhienLieu + 
				", Hãng sản xuất: "+super.layTenHangSanXuat() +"]";
	}
	@Override
	public double layVanToc() {
		return 500;
	}
	public void catCanh() {
		System.out.println("Cất cánh...");
	}
	public void haCanh() {
		System.out.println("Hạ cánh...");
	}
	
	

}
