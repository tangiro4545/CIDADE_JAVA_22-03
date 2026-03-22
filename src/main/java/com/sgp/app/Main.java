package com.sgp.app;

import com.sgp.modelo.Cidade;

public class Main {

    public static void main(String[] args) {

        // Teste com objeto nulo
        Cidade cidadeNula = null;
        imprimirCidade(cidadeNula);

        // Cidade normal
        Cidade cidade = new Cidade("São Paulo", "Ricardo Nunes", 11.9);
        cidade.setNumHabitantes(11.4);
        imprimirCidade(cidade);

        // Construtor padrão
        Cidade cidadePadrao = new Cidade();
        System.out.println("\nConstrutor padrão:");
        imprimirCidade(cidadePadrao);

        // Teste com dados
        Cidade cidadeComDados = new Cidade("Campinas", "Dário Saadi", 1.2);
        System.out.println("\nOutra cidade:");
        imprimirCidade(cidadeComDados);

        // Testes de getters e setters
        cidade.saudacao();

        System.out.println("Nome: " + cidade.getNome());

        cidade.setNome("João");
        System.out.println("Nome modificado: " + cidade.getNome());

        cidade.setPrefeito("Novo Prefeito");
        System.out.println("Prefeito: " + cidade.getPrefeito());

        cidade.setNumHabitantes(12.0);
        System.out.println("Habitantes: " + cidade.getNumHabitantes());
    }

    public static void imprimirCidade(Cidade cidade) {
        if (cidade == null) {
            System.out.println("Cidade não inicializada!");
            return;
        }

        System.out.println(cidade);
        cidade.saudacao();
    }
}