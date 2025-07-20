import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        String nomeCompleto = "Yasmin  Jornele";
        String tipoConta = "Conta Corrente";
        double saldo = 1500.58;
        int opcao = 0;


        System.out.println("\n---------------------------------------Sistema Bancario--------------------------------------------------");
        System.out.println("Nome do cliente: " + nomeCompleto);
        System.out.println("Conta:" + tipoConta);
        System.out.println("Saldo atual :" + saldo);
        System.out.println("\n -------------------Menu de Opção----------------------------------------");

        String menu = """
                Digite sua opção 
                1- saldo
                2- sacar
                3-depositar
                4- sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é :" + saldo);
            }else if (opcao ==2){
                System.out.println("Qual valor voce quer sacar?");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo -=  valor;
                    System.out.println("Saldo atual:" + saldo);

                }
            }else if (opcao == 3){
                System.out.println("Deposito realizado com sucesso.Obrigado!");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("saldo atual:" + saldo);
            }else if( opcao !=4){
                System.out.println("opcao invalida");
            }

        }

    }
}
