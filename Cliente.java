package banco;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcos Lima
 */
public class Cliente extends Pessoa implements Autentica{

    
    public Cliente() {
        nome = "";
        cpf = "";
        endereco = "";
        telefone = "";
    }
    
    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = "";
    }
    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
     public Cliente(String nome) {
        this.nome = nome;
        cpf = "";
        endereco = "";
        telefone = "";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    @Override
        public String getDados(){
            return nome + "|" + telefone + "|" + endereco + "|" + cpf;
        }
    
    @Override
	public String toString() {
		return "Nome: " + this.getNome()
                       + ", Cpf: " + this.getCpf()
                       + ", Endereço: " + this.getEndereco()
                       + ", Telefone: " + this.getTelefone();
	}

        @Override
    public boolean getAutentica(String senha) {
        if(senha.equals(this.cpf)){
            return true;
        }else{
            return false;
        }
    }
    
}
