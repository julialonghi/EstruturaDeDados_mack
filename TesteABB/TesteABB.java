package TesteABB;
//Classe Teste: encarregada de manipular a estrutura de dados
//árvore de busca binária (ABB) genérica.
//
//Autor1: Ivan Carlos / Alcides / Charles
//Data da Criação: 04/14/2026. 15h.
//
// Adaptação
//
// Classe TesteABB: encarregada de manipular o sistema de cadastro de funcionários,
// permitindo operações como inserção, listagem e análise de dados utilizando uma
// ABB genérica.
//
// Autor: Julia Oliveira Longhi
// Data: 28/04/2026
import java.util.Scanner;

public class TesteABB {
        static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
                System.out.println("\n\nCriação de uma ABB com objetos Funcionário:\n");
                ABB<Funcionario> abb2 = new ABB<Funcionario>();
                
                int opcao;
                do {
                        System.out.println("\nMENU DE OPÇÕES \n" +
                                "1- Cadastrar funcionário" +
                                "\n2- Mostrar dados de todos os funcionários cadastrados" +
                                "\n3- Mostrar gastos com salários dos funcionários" +
                                "\n4- Mostrar total de funcionários de determinado sexo" +
                                "\n5- Mostrar quantidade de funcionários de certa de categoria" +
                                "\n6- Mostrar dados de funcionários a partir de certa idade" +
                                "\n7- Simular cadastro de funcionários" +
                                "\n8- Sair\n");
                        System.out.println("Digite a opção desejada: ");
                        opcao = sc.nextInt();
                        if (opcao == 1) {
                                Funcionario func = cadastro();
                                abb2.inserir(func);
                        } else if (opcao == 2) {
                                Scanner sc = new Scanner(System.in);
                                abb2.emOrdem2();
                        } else if (opcao == 3) {
                                double total = abb2.totalSalarios(abb2.getRaiz());
                                System.out.println("Total gasto com salários: " + total);
                        } else if (opcao == 4) {
                                System.out.print("Informe o sexo (M/F): ");
                                char sexo = sc.next().charAt(0);

                                int totalSexo = abb2.contarPorSexo(abb2.getRaiz(), sexo);
                                System.out.println("Total de funcionários do sexo " + sexo + ": " + totalSexo);
                        } else if (opcao == 5) {

                                System.out.print("Informe a categoria (P/O/H): ");
                                char categoria = sc.next().charAt(0);

                                int totalCat = abb2.contarPorCategoria(abb2.getRaiz(), categoria);
                                System.out.println("Total da categoria " + categoria + ": " + totalCat);
                        } else if (opcao == 6) {
                                System.out.print("Informe a idade mínima: ");
                                int idade = sc.nextInt();

                                System.out.println("\nFuncionários com idade >= " + idade + ":");
                                abb2.mostrarPorIdade(abb2.getRaiz(), idade);
                        }
                        else if (opcao == 7) {
                                simularCadastro(abb2);
                                System.out.println("\nFuncionários cadastrados com sucesso.");
                        } else if (opcao == 8) {
                                System.out.print("Deseja realmente sair? (S/N): ");
                                char resp = sc.next().charAt(0);

                                if (resp == 'S' || resp == 's') {
                                System.out.println("Encerrando sistema...");
                                } else {
                                opcao = 0; 
                                }
                        } else {

                                System.out.println("Opção inválida!");
                        }
                } while (opcao != 8);
        }

        public static Funcionario cadastro() {
                System.out.println("-> ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("-> Categoria: P – Presencial, O – Home Office, H – Híbrido");
                char categoria = sc.nextLine().charAt(0);

                System.out.println("-> Nome: ");
                String nome = sc.nextLine();

                System.out.println("-> Cargo: ");
                String cargo = sc.nextLine();

                System.out.println("-> Sexo: F – feminino, M – masculino");
                char sexo = sc.nextLine().charAt(0);

                System.out.println("-> Idade: ");
                int idade = sc.nextInt();

                System.out.println("-> Salário: ");
                double sal = sc.nextDouble();

                Funcionario func = new Funcionario(id, categoria, nome, cargo, sexo, idade, sal);
                return func;
        }

        public static void simularCadastro(ABB<Funcionario> abb) {
                abb.inserir(new Funcionario(1, 'P', "Ana", "Analista", 'F', 25, 3000));
                abb.inserir(new Funcionario(2, 'O', "Bruno", "Dev", 'M', 30, 4000));
                abb.inserir(new Funcionario(3, 'H', "Carla", "Gerente", 'F', 35, 6000));
                abb.inserir(new Funcionario(4, 'P', "Daniel", "Suporte", 'M', 28, 2800));
                abb.inserir(new Funcionario(5, 'O', "Eduarda", "RH", 'F', 32, 3500));
                abb.inserir(new Funcionario(6, 'H', "Felipe", "Dev", 'M', 27, 4200));
                abb.inserir(new Funcionario(7, 'P', "Gabriela", "Financeiro", 'F', 40, 5000));
                abb.inserir(new Funcionario(8, 'O', "Henrique", "Dev", 'M', 29, 4100));
                abb.inserir(new Funcionario(9, 'H', "Isabela", "Marketing", 'F', 31, 3700));
                abb.inserir(new Funcionario(10, 'P', "João", "Suporte", 'M', 26, 2600));
                abb.inserir(new Funcionario(11, 'O', "Karina", "RH", 'F', 33, 3600));
                abb.inserir(new Funcionario(12, 'H', "Lucas", "Dev", 'M', 34, 4500));
                abb.inserir(new Funcionario(13, 'P', "Mariana", "Financeiro", 'F', 38, 5200));
                abb.inserir(new Funcionario(14, 'O', "Nicolas", "Dev", 'M', 24, 3900));
                abb.inserir(new Funcionario(15, 'H', "Olivia", "Marketing", 'F', 36, 4800));
                abb.inserir(new Funcionario(16, 'P', "Pedro", "Suporte", 'M', 23, 2500));
                abb.inserir(new Funcionario(17, 'O', "Renata", "RH", 'F', 37, 4100));
                abb.inserir(new Funcionario(18, 'H', "Samuel", "Dev", 'M', 39, 5300));
                abb.inserir(new Funcionario(19, 'P', "Tatiane", "Financeiro", 'F', 41, 5500));
                abb.inserir(new Funcionario(20, 'O', "Victor", "Dev", 'M', 28, 4300));
        }
}
