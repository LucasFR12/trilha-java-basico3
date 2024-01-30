package cell;

import cell.music.ReprodutorMusical;
import cell.phone.AparelhoTelefonico;
import cell.internet.NavegadorInternet;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("TOCAR MUSICA");
    }
    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA.");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO PARA FULANO.");
    }
    @Override
    public void atender() {
        System.out.println("ATENDENDO O TELEFONE.");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PAGINA.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA.");
    }
}
