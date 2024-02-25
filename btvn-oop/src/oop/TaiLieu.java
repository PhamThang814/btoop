package oop;

public class TaiLieu {
	protected String ma;
	protected String tennxb;
	protected int soban;

	public TaiLieu() {
		super();
	}

	public TaiLieu(String ma, String tennxb, int soban) {
		super();
		this.ma = ma;
		this.tennxb = tennxb;
		this.soban = soban;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTennxb() {
		return tennxb;
	}

	public void setTennxb(String tennxb) {
		this.tennxb = tennxb;
	}

	public int getSoban() {
		return soban;
	}

	public void setSoban(int soban) {
		this.soban = soban;
	}
	public void hienThi() {
		System.out.println("Ma Tai Lieu : " + ma);
		System.out.println("Ten NXB : " + tennxb);
		System.out.println("So Ban Phat Hanh : " + soban);
	}
	@Override
	public String toString() {
		return "TaiLieu [ma=" + ma + ", tennxb=" + tennxb + ", soban=" + soban + "]";
	}

}
