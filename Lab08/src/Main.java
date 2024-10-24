import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Use the getInt method from SafeInput class to get the user's favorite integer
        int favoriteInt = SafeInput.getInt(in, "Please enter your favorite integer");
        System.out.println("Your favorite integer is: " + favoriteInt);

        // Use the getDouble method from SafeInput class to get the user's favorite double
        double favoriteDouble = SafeInput.getDouble(in, "Please enter your favorite double");
        System.out.println("Your favorite double is: " + favoriteDouble);

        in.close();
    }
}

