package oop;

public class Sach extends TaiLieu {
	private String tentacgia;
	private int sotrang;

	public Sach(String ma, String tennxb, int soban, String tentacgia2, int sotrang2) {
		super();

	}

	public Sach(String ma, String tennxb, int soban, int sotrang, String tentacgia) {
		super(ma, tennxb, soban);
		this.sotrang = sotrang;
		this.tentacgia = tentacgia;
	}

	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("Ten Tac Gia: " + tentacgia);
		System.out.println("So Trang :" + sotrang);
	}

	@Override
	public String toString() {
		return "Sach [tentacgia=" + tentacgia + ", sotrang=" + sotrang + "]";
	}
}
