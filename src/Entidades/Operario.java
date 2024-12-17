package Entidades;

import java.util.Date;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao = 0.10;

    public Operario(String cargo, double valorProducao, int codigoSetor, String telefone, String endereco, String nome, Date dataNascimento){
        super(cargo, codigoSetor, telefone, endereco, nome, dataNascimento);
        this.valorProducao = valorProducao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao);
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
