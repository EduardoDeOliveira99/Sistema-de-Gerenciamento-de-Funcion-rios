package ProjetoGestao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        Funcionarios funcionario;
        int opcao;

        ConsoleObserver consoleObserver = new ConsoleObserver();
        empresa.addObserver(consoleObserver);

        do {
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Aumentar salário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                System.out.print("Cargo: ");
                String cargo = scanner.next();
                
                funcionario = new Funcionarios(nome, idade, salario, cargo);
                empresa.addFuncionario(funcionario);
                System.out.println();
                break;
                case 2:
                	System.out.println("");
                    System.out.println(empresa.toString());
                    System.out.println("");
                break;
                case 3:
                	System.out.println("");
                    System.out.print("Qual o número correspondente do funcionário: ");
                    int funcionarioIndice = scanner.nextInt();
                    Funcionarios funcionarioAdd = empresa.getFuncionario(funcionarioIndice);
                    empresa.getFuncionario(funcionarioIndice);
                    System.out.print("Qual a taxa de aumento desejada: ");
                    double TaxaAumento = scanner.nextDouble();
                    funcionarioAdd.CalcSalario(TaxaAumento);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                	System.out.println("");
                    System.out.println("Opção inválida!");
                    System.out.println("");
            }


        } while (opcao != 4);

        scanner.close();
    }
}