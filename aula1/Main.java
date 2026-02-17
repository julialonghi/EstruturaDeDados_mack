import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Informe a quantidade de avaliações: ");
        int qtdAvaliacoes = sc.nextInt();

        Aluno[] alunos = new Aluno[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdAvaliacoes];

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Matricula: ");
            String matricula = sc.nextLine();

            alunos[i] = new Aluno(nome, matricula);

            for (int j = 0; j < qtdAvaliacoes; j++) {
                System.out.print("Nota da avaliacao " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        Turma turma = new Turma(alunos, notas);
        turma.relatorio();

        sc.close();
    }
}
