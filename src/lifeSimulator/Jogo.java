package lifeSimulator;

import Eventos.Acoes;
import java.util.Scanner;

public class Jogo {
    private Pessoa pessoa;
    Scanner sc = new Scanner(System.in);
    int ano = 2026;

    public Jogo() {

    }
    
    public void iniciarJogo() {

        System.out.println("----------------");
        System.out.println("LIFE SIMULATOR");
        System.out.println("----------------");

        criarPersonagem();

        while (pessoa.condicaoVida) {

            System.out.println("--- LIFE SIMULATOR ---");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Genero: "+ pessoa.getSexo());
            System.out.println("Ano: "+ ano);            

            passarAno();

            break;
        }
    }

    public void criarPersonagem() {

        String sexo = "";
        
        System.out.println("--- CRIAR PERSONAGEM ---");

        System.out.println("Digite o nome: ");
        String nome = sc.next();

        System.out.println("Digite o sexo: \n1 - Homem \n2 - Mulher");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                sexo = "Masculino";
                break;
            case 2:
                sexo = "Feminino";
                break;
            default:
                System.out.println("Inválido!");
                return;
        }

        pessoa = new Pessoa(nome, sexo);

        System.out.println("--- PERSONAGEM CRIADO ---");
        System.out.println("\n ");
    }

    public void mostrarMenu() {
        Acoes acoes = new Acoes(pessoa);
        int opcao = 0;
        
        System.out.println("1 - Proximo ano");
        System.out.println("2 - Trabalhar");
        System.out.println("3 - Estudar");
        System.out.println("4 - Sair");
        opcao = sc.nextInt();
        switch(opcao) {
            case 1: 
                passarAno();
            case 2:
                acoes.trabalhar(pessoa);
            case 3:
                acoes.estudar();
            case 4:
                break;
            default:
                System.out.println("Opcao invalida\n");
                System.out.println("1 - Proximo ano");
                System.out.println("2 - Trabalhar");
                System.out.println("3 - Estudar");
                System.out.println("4 - Sair");       
                opcao = sc.nextInt();
        }   
        
    }
    
    
    public void passarAno() {
        pessoa.envelhecer();
        ano++;
    }
    
    
}
