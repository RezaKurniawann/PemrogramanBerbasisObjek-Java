package Tugas.Overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return this.sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return this.sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));

    }

    public static void main(String[] args) {
        Segitiga objek = new Segitiga();

        // method totalSudut()
        System.out.println("Method totalSudut yang pertama : " + objek.totalSudut(50));
        System.out.println("Method totalSudut yang kedua   : " + objek.totalSudut(50, 30));

        // method keliling()
        System.out.println("Metod keliling yang pertama : " + objek.keliling(1, 2, 3));
        System.out.println("Method keliling yang kedua : " + objek.keliling(2, 5));
    }

}
