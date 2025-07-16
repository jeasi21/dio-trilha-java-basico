
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class candidaura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
      imprimirSelecionados();
       String [] candidatos ={"Ana Paula", "João", "Carlos", "Antonio","Cícero"};
       for(String candidato : candidatos){
            entrandoEmContato(candidato);
       }
        

    }/* */
    
    static  void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean contnuarTenando = true;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            contnuarTenando = !atendeu;

            if(contnuarTenando){
                tentativasRealizadas ++;
            }else{
                System.out.println("Contato realizado com Sucesso!");
            }

            
        } while (contnuarTenando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimos contatar com " + candidato + " na "+ tentativasRealizadas);
        }else{
            System.out.println("Não conseguimos contatar com " + candidato + ", numero maximo de tentativas:  "+ tentativasRealizadas);

        }


    }/* */

    static  boolean  atender(){
        return new Random().nextInt(3) == 1;
    }/* */

    static  void imprimirSelecionados(){
        String [] candidatos ={"Ana Paula", "João", "Carlos", "Antonio","Cícero"};

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato nº: " +(i + 1)  + " -> " + candidatos[i]);
        }
    }/* */

    static void selecaoCandidatos(){
        String [] candidatos ={"Ana Paula", "João", "Carlos", "Antonio","Cícero", "Paulo", "Armando", "Otavio", "Guilherme", "Kleyhon"};
        int candidatosSelecionados =0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { 
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ValorPretendido() ;

            System.out.println("O candidato: " + candidato + " Solicitou o valor de salario R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+"Foi selecionado!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }/* */

    static  double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }/* */


    static void analiseCandiato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato!");

        }else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta!");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos!");

        }

    }/* */

}
