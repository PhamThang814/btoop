package oop;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 QuanLySach quanLySach = new QuanLySach();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Them moi tai lieu");
	            System.out.println("2. Xoa tai lieu theo ma");
	            System.out.println("3. Hien thi thong tin tai lieu");
	            System.out.println("4. Tim kiem tai lieu theo loai");
	            System.out.println("5. Thoat");

	            System.out.print("Chon chuc nang: ");
	            int chucNang = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (chucNang) {
	                case 1:
	                    quanLySach.themMoiTaiLieu();
	                    break;
	                case 2:
	                    quanLySach.xoaTaiLieuTheoMa();
	                    break;
	                case 3:
	                    quanLySach.hienThiThongTinTaiLieu();
	                    break;
	                case 4:
	                    quanLySach.timKiemTheoLoai();
	                    break;
	                case 5:
	                    System.out.println("Thoat khoi chuong trinh.");
	                    System.exit(0);
	                default:
	                    System.out.println("Chuc nang ko hop le. Can chon lai");
	            }
	        }
	    }
}
