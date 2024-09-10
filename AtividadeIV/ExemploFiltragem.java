import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploFiltragem {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> ehPar = n -> n % 2 == 0;
        List<Integer> numerosPares = numeros.stream()
                                            .filter(ehPar)
                                            .collect(Collectors.toList());

        System.out.println(numerosPares);
    }
}