package br.com.alura.challenge.metodos;

import com.google.gson.JsonObject;

public class ProcurarMoeda {
    public double procurarTaxaDeConversao(JsonObject jsonObject, String moedaDesejada) {
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        if (conversionRates.has(moedaDesejada)) {
            return conversionRates.get(moedaDesejada).getAsDouble();
        } else {
            System.out.println("Moeda não encontrada.");
            return 0.0;
        }
    }
}

