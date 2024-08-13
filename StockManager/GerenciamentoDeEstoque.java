import java.util.ArrayList;

public class GerenciamentoDeEstoque {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adicionando produtos ao estoque
        produtos.add(new Produto("Camiseta"));
        produtos.add(new Produto("Calça"));
        produtos.add(new Produto("Tênis"));
        produtos.add(new Produto("Boné"));

        // Exibindo produtos no estoque
        System.out.println("Produtos no estoque:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        // Removendo um produto específico
        String produtoARemover = "Camiseta";
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(produtoARemover));

        // Tentando remover um produto que não existe
        String produtoNaoExistente = "Sapato";
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(produtoNaoExistente));

        // Exibindo produtos atualizados
        System.out.println("\nProdutos atualizados no estoque:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        // Tentando acessar um produto fora do índice válido
        System.out.println("\nTentando acessar um produto fora do índice válido:");
        if (produtos.size() > 10) {
            System.out.println(produtos.get(10));
        } else {
            System.out.println("O índice 10 não existe no estoque.");
        }
    }
}
