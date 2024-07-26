public class Anggota {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String ID) {
        this.nama = nama;
        this.idAnggota = ID;
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}