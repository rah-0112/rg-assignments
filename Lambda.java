import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression to iterate through the list
        names.forEach(name -> System.out.println(name));
    }
}
