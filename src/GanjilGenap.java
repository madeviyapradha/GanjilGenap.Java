public class GanjilGenap {
    public static void main(String[] args) {
        int i;
        i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah Genap");
            } else {
                System.out.println(i + " adalah Ganjil");
            }
            i = i + 1;
        }
    }
}