//312 - Exercicio Classe Invoice
package _Exercicios;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[]args){
        String numero, descricao;
        int qtd;
        double preco;
        
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice("0001", "Leite", 1, 10.00);
        
        System.out.print("Digite o numero do produto: ");
        numero = input.next();
        invoice.setNumero(numero);
        System.out.print("Digite a descricao do produto: ");
        descricao = input.next();
        invoice.setDescricao(descricao);
        System.out.print("Digite a quantidade do produto: ");
        qtd = input.nextInt();
        invoice.setQtd(qtd);
        System.out.print("Digite o preco do produto: ");
        preco = input.nextDouble();
        invoice.setPreco(preco);

        System.out.println("O valor da fatura e: "+ invoice.getInvoiceAmount());
    }
}
