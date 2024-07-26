public class Gerbong {
    private String kode;
    private Kursi [] arrayKursi; 

    Gerbong (String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            System.out.println("Penumpang " + penumpang.getNama() + " berhasil ditempatkan di kursi nomor " + nomor);
        } else {
            System.out.println("Maaf, kursi nomor " + nomor + " sudah ditempati oleh penumpang lain.");
        }
    }
    

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }
}
