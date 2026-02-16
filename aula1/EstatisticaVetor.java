import java.util.Scanner;

public class EstatisticaVetor {
    private int[] qtdPassos;
    public EstatisticaVetor (int[] qtdPassos) {
        this.qtdPassos = qtdPassos;
    }

    public void maior() {
        int maior = qtdPassos[0];
        for (int passo : qtdPassos) {
            if (passo > maior) {
                maior = passo;
            }
        }
        System.out.println("Maior: "+ maior);
    }

    public void menor() {
        int menor = qtdPassos[0];
        for (int passo : qtdPassos) {
            if (passo < menor) {
                menor = passo;
            }
        }
        System.out.println("Menor: "+ menor);
    }

    public void media() {
        double soma = 0;
        for (int i = 0; i < qtdPassos.length; i++) {
            soma += qtdPassos[i];
        }
        double media = soma/qtdPassos.length;
        System.out.printf("Media: %.2f\n", media);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N");
        int n = sc.nextInt();
        System.out.println("Digite os valores");
        int[] passos = new int[n];

        for (int i = 0; i < n; i++) {
            passos[i] = sc.nextInt();
        }
        EstatisticaVetor ev = new EstatisticaVetor(passos);

        ev.maior();
        ev.menor();
        ev.media();
    }

}
