package quanlysinhvien;
import classmydate.MyDate;

public class SinhVien {
	private String maSV;
	private String hoVaTen;
	private MyDate ngaySinh;
	private double diemTB;
	private LopHoc lop;

	public SinhVien(String maSV, String hoVaTen, MyDate ngaySinh, double diemTB, LopHoc lop) {

		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	public String getMaSV() {
		return this.maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public MyDate getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(MyDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return this.diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public LopHoc getLop() {
		return this.lop;
	}

	public void setLop(LopHoc lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "|Mã SV: " + this.maSV + "\t|Họ Và Tên: " + this.hoVaTen + "\t|Ngày Sinh: " + this.ngaySinh
				+ "\t|Điểm TB: " + this.diemTB + "\t" + this.lop;
	}

	public String getTenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean kiemTraThiDat() {
		return this.diemTB >= 5;
	}

	public boolean kiemTraCungNgaySinh(SinhVien sv) {
		return this.ngaySinh.equals(sv.ngaySinh);
	}
}
