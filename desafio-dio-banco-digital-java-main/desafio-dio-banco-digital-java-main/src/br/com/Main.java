package br.com;

public class Main {

    public static void main(String[] args) {

        Cliente vinicius = new Cliente("Vinícius", "55898745102", "478569978");
        Cliente sara = new Cliente("Sara", "55899863221", "4158698525");
        Cliente lucca = new Cliente("Lucca", "41023156878", "5648752136");
        Cliente luiggi = new Cliente("Luiggi", "41025647878", "5647845136");

        Conta ccVinicius = new ContaCorrente(vinicius);
        Conta cpVinicius = new ContaPoupanca(vinicius);
        Conta ccSara = new ContaCorrente(sara);
        Conta ccLucca = new ContaCorrente(lucca);
        Conta cpLuiggi = new ContaPoupanca(luiggi);

        ccVinicius.depositar(100);
        ccVinicius.transferir(50.5, cpVinicius);

        ccVinicius.imprimirExtrato();
        cpVinicius.imprimirExtrato();

        ccVinicius.dadosDoCliente();

    }

}
