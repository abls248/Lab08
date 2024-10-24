import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);


        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: Mxxxxx)", "^(M|m)\\d{5}$");
        System.out.println("Valid UC M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice: " + menuChoice);


        in.close();
    }
}
