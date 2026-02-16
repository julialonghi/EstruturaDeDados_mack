import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de alunos: ");
        int a = sc.nextInt();
        System.out.println("Digite a qtd de provas: ");
        int p = sc.nextInt();
        System.out.println("Digite as notas de cada aluno: ");
        double[][] notas = new double[a][p];

        for (int i = 0; i < a; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < p; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < a; i++) {
            double soma = 0;
            for (int j = 0; j < p; j++) {
                soma += notas[i][j];
            }
            System.out.println("Aluno " + (i + 1) + " média: " + (soma / p));
        }
    }
}
