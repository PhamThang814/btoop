package oop;

public class Bao extends TaiLieu {
	private int ngayphathanh;

	public Bao(String ma, String tennxb, int soban, String ngayphathanh2) {
		super();

	}

	public Bao(String ma, String tennxb, int soban, int sotrang, int ngayphathanh) {
		super(ma, tennxb, soban);
		this.ngayphathanh = ngayphathanh;

	}

	public int getNgayphathanh() {
		return ngayphathanh;
	}

	public void setNgayphathanh(int ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}
	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println();
	}
	@Override
	public String toString() {
		return "Bao [ngayphathanh=" + ngayphathanh + "]";
	}
}