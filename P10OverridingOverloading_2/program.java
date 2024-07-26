public class program {
    public static void main(String[] args) {
        kucing kucingKampung = new kucing ();
        ikan lumbaLumba = new ikan ();

        orang ani = new orang ("Ani");
        orang budi = new orang ("budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}