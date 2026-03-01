import java.util.Scanner;
public class array24 {
static Scanner sc = new Scanner(System.in);
static int jumlahMK;
static String[] namaMK;
static int[] sks;
static String[] nilaiHuruf;
static double[] nilaiMutu;
static double totalBobot = 0;
static int totalSKS = 0;
static double ipSemester;
static double getNilaiMutu(String huruf) {
if (huruf.equalsIgnoreCase("A"))
return 4.0;
else if (huruf.equalsIgnoreCase("B+"))
return 3.5;
else if (huruf.equalsIgnoreCase("B"))
return 3.0;
else if (huruf.equalsIgnoreCase("C+"))
return 2.5;
else if (huruf.equalsIgnoreCase("C"))
return 2.0;
else if (huruf.equalsIgnoreCase("D"))
return 1.0;
else
return 0.0;
}
public static void main(String[] args) {
System.out.println("Program Menghitung IP Semester");
System.out.println("===================================");
System.out.print("Masukkan jumlah mata kuliah: ");
jumlahMK = sc.nextInt();
sc.nextLine();
namaMK = new String[jumlahMK];
sks = new int[jumlahMK];
nilaiHuruf = new String[jumlahMK];
nilaiMutu = new double[jumlahMK];
for (int i = 0; i < jumlahMK; i++) {
System.out.println("\nData MK ke-" + (i + 1));
System.out.print("Nama MK : ");
namaMK[i] = sc.nextLine();
System.out.print("SKS : ");
sks[i] = sc.nextInt();
sc.nextLine();
System.out.print("Nilai Huruf (A/B+/B/C+/C/D/E): ");
nilaiHuruf[i] = sc.nextLine();
nilaiMutu[i] = getNilaiMutu(nilaiHuruf[i]);
totalBobot += nilaiMutu[i] * sks[i];
totalSKS += sks[i];
}
ipSemester = totalBobot / totalSKS;
System.out.println("\nHASIL KONVERSI NILAI");
System.out.println("==============================================================")
;
System.out.printf("%-25s %-5s %-12s %-12s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot");
System.out.println("--------------------------------------------------------------");
for (int i = 0; i < jumlahMK; i++) {
System.out.printf("%-25s %-5d %-12s %-12.2f\n",
namaMK[i], sks[i], nilaiHuruf[i], nilaiMutu[i]);
}
System.out.println("==============================================================");
System.out.printf("IP Semester : %.2f\n", ipSemester);
System.out.println("==============================================================");
sc.close();
}
}