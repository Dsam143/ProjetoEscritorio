package empresa;

import java.util.Scanner;

public class cadastrarEmpresa {
    public empresa cadastrar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome da empresa:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite o CNPJ da empresa:");
            String cnpj = scanner.nextLine();
            
            System.out.println("Digite o capital social da empresa:");
            double capitalSocial = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Digite o nome do sócio administrador:");
            String socio = scanner.nextLine();
            
            System.out.println("Digite o endereço da empresa:");
            String endereco = scanner.nextLine();
            
   

            empresa empresa = new empresa (nome, cnpj, capitalSocial, socio, endereco);
            
            System.out.println("Empresa cadastrada com sucesso!");
            return empresa;
        }
    }
}
