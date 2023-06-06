//Menampilkan Bil Ganjil
public class C {
    public static void main(String[] args) {
        int[] ElemenArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i : ElemenArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

