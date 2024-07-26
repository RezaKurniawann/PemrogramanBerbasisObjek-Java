public class Buku {
    private int id;
    private String judul;
    private int tahunTerbit;
    private int stock;

    public Buku(int id, String judul, int tahunTerbit, int stock) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void tampilkanDaftarBuku(Buku buku) {
        System.out.println("ID: " + buku.getId() + ", Judul: " + buku.getJudul() +
                ", Tahun Terbit: " + buku.getTahunTerbit() + ", Stock: " + buku.getStock());
    }

    public void pinjamBuku(Buku buku, Anggota anggota) {
        if (buku.getStock() > 0) {
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam oleh " + anggota.getNama());
            buku.setStock(buku.getStock() - 1);
        } else {
            System.out.println("Maaf " + anggota.getNama() + ", buku \"" + buku.getJudul() + "\" tidak tersedia.");
        }
    }

    public void kembalikanBuku(Buku buku, Anggota anggota) {
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dikembalikan oleh " + anggota.getNama());
        buku.setStock(buku.getStock() + 1);
    }
}