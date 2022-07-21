package br.com;

/**
 *
 * @author vinivilasboas
 */

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-- EXTRATO DE CONTA POUPANÇA --");
        super.imprimirInfosComuns();
    }

}
