package br.com.alura.challenge.utils;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private final Scanner leitura;

    public Menu() {
        this.leitura = new Scanner(System.in);
    }

    public void exibir() {
        int opcao = 0;

        while (opcao != 13) {
            mostrarOpcoes();
            opcao = leitura.nextInt();

            if (opcao >= 1 && opcao <= 12) {
                processarConversao(opcao);
            } else if (opcao == 13) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void mostrarOpcoes() {
        System.out.println("""
                ***************************************
                Menu conversor de moedas:

                1) Dólar americano => Real brasileiro
                2) Real brasileiro => Dólar americano
                3) Euro => Real brasileiro
                4) Real brasileiro => Euro
                5) Peso argentino => Real brasileiro
                6) Real brasileiro => Peso argentino
                7) Libra esterlina => Real brasileiro
                8) Real brasileiro => Libra esterlina
                9) Iene japonês => Real brasileiro
                10) Real brasileiro => Iene japonês
                11) Dólar canadense => Real brasileiro
                12) Real brasileiro => Dólar canadense
                13) Sair
                ***************************************

                Escolha uma opção:
                """);
    }

    private void processarConversao(int opcao) {
        String moedaBase = "", moedaAlvo = "", descricao = "";

        switch (opcao) {
            case 1 -> {
                moedaBase = "USD";
                moedaAlvo = "BRL";
                descricao = "Dólar americano";
            }
            case 2 -> {
                moedaBase = "BRL";
                moedaAlvo = "USD";
                descricao = "Real brasileiro";
            }
            case 3 -> {
                moedaBase = "EUR";
                moedaAlvo = "BRL";
                descricao = "Euro";
            }
            case 4 -> {
                moedaBase = "BRL";
                moedaAlvo = "EUR";
                descricao = "Real brasileiro";
            }
            case 5 -> {
                moedaBase = "ARS";
                moedaAlvo = "BRL";
                descricao = "Peso argentino";
            }
            case 6 -> {
                moedaBase = "BRL";
                moedaAlvo = "ARS";
                descricao = "Real brasileiro";
            }
            case 7 -> {
                moedaBase = "GBP";
                moedaAlvo = "BRL";
                descricao = "Libra esterlina";
            }
            case 8 -> {
                moedaBase = "BRL";
                moedaAlvo = "GBP";
                descricao = "Real brasileiro";
            }
            case 9 -> {
                moedaBase = "JPY";
                moedaAlvo = "BRL";
                descricao = "Iene japonês";
            }
            case 10 -> {
                moedaBase = "BRL";
                moedaAlvo = "JPY";
                descricao = "Real brasileiro";
            }
            case 11 -> {
                moedaBase = "CAD";
                moedaAlvo = "BRL";
                descricao = "Dólar canadense";
            }
            case 12 -> {
                moedaBase = "BRL";
                moedaAlvo = "CAD";
                descricao = "Real brasileiro";
            }
        }

        System.out.println("Qual valor em " + descricao + " deseja converter?");
        double valor = leitura.nextDouble();

        try {
            Moeda moeda = Api.ObterDados(moedaBase, moedaAlvo);
            double valorConvertido = moeda.calcularConversao(valor);

            System.out.printf("Valor %.2f [%s] corresponde ao valor final de => %.2f [%s]%n",
                    valor, moeda.getMoedaBase(), valorConvertido, moeda.getMoedaAlvo());

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar dados da API.");
        }
    }
}
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar dados da API.");
        }
    }
}
