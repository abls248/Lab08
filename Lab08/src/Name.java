import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";


        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");


        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");


        System.out.println("\nYour full name is: " + firstName + " " + lastName);


        in.close();
    }
}