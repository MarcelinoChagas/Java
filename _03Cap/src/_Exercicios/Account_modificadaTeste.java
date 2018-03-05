// Classe Account modificada
package _Exercicios;
import java.util.Scanner;

public class Account_modificadaTeste {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        Account_modificada account = new Account_modificada("Marcelino", 100);
        double deposito, debito;
        
        System.out.println("Seu saldo Atual R$ "+ account.getBalance());
        System.out.print("Digite o valor do deposito: ");
        deposito = input.nextDouble();
        account.deposit(deposito);
        System.out.println("Seu saldo Atual R$ "+ account.getBalance());
        System.out.print("Digite o valor do debito: ");
        debito = input.nextDouble();
        account.withdraw(debito);
        System.out.println("Seu saldo Atual R$ "+ account.getBalance());
        
        
    }
}
