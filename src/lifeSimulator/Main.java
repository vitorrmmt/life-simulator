package lifeSimulator;

import java.util.Scanner;

public class Main {

    public static void limparConsole() {
        // EM CONSTRUCAO
    }
    
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        
        jogo.iniciarJogo();
        
        jogo.mostrarMenu();
        
    }
}
