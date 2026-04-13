public class MahasiswaBerprestasi23 {
 Mahasiswa23[] listMhs = new Mahasiswa23[5];
 int idx;

     void tambah(Mahasiswa23 m){
          if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
          }else{
                System.out.println("data sudah penuh");
     }
 }

     void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
          for (int j = 1; j < idx-i; j++) {
            if(listMhs[j].ipk > listMhs[j-1].ipk){
               Mahasiswa23 tmp = listMhs[j];
                 listMhs[j] = listMhs[j-1];
                 listMhs[j-1] = tmp;
            }
        }
    }
 }
         int sequentialSearching(double cari){
    int posisi = -1;
    for (int j = 0; j < idx; j++) {
        if(listMhs[j].ipk == cari){
            posisi = j;
            break;
        }
    }
    return posisi;
}

         void tampil(){
         for (int i = 0; i < idx; i++) {
         listMhs[i].tampilInformasi();
         System.out.println("-------------------------");
         }
     }
}
