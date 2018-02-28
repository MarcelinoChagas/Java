//Separando os digitos em um inteiro
//author Marcelino Chagas
package _Exercicios;
import java.util.Scanner;

public class _230 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.print("Digite um numero inteiro de 5 digitos: ");
        num = input.nextInt();
        /*
        * Divide o valor pela 1* (quantidade de zero que define o número) e modulo para resto da divisao de int
        */
        System.out.printf("%d   %d   %d   %d   %d"
                         +"\n",num/10000, (num/1000)%10, (num/100)%10, (num/10)%10, num%10); 
    }    
}
