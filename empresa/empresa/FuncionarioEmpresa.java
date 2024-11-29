package empresa;

public class FuncionarioEmpresa{
    private String nome;
    private double salario;

    public FuncionarioEmpresa (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
