package oop;
import java.util.*;
public class QuanLySach {

	private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();

    public void themMoiTaiLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chon loai tai lieu (1 - Sach, 2 - Tap chi, 3 - Bao): ");
        int loai = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nhap ma tai lieu: ");
        String ma = scanner.nextLine();

        System.out.print("Nhap ten nha xuat ban: ");
        String tennxb = scanner.nextLine();

        System.out.print("Nhap so ban phat hanh: ");
        int soban = scanner.nextInt();
        scanner.nextLine(); 

        switch (loai) {
            case 1:
                System.out.print("Nhap ten tac gia: ");
                String tentacgia = scanner.nextLine();
                System.out.print("Nhap so trang: ");
                int sotrang = scanner.nextInt();
                danhSachTaiLieu.add(new Sach(ma, tennxb, soban, tentacgia, sotrang));
                break;
            case 2:
                System.out.print("Nhap so phat hanh: ");
                int sophathanh = scanner.nextInt();
                System.out.print("Nhap thang phat hanh: ");
                int thangphathanh = scanner.nextInt();
                danhSachTaiLieu.add(new TapChi(ma, tennxb, soban, sophathanh, thangphathanh));
                break;
            case 3:
                System.out.print("Nhap ngay phat hanh: ");
                String ngayphathanh = scanner.nextLine();
                danhSachTaiLieu.add(new Bao(ma, tennxb, soban, ngayphathanh));
                break;
            default:
                System.out.println("Loai tai lieu ko hop le");
        }
    }

    public void xoaTaiLieuTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu can xoa: ");
        String ma = scanner.nextLine();

        danhSachTaiLieu.removeIf(taiLieu -> taiLieu.ma.equals(ma));
    }

    public void hienThiThongTinTaiLieu() {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            taiLieu.hienThi();
            System.out.println("----------------------");
        }
    }

    public void timKiemTheoLoai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap loai tai lieu can tim(Sach/Tap chi/Bao): ");
        String loai = scanner.nextLine();

        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if ((taiLieu instanceof Sach && loai.equalsIgnoreCase("Sach")) ||
                (taiLieu instanceof TapChi && loai.equalsIgnoreCase("Tap chi")) ||
                (taiLieu instanceof Bao && loai.equalsIgnoreCase("Bao"))) {
                taiLieu.hienThi();
                System.out.println("----------------------");
            }
       }
    }
}
    
