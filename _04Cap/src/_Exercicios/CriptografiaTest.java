package _Exercicios;
import java.util.Scanner;

public class CriptografiaTest {
    public static void main(String[]args){
        
        int numero;
        
        Scanner input = new Scanner(System.in);
        Criptografia cript = new Criptografia();
        
        System.out.print("Digite um numero de 4 digitos: ");
        numero = input.nextInt();
        cript.Criptografado(numero);
        cript.Descriptografado();
        
    }
}
