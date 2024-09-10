import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                      .filter(predicate)
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Java", "Predicate", "Stream", "", "Functional");
        Predicate<String> nonEmptyPredicate = s -> !s.isEmpty(); 
        
        List<String> result = filterStrings(strings, nonEmptyPredicate);
        System.out.println(result); 
    }
}