package _Exercicios;
import java.util.Scanner;
public class _217 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Digite o valor de A: ");
        a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        c = input.nextInt();
        
        System.out.printf("A soma: %d"
                        + "\nA média: %d\n",a+b+c,(a+b+c)/3);
    }
}
