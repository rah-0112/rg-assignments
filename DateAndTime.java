import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
  public static void main(String[] args) {
    // Get the current date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Current Date: " + currentDate);

    // Get the current time
    LocalTime currentTime = LocalTime.now();
    System.out.println("Current Time: " + currentTime);
  }
}
