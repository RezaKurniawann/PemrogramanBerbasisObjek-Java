public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi (String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }   

    KeretaApi (String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama (String nama) {
        this.nama = nama ;
    }

    public String getNama () {
        return nama;
    }

    public void setKelas (String kelas) {
        this.kelas = kelas;
    }

    public String getKelas () {
        return kelas;
    }

    public void setMasinis (Pegawai masinis) {
        this.masinis = masinis;
    }

    public Pegawai getMasinis () {
        return masinis;
    }

    public void setAsisten (Pegawai asisten) {
        this.asisten = asisten;
    }

    public Pegawai getAsisten () {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : \n" + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten : \n" + this.asisten.info() + "\n";
        } else {
            info += "Tidak ada asisten yang ditentukan\n";
        }
        return info;
    }

}