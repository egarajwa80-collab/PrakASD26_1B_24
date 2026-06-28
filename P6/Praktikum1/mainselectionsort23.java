package P6.Praktikum1;

public class mainselectionsort23 {
 public static void main(String[] args) {
 int a[] = {20,10,2,7,12};

        selectionsort23 dataurut1 = new selectionsort23(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30,20,2,8,14};

        selectionsort23 dataurut2 = new selectionsort23(b, b.length);
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        }
    }
