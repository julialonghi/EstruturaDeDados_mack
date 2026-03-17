package aula5;

import java.util.Scanner;

import javax.crypto.spec.OAEPParameterSpec;

public class Proposta1 {
    public static void main(String[] args) {
        String simbolos[] = {"0", "1", "2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor na base 10: ");
        int num = sc.nextInt();
        System.out.println("Digite a base para converter (2 | 8 | 16): ");
        int sist_num = sc.nextInt();

        PilhaInt base_ = converterDeQualquer(num, sist_num);
        String resp = "";
        base_.exibir();
        while (base_.isEmpty() != true) {
            int topo = base_.pop();
            resp += simbolos[topo];
        }
        System.out.println("Dec = " + num + ", Base ("+ sist_num +") = "+ resp);
    }

    public static PilhaInt converterDeQualquer(int num, int base){
        int tam = (int)Math.floor(Math.log(num)/Math.log(base) + 1);
        PilhaInt aux = new PilhaInt(tam);
        while (num != 0) {
            aux.push(num % base);
            num = num / base;
        }
        return aux;
    }
}
