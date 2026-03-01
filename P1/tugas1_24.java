import java.util.Scanner;
public class tugas1_24{
static Scanner sc = new Scanner(System.in);
static char[] KODE = {
'A','B','D','E','F','G','H','L','N','T'
};
static String[][] KOTA = {
{"B","A","N","T","E","N"},
{"J","A","K","A","R","T","A"},
{"B","A","N","D","U","N","G"},
{"C","I","R","E","B","O","N"},
{"B","O","G","O","R"},
{"P","E","K","A","L","O","N","G","A","N"},
{"S","E","M","A","R","A","N","G"},
{"S","U","R","A","B","A","Y","A"},
{"M","A","L","A","N","G"},
{"T","E","G","A","L"}
};
static char inputKode;
static boolean ditemukan = false;
public static void main(String[] args) {
System.out.println("===================================");
System.out.println(" Program Pencarian Kota dari Plat ");
System.out.println("===================================");
System.out.print("Masukkan Kode Plat : ");
inputKode = sc.next().charAt(0);
for (int i = 0; i < KODE.length; i++) {
if (inputKode == KODE[i]) {
System.out.print("Nama Kota : ");
for (int j = 0; j < KOTA[i].length; j++) {
System.out.print(KOTA[i][j]);
}
ditemukan = true;
break;
}
}
if (!ditemukan) {
System.out.println("Kode tidak ditemukan");
}
System.out.println("\n===================================");
sc.close();
}
}