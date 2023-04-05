package LuyThua;

import java.util.Scanner;

public class LuyThua {
    private static int nhapLieu() {
        Scanner scan = new Scanner(System.in);
        int soN;
       do{
           System.out.print("Nhập vào số n: ");
            soN = scan.nextInt();
       }while(soN < 1);
        return soN;
    }
    private static int luyThua(int soN) {
        int luyThua = 1;
        for(int i = 1; i <= soN; i++) {
            luyThua *= i;
        }
        return luyThua;
    }
    private static void ketQua(int luyThua) {
        System.out.println("Luỹ thừa là: " + luyThua);
    }

    public static void main(String[] args) {
        // Input
        int soN = nhapLieu();
        //Process
        int luyThua = luyThua(soN);
        //Output
        ketQua(luyThua);
    }
}
