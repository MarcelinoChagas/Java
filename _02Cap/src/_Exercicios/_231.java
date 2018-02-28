// Tabela de quadrados e cubos
package _Exercicios;

public class _231 {
    public static void main(String[]args){                
        int n=0;
        System.out.printf("number    square    cube\n"
                        + "0         %d         %d\n"
                        + "1         %d         %d\n"
                        + "2         %d         %d\n"
                        + "3         %d         %d\n"
                        + "4         %d        %d\n"
                        + "5         %d        %d\n"
                        + "6         %d        %d\n"
                        + "7         %d        %d\n"
                        + "8         %d        %d\n"
                        + "9         %d        %d\n"
                        + "10        %d       %d\n",n*n,n*n*n++,     //0 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //1 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //2 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //3 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //4 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //5 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //6 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //7 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //8 adiciona +1 no proximo n
                                                    n*n,n*n*n++,     //9 adiciona +1 no proximo n
                                                    n*n,n*n*n);      //10                
    }
}
