package view;

import business.GeradorPin;
import business.GeradorSenhaForte;
import business.IGeradorSenha;

public class Principal {

    // Alunos: Thamiris Ferreira e Rafael Daniel Durval
    public static void main(String[] args) {

        IGeradorSenha gerador = new GeradorSenhaForte(12);
        System.out.println("Senhas fortes:");
        System.out.println(gerador.gerarSenha());
        System.out.println(gerador.gerarSenha());

        gerador = new GeradorPin();
        System.out.println("PINs:");
        System.out.println(gerador.gerarSenha());
        System.out.println(gerador.gerarSenha());

    }
}
