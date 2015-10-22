package Domain;

public class Processo {    
    private int TempoExecucao;
    private int TempoEspera;
    private int TempoExecutado;
    private int TempoFinalizacaoUltimaExecucao;
    private String Nome;
    private Status Status;
    private int Prioridade;
    private int QuantidadeExecucoesProcessador;

    public int getTempoExecucao() {
        return TempoExecucao;
    }

    public void setTempoExecucao(int TempoExecucao) {
        this.TempoExecucao = TempoExecucao;
    }

    public int getTempoEspera() {
        return TempoEspera;
    }

    public void setTempoEspera(int TempoEspera) {
        this.TempoEspera = TempoEspera;
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

    public int getTempoExecutado() {
        return TempoExecutado;
    }

    public void setTempoExecutado(int TempoExecutado) {
        this.TempoExecutado = TempoExecutado;
    }

    public int getTempoFinalizacaoUltimaExecucao() {
        return TempoFinalizacaoUltimaExecucao;
    }

    public void setTempoFinalizacaoUltimaExecucao(int TempoFinalizacaoUltimaExecucao) {
        this.TempoFinalizacaoUltimaExecucao = TempoFinalizacaoUltimaExecucao;
    }    

    public int getQuantidadeExecucoesProcessador() {
        return QuantidadeExecucoesProcessador;
    }

    public void setQuantidadeExecucoesProcessador(int QuantidadeExecucoesProcessador) {
        this.QuantidadeExecucoesProcessador = QuantidadeExecucoesProcessador;
    }
}
