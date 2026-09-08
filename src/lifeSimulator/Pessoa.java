package lifeSimulator;

public class Pessoa {
    public String nome;
    public String sexo;
    public int idade = 0; 
    public boolean condicaoVida = true;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public void envelhecer() {
        idade++;
    }
    
    
}
