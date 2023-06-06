//Menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh
//angka-angka sebelumnya.
public class N {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
            System.out.print(total + " ");
        }
    }
}
