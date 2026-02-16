import java.util.*;

public class Assentos {
    private int[][] assentos;

    public Assentos(int[][] assentos) {
        this.assentos = assentos;
    }
    public int[] reservarBloco(int qtd) {
        for (int i = 0; i < assentos.length; i++) {
            int cont = 0;

            for (int j = 0; j < assentos[i].length; j++) {
                if (assentos[i][j] == 0) {
                    cont++;
                } else {
                    cont = 0;
                }

                if (cont == qtd) {
                    int colunaInicial = j - qtd + 1;
                    for (int k = colunaInicial; k <= j; k++) {
                        assentos[i][k] = 1;
                    }
                    return new int[]{i, colunaInicial};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de linhas e colunas: ");
        int linha = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Digite a ocupação inicial da sala: ");
        int[][] assentos = new int[linha][col];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < col; j++) {
                assentos[i][j] = sc.nextInt();
            }
        }

        Assentos sala = new Assentos(assentos);

        System.out.println("Digite a qtd de assentos para reservar:");
        int qtd = sc.nextInt();

        int[] resultado = sala.reservarBloco(qtd);

        System.out.println("Resultado da reserva: " + resultado[0] + " " + resultado[1]);

        System.out.println("Mapa final da sala:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(assentos[i][j] + " ");
            }
            System.out.println();
        }

    }
}
