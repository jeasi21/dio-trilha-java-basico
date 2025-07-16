
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor insira os seus dados:");

        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Idade: ");
        int idade = entrada.nextInt();
       

        System.out.println("E-mail: ");
        String email = entrada.next();
       
        
        Pessoa p1 = new Pessoa();
        p1.setName(nome);
        p1.setEmail(email);
        p1.setAge(idade);
        System.out.println("\nConfira seus dados:");
        System.out.println("\nNome: "+p1.getName()+"\nE-mail: " +p1.getEmail()+"\nIdade: "+ p1.getAge()+
        "\nEstá tudo correto? y/n:");
        String confirma = entrada.next();

        if(confirma.equals("y")|| confirma.equals("Y")){
            System.out.println(p1.Greetings());
        }else{
            System.out.println(p1.noFind());
        }



        entrada.close();
    }
}
