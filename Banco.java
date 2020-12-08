package banco;

import java.util.ArrayList;
//[35,37,46] cor fundo telas

public class Banco {

    private static ArrayList<Conta> contas;
    private static ArrayList<Funcionario> funcionarios;
 
    public static void main(String[] args) {
        
        //EXERCICIO 7
        Conta c1, c2, c3, c4;
        Funcionario f1, f2, f3;
//        String nome, String cpf, String endereco, Float salario, String matricula, String telefone
        f1 = new Funcionario("ze", "123", "rua do ze", 980.98f,"456", "12412");
        f2 = new Funcionario("maria", "789", "rua da maria", 980.98f,"012", "0000");
        f3 = new Funcionario("joão", "1345", "rua do joao", 9878.90f,"678", "1111");

        
// Exercicio 14
//    Funcionario fun1, fun2, fun3;
//    fun1 = new Funcionario("Ze", "123", "Rua do ze", 480.98f, "456");
//    fun2 = new Funcionario("maria", "789", "Rua da maria", 980.98f, "012");
//    fun3 = new Funcionario("joão", "345", "Rua do joao", 9878.90f, "678");

//    c1 = new Conta(1, 1, 0f, 1000.00f, "abc","998","rua do abc","");
//    c2 = new Conta(2, 1, 2019.00f, 500.00f, "bolinhas","025","rua do bolinhas","");
//    c3 = new Conta(3, 1, -956.98f, 1250.00f, "ferrado","771","rua do ferrado","");
//    c4 = new Conta(4, 1, 395798.00f, 95000.00f, "feliz","001","rua do feliz","");
    
//    Exercicio 17
//    Criando um arraylist de contas
        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    //Exercicio 18
        //criando uma conta
        contas.add(new Conta(1, 1, 0f, 1000.00f, "abc","998","rua do abc",""));
        contas.add(new Conta(2, 1, 2019.00f, 500.00f, "bolinhas","025","rua do bolinhas",""));
        contas.add(new Conta(3, 1, -956.98f, 1250.00f, "ferrado","771","rua do ferrado",""));
        contas.add(new Conta(4, 1, 395798.00f, 95000.00f, "feliz","001","rua do feliz",""));
        funcionarios.add(new Funcionario("ze", "123", "rua do ze", 980.98f,"456", "12412"));
        funcionarios.add(new Funcionario("maria", "789", "rua da maria", 980.98f,"012", "0000"));
        funcionarios.add(new Funcionario("joão", "1345", "rua do joao", 9878.90f,"678", "1111"));
        //criando uma conta com parâmetros
//        contas.add(new Conta(1,4,"Marcos"));
        
//        funcionarios.add(fun1);
//        funcionarios.add(fun2);
//        funcionarios.add(fun3);
        //for apenas para percorrer todo o array
        for (Conta c : contas) {
            System.out.println("Nome: "+c.getTitular());
        }
    //Exercicio 19
        System.out.println("\n");
        //for apenas para percorrer todo o array com o for lambda
        System.out.println("Contas cadastradas:");
        contas.forEach(c -> {
        
            System.out.println("Nome: "+c.toString());
        });
        System.out.println("\n");
        //for apenas para percorrer todo o array com o for lambda
        System.out.println("Funcionarios cadastrados: ");
        funcionarios.forEach(c -> {
            
            System.out.println("Nome: "+c.toString());
        });
        java.awt.EventQueue.invokeLater(() -> {
           new TelaFuncionario(funcionarios).setVisible(true); 
        });

        java.awt.EventQueue.invokeLater(() -> {
           new TelaBanco(contas , funcionarios).setVisible(true); 
        });
        

    }
}
