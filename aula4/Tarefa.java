public class Tarefa {
    private int ID;
    private String descricao;
    private String prioridade;
    private String status;

    public Tarefa(int id, String descricao, String prioridade, String status) {
        this.ID = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
