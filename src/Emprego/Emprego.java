package Emprego;

public class Emprego {
    private String nome; 
    private double salario; 
    private int intNecessaria; 

    public Emprego(String nome, double salario, int intNecessaria) {
        this.nome = nome;
        this.salario = salario;
        this.intNecessaria = intNecessaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIntNecessaria() {
        return intNecessaria;
    }

    public void setIntNecessaria(int intNecessaria) {
        this.intNecessaria = intNecessaria;
    }
    
    
    
    
}
