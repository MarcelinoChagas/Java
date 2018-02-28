// Diâmetro, circunferênciae área de um círculo
package _Exercicios;
import java.util.Scanner;

/**
 * @author Marcelino Chagas
 */
public class _228 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r;
        
        System.out.print("Digite um valor para o raio: ");
        r = input.nextInt();
        System.out.printf("\nDiâmetro: %d", 2 * r);
        System.out.printf("\nCircunferencia: %.2f", (2 * Math.PI) * r );
        System.out.printf("\nÁrea: %.2f\n", Math.PI * (r * r));
    }
}
