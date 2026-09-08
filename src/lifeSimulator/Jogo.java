package lifeSimulator;

public class Jogo {
    private Pessoa pessoa;
    
    public Jogo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void passarAno() {
        pessoa.envelhecer();
    }
    
    
}
