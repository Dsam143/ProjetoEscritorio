package setor;

public class setorPai {
    protected String nome;

    public setorPai(String nome) {
        this.nome = nome;
    }

    public void realizarAtividades() {
        System.out.println("Atividades do setor: " + nome);
    }
}