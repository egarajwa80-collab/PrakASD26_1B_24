package P2.P2_tugas1_24;

public class matakuliahmain24 {

    public static void main(String[] args) {

       
        matakuliah24 mk1 = new matakuliah24();

        mk1.kodeMK = "ASD001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(3);
        mk1.tampilInformasi();


       
        matakuliah24 mk2 = new matakuliah24(
                "BD002",
                "Basis Data",
                2,
                3
        );

        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangJam(5);
        mk2.tampilInformasi();
    }
}