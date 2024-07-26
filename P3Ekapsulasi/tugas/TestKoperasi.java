package tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        boolean lanjut = true;

        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        do {
            donny.menu();
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Jumlah yang Ingin Anda Pinjam : ");
                    int pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Jumlah yang Ingin Anda Angsur : ");
                    int angsur = sc.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;
                case 3:
                    System.out.println("Jumlah Pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    System.out.println("Terima Kasih!");
                    lanjut = false;
                    break;
                default:
                    System.out.println("Input Anda Tidak Valid!");
                    break;
            }
        } while (lanjut);
    }
}