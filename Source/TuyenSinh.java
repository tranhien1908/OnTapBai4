import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> dsThiSinh;

    public TuyenSinh() {
        dsThiSinh = new ArrayList<>();
    }

    public void themThiSinh(ThiSinh ts) {
        dsThiSinh.add(ts);
    }

    public void nhapDanhSach(Scanner sc){
        ThiSinh ts;

        System.out.print("Nhap so luong thi sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
         
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ": ");
            System.out.print("Chon khoi thi (A, B, C): ");
            String khoiThi = sc.nextLine();
            
            if (khoiThi.equalsIgnoreCase("A")) {
                ts = new KhoiA();
            } else if (khoiThi.equalsIgnoreCase("B")) {
                ts = new KhoiB();
            } else if (khoiThi.equalsIgnoreCase("C")) {
                ts = new KhoiC();
            } else {
                System.out.println("Khoi thi khong hop le. Vui long nhap lai.");
                i--;
                continue;
            }
            ts.nhapThongTin(sc);
            themThiSinh(ts);
        }
    }

    public void hienThiDanhSach() {
        for (ThiSinh ts : dsThiSinh) {
            ts.hienThiThongTin();
            System.out.println("-----------------------");
        }
    }

    public void timKiemThiSinh(int soBaoDanh) {
        for (ThiSinh ts : dsThiSinh) {
            if (ts.getSoBaoDanh() == soBaoDanh) {
                ts.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh voi so bao danh: " + soBaoDanh);
    }
}
