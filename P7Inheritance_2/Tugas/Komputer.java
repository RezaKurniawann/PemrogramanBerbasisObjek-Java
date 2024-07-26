package Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {

    }

    public Komputer(String merk, String jnsProsesor, int sizeMemory, int kecProsesor) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.sizeMemory = sizeMemory;
        this.kecProsesor = kecProsesor;
    }

    public void tampilData() {
        System.out.println("===============Spesifikasi===============");
        System.out.println("Merk                    = " + merk);
        System.out.println("Jenis Prosesor          = " + jnsProsesor);
        System.out.println("Kecepatan Prosesor      = " + kecProsesor);
        System.out.println("Size Memory             = " + sizeMemory);
    }
}
