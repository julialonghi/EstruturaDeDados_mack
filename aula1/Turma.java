public class Turma {
    private Aluno[] alunos;
    private double[][] notas;

    public Turma(Aluno[] alunos, double[][] notas) {
        this.alunos = alunos;
        this.notas = notas;
    }

    public double mediaAluno(int i) {
        double soma = 0;
        for (int j = 0; j < notas[i].length; j++) {
            soma += notas[i][j];
        }
        return soma / notas[i].length;
    }

    public double mediaAvaliacao(int j) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i][j];
        }
        return soma / notas.length;
    }

    public Aluno melhorAluno() {
        int indice = 0;
        double maior = mediaAluno(0);

        for (int i = 1; i < alunos.length; i++) {
            double media = mediaAluno(i);
            if (media > maior) {
                maior = media;
                indice = i;
            }
        }
        return alunos[indice];
    }

    public int aprovados() {
        int cont = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (mediaAluno(i) >= 6.0) {
                cont++;
            }
        }
        return cont;
    }

    public void relatorio() {

        System.out.println("\n=== RELATORIO DA TURMA ===");

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Aluno: %s | Media: %.2f\n",
                    alunos[i].getNome(), mediaAluno(i));
        }

        for (int j = 0; j < notas[0].length; j++) {
            System.out.printf("Media avaliacao %d: %.2f\n",
                    j + 1, mediaAvaliacao(j));
        }

        System.out.println("Melhor aluno: " + melhorAluno().getNome());
        System.out.println("Aprovados: " + aprovados());
    }
}
