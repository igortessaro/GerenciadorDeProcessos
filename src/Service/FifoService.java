package Service;

import Domain.Processo;
import java.util.Collections;
import java.util.List;
import Core.CustomComparator;
import java.util.Comparator;

public class FifoService implements IEscalonamentoService {

    @Override
    public void executar(List<Processo> processoList) {
        System.out.println("");
        System.out.println("Iniciando execução com escalonamento FIFO.");

        Collections.sort(processoList, new Comparator<Processo>() {
            @Override
            public int compare(Processo processo, Processo processoCompar) {
                int startComparison = this.compare(processo.getPrioridade(), processoCompar.getPrioridade());
                return startComparison != 0 ? startComparison
                        : this.compare(processo.getPrioridade(), processoCompar.getPrioridade());
            }

            private int compare(int a, int b) {
                return a < b ? -1
                        : a > b ? 1
                                : 0;
            }
        });

        for (Processo processo : processoList) {
            if (processo == null) {
                continue;
            }

            System.out.println("Executando o processo: " + processo.getNome());
            System.out.println("Com prioridade " + processo.getPrioridade());

            for (int i = 0; i < processo.getTempo(); i++) {
                System.out.println("Tempo em execução " + i + " segundos...");
            }

            System.out.println("Fim do processo...!");
            System.out.println("");
            System.out.println("");
        }
    }
}
