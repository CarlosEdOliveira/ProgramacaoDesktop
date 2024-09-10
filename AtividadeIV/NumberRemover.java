import java.util.List;
import java.util.ArrayList;

public class NumberRemover {

    public static void removeNegativeNumbers(List<Integer> numbers) {
        numbers.removeIf(n -> n < 0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -2, 3, -4, 5);
        List<Integer> mutableNumbers = new ArrayList<>(numbers);
        
        removeNegativeNumbers(mutableNumbers);
        System.out.println(mutableNumbers);
    }
}