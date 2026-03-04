package P3.Praktikum03;
import java.util.Scanner;
public class Matakuliahdemo24 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[3];
        String kode, nama, dummy;
        int sks, jumlahjam;

        System.out.print("Jumlah Matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
  

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode   : ");
            kode = sc.nextLine();
            System.out.print("Nama   : ");
            nama = sc.nextLine();
            System.out.print("SKS    : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");
            arrayOfMataKuliah[i] = new MataKuliah24(kode, nama, sks, jumlahjam);
        }

for (MataKuliah24 mk : arrayOfMataKuliah) {
    System.out.println("Kode   : " + mk.getKode());
    System.out.println("Nama   : " + mk.getNama());
    System.out.println("SKS    : " + mk.getSks());
    System.out.println("Jumlah Jam : " + mk.getJumlahjam());
    System.out.println("---------------------------------");
}

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode   : " + arrayOfMataKuliah[i].getKode());
            System.out.println("Nama   : " + arrayOfMataKuliah[i].getNama());
            System.out.println("SKS    : " + arrayOfMataKuliah[i].getSks());
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].getJumlahjam());
            System.out.println("---------------------------------");
        }
        sc.close();
    }
}
