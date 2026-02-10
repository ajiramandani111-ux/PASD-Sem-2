package jobsheet1;
import java.util.Scanner;
public class PraktikumPerulangan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        
        int n = 0;
        int faktor = 1;

        for (int i = 0; i < 2; i++) {
            n = n + (int)(nim % 10) * faktor;
            nim = nim / 10;
            faktor = faktor * 10;
        }

        if (n < 10) {
            n = n + 10;
        }
        
        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
            } else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
