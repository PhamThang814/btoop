package oop;
import java.util.*;
public class Main {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     QLCB qlcb = new QLCB();

     while (true) {
         System.out.println("1. Them moi can bo");
         System.out.println("2. Tim kiem theo ho ten");
         System.out.println("3. Hien thi thong tin danh sach can bo");
         System.out.println("4. Thoat");

         System.out.print("Chon chuc nang: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); 
         switch (choice) {
             case 1:
                
                 System.out.println("Chon loai can bo:");
                 System.out.println("1. Cong nhan");
                 System.out.println("2. Ky su");
                 System.out.println("3. Nhan vien");
                 System.out.print("Chon loai: ");
                 int loaiCanBo = scanner.nextInt();
                 scanner.nextLine(); 
                 System.out.print("Nhap ho ten: ");
                 String hoten = scanner.nextLine();
                 System.out.print("Nhap tuoi: ");
                 int tuoi = scanner.nextInt();
                 scanner.nextLine();
                 System.out.print("Nhap gioi tinh: ");
                 String gioitinh = scanner.nextLine();
                 System.out.print("Nhap dia chi: ");
                 String diachi = scanner.nextLine();

                 if (loaiCanBo == 1) {
                     System.out.print("Nhap bac: ");
                     int bac = scanner.nextInt();
                     qlcb.themMoiCanBo(new congnhan(hoten, tuoi, gioitinh, diachi, bac));
                 } else if (loaiCanBo == 2) {
                     System.out.print("Nhap nganh dao tao: ");
                     String nganhDaoTao = scanner.nextLine();
                     qlcb.themMoiCanBo(new kysu(hoten, tuoi, gioitinh, diachi, nganhDaoTao));
                 } else if (loaiCanBo == 3) {
                     System.out.print("Nhap cong viec: ");
                     String congViec = scanner.nextLine();
                     qlcb.themMoiCanBo(new nhanvien(hoten, tuoi, gioitinh, diachi, congViec));
                 }
                 break;
}
}
}
}


