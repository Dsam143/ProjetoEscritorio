package setor;


import java.util.Arrays;
import java.util.Scanner;

public class setorFiscal extends setorPai {

    Scanner recebe = new Scanner(System.in);

    public setorFiscal() {
        super("Setor Fiscal");
    }

    public void calcularFaturamento() {
        double[] faturamento = new double[11];

        System.out.println("Qual foi o faturamento do mês de Janeiro?");
        faturamento[0] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Fevereiro?");
        faturamento[1] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Março?");
        faturamento[2] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Abril?");
        faturamento[3] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Maio?");
        faturamento[4] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Junho?");
        faturamento[5] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Julho?");
        faturamento[6] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Agosto?");
        faturamento[7] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Setembro?");
        faturamento[8] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Outubro?");
        faturamento[9] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Novembro?");
        faturamento[10] = recebe.nextDouble();

        System.out.println("Qual foi o faturamento do mês de Dezembro?");
        faturamento[11] = recebe.nextDouble();

        recebe.close();

        System.out.println(Arrays.toString(faturamento));
        
    }
}
