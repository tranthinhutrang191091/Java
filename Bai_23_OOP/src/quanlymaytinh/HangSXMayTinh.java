package quanlymaytinh;

public class HangSXMayTinh {
	private String tenHang;
	private QuocGia quocGia;

	public HangSXMayTinh(String tenHang, QuocGia quocGia) {

		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	public String getTenHang() {
		return this.tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public QuocGia getQuocGia() {
		return this.quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return "|Hãng SX: " + this.tenHang + "\t" + this.quocGia;
	}

	public String layTenQuocGia() {
		return this.quocGia.getTenQuocGia();
	}

}
