import java.util.*;

public class AgendaSemanal {
    private int[][] agenda;

    public AgendaSemanal(int[][] agenda){
        this.agenda = agenda;
    }

    public int totalHorarios() {
        int soma = 0;
        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                if (agenda[i][j] == 1) {
                    soma += agenda[i][j];
                }
            }
        }
        return 40-soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] agenda = new int[5][8];
        System.out.println("Digite os dados da agenda:");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 8; j++) {
                agenda[i][j] = sc.nextInt();
            }
        }

        AgendaSemanal agSem = new AgendaSemanal(agenda);

        System.out.println("Horários livres: " + agSem.totalHorarios());
    }
}
