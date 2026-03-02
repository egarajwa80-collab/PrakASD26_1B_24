package P2.P2_tugas2_24;

public class DosenMain24 {
    public static void main(String[] args) {

        Dosen24 dsn1 = new Dosen24();
        dsn1.idDosen = "0001";
        dsn1.nama = "Fatihin";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma Struktur Data";

       
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2026);
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Sistem Informasi");
        dsn1.tampilInformasi();

       
        Dosen24 dsn2 = new Dosen24("0002", "Pavita", false, 2010, "Basis Data");

       
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.hitungMasaKerja(2026);
        dsn2.ubahKeahlian("Big Data");
        dsn2.tampilInformasi();
    }
}