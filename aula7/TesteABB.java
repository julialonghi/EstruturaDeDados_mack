package TesteABB;

import java.util.Scanner;

public class TesteABB {

	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.println("\n\nCriação de uma ABB com objetos Integer:\n");
                ABB<Integer> abb1 = new ABB<Integer>();
                
                do {
                        System.out.println("MENU DE OPÇÕES \n" +
                                "1- Cadastrar funcionário" +
                                "2- Mostrar dados de todos os funcionários cadastrados" +
                                "3- Mostrar gastos com salários dos funcionários" +
                                "4- Mostrar total de funcionários de determinado sexo" +
                                "5- Mostrar quantidade de funcionários de certa de categoria" +
                                "6- Mostrar dados de funcionários a partir de certa idade" +
                                "7- Simular cadastro de funcionários" +
                                "8- Sair");
                        System.out.println("Digite a opção desejada: ");
                        int opcao = sc.nextInt();
                        if (opcao == 1) {
                                Funcionario func = cadastro();
                                abb2.inserir(func);
                        } else if (opcao == 2) {
                                abb2.emOrdem();
                        } else if (opcao == 7) {
                                for (int i = 1; i <= 20; i++) {
                                        Funcionario func = cadastro();
                                        abb2.inserir(func);
                                }
                        }
                } while (opcao != 8);

                public Funcionario cadastro() {
                        System.out.println("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Categoria: P – Presencial, O – Home Office, H – Híbrido");
                        char categoria = sc.nextLine().charAt(0);
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.println("Sexo: F – feminino, M – masculino");
                        char sexo = sc.nextLine().charAt(0);
                        System.out.println("Idade: ");
                        int idade = sc.nextInt();
                        System.out.println("Salário: ");
                        float sal = sc.nextDouble();

                        Funcionario func = new Funcionario(categoria, nome, cargo, sexo, idade, sal);
                        return func;
                }
        }
        
        /* 
        System.out.println( "Insere " + abb1.insert(12) );
        System.out.println( "Insere " + abb1.insert(6) );
        System.out.println( "Insere " + abb1.insert(4) );
        System.out.println( "Insere " + abb1.insert(15) );
        System.out.println( "Insere " + abb1.insert(13) );
        System.out.println( "Insere " + abb1.insert(25) );
        System.out.println( "Insere " + abb1.insert(2) );
        System.out.println( "Insere " + abb1.insert(5) );
        
        System.out.println("\n\nMostra a ABB percorrendo em-ordem:\n");
        System.out.println( abb1.emOrdem() );
        System.out.println("\nMostra a ABB percorrendo pré-ordem:\n");
        abb1.preOrdem();
        System.out.println("\nMostra a ABB percorrendo pós-ordem:\n");
        abb1.posOrdem();
        System.out.println("\nMostra a ABB percorrendo em nível:\n");
        abb1.emNivel();

        System.out.println("\n\nCriação de uma ABB de objetos da classe Funcionario (Chave: RA):\n");
        ABB<Funcionario> abb2 = new ABB<Funcionario>();
         
        // Criação dos Funcionarios
        Funcionario alA = new Funcionario("888-8", "Caio", 'M', 5.5f);
        Funcionario alB = new Funcionario("333-3", "Lara", 'F', 9.8f);
        Funcionario alC = new Funcionario("666-6", "Vanessa", 'F', 8.8f);
        Funcionario alD = new Funcionario("111-1", "Luiz", 'M', 6.5f);
        Funcionario alE = new Funcionario("999-9", "Ana", 'F', 9.5f);
        
        // Insere os Funcionarios na árvore
        // A chave da ABB é RA do Funcionario
        abb2.inserir(new Funcionario("123-4", "Rosa", 'F', 4.5f));
        abb2.inserir(alE);
        abb2.inserir(alD);
        abb2.inserir(new Funcionario("444-4", "Betty", 'F', 9.0f));
        abb2.inserir(new Funcionario("222-2", "Pedro", 'M', 7.0f));
        abb2.inserir(new Funcionario("777-7", "Renata", 'F', 7.2f));
        abb2.inserir(alA);
        abb2.inserir(alB);
        abb2.inserir(alC);
        
        // Imprime os Funcionarios em ordem de RA
        abb2.emOrdem2();  
       
        // Se conseguiu eliminar o Funcionario de RA 666-6
        if (abb2.eliminar(alC) == true) 
        	System.out.println("\nEliminado: " + alC);
        else 
        	System.out.println("\nNão eliminado: " + alC);
        
        // Busca os Funcionarios na árvore e mostra, se existir
        System.out.println("\nBuscamos " + alA +   ", Resultado: " + abb2.find(alA));
        System.out.println("\nBuscamos " + alC +   ", Resultado: " + abb2.find(alC));
        System.out.println("\nBuscamos " + alB +   ", Resultado: " + abb2.search(alB) + "\n");
        
        // Imprime o resultado da árvore em ordem de RA
        System.out.println("\nOs Funcionarios que estão na árvore por RA são:");
        abb2.emOrdem2();   
        */   
	
}
