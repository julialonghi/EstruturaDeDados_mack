import java.util.*;

public class Ex2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de códigos: ");
        int qtd = sc.nextInt();
        int codigos[] = new int[qtd];
        System.out.println("Digite os códigos: ");
        for (int i=0; i < qtd; i++) {
            codigos[i] = sc.nextInt();
        }
        int unicos[] = new int[qtd];
        int cont = 0;
        for (int i = 0; i < qtd; i++) {
            boolean repetido = false;
            for (int j = 0; j < cont; j++) {
                if (codigos[i] == unicos[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                unicos[cont] = codigos[i];
                cont++;
            }
        }
        System.out.print("Tamanho final: " + cont);
        System.out.print("\nÚnicos: ");
        for (int i = 0; i < cont; i++) {
            System.out.print(unicos[i] + " ");
        }
    }
}
