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
public class Funcionario extends Cliente implements Autentica{

    private String matricula;
    private String telefone;
    private float salario;
    
    public Funcionario() {
        super();
        this.matricula = "";
        this.salario = 0;
    }
    public Funcionario(String nome, String cpf, String endereco, Float salario, String matricula, String telefone){
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.salario = salario;
        this.telefone = telefone;
    }

///////////////////////////////////////////   
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

///////////////////////////////////////////    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
///////////////////////////////////////////    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
  
    
/////////////////////////////////////////// 
    @Override
        public String getDados(){
            return nome + "|" + telefone + "|" + endereco + "|" + cpf;
        }
    @Override
	public String toString() {
		return "Nome: " + this.getNome()
                       + ", Cpf: " + this.getCpf()
                       + ", Matricula: " + this.getMatricula()
                       + ", Cidade: " + this.getSalario();
	}
    @Override
    public boolean getAutentica(String senha) {
        if(senha.equals(this.matricula)){
           return true;
        }else{
            return false;
        }
    }
}
