package Entidades;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataNascimento;
    private String sexo;
    
    public Pessoa() {
        // Inicializando os atributos com valores padrão
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
        this.dataNascimento = new Date(); // Inicializa com a data atual
        this.sexo = "";
    }

    public Pessoa(String nome, String endereco, String telefone, Date dataNascimento, String sexo){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
        else
            System.out.println("ERRO!");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isValidNome(String nome) {
        return nome != null && nome.matches("[a-zA-Z ]+");
    }
    
    public boolean isValidTelefone(String telefone) {
        return telefone != null && telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}");
    }
    
    public boolean isValidEndereco(String endereco) {
        return endereco != null;
    }
    

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}


