package empresa;

public class empresa {
    private String nome;
    private String cnpj;
    private double capitalSocial;
    private String socioAdministrador;
    private String endereco;

    public empresa (String nome, String cnpj, double capitalSocial, String socioAdministrador, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.capitalSocial = capitalSocial;
        this.socioAdministrador = socioAdministrador;
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Capital Social: " + capitalSocial);
        System.out.println("Sócio Administrador: " + socioAdministrador);
        System.out.println("Endereço: " + endereco);
    }
}
