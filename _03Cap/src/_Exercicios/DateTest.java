// 314 Classe DateTest 
package _Exercicios;
import java.util.Scanner;

public class DateTest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Date data = new Date(0,0,0);
        
        int d,m,a;
        
        System.out.print("Dia: ");
        d = input.nextInt();
        data.setDia(d);
        System.out.print("Mês: ");
        m = input.nextInt();
        data.setMes(m);
        System.out.print("Ano: ");
        a = input.nextInt();
        data.setAno(a);
        
        data.displayDate();
        System.out.println("");
                
    }
}
