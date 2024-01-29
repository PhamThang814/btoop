package oop;
import java.util.*;
public class nhanvien extends canbo {
	private String congviec;
	public nhanvien(String hoten, int tuoi, String gioitinh, String diachi, String congviec) {
		super(hoten,tuoi,gioitinh,diachi);
		this.congviec= congviec;
	}
	public String getcongviec() {
		return congviec;
	}
	public void setcongviec(String congviec) {
		this.congviec=congviec;
	}
}
