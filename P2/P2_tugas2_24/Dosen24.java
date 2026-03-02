package P2.P2_tugas2_24;

public class Dosen24 {

   
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

 
    public Dosen24() {
    }

 
    public Dosen24(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("------------------------------------");
    }


    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status) {
            System.out.println(nama + " sekarang berstatus Aktif.");
        } else {
            System.out.println(nama + " sekarang berstatus Tidak Aktif.");
        }
    }

  
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja " + nama + " adalah " + masaKerja + " tahun.");
        return masaKerja;
    }

  
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + nama + " diubah menjadi: " + bidang);
    }
}