package Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS, TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        jumlahSKS = sks;
    }

    public void setTarif(int tarif) {
        TARIF_SKS = tarif;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
