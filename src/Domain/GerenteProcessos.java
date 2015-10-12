package Domain;

import Service.IEscalonamentoService;
import Views.ViewMenu;
import java.util.ArrayList;
import java.util.List;

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
        this.ProcessoList.add(view.menuCadastroProcesso());
    }
}
