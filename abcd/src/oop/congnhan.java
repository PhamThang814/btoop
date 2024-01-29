package oop;
import java.util.*;
public class congnhan extends canbo {
	private int bac;
	public congnhan(String hoten, int tuoi, String gioitinh, String diachi, int bac) {
		super(hoten,tuoi,gioitinh,diachi);
		this.bac= bac;
	}
	public int getbac() {
		return bac;
	}
	public void setbac(int bac) {
		this.bac= bac;
	}
}

