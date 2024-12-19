package Entidades;

import java.util.Date;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto = 0.15;
    private String cargo;
    
    
    public Empregado(int codigoSetor, double salarioBase) {
    	this.codigoSetor = codigoSetor;
    	this.salarioBase = salarioBase;
    }

    public Empregado(String cargo, int codigoSetor, double salarioBase, String telefone, String endereco, String nome, Date dataNascimento, String sexo){
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
    
    public boolean isValidCodigoSetor(String codigoSetor) {
        return codigoSetor != null && !codigoSetor.trim().isEmpty() && codigoSetor.matches("\\d+") && Integer.parseInt(codigoSetor) >= 0;
    }
    
    public boolean isValidSalario(String salario) {
        return salario != null && !salario.trim().isEmpty() && salario.matches("\\d+") && salario.length() < 7 && Double.parseDouble(salario) >= 0;
    }


    public double calcularSalario() {
        return salarioBase -(salarioBase * imposto);
    }
}

