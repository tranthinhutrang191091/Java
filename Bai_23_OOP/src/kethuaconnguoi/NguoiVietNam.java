package kethuaconnguoi;

import kethuaconguoihocsinh.ConNguoi;

public class NguoiVietNam extends ConNguoi {
	public NguoiVietNam(String hoTen, int namSinh) {
		super(hoTen, namSinh);
	}

	public void xinChao() {
		System.out.println("Xin chào!");
	}
}
