import java.util.Scanner;

public class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String dienUuTien;

    public ThiSinh() {

    }

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String dienUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienUuTien = dienUuTien;
    }

    public void nhapThongTin( Scanner sc) {
        System.out.print("Nhap so bao danh: ");
        soBaoDanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap dien uu tien: ");
        dienUuTien = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("So bao danh: " + soBaoDanh);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Dien uu tien: " + dienUuTien);
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }
}
