//Menampilkan selisih angka-angka genap dengan angka
//setelahnya yang genap pula
public class J {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int k = 0; k < array.length - 1; k++) {
            if (array[k] % 2 == 0 && array[k + 1] % 2 == 0) {
                System.out.println(array[k + 1] - array[k]);
            }
        }
    }
}



