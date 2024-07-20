import java.util.Arrays;
import java.util.List;

public class Map {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    // Convert the list of strings to uppercase using map
    List<String> upperCaseNames = names.stream()
        .map(String::toUpperCase)
        .toList();

    upperCaseNames.forEach(System.out::println);
  }
}
