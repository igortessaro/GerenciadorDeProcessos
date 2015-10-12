package Main;

import Domain.GerenteProcessos;
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
                    System.out.println("Executar processos selecionado...");
                    break;
            }

        } while (opcaoMenuPrincipal != 3);
    }
}
