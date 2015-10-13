package Core;

import Domain.Processo;
import java.util.Comparator;

public class CustomComparator implements Comparator<Processo> {

    @Override
    public int compare(Processo processo, Processo processoCompar) {
        int startComparison;
        startComparison = this.compare(processo.getPrioridade(), processoCompar.getPrioridade());
        return startComparison != 0 ? startComparison
                : this.compare(processo.getPrioridade(), processoCompar.getPrioridade());
    }

    private static int compare(int a, int b) {
        return a < b ? -1
                : a > b ? 1
                        : 0;
    }
}
