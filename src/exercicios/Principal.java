package exercicios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Akdemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));

        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

        System.out.println("\nLista de nomes e idades (usando getters):");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }
    }
}
