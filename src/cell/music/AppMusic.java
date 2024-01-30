package cell.music;

import cell.music.ReprodutorMusical;

public class AppMusic implements ReprodutorMusical {

    public void tocar() {
        System.out.println("TOCANDO MÚSICA.");
    }
    public void pausar() {
        System.out.println("MÚSICA PAUSADA.");
    }
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA.");
    }
}
