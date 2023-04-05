package DemSo;

public class DemSo {
    public static void main(String[] args) {
        soChiaHetCho3();
    }
    private static void soChiaHetCho3() {
        int dem = 0;
        for (int i = 0; i <= 100; i++){
            if(i % 3 == 0) {
                dem++;
            }
        }
        System.out.println("Có " + dem + " số chia hết cho 3");
    }
}
