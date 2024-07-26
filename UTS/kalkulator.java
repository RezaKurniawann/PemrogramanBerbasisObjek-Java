import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("                KALKULATOR               ");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan angka pertama : ");
        double angka1 = reza.nextDouble();

        System.out.print("Masukkan operator      : ");
        char operator = reza.next().charAt(0);

        System.out.print("Masukkan angka kedua   : ");
        double angka2 = reza.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error : tidak boleh dibagi 0");
                    return;
                }
                break;
            default:
                System.out.println("Error: operator tidak valid");
                return;
        }

        System.out.println("-----------------------------------------");
        System.out.println("Hasil : " + hasil);
        System.out.println("-----------------------------------------");

    }
}
