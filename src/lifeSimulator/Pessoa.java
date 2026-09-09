package lifeSimulator;

import Emprego.Emprego;
import java.util.Random;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade; 
    private double dinheiro;
    private int inteligencia; 
    private int saude; 
    public boolean condicaoVida;
    Random random = new Random();
    
    private Emprego emprego;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.saude = saude;
        this.idade = 0;
        this.dinheiro = 0;
        this.inteligencia = random.nextInt(51) + 50;
        this.saude = 100;
        this.condicaoVida = true;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }
    
    
    public boolean isCondicaoVida() {
        return condicaoVida;
    }
    
    
    
    public void envelhecer() {
        idade++;
    }
    
    
}
