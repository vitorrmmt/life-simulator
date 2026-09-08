package lifeSimulator;

import java.util.Scanner;

public class Main {

    public static void limparConsole() {
        // EM CONSTRUCAO
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("LIFE SIMULATOR");
        System.out.println("----------------");

        System.out.println("--- CRIAR PERSONAGEM ---");
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        System.out.println("Digite o sexo: \n H - Homem \n M - Mulher");
        String sexo = sc.next();
        Pessoa pessoa = new Pessoa(nome, sexo);
        Jogo jogo = new Jogo(pessoa);
        
        System.out.println("--- PERSONAGEM CRIADO ---");
        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Sexo: "+ pessoa.sexo);
        
        while(pessoa.condicaoVida == true) {
            System.out.println("--- LIFE SIMULATOR ---");
            System.out.println("Ano: 2026");
            System.out.println("Nome: "+ pessoa.nome);
            System.out.println("Idade: "+ pessoa.idade);
            
            jogo.passarAno();
            System.out.println("Idade: "+ pessoa.idade);
            
            break;
        }
    }
    
}
