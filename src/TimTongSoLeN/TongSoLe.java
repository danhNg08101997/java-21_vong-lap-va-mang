package TimTongSoLeN;

import java.util.Scanner;

public class TongSoLe {
    // Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn n được nhập từ người dùng. Chỉ cho nhập số > 0, yêu cầu nhập lại nếu sai.
    /* Mô hình 3 khối
    * Input: n nhập từ người dùng
    * Process:
    *   + B1: lấy dữ liệu từ người dùng
    *   + B2: Chạy vòng lập nhập vào n
    *   + B3: chạy vòng lập for
    *       i = 1;
    *       tong += i;
    * Output: xuất ra tổng
    * */
    private static int nhapSo () {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        input = scanner.nextInt();
        return input;
    }

    public static void main(String[] args) {
        // Input
       int n, tong = 0;
       // Process
        do {
            n = nhapSo();
            if (n <= 0) {
                System.out.println("Vui lòng nhập lại");
            } else {
                for (int i = 1; i < n; i += 2) {
                    if (i % 2 != 0) {
                        tong += i;
                    }
                }
            }
        } while (n <= 0);
        // Output
        System.out.println("Kết quả là: " + tong);
    }
}
