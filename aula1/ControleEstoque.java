import java.util.*;

public class ControleEstoque {
    private int[][] estoque;
    public ControleEstoque(int[][] estoque) {
        this.estoque = estoque;
    }

    public int estoqueProduto(int produto) {
        int soma = 0;
        for (int i = 0; i < estoque.length; i++) {
            if (i == produto) {
                for (int j = 0; j < estoque[i].length; j++) {
                    soma += estoque[i][j];
                }
            }
        }
        return soma;
    }

    public int estoqueEmpresa() {
        int soma = 0;
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                soma += estoque[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de produtos");
        int qtdP = sc.nextInt();
        System.out.println("Digite a qtd de filiais");
        int qtdF = sc.nextInt();
        System.out.println("Digite a qtd de produtos por filial: ");
        int[][] estoque = new int[qtdP][qtdF];

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                estoque[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número do produto que deseja consultar: ");
        int produto = sc.nextInt();

        ControleEstoque contEstoque = new ControleEstoque(estoque);
        
        System.out.println("Total produto " + produto + ": " + contEstoque.estoqueProduto(produto));
        System.out.println("Total geral: " + contEstoque.estoqueEmpresa());
    }
}