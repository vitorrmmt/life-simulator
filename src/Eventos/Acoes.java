package Eventos;

import Emprego.Emprego;
import Financeiro.Financeiro;
import java.util.Random;
import lifeSimulator.Pessoa;

public class Acoes {
    Random random = new Random();
    private Financeiro financeiro;
    private Emprego emprego;
    
    public Acoes(Pessoa pessoa) {
        financeiro = new Financeiro(pessoa);
    }
    
    public void trabalhar(Pessoa pessoa) {
        double ganhos = 0;
        if(pessoa.getEmprego() != null) {
            System.out.println("Você trabalhou de: "+ pessoa.getEmprego());
            ganhos = emprego.getSalario();
            pessoa.setDinheiro(pessoa.getDinheiro() + ganhos);
        }
        else {
            System.out.println("Voce trabalhou!");
            ganhos = random.nextInt(101) + 50;
            System.out.println("Ganhos: "+ ganhos);
        
        }
        
            System.out.println("VOCÊ TRABALHOU! ");
            System.out.println("GANHOS: "+ ganhos);
            financeiro.adicionarDinheiro(ganhos);
    }
    
    public void estudar() {
        int aumentoInt = random.nextInt(6);
        System.out.println("VOCÊ ESTUDOU! ");
        System.out.println("");
    }
    
}
