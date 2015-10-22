package Service;

import Domain.Processo;
import Domain.Status;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CircularService implements IEscalonamentoService {

    @Override
    public void executar(List<Processo> processoList) {
        System.out.println("");
        System.out.println("Iniciando execução com escalonamento Circular.");

        int fatiaTempo = 5;

        System.out.println("Quantum (Fatia de tempo): " + fatiaTempo);

        int tempoEmExecucao = 0;
        int tempoDeEsperaTotal = 0;
        int mediaTempoEspera = 0;
        int prioridade = 0;

        boolean executouProcesso = true;

        do {
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

            if(!executouProcesso)
                prioridade++;
            
            executouProcesso = false;

            for (Processo processo : processoList) {
                if (processo == null 
                        || processo.getStatus() == Status.Finalizado 
                        || processo.getPrioridade() != prioridade) {
                    continue;
                }

                executouProcesso = true;

                processo.setQuantidadeExecucoesProcessador(processo.getQuantidadeExecucoesProcessador() + 1);

                if (processo.getQuantidadeExecucoesProcessador() % 2 == 0) {
                    processo.setPrioridade(processo.getPrioridade() + 1);
                }

                System.out.println("Executando o processo: " + processo.getNome());
                System.out.println("Com prioridade " + processo.getPrioridade());
                
                processo.setTempoEspera(processo.getTempoEspera() + (tempoEmExecucao - processo.getTempoFinalizacaoUltimaExecucao()));
                
                System.out.println("Com tempo de espera " + processo.getTempoEspera() + " segundos.");
                /*System.out.println("Foram executados "
                        + processo.getTempoExecutado()
                        + " segundos de tantos "
                        + processo.getTempoExecucao()
                        + " segundos necessários.");*/
                
                for (int i = 0; i < fatiaTempo; i++) {
                    if (processo.getStatus() != Status.Finalizado) {
                        tempoEmExecucao++;

                        int qtdSegundos = processo.getTempoExecutado() + 1;
                        System.out.println("Tempo em execução " + qtdSegundos + " segundos...");
                        processo.setTempoExecutado(processo.getTempoExecutado() + 1);

                        System.out.println("Foram executados "
                                + processo.getTempoExecutado()
                                + " segundos de tantos "
                                + processo.getTempoExecucao()
                                + " segundos necessários.");

                        if (processo.getTempoExecucao() == processo.getTempoExecutado()) {
                            processo.setStatus(Status.Finalizado);
                        }
                    }
                }

                processo.setTempoFinalizacaoUltimaExecucao(tempoEmExecucao);
                
                System.out.println("Fim do processo...!");
                System.out.println("");
                System.out.println("");
            }
        } while (executouProcesso || !this.processosFinalizados(processoList));

        for (Processo processo : processoList) {
            if (processo == null) {
                continue;
            }

            tempoDeEsperaTotal += processo.getTempoEspera();
        }

        if (processoList.size() > 0) {
            mediaTempoEspera = tempoDeEsperaTotal / processoList.size();
        }

        System.out.println("Tempo médio de espera: " + mediaTempoEspera);
    }
    
    public boolean processosFinalizados(List<Processo> processoList){
        for (Processo processo : processoList) {
            if(processo != null && processo.getStatus() != Status.Finalizado)
                return false;
        }
        
        return true;
    }

}
