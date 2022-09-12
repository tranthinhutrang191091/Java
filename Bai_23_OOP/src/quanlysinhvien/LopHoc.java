package quanlysinhvien;

public class LopHoc {
	private String tenLop;
	private String tenKhoa;

	public LopHoc(String tenLop, String tenKhoa) {
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}

	public String getTenLop() {
		return this.tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenKhoa() {
		return this.tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	@Override
	public String toString() {
		return "|Lớp: " + this.tenLop + "\t| Khoa: " + this.tenKhoa + "\t|";
	}

}
