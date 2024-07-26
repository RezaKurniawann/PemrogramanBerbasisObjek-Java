package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("************************");
            System.out.println("List Laptop dan Komputer");
            System.out.println("************************");
            System.out.println("1. PC");
            System.out.println("2. Macbook");
            System.out.println("3. Windows");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan kamu: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nMasukkan Merk               : ");
                    String merkPC = sc.next();
                    System.out.print("Masukkan Kecepatan Prosesor : ");
                    int kecepatanProsesorPC = sc.nextInt();
                    System.out.print("Masukkan Jenis Prosesor     : ");
                    String jenisProsesorPC = sc.next();
                    System.out.print("Masukkan Size Memory        : ");
                    int sizeMemoryPC = sc.nextInt();
                    System.out.print("Masukkan Ukuran Layar       : ");
                    int ukuranLayarPC = sc.nextInt();
                    Pc pc = new Pc(merkPC, jenisProsesorPC, kecepatanProsesorPC, sizeMemoryPC, ukuranLayarPC);
                    System.out.println("\nInformasi PC yang Anda Pilih:");
                    pc.tampilPc();
                    break;
                case 2:
                    System.out.print("\nMasukkan Merk               : ");
                    String merkMac = sc.next();
                    System.out.print("Masukkan Kecepatan Prosesor : ");
                    int kecepatanProsesorMac = sc.nextInt();
                    System.out.print("Masukkan Jenis Prosesor     : ");
                    String jenisProsesorMac = sc.next();
                    System.out.print("Masukkan Size Memory        : ");
                    int sizeMemoryMac = sc.nextInt();
                    System.out.print("Masukkan Jenis Baterai      : ");
                    String jenisBateraiMac = sc.next();
                    System.out.print("Masukkan Security           : ");
                    String securityMac = sc.next();
                    Mac mac = new Mac(merkMac, jenisProsesorMac, kecepatanProsesorMac, sizeMemoryMac, jenisBateraiMac,
                            securityMac);
                    System.out.println("\nInformasi Macbook yang Anda Pilih:");
                    mac.tampilMac();
                    break;
                case 3:
                    System.out.print("\nMasukkan Merk               : ");
                    String merkWindows = sc.next();
                    System.out.print("Masukkan Kecepatan Prosesor : ");
                    int kecepatanProsesorWindows = sc.nextInt();
                    System.out.print("Masukkan Jenis Prosesor     : ");
                    String jenisProsesorWindows = sc.next();
                    System.out.print("Masukkan Size Memory        : ");
                    int sizeMemoryWindows = sc.nextInt();
                    System.out.print("Masukkan Jenis Baterai      : ");
                    String jenisBateraiWindows = sc.next();
                    System.out.print("Masukkan fitur              : ");
                    String fiturWindows = sc.next();
                    Windows windows = new Windows(merkWindows, jenisProsesorWindows, kecepatanProsesorWindows,
                            sizeMemoryWindows, jenisBateraiWindows, fiturWindows);
                    System.out.println("\nInformasi Windows Laptop yang Anda Pilih:");
                    windows.tampilWindows();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
