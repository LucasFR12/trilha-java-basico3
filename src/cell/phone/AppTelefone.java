package cell.phone;

import cell.phone.AparelhoTelefonico;
public class AppTelefone  implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("LIGANDO...");
    }
    public void atender() {
        System.out.println("ATENDENDO O TELEFONE.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ.");
    }
}
