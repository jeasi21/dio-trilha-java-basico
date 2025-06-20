
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Seja bem vindo ao nosso sistema bancário!");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Deseja criar uma conta? y/n");
        String criarConta = entrada.next();
        criarConta.toLowerCase();

        if(criarConta.equals("y")){
            int min = 1001;
            int max = 2001;
            int numeroConta = (int) (Math.random()*(max - min +1 )) + min;

            System.out.println("Digite a agência:");
            String agencia = entrada.next();
            entrada.nextLine();//Objetivo Limpar o buffer!
            System.out.println("Digite seu Nome:");
            String nomeCliente = entrada.nextLine();
            System.out.println("Digite o valor de depósito:");
            double saldo = entrada.nextDouble();
            

            System.out.println("\nOlá "+nomeCliente + " Obrigado porcriar uma conta em nosso banco!!\n"+
            "Sua agência é "+ agencia+ "\nconta " + numeroConta +
            "\nSeu saldo de R$"+ saldo +" já está disponível para saque!");

            System.out.println("\n++++++++++++++++++++++++++++++++++++");


        }else{
            System.out.println("Obrigado pela visita ao nosso sistema bancário!!!\nVolte Sempre!");
        }





        entrada.close();
    }
}
