package br.com;

/**
 *
 * @author vinivilasboas
 */

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-- EXTRATO DE CONTA CORRENTE --");
        super.imprimirInfosComuns();
    }

}
