package quanlymaytinh;

public class QuocGia {
	private String maQuocGia;
	private String tenQuocGia;

	public QuocGia(String maQuocGia, String tenQuocGia) {

		this.maQuocGia = maQuocGia;
		this.tenQuocGia = tenQuocGia;
	}

	public String getMaQuocGia() {
		return this.maQuocGia;
	}

	public void setMaQuocGia(String maQuocGia) {
		this.maQuocGia = maQuocGia;
	}

	public String getTenQuocGia() {
		return this.tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

	@Override
	public String toString() {
		return "|Mã: " + this.maQuocGia + "\t|Tên Quốc Gia: " + this.tenQuocGia + "\t|";
	}

}
