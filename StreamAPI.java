import java.util.Arrays;
import java.util.List;

public class StreamAPI {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

    // Using the Stream API to filter, transform, and collect data
    List<String> result = names.parallelStream()
        .filter(name -> name.length() > 3) // Filter names with more than 3 characters
        .map(String::toUpperCase) // Convert names to uppercase
        .sorted() // Sort names
        .toList(); // Collect the result into a list

    result.forEach(System.out::println);
  }
}
