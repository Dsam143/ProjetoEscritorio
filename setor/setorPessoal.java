package setor;

public class setorPessoal extends setorPai {
    public setorPessoal() {
        super("Setor Pessoal");
    }

    public void processarFolhaPagamento() {
        System.out.println("Processando folha de pagamento...");
    }

    public void calcularDecimoTerceiro() {
        System.out.println("Calculando décimo terceiro...");
    }
}