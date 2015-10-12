package Service;

import Domain.Processo;
import java.util.List;

public class FifoService implements IEscalonamentoService{

    @Override
    public void executar(List<Processo> processoList) {
        System.out.println("Implementou Fifo...");
    }
    
}
