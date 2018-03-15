package _Exemplos;
//Do While Executa ao menos 1 vez.

public class DoWhileTest {
    public static void main(String[]args){
        int counter = 1;
        
        do{
            System.out.printf("%d ", counter);
            ++counter;
        }while (counter <= 10);
        
        System.out.println();
    }
}
