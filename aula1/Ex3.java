import java.util.*;

public class Ex3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de eventos: ");
        int qtd = sc.nextInt();
        System.out.println("Digite os eventos: ");
        int[] vetor = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            vetor[i] = sc.nextInt();
        }
        int j = qtd;
        int p;
        for (int i = 0; i < (qtd/2); i++) {
            p = vetor[i];
            j--;
            vetor[i] = vetor[j];
            vetor[j] = p;
        }
        
        for (int i = 0; i < qtd; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}