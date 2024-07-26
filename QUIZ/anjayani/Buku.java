public class Buku {
    private int id;
    private String judul;
    private int tahunTerbit;
    private int jumlahTersedia;

    public Buku(int id, String judul, int tahunTerbit, int jumlahTersedia) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.jumlahTersedia = jumlahTersedia;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public static void tampilkanDaftarBuku(Buku[] daftarBuku) {
        for (Buku buku : daftarBuku) {
            System.out.println("ID: " + buku.getId() + ", Judul: " + buku.getJudul() + ", Tahun Terbit: " + buku.getTahunTerbit() + ", Jumlah Tersedia: " + buku.getJumlahTersedia());
        }
    }

    public void pinjamBuku(Buku buku, Anggota anggota) {
        if (buku.getJumlahTersedia() > 0) {
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam oleh " + anggota.getNama());
            buku.jumlahTersedia--;
        } else {
            System.out.println("Maaf, buku \"" + buku.getJudul() + "\" sedang tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku, Anggota anggota) {
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dikembalikan oleh " + anggota.getNama());
        buku.jumlahTersedia++;
    }
}
