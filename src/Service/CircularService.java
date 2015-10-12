package Service;

import Domain.Processo;
import java.util.List;

public class CircularService implements IEscalonamentoService{

    @Override
    public void executar(List<Processo> processoList) {
        System.out.println("Implementou Circular..");
    }
    
}
