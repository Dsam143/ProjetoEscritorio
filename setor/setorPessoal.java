package setor;

public class setorPessoal extends setorPai implements data {
    public setorPessoal() {
        super("Setor Pessoal");
    }

    public void data(){
        System.out.println("Lembrar do prazo até o dia 20");
    }

    public void realizarAtividades() {
        System.out.println("Atividades do setor: " + nome);
    }

    public void processarFolhaPagamento() {
        System.out.println("Processando folha de pagamento...");
    }

    public void calcularDecimoTerceiro() {
        System.out.println("Calculando décimo terceiro...");
    }
}