package Emprego;

import java.util.ArrayList;

public class GerenciaEmprego {
    
    private ArrayList<Emprego> empregos;
    
    public GerenciaEmprego() {
    empregos = new ArrayList<>();
    
    Emprego medico = new Emprego("Medico", 5000, 70);
    empregos.add(medico);
   
    }
    
    public void contratar() {
        
    }
    
    public void demitir() {
        
    }
    
    
}
