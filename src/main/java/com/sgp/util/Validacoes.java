package com.sgp.util;

public class Validacoes {

    private Validacoes() {}

    // NOME
    public static boolean nomeValido(String nome) {
        return !(nome == null ||
                nome.trim().isEmpty() ||
                nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: o nome nao pode ser vazio";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: o nome nao pode conter numero";
        }
        return "";
    }

    // PREFEITO
    public static boolean prefeitoValido(String prefeito) {
        return !(prefeito == null ||
                prefeito.trim().isEmpty() ||
                prefeito.matches(".*\\d+.*"));
    }

    public static String mensagemErroPrefeito(String prefeito) {
        if (prefeito == null || prefeito.trim().isEmpty()) {
            return "Erro: o prefeito nao pode ser vazio";
        } else if (prefeito.matches(".*\\d+.*")) {
            return "Erro: o prefeito nao pode conter numero";
        }
        return "";
    }

    // NUM HABITANTES
    public static boolean numHabitantesValido(double numHabitantes) {
        return numHabitantes >= 0 && numHabitantes <= 30;
    }

    public static String mensagemErroNumHabitantes(double numHabitantes) {
        if (numHabitantes < 0) {
            return "Erro: numero de habitantes nao pode ser negativo";
        } else if (numHabitantes > 30) {
            return "Erro: numero de habitantes deve estar entre 0 e 30 milhões";
        }
        return "";
    }
}