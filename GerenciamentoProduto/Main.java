import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        FiltroProduto filtroProduto = new FiltroProduto();

        while (true) {
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Filtrar Produtos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Categoria do produto: ");
                String categoria = scanner.nextLine();

                Produto produto = new Produto(nome, preco, categoria);
                produtos.add(produto);
                System.out.println("Produto cadastrado com sucesso!\n");

            } else if (opcao == 2) {

                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.\n");
                } else {
                    System.out.println("Produtos cadastrados:");
                    produtos.forEach(System.out::println);
                    System.out.println();
                }

            } else if (opcao == 3) {
                System.out.println("1. Filtrar por categoria");
                System.out.println("2. Filtrar por preço abaixo de 100.00");
                System.out.println("3. Filtrar por preço acima de 100.00");
                System.out.println("4. Filtrar por nome do produto");
                System.out.print("Escolha uma opção de filtro: ");
                int filtroOpcao = scanner.nextInt();
                scanner.nextLine(); 

                Predicate<Produto> filtro;

                if (filtroOpcao == 1) {
                    System.out.print("Digite a categoria: ");
                    String categoriaFiltro = scanner.nextLine();
                    filtro = produto -> produto.getCategoria().equalsIgnoreCase(categoriaFiltro);
                } else if (filtroOpcao == 2) {
                    filtro = produto -> produto.getPreco() < 100.00;
                } else if (filtroOpcao == 3) {
                    filtro = produto -> produto.getPreco() > 100.00;
                } else if (filtroOpcao == 4) {
                    System.out.print("Digite o nome do produto: ");
                    String nomeFiltro = scanner.nextLine();
                    filtro = produto -> produto.getNome().equalsIgnoreCase(nomeFiltro);
                } else {
                    System.out.println("Opção de filtro inválida.\n");
                    continue;
                }

                List<Produto> produtosFiltrados = filtroProduto.filtrarProdutos(produtos, filtro);

                if (produtosFiltrados.isEmpty()) {
                    System.out.println("Nenhum produto encontrado com o filtro selecionado.\n");
                } else {
                    System.out.println("Produtos filtrados:");
                    produtosFiltrados.forEach(System.out::println);
                    System.out.println();
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
                break;

            } else {
                System.out.println("Opção inválida.\n");
            }
        }

        scanner.close();
    }
}