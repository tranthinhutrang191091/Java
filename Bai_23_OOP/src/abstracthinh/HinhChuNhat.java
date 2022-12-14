package abstracthinh;

public class HinhChuNhat extends Hinh {
	private double chieuCao, chieuRong;
	public HinhChuNhat(ToaDo toaDo, double chieuCao, double chieuRong) {
		super(toaDo);
		this.chieuCao=chieuCao;
		this.chieuRong=chieuRong;
	}
	@Override
	public String toString() {
		return "I"+toaDo.toString()+", h=" + chieuCao + ", a=" + chieuRong;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	@Override
	public double tinhDienTich() {
		return this.chieuCao*this.chieuRong;
	}
	
}
