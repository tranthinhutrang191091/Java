package phuongtiendichuyen;

import quanlybophim.HangSanXuat;

public class OTo extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public OTo( HangSanXuat hsx, String loaiNhienLieu) {
		super("Ô tô", hsx);
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
		return "Ô Tô [Loại nhiên liệu: " + loaiNhienLieu +
				", Hãng sản xuất: "+super.layTenHangSanXuat() +"]";
	}

	@Override
	public double layVanToc() {
		return 60;
	}
	
	
}
