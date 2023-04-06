package BTMang1;

import java.util.Scanner;

public class Mang1 {
    public static void main(String[] args) {
        int soPhanTuMang, luaChon;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử mảng: ");
            soPhanTuMang = scanner.nextInt();
            if (soPhanTuMang <= 0) {
                System.out.println("Vui lòng nhập lớn hơn 0");
            }
        } while (soPhanTuMang <= 0);
        //khởi tạo mảng
        arr = new int[soPhanTuMang];
        System.out.println("---------Nhập mảng--------");
        nhapMang(arr,scanner);
        // danh sách lựa chọn
        danhSachChon();
        //nhập lựa chọn
        do {
            System.out.print("\nNhập vào sự lựa chọn (từ 0 -> 10): ");
            luaChon = scanner.nextInt();
            if (luaChon < 0 || luaChon > 10) {
                System.out.println("Vui lòng nhập các số từ 0 đến 10");
            } else {
                xuLyLuaChon(arr, luaChon);
            }
        } while (true);


    }
    public static void nhapMang(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nPhần tử thứ " + i + " - ");
            arr[i] = scanner.nextInt();
        }

    }
    public static void danhSachChon() {
        System.out.println("\n----------Menu----------");
        System.out.println("1. Tính tổng các số dương.");
        System.out.println("2. Tính tổng các số lẻ.");
        System.out.println("3. Đếm có bao nhiêu số dương trong mảng.");
        System.out.println("4. Tìm số nhỏ nhất trong mảng.");
        System.out.println("5. Tìm số dương nhỏ nhất trong mảng.");
        System.out.println("6. Tìm số chẵn cuối cùng trong mảng.");
        System.out.println("7. Tìm số chẵn đầu tiên trong mảng.");
        System.out.println("8. Tìm số nguyên đầu tiên trong mảng.");
        System.out.println("9. Tìm số dương cuối cùng trong mảng.");
        System.out.println("10. Tìm giá trị chẵn nhỏ nhất trong mảng.");
        System.out.println("0. Thoát chương trình.");
    }
    public static void xuLyLuaChon(int[] arr, int soChon) {
        switch (soChon) {
            case 1:
                tongSoDuong(arr);
                break;
            case 2:
                tongSoLe(arr);
                break;
            case 3:
                demSoDuong(arr);
                break;
            case 4:
                soNhoNhat(arr);
                break;
            case 5:
                soDuongNhoNhat(arr);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default: System.exit(0);
        }
    }
    // Tính tổng các số dương
    public static void tongSoDuong(int[] arr) {
        // Input
        int tongDuong = 0;
        // Process
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                tongDuong += arr[i];
            }
        }
        // Output
        System.out.printf("Tổng các số dương là: %d", tongDuong);
    }
    // Tính tổng các số lẻ
    public static void tongSoLe(int[] arr) {
        // Input
        int tongSoLe = 0;
        // Process
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                tongSoLe += arr[i];
            }
        }
        // Output
        System.out.printf("Tổng các số lẻ: %d", tongSoLe);

    }
    // Đếm số dương trong mảng
    public static void demSoDuong(int[] arr) {
        // Input
        int dem = 0;
        // Process
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                dem++;
            }
        }
        // Output
        System.out.printf("Có %d số dương trong mảng.", dem);
    }
    // Số nhỏ nhất trong mảng
    public static void soNhoNhat(int[] arr) {
        //Input
        int temp = arr[0];
        // Process
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        // Output
        System.out.printf("Số nhỏ nhất trong mảng là: %d", temp);
    }
    // Số dương nhỏ nhất trong mảng
    public static void soDuongNhoNhat(int[] arr) {
        // Input
        int temp = arr[0];
       // Process
        for (int i = 0; i < arr.length; i++) {
            if (temp < 0) {
                temp = arr[i + 1];
            }
            if (temp > 0) {
                if (temp > arr[i]) {
                    temp = arr[i];
                }
            }
        }
        // Output
        System.out.printf("Số nhỏ nhất trong mảng là: %d", temp);
    }
}
