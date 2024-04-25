package dio.desafio.conta;

import java.util.Scanner;

public class ContaTerminal {
    public int numeroConta;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setNomeCliente( String cliente){
        this.nomeCliente = cliente;
    }

    public  void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Bem vindo ao terminal bancário! \n" +
                "Informe alguns dados da sua conta a seguir.");

        System.out.println("Informe o numero da sua Conta: ");
        int numeroConta = input.nextInt();
        conta.setNumeroConta(numeroConta);

        System.out.println("Informe a sua agência: ");
        String agencia = input.next();
        conta.setAgencia(agencia);

        System.out.println("Informe seu nome: ");
        String nome = input.next();
        conta.setNomeCliente(nome);

        System.out.println("Informe seu saldo:");
        double saldo = input.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("Olá " + conta.nomeCliente + " obrigado por criar uma conta em nosso banco, \n" +
                "sua agência é " + conta.agencia + " conta " + conta.numeroConta + " e seu saldo R$" + conta.saldo + "\n" +
                "disponível para saque!");
    }
}


