import java.util.Scanner;
public class perulangan24 {
static Scanner sc = new Scanner(System.in);
static String nim;
static int n;
static int i;
public static void main(String[] args) {
System.out.println("Program Deret Bilangan");
System.out.print("Masukkan NIM : ");
nim = sc.nextLine();
n = Integer.parseInt(nim.substring(nim.length() - 2));
if (n < 10) {
n = n + 10;
}
System.out.println("n = " + n);
System.out.println("Output :");
for (i = 1; i <= n; i++) {
if (i == 10 || i == 15) {
continue;
}
if (i % 3 == 0) {
System.out.print("# ");
}
else if (i % 2 != 0) {
System.out.print("* ");
}
else {
    System.out.print(i + " ");
}
}
sc.close();
}
} 