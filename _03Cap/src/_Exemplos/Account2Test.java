package _Exemplos;
import java.util.Scanner;

public class Account2Test {
    public static void main(String[]args){
        Account2 account1 = new Account2("Jane Green", 50.00);
        Account2 account2 = new Account2("John Blue", -7.53);
        
        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(),account2.getBalance());
        
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        
        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",account2.getName(),account2.getBalance());
    }
}
