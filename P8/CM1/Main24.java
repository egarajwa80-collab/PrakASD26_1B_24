package P8.CM1;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mahasiswa24[] mhs = {
            new mahasiswa24("22001", "Andi", "Teknik Informatika"),
            new mahasiswa24("22002", "Budi", "Teknik Informatika"),
            new mahasiswa24("22003", "Citra", "Sistem Informasi Bisnis")
        };

        buku24[] buku = {
            new buku24("B001", "Algoritma", 2020),
            new buku24("B002", "Basis Data", 2019),
            new buku24("B003", "Pemrograman", 2021),
            new buku24("B004", "Fisika", 2024)
        };

        peminjaman24[] pinjam = {
            new peminjaman24(mhs[0], buku[0], 7),
            new peminjaman24(mhs[1], buku[1], 3),
            new peminjaman24(mhs[2], buku[2], 10),
            new peminjaman24(mhs[2], buku[3], 6),
            new peminjaman24(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (mahasiswa24 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (buku24 b : buku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (peminjaman24 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                peminjaman24 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (peminjaman24 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    System.out.println("\nHasil Pencarian:");
                    for (peminjaman24 p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampilPeminjaman();
                        }
                    }
                    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");

        sc.close();
    }
}