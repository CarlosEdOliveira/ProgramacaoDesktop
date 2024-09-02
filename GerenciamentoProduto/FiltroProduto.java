import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltroProduto {

    public List<Produto> filtrarProdutos(List<Produto> produtos, Predicate<Produto> filtro) {
        return produtos.stream()
                       .filter(filtro)
                       .collect(Collectors.toList());
    }
}