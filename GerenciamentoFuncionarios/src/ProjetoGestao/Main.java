import java.util.Scanner;
package ProjetoGestao;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Calcular custo total da folha de pagamento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    Funcionario funcionario = new Funcionario(nome, cargo, salario);
                    empresa.adicionarFuncionario(funcionario);
                    break;
                case 2:
                    for (Funcionario f : empresa) {
                        System.out.println("Nome: " + f.getNome() + ", Cargo: " + f.getCargo() + ", Salário: " + f.getSalario());
                    }
                    break;
                case 3:
                    double custoTotal = 0;
                    for (Funcionario f : empresa) {
                        custoTotal += f.getSalario();
                    }
                    System.out.println("Custo total da folha de pagamento: " + custoTotal);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}