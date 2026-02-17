import java.util.*;

public class ResultadoPesquisa {
    int[] respostas;
    public ResultadoPesquisa(int[] respostas) {
        this.respostas = respostas;
    }

    public void qtdRespostas() {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < respostas.length; i++) {
            switch(respostas[i]) {
                case 1:
                    n1 += 1;
                    break;
                case 2:
                    n2 += 1;
                    break;
                case 3:
                    n3 += 1;
                    break;
                case 4:
                    n4 += 1;
                    break;
                case 5:
                    n5 += 1;
                    break;
                default:
                    System.out.println("inválido");
            }
        }
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Nota 3: " + n3);
        System.out.println("Nota 4: " + n4);
        System.out.println("Nota 5: " + n5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de respostas para cadastar:");
        int qtd = sc.nextInt();
        System.out.println("Digite as 10 respostas obtidas na pesquisa:");
        int[] respostas = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            respostas[i] = sc.nextInt();
        }

        ResultadoPesquisa resPesq = new ResultadoPesquisa(respostas);

        resPesq.qtdRespostas();
    }
}
