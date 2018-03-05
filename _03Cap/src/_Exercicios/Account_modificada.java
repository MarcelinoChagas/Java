// Classe Account modificada
package _Exercicios;

public class Account_modificada {
    private String name;
    private double balance;

    public Account_modificada(String name, double balance) {
        this.name = name;
        
        if(balance> 0.0)
            this.balance = balance;
        
    }
    
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            balance = balance + depositAmount;
        
    }
    
    public void withdraw(double remove){
        if(remove <= balance)
            balance = balance - remove;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
            
    public double getBalance() {
        return balance;
    }
  
}
