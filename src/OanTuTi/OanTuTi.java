package OanTuTi;

import java.util.Scanner;

public class OanTuTi {
    private static int nguoiChoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng chọn (1 - Kéo || 2 - Búa || 3 - Bao) ==> ");
        int nguoiChoiChon = scanner.nextInt();
        return nguoiChoiChon;
    }
    private static int mayChoi() {
        int mayChon = (int) (Math.random() * 3) + 1;
        return mayChon;
    }
    private static String thongBao (int chon) {
        String ketQua = "";
        if (chon < 0 || chon > 3) {
            ketQua = "Vui lòng chọn lại";
        } else if (chon == 1) {
            ketQua = "Kéo";
        } else if (chon == 2) {
            ketQua = "Búa";
        } else if (chon == 3) {
            ketQua = "Bao";
        }
        return ketQua;
    }
    private static void tongKet (int tiSoMay, int tiSoNguoi) {
        if (tiSoMay > tiSoNguoi) {
            System.out.println("Tỉ số: " + "\nMáy: " + tiSoMay + " - " + "Người chơi: " + tiSoNguoi + "\n==> Máy Vô Địch");
        } else if (tiSoNguoi > tiSoMay) {
            System.out.println("Tỉ số: " + "\nNgười chơi: " + tiSoNguoi + " - " + "Máy: " + tiSoMay + "\n==> Người chơi Vô Địch");
        } else {
            System.out.println("Tỉ số: " + "\nMáy: " + tiSoMay + " - " + "Người chơi: " + tiSoNguoi + "\n==> Trận đầu hoà");
        }
    }
    public static void main(String[] args) {
        //Input
        int nguoi, may;
        int demNguoi = 0, demMay = 0;
        //Process
        do {
            nguoi = nguoiChoi();
            if (nguoi != 0) {
                if (nguoi < 0 || nguoi > 3) {
                    System.out.println(thongBao(nguoi));
                } else {
                    may = mayChoi();
                    if (nguoi == may) {
                        System.out.println("Người chơi chọn " + thongBao(nguoi) + " - " + "Máy chọn " + thongBao(may) + " ==> HOÀ");
                    } else if (nguoi == 1 && may == 2 || nguoi == 2 && may == 3 || nguoi == 3 && may == 1) {
                        System.out.println("Người chơi chọn " + thongBao(nguoi) + " - " + "Máy chọn " + thongBao(may) + " ==> MÁY THẮNG");
                        demMay++;
                    } else {
                        System.out.println("Người chơi chọn " + thongBao(nguoi) + " - " + "Máy chọn " + thongBao(may) + " ==> NGƯỜI CHƠI THẮNG");
                        demNguoi++;
                    }
                }
            }
        } while (nguoi != 0);
        //Output
        tongKet(demMay,demNguoi);
    }
}
