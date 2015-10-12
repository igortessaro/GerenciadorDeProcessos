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
        System.out.println("Menu Principal");
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
    
    public Processo menuCadastroProcesso(){
        Scanner teclado = new Scanner(System.in);
        Processo processo = new Processo();
        System.out.println("");
        System.out.println("");
        System.out.println("..::Cadastro de Processo::.. ");
        System.out.println("");
        System.out.println("Informe o nome: ");
        processo.setNome(teclado.nextLine());
        System.out.println("Informe a prioridade: ");
        processo.setPrioridade(teclado.nextInt());
        System.out.println("Informe o tempo de execução: ");
        processo.setTempo(teclado.nextInt());
        
        return processo;
    }
}
