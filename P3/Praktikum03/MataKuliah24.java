package P3.Praktikum03;

public class MataKuliah24 {
    private String kode;
    private String nama;
    private int sks;
    private int jumlahjam;

    public MataKuliah24(String kode, String nama, int sks, int jam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahjam = jam;
  }

    public String getKode() {
        return kode;
    }

    public int getSks() {
        return sks;
    }

    public int getJumlahjam() {
        return jumlahjam;
    }

    public String getNama() {
        return nama;
    }
}
