package Tugas;

import java.util.ArrayList;

public class DaftarGaji {
    private ArrayList<Pegawai> listPegawai = new ArrayList<Pegawai>();

    public DaftarGaji() {

    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai.add(pegawai);
    }

    public void printSemuaGaji() {
        System.out.println("-------------------------------------");
        System.out.printf("| %-20s | %-10s |\n", "Nama Pegawai", "Gaji");
        System.out.println("-------------------------------------");
        for (Pegawai pegawai : listPegawai) {
            System.out.printf("| %-20s | %-10s |\n", pegawai.getNama(), pegawai.getGaji());
        }
        System.out.println("-------------------------------------");
    }

}
