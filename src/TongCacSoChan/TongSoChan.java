package TongCacSoChan;

import java.util.Scanner;

public class TongSoChan {
    public static void main(String[] args) {
        // Input
        int myNum = myNum();
        //Process
        int tong = tongSoChan(myNum);
        // Output
        ketQua(tong);
    }
    private static int myNum() {
        final String TEXT_SO_NHAP = "Nhập vào một số lớn hơn 1: ";
        Scanner scanner = new Scanner(System.in);
        int n;
       do{
           System.out.print(TEXT_SO_NHAP);
           n = scanner.nextInt();
       }while(n < 1);
       return n;
    }
    private static int tongSoChan(int n) {
        int tong = 0;
        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                tong += i;
            }
        }
        return tong;
    }
    private static void ketQua(int tong) {
        System.out.println("Tổng các số chẵn là: " + tong);
    }
}
