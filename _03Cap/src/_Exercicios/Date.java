// 314 Classe Date
package _Exercicios;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
              
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void displayDate(){
        System.out.printf("%d / %d / %d",getDia(),getMes(),getAno());
    }
    
}
