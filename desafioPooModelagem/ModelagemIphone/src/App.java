public class App {
    public static void main(String[] args) throws Exception {
        Iphone player = new Iphone();
        player.SelecionarMusica("Send me an angel!");
        player.Tocar();
        player.Pausar();
        System.out.println("\n");
        
        Iphone telefone = new Iphone();
        telefone.Ligar("123456789");
        telefone.IniciarCorreioVoz();
        telefone.Atender();
        System.out.println("\n");

        Iphone navegador = new Iphone();
        navegador.ExibirPagina("https://google.com");
        navegador.AtualizarPagina();
        navegador.AdicionarNovaAba();

        
        
    }

    
}
