package _Exemplos;

public class Account {
    private String name;
    
    // o construtor inicializa name com o nome do parâmetro
    public Account(String name){ // o nome do construtor é nome da classe
        this.name = name;
    }
    // método para definir o nome no objeto
    public void setName(String name){
        this.name = name;  // armazena o nome
    }
    
    // método para recuperar o nome do objeto
    public String getName(){
        return name;
    }
}
