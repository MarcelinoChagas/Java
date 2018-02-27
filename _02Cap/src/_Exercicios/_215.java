package _Exercicios;
import java.util.Scanner;

public class _215 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        n2 = input.nextInt();
        if(n2 == 0)
            System.out.println("Não é possivel dividir por zero");
        else
        System.out.printf("\nSoma: %d"
                        + "\nSubtracao: %d"
                        + "\nMultiplicação: %d"
                        + "\nDivisao: %d\n",n1+n2,n1-n2,n1*n2,n1/n2);
    }
}
