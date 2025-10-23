import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        // Create a Date object representing the current date and time
        Date currentDate = new Date();

        // Format for the day of the week
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        // Format for the day of the month
        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d");
        String dayOfMonth = dayOfMonthFormat.format(currentDate);

        // Format for the month name
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        String month = monthFormat.format(currentDate);

        // Output the results
        System.out.println("Current Day of the Week: " + dayOfWeek);
        System.out.println("Day of the Month: " + dayOfMonth);
        System.out.println("Current Month: " + month);
    }
}