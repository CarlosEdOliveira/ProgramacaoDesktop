import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo, String descricao) {
        var tarefa = new Tarefa(titulo, descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getTitulo());
    }

    public void removerTarefa(String titulo) {
        for (var tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefas.remove(tarefa);
                System.out.println("Tarefa removida: " + titulo);
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + titulo);
    }

    public void marcarComoConcluida(String titulo) {
        for (var tarefa : tarefas) { 
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.setConcluida(true);
                System.out.println("Tarefa marcada como concluída: " + titulo);
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + titulo);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (var tarefa : tarefas) { 
                System.out.println(tarefa);
                System.out.println("------------");
            }
        }
    }

    public static void main(String[] args) {
        var gerenciador = new GerenciadorDeTarefas(); 
        var scanner = new Scanner(System.in); 
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    var titulo = scanner.nextLine(); 
                    System.out.print("Digite a descrição da tarefa: ");
                    var descricao = scanner.nextLine(); 
                    gerenciador.adicionarTarefa(titulo, descricao);
                    break;

                case 2:
                    System.out.print("Digite o título da tarefa a ser removida: ");
                    var tituloRemover = scanner.nextLine(); 
                    gerenciador.removerTarefa(tituloRemover);
                    break;

                case 3:
                    System.out.print("Digite o título da tarefa a ser marcada como concluída: ");
                    var tituloConcluir = scanner.nextLine(); 
                    gerenciador.marcarComoConcluida(tituloConcluir);
                    break;

                case 4:
                    gerenciador.listarTarefas();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
