package kethuaconnguoi;

import kethuaconguoihocsinh.ConNguoi;

public class NguoiMy extends ConNguoi {
	public NguoiMy(String hoTen, int namSinh) {
		super(hoTen, namSinh);
	}

	public void xinChao() {
		System.out.println("Hello!");
	}
}
