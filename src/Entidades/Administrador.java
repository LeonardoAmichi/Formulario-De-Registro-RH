package Entidades;

import java.util.Date;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String cargo, double ajudaDeCusto, int codigoSetor, double salarioBase,String telefone, String endereco, String nome, Date dataNascimento, String sexo){
        super(cargo, codigoSetor, salarioBase, telefone, endereco, nome, dataNascimento, sexo);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

   
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
