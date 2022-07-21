package br.com;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author vinivilasboas
 */

@Getter @Setter

public abstract class Conta implements IConta{

    @Getter private int agencia;
    @Getter private int numero;
    @Getter private double saldo;
    @Getter protected Cliente cliente;
    protected Banco banco = new Banco(); // parâmetro para instanciar o banco

    // implementação de agência padrão de valor 1
    private static final int AGENCIA_PADRAO = 1;
    /** implementação sequencial de número
     * de conta corrente ou poupança */
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        // base para impressão de extratos
        System.out.println("===============================");
        System.out.println(String.format("Titular: %s", this.getCliente().getNome()));
        System.out.println(String.format("Agência: %03d", this.getAgencia()));
        System.out.println(String.format("Conta: %08d", this.getNumero()));
        System.out.println(String.format("Saldo %.2f", this.getSaldo()));
        System.out.println(this.banco.getNome());
        System.out.println("===============================");
        System.out.println("");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor); // retira o valor da conta de origem
        contaDestino.depositar(valor); // deposita o valor para a conta destino
    }

    @Override
    public void dadosDoCliente() {
        System.out.println(this.getCliente().toString());
    }

}
