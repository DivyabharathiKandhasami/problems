import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class Demo10 {
        public static void main(String[] args) {
            String dateString = "23/12/23"; // replace with the actual date string
            findDayOfDate(dateString);
        }

        public static void findDayOfDate(String dateString) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("The day of the date is: " + date.getDayOfWeek());
        }
    }

