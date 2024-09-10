import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FirstMatchFinder {

    public static Integer findFirstMatch(List<Integer> numbers, Predicate<Integer> predicate) {
        Optional<Integer> match = numbers.stream()
                                         .filter(predicate)
                                         .findFirst();
        return match.orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        Integer result = findFirstMatch(numbers, isEven);
        System.out.println(result);
    }
}