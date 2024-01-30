package cell.internet;

import cell.internet.NavegadorInternet;

public class AppNavegador implements NavegadorInternet{
    public void exibirPagina() {
        System.out.println("EXIBINDO A PAGINA.");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA.");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA.");
    }
}
