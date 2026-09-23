import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();
        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else if (nilai >= 40) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
    
}
