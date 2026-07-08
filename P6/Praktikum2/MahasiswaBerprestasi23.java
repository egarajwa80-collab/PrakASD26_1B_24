public class MahasiswaBerprestasi23 {
    Mahasiswa23[] listMhs = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

  
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    public void tampilPosisi(Double cariIpk, int pss) {
        if (pss != -1) {
            System.out.println("Data ditemukan pada posisi: " + pss);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void tampilDataSearch(Double cariIpk, int pss) {
        if (pss != -1) {
            listMhs[pss].tampilInformasi();
        } else {
            System.out.println("Data mahasiswa dengan IPK " + cariIpk + " tidak ditemukan");
        }
    }
}
