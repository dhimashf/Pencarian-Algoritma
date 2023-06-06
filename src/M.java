//Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i) di atas.
public class M {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int hitung = 0;
        for (int k = 0; k < array.length - 1; k++) {
            int selisih = array[k + 1] - array[k];
            System.out.println(selisih);
            hitung += selisih;
        }
        System.out.println("Jumlah selisih: " + hitung);
    }
}



