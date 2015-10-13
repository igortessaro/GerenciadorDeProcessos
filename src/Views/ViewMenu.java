package Views;

import Domain.Processo;
import java.util.Scanner;

public class ViewMenu {
    public void titulo(){
        System.out.println("");
        System.out.println("");
        System.out.println("...::  GERENCIADOR DE PROCESSOS  ::...");
        System.out.println("");
        System.out.println("");
    }
    
    public void menuPrincipal(){
        System.out.println("");
        System.out.println("");
        System.out.println("..::Menu Principal::..");
        System.out.println("1 - Adicionar processo.");
        System.out.println("2 - Executar processos.");
        System.out.println("3 - Sair.");
        System.out.println("Informe a ação desejada: ");
    }
    
    public void mensagemErro(String mensagem){
        System.out.println("");
        System.out.println("");
        System.out.println(String.format("ERRO: %s", mensagem));
        System.out.println("");
        System.out.println("");
    }
    
    public void menuCadastroProcesso(){
        System.out.println("");
        System.out.println("");
        System.out.println("..::Cadastro de Processo::.. ");
        System.out.println("");
    }
    
    public void menuEscalonamento(){
        System.out.println("");
        System.out.println("");
        System.out.println("..::Menu Escalonamento::..");
        System.out.println("");
        System.out.println("1 - Fifo.");
        System.out.println("2 - Circular.");
        System.out.println("Informe a ação desejada: ");
    }
}
