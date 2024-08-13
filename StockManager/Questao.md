Analise o código Java abaixo que simula um sistema simples degerenciamento de estoque de produtos. O código tem alguns erros que impedem o programa de funcionar corretamente. Sua tarefa é identificar e corrigir esses erros e/ou acrescentar o tramento de exceção apropriado.

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
 for (int i = 0; i <= produtos.size(); i++) {
 System.out.println(produtos.get(i));
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
 System.out.println("\nTentando acessar um produto fora do
índice válido:");
 System.out.println(produtos.get(10)); // Esse índice pode não
existir
 }
}