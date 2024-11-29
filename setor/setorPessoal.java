package setor;

import java.util.Scanner;

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

    public void calcularDecimoTerceiro() {
        Scanner recebe = new Scanner(System.in);


        System.out.println("Quantos meses trabalhado?");
        int mes = recebe.nextInt();

        System.out.println("Qual o valor do salário?");
        int salarioD = recebe.nextInt();

        decTerc = (salarioD / 12) * mes;

        System.out.println("O valor do décimo terceiro será: R$", decTerc);

    }
}