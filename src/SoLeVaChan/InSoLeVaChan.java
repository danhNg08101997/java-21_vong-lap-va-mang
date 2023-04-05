package SoLeVaChan;

public class InSoLeVaChan {
    public static void main(String[] args) {
        System.out.print("Số nguyên dương lẻ là: ");
        soNguyenDuongLe();

        System.out.print("\nSố nguyên dương chẳn là: ");
        soNguyenDuongChan();
    }
    private static void soNguyenDuongLe() {
        for(int i = 1; i < 100; i+=2){
            System.out.print(i + " ");
        }
    }
    private static void soNguyenDuongChan() {
        for(int j = 0; j < 100; j+=2){
            System.out.print(j + " ");
        }
    }
}
