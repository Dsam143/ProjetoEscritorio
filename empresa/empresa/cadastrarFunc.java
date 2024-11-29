package empresa;

import java.util.Scanner;


public class cadastrarFunc {
    public empresa cadastrar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do funcionário:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite o salário:");
            Double salário = scanner.nextDouble();
            
   

            FuncionarioEmpresa Funcionario = new FuncionarioEmpresa(nome, salário);
            
            System.out.println("Funcionario cadastrado com sucesso!");
            return Funcionario;
        }
    }
}