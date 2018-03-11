//313 - Exercicio Classe EmployeeTest
package _Exercicios;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Employee employ = new Employee("Marcelino","Chagas", 1000);
        Employee employ2 = new Employee("Pedro","Chagas", 2000);
                      
        System.out.printf("Nome: %s\n"
                        + "Sobrenome: %s\n"
                        + "Salario: R$ %.2f\n\n",employ.getNome(),employ.getSobrenome(),employ.getSalario());
        
        System.out.printf("Nome: %s\n"
                        + "Sobrenome: %s\n"
                        + "Salario: R$ %.2f\n\n",employ2.getNome(),employ2.getSobrenome(),employ2.getSalario());
        
        System.out.println("AUMENTO DE 10% NO SALÁRIO \n");
        
        System.out.printf("Nome: %s\n"
                        + "Sobrenome: %s\n"
                        + "Salario: R$ %.2f\n\n",employ.getNome(),employ.getSobrenome(),employ.getSalario()+(employ.getSalario()*0.10));
        
        System.out.printf("Nome: %s\n"
                        + "Sobrenome: %s\n"
                        + "Salario: R$ %.2f\n\n",employ2.getNome(),employ2.getSobrenome(),employ2.getSalario()+(employ2.getSalario()*0.10));
        
    }
}
