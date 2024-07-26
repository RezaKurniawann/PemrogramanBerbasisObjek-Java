import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Buku[] daftarBuku = {
            new Buku(1, "Java Programming", 2020, 3),
            new Buku(2, "Python Programming", 2019, 1)
        };

        Scanner scanner = new Scanner(System.in);

        Anggota anggota = new Anggota("Reza Kurniawan", "170804");

        System.out.println("Nama    : " + anggota.getNama());
        System.out.println("ID      : " + anggota.getIdAnggota());

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Menampilkan daftar Buku:");
                    Buku.tampilkanDaftarBuku(daftarBuku);
                    break;
                case 2:
                    System.out.print("Masukkan ID Buku yang ingin dipinjam: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); 
                    Buku bukuDipinjam = cariBukuByID(daftarBuku, bookId);
                    if (bukuDipinjam != null) {
                        bukuDipinjam.pinjamBuku(bukuDipinjam, new Anggota(anggota.getNama(), anggota.getIdAnggota()));
                    } else {
                        System.out.println("Buku dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID Buku yang ingin dikembalikan: ");
                    int returnBookId = scanner.nextInt();
                    scanner.nextLine(); 
                    Buku bukuDikembalikan = cariBukuByID(daftarBuku, returnBookId);
                    if (bukuDikembalikan != null) {
                        bukuDikembalikan.kembalikanBuku(bukuDikembalikan, new Anggota(anggota.getNama(), anggota.getIdAnggota()));
                    } else {
                        System.out.println("Buku dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
    public static Buku cariBukuByID(Buku[] daftarBuku, int id) {
        for (Buku buku : daftarBuku) {
            if (buku.getId() == id) {
                return buku;
            }
        }
        return null; // Book not found
    }
}