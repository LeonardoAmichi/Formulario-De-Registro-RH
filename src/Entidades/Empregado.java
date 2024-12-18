package Entidades;

import java.util.Date;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto = 0.15;
    private String cargo;

    Empregado(String cargo, int codigoSetor, double salarioBase, String telefone, String endereco, String nome, Date dataNascimento, String sexo){
        super(nome, endereco, telefone, dataNascimento, sexo);
        this.codigoSetor = codigoSetor;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }
    

    public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double calcularSalario() {
        return salarioBase -(salarioBase * imposto);
    }
}

