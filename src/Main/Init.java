package Main;

import Domain.GerenteProcessos;
import Service.CircularService;
import Service.FifoService;
import Service.IEscalonamentoService;
import Views.ViewMenu;
import java.util.Scanner;

public class Init {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ViewMenu view = new ViewMenu();
        int opcaoMenuPrincipal;
        view.titulo();
        GerenteProcessos gerenciador = new GerenteProcessos();

        do {
            view.menuPrincipal();
            opcaoMenuPrincipal = teclado.nextInt();

            if (opcaoMenuPrincipal < 1 || opcaoMenuPrincipal > 3) {
                view.mensagemErro("Opção inválida!");
                continue;
            }

            switch (opcaoMenuPrincipal) {
                case 1:
                    gerenciador.adicionarProcesso();
                    break;
                case 2:
                    gerenciador.executar(Init.menuEscalonamento());
                    break;
            }

        } while (opcaoMenuPrincipal != 3);
    }

    public static IEscalonamentoService menuEscalonamento() {
        Scanner teclado = new Scanner(System.in);
        ViewMenu view = new ViewMenu();
        int opcao = 0;
        boolean opcaoValida = false;

        do {
            view.menuEscalonamento();
            opcao = teclado.nextInt();
            
            if(opcao > 0 && opcao < 3)
                opcaoValida = true;
            else
                view.mensagemErro("Opção inválida!");
        } while (!opcaoValida);
        
        switch(opcao){
            case 1:
                return new FifoService();
            case 2:
                return new CircularService();
            default:
                return null;
        }
    }
}
