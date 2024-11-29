package empresa;

import java.util.ArrayList;
import java.util.List;

public class boletoEmpresa {
    private List<String> boletos;

    public boletoEmpresa() {
        this.boletos = new ArrayList<>();
    }

    public void gerarBoleto(String valor) {
        boletos.add("Boleto gerado no valor de R$ " + valor);
        System.out.println("Boleto gerado com sucesso!");
    }

    public void listarBoletos() {
        System.out.println("Boletos emitidos:");
        for (String boleto : boletos) {
            System.out.println(boleto);
        }
    }
}
