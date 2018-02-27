package _Exercicios;
import java.util.Scanner;

public class _216 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Digite um numero A");
        a = input.nextInt();
        System.out.println("Digite um numero B");
        b = input.nextInt();
        
        if(a > b)
            System.out.println("A > B");
        if(a < b)
            System.out.println("A < B");
        if(a != b) {
        } else {
            System.out.println("A = B");
        }
    }
}
