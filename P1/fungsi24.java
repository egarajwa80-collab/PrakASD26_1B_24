public class fungsi24{
static String[] cabang = {
"RoyalGarden 1",
"RoyalGarden 2",
"RoyalGarden 3",
"RoyalGarden 4"
};
static int[][] stock = {
{10, 5, 15, 7},
{6, 11, 9, 12},
{2, 10, 10, 5},
{5, 7, 12, 9}
};
static int hargaAglonema = 75000;
static int hargaKeladi = 50000;
static int hargaAlocasia = 60000;
static int hargaMawar = 10000;
static int totalPendapatan;
static int hitungPendapatan(int indexCabang) {
int total = 0;
total = (stock[indexCabang][0] * hargaAglonema) +
(stock[indexCabang][1] * hargaKeladi) +
(stock[indexCabang][2] * hargaAlocasia) +
(stock[indexCabang][3] * hargaMawar);
return total;
}
static String getStatus(int pendapatan) {
if (pendapatan > 1500000) {
return "Sangat Baik";
} else {
return "Perlu Evaluasi";
}
}
public static void main(String[] args) {
    System.out.println("======================================");
System.out.println(" Program Perhitungan Royal Garden");
System.out.println("======================================");
for (int i = 0; i < cabang.length; i++) {
totalPendapatan = hitungPendapatan(i);
System.out.println("\nCabang : " + cabang[i]);
System.out.println("Pendapatan : Rp " + totalPendapatan);
System.out.println("Status : " + getStatus(totalPendapatan));
}
System.out.println("\n======================================");
}
}