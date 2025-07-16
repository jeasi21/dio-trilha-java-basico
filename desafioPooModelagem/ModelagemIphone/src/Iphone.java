public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico  {

    @Override
    public void Pausar() {
        System.out.println("Musica Pausada!");
        
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
        
    }

    @Override
    public void Tocar() {
        System.out.println("A música está tocando!!!");
        
    }

    

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova Aba Adicionada!");
        
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Página Atualizada!");
        
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.println("Exibindo pagina: "+ url);
        
    }

   

    @Override
    public void Atender() {
        System.out.println("Chamada atendida!");
        
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
        
    }

    @Override
    public void Ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        
    }

}
