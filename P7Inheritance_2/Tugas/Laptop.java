package Tugas;

public class Laptop extends Komputer {
    public String jnsBatrei;

    public Laptop() {

    }

    public Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei) {
        super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai           = " + jnsBatrei);
    }
}