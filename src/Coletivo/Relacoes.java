package Coletivo;

public class Relacoes  {

public enum tipoRelacao {
    DESCONHECIDO,
    COLEGA,
    AMIGO,
    FICANTE,
    NAMORADO,
    CASADO,
    EX,
    INIMIGO,
    PAI,
    MAE,
}

private Pessoa pessoa; 
private tipoRelacao tipo;

public Relacoes (Pessoa pessoa, tipoRelacao tipo) {
    
}

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public tipoRelacao getTipo() {
        return tipo;
    }

    public void setTipo(tipoRelacao tipo) {
        this.tipo = tipo;
    }



}