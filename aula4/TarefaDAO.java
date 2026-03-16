import java.util.ArrayList;

public class TarefaDAO {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public boolean inserir(Tarefa t) {
        if (buscar(t.getID()) == null) {
            tarefas.add(t);
            return true;
        }
        return false;
    }

    public Tarefa buscar(int id) {
        for (Tarefa t : tarefas) {
            if (t.getID() == id) {
                return t;
            }
        }
        return null;
    }

    public boolean remover(Tarefa t) {
        Tarefa taux = buscar(t.getID());
        if (taux != null) {
            tarefas.remove(taux);
            return true;
        }
        return false;
    }

    public boolean atualizarDescricao(Tarefa t, String novaDesc) {
        Tarefa taux = buscar(t.getID());
        if (taux != null) {
            taux.setDescricao(novaDesc);
            return true;
        }
        return false;
    }

    public boolean concluirTarefa(Tarefa t) {
        Tarefa taux = buscar(t.getID());
        if (taux != null) {
            taux.setStatus("Concluída");
            return true;
        }
        return false;
    }

    public int contarConcluidas() {
        int cont = 0;
        for (Tarefa t : tarefas) {
            if (t.getStatus().equals("Concluída")) {
                cont++;
            }
        }
        return cont;
    }

    public String listarPendentes() {
        String saida = "";
        for (Tarefa t : tarefas) {
            if (t.getStatus().equals("Pendente")) {
                saida += "ID: " + t.getID() +
                        " - "+ t.getDescricao() +
                        " - Prioridade: " + t.getPrioridade() +
                        " - Status: " + t.getStatus() + "\n";
            }
        }
        return saida;
    }

    public void ordenarPorPrioridade() {
        for (int i = 0; i < tarefas.size() - 1; i++) {
            for (int j = i + 1; j < tarefas.size(); j++) {
                if (tarefas.get(i).getPrioridade().equals("Baixa") && !tarefas.get(j).getPrioridade().equals("Baixa")) {
                    Tarefa taux = tarefas.get(i);
                    tarefas.set(i, tarefas.get(j));
                    tarefas.set(j, taux);
                } else if (tarefas.get(i).getPrioridade().equals("Média") && tarefas.get(j).getPrioridade().equals("Alta")) {
                    Tarefa taux = tarefas.get(i);
                    tarefas.set(i, tarefas.get(j));
                    tarefas.set(j, taux);
                }
            }
        }
    }

    @Override
    public String toString() {
        String saida = "";
        for (Tarefa t : tarefas) {
            saida += "ID: " + t.getID() +
                    " - "+ t.getDescricao() +
                    " - Prioridade: " + t.getPrioridade() +
                    " - Status: " + t.getStatus() + "\n";
        }
        return saida;
    }
}
