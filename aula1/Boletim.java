import java.util.Scanner;

public class Boletim {

    private double[][] notas;

    public Boletim(double[][] notas) {
        this.notas = notas;
    }

    public void mediaAluno(int a) {
        double soma = 0;
        for (int j = 0; j < notas[a].length; j++) {
            soma += notas[a][j];
        }
        System.out.println(soma / notas[a].length);
    }

    public void mediaProva(int p) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i][p];
        }
        System.out.println(soma / notas.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a qtd de alunos:");
        int a = sc.nextInt();

        System.out.println("Digite a qtd de provas:");
        int p = sc.nextInt();

        double[][] notas = new double[a][p];

        for (int i = 0; i < a; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1));
            for (int j = 0; j < p; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        Boletim boletim = new Boletim(notas);

        for (int i = 0; i < a; i++) {
            System.out.printf("Media aluno %d: %.2f\n", i + 1, boletim.mediaAluno(i));
        }


        for (int j = 0; j < p; j++) {
            System.out.printf("Media prova %d: %.2f\n", j + 1, boletim.mediaProva(j));
        }

    }
}


   