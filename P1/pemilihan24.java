
import java.util.Scanner;
public class pemilihan24 {
 static Scanner sc = new Scanner(System.in);
 static double tugas, kuis, uts, uas;
 static double nilaiAkhir;
 static String nilaiHuruf;
 static String keterangan;
 static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
 return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
 }
 static String getNilaiHuruf(double nilaiAkhir) {
 if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
 return "A";
 } else if (nilaiAkhir >= 73) {
 return "B+";
 } else if (nilaiAkhir >= 65) {
 return "B";
 } else if (nilaiAkhir >= 60) {
 return "C+";
 } else if (nilaiAkhir >= 50) {
 return "C";
 } else if (nilaiAkhir >= 39) {
 return "D";
 } else {
 return "E";
 }
 }
 static String getKeterangan(String huruf) {
 if (huruf.equals("A") || huruf.equals("B+") ||
 huruf.equals("B") || huruf.equals("C+") ||
 huruf.equals("C")) {
 return "LULUS";
 } else {
 return "TIDAK LULUS";
 }
 }
 static boolean validasi(double nilai) {
 return nilai >= 0 && nilai <= 100;
 }
 public static void main(String[] args) {
 System.out.println("=================================");
 System.out.println("Program Menghitung Nilai Akhir");
 System.out.println("=================================");
 System.out.print("Masukkan Nilai Tugas : ");
 tugas = sc.nextDouble(); 
 System.out.print("Masukkan Nilai KUIS : ");
 kuis = sc.nextDouble();
 System.out.print("Masukkan Nilai UTS : ");
 uts = sc.nextDouble();
 System.out.print("Masukkan Nilai UAS : ");
 uas = sc.nextDouble();
 System.out.println("=================================");
 if (!validasi(tugas) || !validasi(kuis) ||
 !validasi(uts) || !validasi(uas)) {
 System.out.println("Nilai tidak valid");
 } else {
 nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
 nilaiHuruf = getNilaiHuruf(nilaiAkhir);
 keterangan = getKeterangan(nilaiHuruf);
 System.out.printf("Nilai Akhir : %.2f\n", nilaiAkhir);
 System.out.println("Nilai Huruf : " + nilaiHuruf);
 System.out.println("Keterangan : " + keterangan);
 }
 System.out.println("=================================");
 sc.close();
 }
}