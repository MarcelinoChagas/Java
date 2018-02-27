package _Exemplos;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        System.out.printf("\nA Soma e: %d ", n1+n2);
    }    
}
