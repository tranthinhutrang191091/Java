package abstracthinh;

public class Diem extends Hinh {

	@Override
	public String toString() {
		return toaDo.toString();
	}

	public Diem(ToaDo toaDo) {
		super(toaDo);
	}

	@Override
	public double tinhDienTich() {
		return 1;
	}
	
}
