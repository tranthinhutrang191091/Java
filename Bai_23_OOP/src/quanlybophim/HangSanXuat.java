package quanlybophim;

public class HangSanXuat {
	private String tenHangSanXuat;
	private String quocGia;

	public HangSanXuat(String tenHangSanXuat, String quocGia) {

		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return this.tenHangSanXuat + " - " + this.quocGia;
	}

	public String getTenHangSanXuat() {
		return this.tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return this.quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

}
