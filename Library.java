import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("........LIBRARY MANAGEMENT SYSTEM.........");
        System.out.println("1.Admin\n2.User");
        System.out.println("Please entre the choice");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("You're in Admin Panel");
                break;
            case 2:
                System.out.println("You're in User Panel");
                break;
            default:
        }

    }
}
