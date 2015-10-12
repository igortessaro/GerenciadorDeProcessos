package Service;

import Domain.Processo;
import java.util.List;

public interface IEscalonamentoService {
    void executar(List<Processo> processoList);
}
