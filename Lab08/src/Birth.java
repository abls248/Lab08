import java.util.Scanner;
public class Birth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        System.out.println("You were born in the year: " + year);

        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        System.out.println("You were born in month: " + month);


        int maxDays = 31;
        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, maxDays);
        System.out.println("You were born on day: " + day);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        System.out.println("You were born at hour: " + hour);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);
        System.out.println("You were born at minute: " + minute);

        in.close();
    }
}
