package _Exercicios;

import java.util.Scanner;

public class _233 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        float peso, altura;
        
        System.out.println("*****Bem Vindo a Calculadora de IMC");
        System.out.printf("BMI VALUES\n"
                        + "Underweight: less than 18.5\n"
                        + "Normal: between 18.5 and 24.9\n"
                        + "Overweight: between 25 and 29.9\n"
                        + "Obese: 30 or greater\n");
        System.out.print("\nDigite o valor do seu Peso em (KG): ");
        peso = input.nextFloat();
        System.out.print("\nDigite o valor da sua Altura em (Metros): ");
        altura = input.nextFloat();
        System.out.printf("Seu IMC é: %.2f\n",peso/(altura*altura));
    
        
    }
}
