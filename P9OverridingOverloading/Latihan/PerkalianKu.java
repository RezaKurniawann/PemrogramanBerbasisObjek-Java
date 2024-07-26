package Latihan;

public class PerkalianKu {
    // latihan 1
    // void perkalian(int a, int b) {
    // System.out.println(a * b);
    // }

    // void perkalian(int a, int b, int c) {
    // System.out.println(a * b * c);
    // }

    // latihan 2
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        // latihan 1
        // PerkalianKu objek = new PerkalianKu();
        // objek.perkalian(25, 43);
        // objek.perkalian(34, 23, 56);

        // latihan 2
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
