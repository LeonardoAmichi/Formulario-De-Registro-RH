package Entidades;

import java.util.Date;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String cargo, double ajudaDeCusto, int codigoSetor, String telefone, String endereco, String nome, Date dataNascimento){
        super(cargo, codigoSetor, telefone, endereco, nome, dataNascimento);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return 	"Nome: " + super.getNome() +
                "\nCargo: " + super.getCargo() +
                "\nEndereco: " + super.getEndereco() +
                "\nTelefone: " + super.getTelefone() +
                "\nCódigo de setor: " + super.getCodigoSetor() +
                "\nSalário: " + calcularSalario();
    }

}
