package com.sgp.modelo;

import com.sgp.util.Validacoes;

public class Cidade {

    private String nome;
    private String prefeito;
    private Double numHabitantes;

    // Construtor
    public Cidade(String nome, String prefeito, Double numHabitantes) {
        setNome(nome);
        setPrefeito(prefeito);
        setNumHabitantes(numHabitantes);
    }

    // Construtor padrão
    public Cidade() {
        this.nome = "São Paulo";
        this.prefeito = "Ricardo Nunes";
        this.numHabitantes = 11.9;
    }

    // Saudação
    public void saudacao() {
        System.out.println("A cidade de " + nome +
                ", cujo prefeito é " + prefeito +
                ", tem " + numHabitantes + " milhões de habitantes.");
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getPrefeito() {
        return prefeito;
    }

    public Double getNumHabitantes() {
        return numHabitantes;
    }

    // SETTERS com validação
    public void setNome(String nome) {
        if (Validacoes.nomeValido(nome)) {
            this.nome = nome;
        } else {
            System.out.println(Validacoes.mensagemErroNome(nome));
        }
    }

    public void setPrefeito(String prefeito) {
        if (Validacoes.prefeitoValido(prefeito)) {
            this.prefeito = prefeito;
        } else {
            System.out.println(Validacoes.mensagemErroPrefeito(prefeito));
        }
    }

    public void setNumHabitantes(Double numHabitantes) {
        if (Validacoes.numHabitantesValido(numHabitantes)) {
            this.numHabitantes = numHabitantes;
        } else {
            System.out.println(Validacoes.mensagemErroNumHabitantes(numHabitantes));
        }
    }

    @Override
    public String toString() {
        return "Cidade [nome=" + nome +
                ", prefeito=" + prefeito +
                ", numHabitantes=" + numHabitantes + "]";
    }
}