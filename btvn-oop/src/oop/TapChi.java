package oop;

public class TapChi extends TaiLieu {
	private int sophathanh;
	private int thangphathanh;

	public TapChi(String ma, String tennxb, int soban, int sophathanh2, int thangphathanh2) {
		super();

	}

	public TapChi(String ma, String tennxb, int soban, int sotrang, int sophathanh, int thangphathanh) {
		super(ma, tennxb, soban);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;
	}

	public int getSophathanh() {
		return sophathanh;
	}

	public void setSophathanh(int sophathanh) {
		this.sophathanh = sophathanh;
	}

	public int getThangphathanh() {
		return thangphathanh;
	}

	public void setThangphathanh(int thangphathanh) {
		this.thangphathanh = thangphathanh;
	}
	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("So Phat Hanh: " + sophathanh);
		System.out.println("Thang Phat Hanh: " + thangphathanh);
	}

	@Override
	public String toString() {
		return "TapChi [sophathanh=" + sophathanh + ", thangphathanh=" + thangphathanh + "]";
	}
}
