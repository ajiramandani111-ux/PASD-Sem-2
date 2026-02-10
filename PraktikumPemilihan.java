package jobsheet1;
import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Nilai Akhir");
        System.out.println("======================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        if(tugas > 100 || tugas < 0 ) {
            System.out.print("Nilai Tidak Valid");
            System.out.print("Masukkan Nilai Tugas: ");
            tugas = sc.nextInt();
        }
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        if(kuis > 100 || kuis < 0 ) {
            System.out.print("Nilai Tidak Valid");
            System.out.print("Masukkan Nilai Kuis: ");
            kuis = sc.nextInt();
        }
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        if(uts > 100 || uts < 0 ) {
            System.out.print("Nilai Tidak Valid");
            System.out.print("Masukkan Nilai UTS: ");
            uts = sc.nextInt();
        }
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        if(uas > 100 || uas < 0 ) {
            System.out.print("Nilai Tidak Valid");
            System.out.print("Masukkan Nilai UAS: ");
            uas = sc.nextInt();
        }
        double nilaiAkhir = (tugas * 20/100)+(kuis * 20/100)+(uts * 30/100)+(uas * 40/100);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        String nHuruf="-";
        if (nilaiAkhir < 80 || nilaiAkhir<= 100 ){
            nHuruf="A";
        }else if (nilaiAkhir < 73 || nilaiAkhir <= 80 ){
            nHuruf="B+";
        }else if (nilaiAkhir < 65 || nilaiAkhir<= 73 ){
            nHuruf="B";
        }else if (nilaiAkhir < 60 || nilaiAkhir<= 65 ){
            nHuruf="C+";
        }else if (nilaiAkhir < 50 || nilaiAkhir<= 60 ){
            nHuruf="C";
        }else if (nilaiAkhir < 39 || nilaiAkhir<= 50 ){
            nHuruf="D";
        }else if (nilaiAkhir<= 39 ){
            nHuruf="E";
        }
        
        System.out.print("Nilai Huruf: "+ nHuruf);
        
        if (nHuruf == "D" || nHuruf == "E"){
            System.out.print("SELAMAT, ANDA TIDAK LULUS");
        }else{
            System.out.print("SELAMAT, ANDA LULUS");
        }
        
    }
    
}