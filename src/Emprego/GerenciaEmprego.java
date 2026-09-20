package Emprego;

import java.util.ArrayList;
import Coletivo.Pessoa;

public class GerenciaEmprego {
    
    private ArrayList<Emprego> empregos;
    
    public GerenciaEmprego() {
    empregos = new ArrayList<>();
    
    Emprego medico = new Emprego("Medico", 5000, 70);
    empregos.add(medico);
   
    }
    
    public void contratar(Pessoa pessoa, Emprego emprego) {
        if (pessoa.getInteligencia() >= emprego.getIntNecessaria()) {
            pessoa.setEmprego(emprego);
            System.out.println("Contratado como: "+ emprego.getNome());
            System.out.println("Salario: R$ "+ emprego.getSalario());
        }
        else {
            System.out.println("Você não está apto a esse emprego!");
        }
    }
    
    public void demitir(Pessoa pessoa, Emprego emprego) {
        pessoa.setEmprego(null);
        System.out.println("Você foi demitido! ");
    }
    
    
}
