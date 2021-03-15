package carvalho.zanini;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){
        int opcao;
        while(executarSistema) {
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank!");
                this.executarSistema = false;
                break;
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in);  //Deixa ele ler da entrada do sistema - teclado
        this.executarSistema = true;
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta (Título)");
        System.out.println("0 - Encerrar");
    }
}
