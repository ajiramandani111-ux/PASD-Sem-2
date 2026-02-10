
import java.util.Scanner;
public class PraktikumFungsi {
    
    static int hitungPendapatan(int aglo, int kela, int aloc, int mawar) {
        return (aglo * 75000) +
               (kela * 50000) +
               (aloc * 60000) +
               (mawar * 10000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int cabang = sc.nextInt();

        int[] aglonema = new int[cabang];
        int[] keladi   = new int[cabang];
        int[] alocasia = new int[cabang];
        int[] mawar    = new int[cabang];
        
        for (int i = 0; i < cabang; i++) {
            System.out.println("\nCabang ke-" + (i + 1));
            System.out.print("Aglaonema : ");
            aglonema[i] = sc.nextInt();
            System.out.print("Keladi    : ");
            keladi[i] = sc.nextInt();
            System.out.print("Alocasia  : ");
            alocasia[i] = sc.nextInt();
            System.out.print("Mawar     : ");
            mawar[i] = sc.nextInt();
        }
        
        System.out.println("\n=== HASIL ===");
        for (int i = 0; i < cabang; i++) {
            int pendapatan = hitungPendapatan(
                    aglonema[i],
                    keladi[i],
                    alocasia[i],
                    mawar[i]
            );

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status : Sangat Baik");
            } else {
                System.out.println("Status : Perlu Evaluasi");
            }
            System.out.println();
        }
    }
}
