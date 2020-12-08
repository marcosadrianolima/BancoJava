package banco;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Conta {
    
    private int numero;
    private int agencia;
    private float saldo;
    private float limite;
    private StringBuilder log;
    private ArrayList<Cliente> titular;
    ArrayList<Cliente> cliente = new ArrayList<>();
    
    
    public Conta(){
        numero = 0;
        agencia = 0;
        saldo = 0;
        limite = 0;
        this.titular = new ArrayList<Cliente>();
        this.titular.add(new Cliente());
        log = new StringBuilder();
    }
    
    public Conta(int numero, int agencia, float saldo, float limite){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.limite = 0;
        //titular = new Pessoa();
        this.titular = new ArrayList<>();
        this.titular.add(new Cliente());
        log = new StringBuilder();
    }
    
    public Conta(int numero, int agencia, String nome){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        //titular = new Pessoa(nome);
        this.titular = new ArrayList<>();
        this.titular.add(new Cliente(nome));
        log = new StringBuilder();
    }
    
    
    public Conta(int numero, int agencia, float saldo, float limite, String nome, String cpf, String endereco){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        //titular = new Pessoa(nome, cpf, endereco);
        this.titular = new ArrayList<>();
        this.titular.add(new Cliente(nome, cpf, endereco));
        log = new StringBuilder();
    }
    public Conta(int numero, int agencia, float saldo, float limite, String nome, String cpf, String endereco, String telefone){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        //titular = new Pessoa(nome, cpf, endereco, telefone);
        this.titular = new ArrayList<>();
        this.titular.add(new Cliente(nome, cpf, endereco));
        log = new StringBuilder();
    }
    public Conta(int numero, String nome){
        this.numero = numero;
        //titular = new Pessoa(nome);
        this.titular = new ArrayList<>();
        this.titular.add(new Cliente(nome));
    }

            
    //MÉTODOS
    
    public boolean sacar(float valor, Funcionario funcionario){
//        StringBuilder titulares = new StringBuilder();
//            this.getTitular().forEach(c->{
//                titulares.append("Titulares"+"\nNome: "+c.getNome()+ " CPF: "+c.getCpf());
//            });
        if((this.getSaldo() + this.getLimite()) < valor){
            return false;
        }else{
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        
    }
    
    public boolean depositar(float valor, Funcionario funcionario){
        this.setSaldo(this.getSaldo() + valor); 
        return true;
    }
    
    public StringBuilder Extrato(){
        StringBuilder a = this.getLog();
        return a;
    }
    
    public boolean transferir(Conta conta, float valor, Funcionario funcionario){
        if(this.sacar(valor, funcionario)){
            conta.setSaldo(conta.getSaldo() + valor);
            return true;
        }else{
            return false;
        }
    }
    
    public void gravaLog(String operacao, String status, float valor, int destino, String matricula){
        this.getLog().append(getDataAtual()).append(" ")
                .append(matricula).append(" ")
//                .append(cpf).append(" ")
                .append(operacao).append(" ")
                .append(status).append(" ")
                .append(NumberFormat.getCurrencyInstance().format(valor)).append(" ")
                .append(destino).append("\n");
          
    }

    private String getDataAtual() {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyy HH:MM:SS");
        return sd.format(new Date(System.currentTimeMillis()));
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public float getLimite() {
        return this.limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    
    public StringBuilder getLog() {
        return this.log;
    }

    
    public void setTitular(ArrayList<Cliente> titular){
        this.titular = titular;
    }
    public ArrayList<Cliente> getTitular(){
        return titular;
    }
//    public void teste(){
//        for (Pessoa pessoa : titular) {
//            pessoa.getNome();
//        }
//    }
///////////////////////////////////////////    
    @Override
	public String toString() {
		return "Agência: " + this.getAgencia()
                       + ", Conta Nº: " + this.getNumero();
	}

}


