package setor;


import java.util.Arrays;
import java.util.Scanner;


public class setorFiscal extends setorPai implements data{
 
    Scanner recebe = new Scanner(System.in);

    public void realizarAtividades() {
        super.realizarAtividades();
    }

   public void data(){
        System.out.println("O prazo de entrega é até o dia 15");
    }

    public setorFiscal() {
        super("Setor Fiscal");
    }

    public void calcularFaturamento() {
        double[] faturamento = new double[11]; // Array para os 12 meses
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Scanner recebe = new Scanner(System.in);


        for (int c = 0; c < meses.length; c++) {
            System.out.println("Qual foi o faturamento do mês de " + meses[c] + "?");
            faturamento[c] = recebe.nextDouble(); // Recebe o faturamento de cada mês
        }

        recebe.close();

        System.out.println("Faturamento anual: " + Arrays.toString(faturamento));

    }

}

