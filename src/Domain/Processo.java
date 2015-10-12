package Domain;

public class Processo {    
    private int Tempo;
    private String Nome;
    private Status Status;
    private int Prioridade;

    public int getTempo() {
        return Tempo;
    }

    public void setTempo(int Tempo) {
        this.Tempo = Tempo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public int getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(int Prioridade) {
        this.Prioridade = Prioridade;
    }    
}
