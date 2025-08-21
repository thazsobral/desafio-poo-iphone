import classes.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        System.out.println("Testando o Reprodutor musical");
        meuIphone.selecionarMusica("Furacão 2000");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println("-----------------------------");

        System.out.println("Testando o Telefone");
        meuIphone.ligar("123-546-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println("-------------------");
        
        System.out.println("Testando o Navegador de Internet");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println("--------------------------------");
    }
}
