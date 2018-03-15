//Exercicios 438 - Impondo privacidade com criptografia

package _Exercicios;

public class Criptografia {
    private int n1;
    private int n2;
    private int n3;
    private int n4;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }


    
    public void Criptografado(int numero){
        n1 = ((numero/1000) + 7);
        setN1(n1);
        n2 = (((numero/100)%10) + 7);
        setN2(n2);
        n3 = (((numero/10)%10)+7);
        setN3(n3);
        n4 = ((numero%10)+7);
        setN4(n4);
        
        System.out.printf("Criptografado: F-WSdfew%dGvDdhy%dEo19jf31%doKqwfc%d\n",n2,n1,n4,n3);
    }
    public int Descrip(int num){
        
        return num;
    }
    public void Descriptografado(){
       int a = n1;
       int b = n2;
       int c = n3;
       int d = n4;
       
       a = (a-7);
       b = (b-7);
       c = (c-7);
       d = (d-7);
       
       System.out.printf("Descriptografado: %d %d %d %d\n",a,b,c,d);
    }
}
