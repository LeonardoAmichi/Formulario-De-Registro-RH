package Entidades;

import java.util.Date;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao = 0.10;

    public Vendedor(String cargo, double valorVendas, int codigoSetor, double salarioBase ,String telefone, String endereco, String nome, Date dataNascimento, String sexo){
        super(cargo, codigoSetor, salarioBase, telefone, endereco, nome, dataNascimento, sexo);
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao);
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
                "\nCargo: " + super.getCargo() +
                "\nEndereco: " + super.getEndereco() +
                "\nTelefone: " + super.getTelefone() +
                "\nCódigo de setor: " + super.getCodigoSetor() +
                "\nSalário: " + calcularSalario();
    }
}

