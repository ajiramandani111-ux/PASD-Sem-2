
import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int jumlahMK = 5;
        
        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalNilai = 0;
        int totalSKS = 0;
            
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama MK      : ");
            namaMK[i] = sc.next();

            System.out.print("SKS          : ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka  : ");
            nilaiAngka[i] = sc.nextDouble();
            
            if (nilaiAngka[i] > 80) {
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiSetara[i] = 1;
            } else {
                nilaiSetara[i] = 0;
            }

            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];

            System.out.println();
        }
        
        double ip = totalNilai / totalSKS;
        System.out.println("===== HASIL =====");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Bobot: " + nilaiSetara[i]);
        }

        System.out.println("IP Semester = " + ip);
        
    }
}
