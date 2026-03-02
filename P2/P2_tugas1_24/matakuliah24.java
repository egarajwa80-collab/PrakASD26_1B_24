package P2.P2_tugas1_24;

public class matakuliah24 {

   
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    
    public matakuliah24() {
    }

   
    public matakuliah24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

   
    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("----------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
}