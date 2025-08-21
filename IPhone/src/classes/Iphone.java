package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo a página %s no navegador.\n",url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.printf("Adicionando uma nova páginano no navegador.\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Exibindo a página no navegador.\n");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s.\n",numero);
    }

    @Override
    public void atender() {
        System.out.printf("Atendendo o telefone.\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.printf("Iniciando o correio de voz.\n");
    }

    @Override
    public void tocar() {
        System.out.printf("Tocando música.\n");
    }

    @Override
    public void pausar() {
        System.out.printf("Pausando música.\n");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando a música %s.\n",musica);
    }

}
