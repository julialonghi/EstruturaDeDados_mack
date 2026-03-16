public class Main {
    public static void main(String[] args) {
        TarefaDAO base = new TarefaDAO();
        Tarefa t1 = new Tarefa(1,"Estudar Java","Alta","Pendente");
        Tarefa t2 = new Tarefa(2,"Fazer exercícios","Média","Pendente");
        Tarefa t3 = new Tarefa(3,"Revisar aula","Baixa","Concluída");
        Tarefa t4 = new Tarefa(4,"Fazer trabalho","Média","Pendente");
        Tarefa t5 = new Tarefa(5,"Estudar comunicação de dados","Alta","Pendente");

        base.inserir(t1);
        base.inserir(t2);
        base.inserir(t3);
        base.inserir(t4);
        base.inserir(t5);

        System.out.println("- Lista de Tarefas -");
        System.out.println(base);

        System.out.println(base.buscar(2).getDescricao());

        base.atualizarDescricao(t2,"Fazer exercícios de Java");

        base.concluirTarefa(t1);

        base.remover(t3);

        System.out.println("\n- Lista Final -");
        System.out.println(base);

        System.out.println("Tarefas concluídas: " + base.contarConcluidas());

        System.out.println("\n- Tarefas pendentes -");
        System.out.println(base.listarPendentes());

        System.out.println("- Tarefas ordenadas por prioridade -");
        base.ordenarPorPrioridade();
        System.out.println(base);
        
    }
}
