package TimSo;

public class TimSoNguyenDuong {
    public static void main(String[] args) {
        //Input
        //Process
        int tong = 0;
        int n = 0;
        while (tong < 10) {
            n++;
            tong += n;
        }
        //Output
        System.out.println("Số nguyên dương n nhỏ nhất là: " + n);
    }
}
