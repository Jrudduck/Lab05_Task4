import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userAge;
        System.out.println("Enter your age.");
        if(scan.hasNextInt()) {
            userAge = scan.nextInt();

            if(userAge >= 21) {
            System.out.println("Please take a wristband.");
        }
        else {
            System.exit(0);
        }


        }
        else {
            System.out.println("Invalid value type");
            System.exit(0);
        }
    }
}