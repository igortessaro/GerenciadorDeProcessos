package Domain;

import Service.IEscalonamentoService;
import Views.ViewMenu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenteProcessos {
    public GerenteProcessos(){
        this.ProcessoList = new ArrayList<>();
    }
    
    private Processo processo;    
    private List<Processo> ProcessoList;
    private TipoEscalonamento TipoEscalonamento;
    private IEscalonamentoService Service;

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public List<Processo> getProcessoList() {
        return ProcessoList;
    }

    public void setProcessoList(List<Processo> ProcessoList) {
        this.ProcessoList = ProcessoList;
    }

    public TipoEscalonamento getTipoEscalonamento() {
        return TipoEscalonamento;
    }

    public void setTipoEscalonamento(TipoEscalonamento TipoEscalonamento) {
        this.TipoEscalonamento = TipoEscalonamento;
    }

    public IEscalonamentoService getService() {
        return Service;
    }

    public void setService(IEscalonamentoService Service) {
        this.Service = Service;
    }
    
    public void adicionarProcesso(){
        Views.ViewMenu view =  new ViewMenu();
        Scanner teclado = new Scanner(System.in);
        Processo processo = new Processo();
        view.menuCadastroProcesso();
        System.out.println("Informe o nome: ");
        processo.setNome(teclado.nextLine());
        System.out.println("Informe a prioridade: ");
        processo.setPrioridade(teclado.nextInt());
        System.out.println("Informe o tempo de execução: ");
        processo.setTempo(teclado.nextInt());
        
        this.ProcessoList.add(processo);
    }
    
    public void executar(IEscalonamentoService escalonamento){
        if(escalonamento == null) return;
        
        escalonamento.executar(this.ProcessoList);        
    }
}
