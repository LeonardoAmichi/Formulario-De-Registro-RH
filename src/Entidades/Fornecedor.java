package Entidades;

import java.util.Date;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String telefone, String endereco, String nome, Date dataNascimento, String sexo){
        super(nome, endereco, telefone, dataNascimento, sexo);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
                "\nEndereco: " + super.getEndereco() +
                "\nTelefone: " + super.getTelefone() +
                "\nValor Crédito: " + valorCredito +
                "\nValor Dívida: " + valorDivida;
    }
}


