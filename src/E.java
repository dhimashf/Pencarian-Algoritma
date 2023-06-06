//Menampilkan angka-angka yang memiliki angka 2
public class E {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int elemen : array) {
            while (elemen > 0) {
                int angka = elemen % 10;
                if (angka == 2) {
                    System.out.println(elemen);
                    break;
                }
                elemen /= 10;
            }
        }
    }
}




