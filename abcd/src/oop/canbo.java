package oop;

public class canbo {
	private String hoten;
	private int tuoi;
	private String gioitinh;
	private String diachi;
	
	 public canbo(String hoten, int tuoi, String gioitinh, String diachi) {
	        this.hoten = hoten;
	        this.tuoi = tuoi;
	        this.gioitinh = gioitinh;
	        this.diachi = diachi;
	    }

	    public String gethoten() {
	        return hoten;
	    }

	    public void sethoten(String hoten) {
	        this.hoten = hoten;
	    }

	    public int gettuoi() {
	        return tuoi;
	    }

	    public void settuoi(int tuoi) {
	        this.tuoi = tuoi;
	    }

	    public String getgioitinh() {
	        return gioitinh;
	    }

	    public void setgioitinh(String gioitinh) {
	        this.gioitinh = gioitinh;
	    }

	    public String getdiachi() {
	        return diachi;
	    }

	    public void setdiachi(String diachi) {
	        this.diachi = diachi;
	    }
}

