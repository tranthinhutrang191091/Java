package quanlybophim;
import classmydate.MyDate;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private MyDate ngayChieu;

	public String getTenPhim() {
		return this.tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return this.namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		if (namSanXuat > 0)
			this.namSanXuat = namSanXuat;
		else
			this.namSanXuat = 0;
	}

	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, MyDate ngayChieu) {
		this.tenPhim = tenPhim;
		if (namSanXuat > 0)
			this.namSanXuat = namSanXuat;
		else
			this.namSanXuat = 0;
		this.hangSanXuat = hangSanXuat;
		if (giaVe > 0)
			this.giaVe = giaVe;
		else
			this.giaVe = 0;
		this.ngayChieu = ngayChieu;
	}

	public HangSanXuat getHangSanXuat() {
		return this.hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return this.giaVe;
	}

	public void setGiaVe(double giaVe) {
		if (giaVe > 0)
			this.giaVe = giaVe;
		else
			this.giaVe = 0;
	}

	public MyDate getNgayChieu() {
		return this.ngayChieu;
	}

	public void setNgayChieu(MyDate ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	@Override
	public String toString() {
		return "|Bộ phim = " + this.tenPhim + "\t|NSX = " + this.namSanXuat + "\t|Hãng SX = " + this.hangSanXuat
				+ "\t|Giá Vé = " + this.giaVe + " VNĐ\t|Ngày Chiếu = " + this.ngayChieu + "\t|";
	}

	public boolean kiemTraGiaVeReHon(BoPhim phim) {
		return (this.giaVe < phim.giaVe) ? true : false;
	}

	public String tenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}

	public double giaSauKhuyenMai(double x) {
		return this.giaVe * (1 - x / 100);
	}
}
