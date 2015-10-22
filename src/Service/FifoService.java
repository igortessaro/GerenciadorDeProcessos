package Service;

import Domain.Processo;
import java.util.List;

public class FifoService implements IEscalonamentoService {

    @Override
    public void executar(List<Processo> processoList) {
        System.out.println("");
        System.out.println("Iniciando execução com escalonamento FIFO.");

        int tempoEmExecucao = 0;
        int tempoDeEsperaTotal = 0;
        int mediaTempoEspera = 0;

        for (Processo processo : processoList) {
            if (processo == null) {
                continue;
            }

            processo.setTempoEspera(tempoEmExecucao);

            System.out.println("Executando o processo: " + processo.getNome());
            System.out.println("Com prioridade " + processo.getPrioridade());
            System.out.println("Com tempo de espera " + processo.getTempoEspera() + " segundos.");

            for (int i = 0; i < processo.getTempoExecucao(); i++) {
                int qtdSegundos = i + 1;
                System.out.println("Tempo em execução " + qtdSegundos + " segundos...");
            }

            System.out.println("Fim do processo...!");
            System.out.println("");
            System.out.println("");

            tempoEmExecucao += processo.getTempoExecucao();
            tempoDeEsperaTotal += processo.getTempoEspera();
        }

        if (processoList.size() > 0) {
            mediaTempoEspera = tempoDeEsperaTotal / processoList.size();
        }

        System.out.println("Tempo médio de espera: " + mediaTempoEspera);
    }
}
