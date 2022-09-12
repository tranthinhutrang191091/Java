package kethuaconguoihocsinh;

public class ConNguoi {
	protected String ten;
	protected int namSinh;

	public ConNguoi(String ten, int namSinh) {
		super();
		this.ten = ten;
		this.namSinh = namSinh;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public void An() {
		System.out.println("Ăn");
	}

	public void Ngu() {
		System.out.println("Ngủ");
	}

	public void Di() {
		System.out.println("Đi");
	}
}
