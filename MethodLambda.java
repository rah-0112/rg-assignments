import java.util.Arrays;
import java.util.List;

public class MethodLambda {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    List<String> upperCaseNamesLambda = names.stream()
        .map(name -> name.toUpperCase())
        .toList();

    List<String> upperCaseNamesMethodReference = names.stream()
        .map(String::toUpperCase)
        .toList();

    upperCaseNamesLambda.forEach(System.out::println);
    upperCaseNamesMethodReference.forEach(System.out::println);
  }
}
