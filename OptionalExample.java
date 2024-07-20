import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();

        optionalWithValue.ifPresent(val -> System.out.println("I am not empty: " + val));
        emptyOptional.ifPresent(val -> System.out.println("I am empty:" + val));
    }
}
