package TongLuyThua;
import java.util.Scanner;
public class TongLuyThua {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        float n = scanner.nextFloat();
        System.out.print("Nhập x: ");
        float x = scanner.nextFloat();
        // Process
        float ketQua = tong(x, n);
        // Output
        System.out.println("Kết quả là: " + ketQua);
    }

    private static float tong(float x, float n) {
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s += luyThua(x,i);
        }
        return s;
    }

    private static float luyThua(float x, int i) {
        float t = 1;
        for (int j = 1; j <= i; j++){
            t *= x;
        }
        return t;
    }
}
