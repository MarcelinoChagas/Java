//313 - Exercicio Classe Invoice
package _Exercicios;

public class Invoice {
    private String numero;
    private String descricao;
    private int qtd;
    private double preco;

    public Invoice(String numero, String descricao, int qtd, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getInvoiceAmount(){
        double fatura;
        if((qtd < 0) || (preco < 0))
            fatura = 0.0;
        else
            fatura = qtd * preco;
        
        return fatura;
    }
    
}
