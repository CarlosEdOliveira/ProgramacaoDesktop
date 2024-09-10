import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploValidacao {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Predicate", "Stream", "");
        Predicate<String> naoVazia = s -> s != null && !s.isEmpty();
        boolean todasValidas = palavras.stream()
                                       .allMatch(naoVazia);

        System.out.println(todasValidas);
    }
}