import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String statusMember;
        System.out.print("Masukkan status member: ");
        statusMember = input.nextLine();
        if (statusMember.equalsIgnoreCase("GOLD")) {
            System.out.println("Diskon 20%");
        } else if (statusMember.equalsIgnoreCase("SILVER")) {
            System.out.println("Diskon 15%");
        } else if (statusMember.equalsIgnoreCase("BRONZE")) {
            System.out.println("Diskon 10%");
        } else if (statusMember.equalsIgnoreCase("REGULAR")) {
            System.out.println("Tidak ada diskon (0%)");
        } else {
            System.out.println("Tidak ada diskon (0%)");
        }
            
    }
}


