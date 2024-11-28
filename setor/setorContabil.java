package setor;

public class setorContabil extends setorPai {
    public setorContabil() {
        super("Setor Contábil");
    }

    public void emitirBoleto() {
        System.out.println("Emitindo boleto...");
    }

    public void realizarFaturamento() {
        System.out.println("Realizando faturamento...");
    }
}