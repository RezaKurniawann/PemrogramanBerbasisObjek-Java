public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku(1, "Java Programming", 2020, 3);
        Buku buku2 = new Buku(2, "Python Programming", 2019, 1);

        System.out.println("Menampilkan daftar buku:");
        buku1.tampilkanDaftarBuku(buku1);
        buku2.tampilkanDaftarBuku(buku2);

        System.out.println();
        Anggota anggota1 = new Anggota("Reza Kurniawan", "17082004");
        System.out.println("Nama : " + anggota1.getNama() + "\nID : " + anggota1.getIdAnggota() + "\nMelakukan Peminjaman");
        buku1.pinjamBuku(buku1, anggota1);
        buku2.pinjamBuku(buku2, anggota1);

        System.out.println();
        buku2.pinjamBuku(buku2, anggota1); // tidak bisa meminjam buku karena stock habis


        System.out.println("\nProses pengembalian buku:");
        buku1.kembalikanBuku(buku1, anggota1);
    }    
}