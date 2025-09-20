import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsts = new TuyenSinh();
        
        dsts.nhapDanhSach(sc);

        System.out.println("\nDanh sach thi sinh:");
        dsts.hienThiDanhSach();

        System.out.print("\nNhap so bao danh can tim:");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();
        dsts.timKiemThiSinh(soBaoDanh);
    }

    // Mã sinh viên: 23115053122312
}
