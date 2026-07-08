
public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa23() {
    }

    Mahasiswa23(String Nim, String Nama, String Kelas, double Ipk) {
        nim = Nim;
        nama = Nama;
        kelas = Kelas;
        ipk = Ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}