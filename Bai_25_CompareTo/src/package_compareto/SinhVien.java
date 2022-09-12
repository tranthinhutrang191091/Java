package package_compareto;

/*
 * interface Comparable<Object> : có phương thức compareTo() để so sánh các đối tượng
 */
public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getTen() {
		String s=this.hoVaTen.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	@Override
	public int compareTo(SinhVien sv) {
		// So sánh mã sinh viên
		// return this.maSinhVien-sv.maSinhVien;
		
		// So sánh tên sinh viên
		String tenThis=this.getTen();
		String tensv=sv.getTen();
		return tenThis.compareTo(tensv);
		/* return: 0 : 2 đối tượng bằng nhau
		 * 			>0: đối tượng this > đối tượng sv
		 * 			<0: đối tượng this < đối tượng sv
		 */
		
	}
	
}
