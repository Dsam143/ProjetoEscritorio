package setor;

public class setorContabil extends setorPai {
    public setorContabil() {
        super("Setor Contábil");
    }

    public void realizarAtividades() {
        System.out.println("Atividades do setor: " + nome);
    }

    public void emitirBoleto() {
        System.out.println("Emitindo boleto...");
    }

    public void realizarFaturamento() {
        System.out.println("Realizando faturamento...");
    }
}