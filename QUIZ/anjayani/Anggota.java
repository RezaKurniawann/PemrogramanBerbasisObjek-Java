public class Anggota {
    private String nama;
    private String idAnggota;

    public Anggota () {}
    public Anggota(String nama, String ID) {
        this.nama = nama;
        this.idAnggota = ID;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }
    
    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}