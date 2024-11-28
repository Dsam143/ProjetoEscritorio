package setor;


import java.util.Arrays;
import java.util.Scanner;

public class setorFiscal extends setorPai {
 
    Scanner recebe = new Scanner(System.in);

    public setorFiscal() {
        super("Setor Fiscal");
    }

    public void calcularFaturamento() {
        double[] faturamento = new double[12]; // Array para os 12 meses
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Scanner recebe = new Scanner(System.in);


        for (int i = 0; i < meses.length; i++) {
            System.out.println("Qual foi o faturamento do mês de " + meses[i] + "?");
            faturamento[i] = recebe.nextDouble(); // Recebe o faturamento de cada mês
        }

        recebe.close();

        System.out.println("Faturamento anual: " + Arrays.toString(faturamento));

    }

}

