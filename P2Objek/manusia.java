public class manusia {

    String nama;
    int umur;

    public manusia(String nm, int um) {
        nama = nm;
        umur = um;
    }

    public void namaku() {
        System.out.println("Hallo namaku " + nama);
    }

    public void umurku() {
        System.out.println("Umurku " + umur + " tahun");
    }

    public static void main(String[] args) {
        manusia mhs = new manusia("Ando", 27);
        mhs.namaku();
        mhs.umurku();
    }
}
