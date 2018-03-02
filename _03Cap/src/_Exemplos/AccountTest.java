package _Exemplos;
import java.util.Scanner;

public class AccountTest {
        public static void main(String[]args){
            Scanner input = new Scanner (System.in);
            
            // cria um objeto Account e atribui a myAccount
            Account myAccount = new Account("Marcelino");
            
            // é possivel criar vários objetos Account e atribuir um valor para cada constructor
            Account account1 = new Account("Gomes");
            Account account2 = new Account("Chagas");
            
           // exibe o valor inicial do nome (null)
           System.out.printf("Initial name is: %s%n%n", myAccount.getName());
           
           // solicita e lê o nome
           System.out.println("Please enter the name: ");
           String theName = input.nextLine();
           myAccount.setName(theName); //insere the name em myAccount como parametro
            System.out.println();
            
            // exibe o nome armazenado no objeto myAccount
            System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
            System.out.printf("Name in object account1 is: %n%s%n",account1.getName());
            System.out.printf("Name in object account2 is: %n%s%n",account2.getName());

        }
}
