package phuongtiendichuyen;

import quanlybophim.HangSanXuat;

public class XeDap extends PhuongTienDiChuyen {

	public XeDap( HangSanXuat hsx) {
		super("Xe Đạp", hsx);
	}

	@Override
	public String toString() {
		return "Xe Đạp [Hãng sản xuất: "+super.layTenHangSanXuat() +"]";
	}

	@Override
	public double layVanToc() {
		return 20;
	}

}
