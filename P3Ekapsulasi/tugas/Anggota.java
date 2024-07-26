package tugas;

public class Anggota {

    private String KTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman = 0;

    Anggota (String KTP, String nama, int limitPinjaman) {
        this.KTP = KTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama () {
        return nama;
    }
    public float getLimitPinjaman () {
        return limitPinjaman;
    }
    public float getJumlahPinjaman () {
        return jumlahPinjaman;
    }
    public void pinjam (int uang) {
        if (limitPinjaman > uang) {
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        
    }
    public void angsur (int uang) {
        if (uang >= (jumlahPinjaman * 0.1)) {
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } 
    }

    public void menu () {
        System.out.println(" ===== MENU =====");
        System.out.println("1. Pinjaman");
        System.out.println("2. Angsuran");
        System.out.println("3. Cek Jumlah Pinjaman");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
   }

   
}
