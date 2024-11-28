package main;

import empresa.boletoEmpresa;
import empresa.cadastrarEmpresa;
import empresa.empresa;
import setor.setorContabil;
import setor.setorFiscal;
import setor.setorPessoal;


public class principal {
    public static void main(String[] args) {

        cadastrarEmpresa cadastrarEmpresa = new cadastrarEmpresa();
        empresa empresa = cadastrarEmpresa.cadastrar();


        empresa.exibirDados();


        setorFiscal setorFiscal = new setorFiscal();
        setorPessoal setorPessoal = new setorPessoal();
        setorContabil setorContabil = new setorContabil();

        // Atividades dos setores
        setorFiscal.realizarAtividades();
        setorFiscal.calcularFaturamento();

        setorPessoal.realizarAtividades();
        setorPessoal.processarFolhaPagamento();
        setorPessoal.calcularDecimoTerceiro();

        setorContabil.realizarAtividades();
        setorContabil.emitirBoleto();
        setorContabil.realizarFaturamento();

        // Boletos
        boletoEmpresa boletos = new boletoEmpresa();
        boletos.gerarBoleto("1500.00");
        boletos.listarBoletos();
    }
}
