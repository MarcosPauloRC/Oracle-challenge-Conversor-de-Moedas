package br.com.alura.challenge.utils;

public class Moeda {
    private String MoedaBase;
    private String MoedaAlvo;
    private double ValorConversao;

    public Moeda(String moedaBase, String moedaAlvo, double valorConversao) {
        this.MoedaBase = moedaBase;
        this.MoedaAlvo = moedaAlvo;
        this.ValorConversao = valorConversao;
    }

    public Moeda(MoedaApi moedaApi) {
        this.MoedaBase = moedaApi.base_code();
        this.MoedaAlvo = moedaApi.target_code();
        this.ValorConversao = moedaApi.conversion_rate();
    }

    public String getMoedaBase() {
        return MoedaBase;
    }

    public String getMoedaAlvo() {
        return MoedaAlvo;
    }

    public double getValorConversao() {
        return ValorConversao;
    }

    public double calcularConversao(double valor) {
        return valor * ValorConversao;
    }

    @Override
    public String toString() {
        return "1 " + MoedaBase + " = " + ValorConversao + " " + MoedaAlvo;
    }
}


