package oop;
import java.util.*;
public class kysu extends canbo {
	private String nganh;
	public kysu(String hoten, int tuoi, String gioitinh, String diachi,String nganh) {
		super(hoten,tuoi,gioitinh,diachi);
		this.nganh=nganh;
	}
	public String getnganh() {
		return nganh;
	}
	public void setnganh(String nganh) {
		this.nganh=nganh;
	}
}
