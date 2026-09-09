package Financeiro;

import lifeSimulator.Pessoa;

public class Financeiro {
    private Pessoa pessoa;
    
    public Financeiro(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void adicionarDinheiro(double valor) {
        pessoa.setDinheiro(pessoa.getDinheiro() + valor);
    }
    
    public void removerDinheiro(double valor) {
        pessoa.setDinheiro(pessoa.getDinheiro() - valor);
    } 
    
}
