//Menampilkan angka-angka yang setelahnya bernilai lebih besar.
public class K {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int k = 0; k < array.length - 1; k++) {
            if (array[k] < array[k + 1]) {
                System.out.println(array[k]);
            }
        }
    }
}
