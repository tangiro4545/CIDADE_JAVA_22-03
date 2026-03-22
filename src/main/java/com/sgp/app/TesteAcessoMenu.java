package com.sgp.app;

import java.util.Scanner;

import com.sgp.modelo.Cidade;
import com.sgp.util.Validacoes;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cidade cidade = new Cidade("São Paulo", "Ricardo Nunes", 11.9);
        int opcao;

        do {
            imprimirMenu();
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(cidade);
                    break;
                case 2:
                    alterarNome(cidade, scanner);
                    break;
                case 3:
                    alterarPrefeito(cidade, scanner);
                    break;
                case 4:
                    cidade.saudacao();
                    break;
                case 5:
                    alterarNumHabitantes(cidade, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Cidade ===");
        System.out.println("1. Mostrar dados da cidade");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar prefeito");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar número de habitantes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner) {
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Cidade cidade, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            cidade.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarPrefeito(Cidade cidade, Scanner scanner) {
        System.out.print("Digite o novo prefeito: ");
        String novoPrefeito = scanner.nextLine();
        if (Validacoes.prefeitoValido(novoPrefeito)) {
            cidade.setPrefeito(novoPrefeito);
            System.out.println("Prefeito alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroPrefeito(novoPrefeito));
        }
    }

    public static void alterarNumHabitantes(Cidade cidade, Scanner scanner) {
        System.out.print("Digite o número de habitantes (em milhões): ");
        try {
            double novoNum = Double.parseDouble(scanner.nextLine());
            if (Validacoes.numHabitantesValido(novoNum)) {
                cidade.setNumHabitantes(novoNum);
                System.out.println("Número de habitantes alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroNumHabitantes(novoNum));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um número válido!");
        }
    }
}