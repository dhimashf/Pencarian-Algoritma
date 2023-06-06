//Mencari Elemen Array
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan Angka yang akan dicari :");
        int Angka = x.nextInt();

        boolean Status = false;
        for (int j : array) {
            if (j == Angka) {
                Status = true;
                break;
            }
        }
        System.out.println("Angka " + Angka + " Status : " + Status);
    }
}



