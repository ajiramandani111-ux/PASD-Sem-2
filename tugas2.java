
import java.util.Scanner;

public class tugas2 {

    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    static void tampilJadwal(String[][] jadwal, int n) {
        System.out.println("=== SEMUA JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println(
                jadwal[i][0] + " | " +
                jadwal[i][1] + " | " +
                jadwal[i][2] + " | " +
                jadwal[i][3]
            );
        }
    }

    static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("=== JADWAL HARI " + hari + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
            }
        }
    }

    static void cariMK(String[][] jadwal, int n, String mk) {
        System.out.println("=== JADWAL MATA KULIAH " + mk + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][2] + " | " +
                    jadwal[i][3]
                );
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilJadwal(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String mk = sc.nextLine();
        cariMK(jadwal, n, mk);
    }
}
