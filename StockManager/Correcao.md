import java.util.ArrayList;
public class GerenciamentoDeEstoque {
	public static void main(String[] args) {
	ArrayList<String> produtos = new ArrayList<String>();
	// Adicionando produtos ao estoque
	produtos.add("Camiseta");
	produtos.add("Calça");
	produtos.add("Tênis");
	produtos.add("Boné");
	// Exibindo produtos no estoque
	System.out.println("Produtos no estoque:");
	for (int i = 0; i < produtos.size(); i++) {
	System.out.println(produtos.get(i));
	//Erro que tava ocorrendo: IndexOutOfBoundsException - i <= produtos.size() acessando indice fora do limite do arraylist
	}

	// Removendo um produto específico
	String produtoARemover = "Camiseta";
	if (produtos.contains(produtoARemover)) {
	produtos.remove(produtoARemover);
	}

	// Tentando remover um produto que não existe
	String produtoNaoExistente = "Sapato";
	produtos.remove(produtoNaoExistente);

	// Exibindo produtos atualizados
	System.out.println("\nProdutos atualizados no estoque:");
	for (int i = 0; i < produtos.size(); i++) {
	System.out.println(produtos.get(i));
	}

 	// Tentando acessar um produto fora do índice válido
 	System.out.println("\nTentando acessar um produto fora do índice válido:");
	if (produtos.size() > 10 ){
        System.out.println(produtos.get(10)); // Esse índice pode não existir
    } else{
        System.out.println("O índice 10 não existe no estoque.");
    }
	//Erro que tava ocorrendo: IndexOutOfBoundsException - tentando acessar indice 10, no entanto o arraylist vai 0-9 na ocasião em questão
	}
}