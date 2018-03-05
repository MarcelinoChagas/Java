package _Exemplos;

public class Account2 {
    private String name;
    private double balance;
    
    public Account2(String name, double balance){
        this.name = name; // Atribui name à váriavel de instância name
        
        /*Valida que o balance é maior que 0.0; se não for
        a variável de instância balance mantém seu valor inicial padrão 0.0
        */
        if (balance > 0.0) // se o saldo for válido
            this.balance = balance; // o atribui à variável de instância balance
    }
    
    // metodo que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount;
    }
    
    // metodo retorna o saldo da conta
    public double getBalance(){
        return balance;
    }
    
    // metodo que define o nome
    public void setName(String name){
        this.name = name;
    }
    
    // metodo que retorna o nome
    public String getName(){
        return name; // retorna o valor de name ao chamador
    }
}
