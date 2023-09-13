package lista2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
        // Exemplos de uso dos métodos de conversão
        System.out.println("1 Dólar em Real: " + dolarParaReal(1)); // Converte 1 Dólar para Real e imprime o resultado
        System.out.println("1 Real em Dólar: " + realParaDolar(1)); // Converte 1 Real para Dólar e imprime o resultado
        System.out.println("25°C em Fahrenheit: " + celsiusParaFahrenheit(25)); // Converte 25°C para Fahrenheit e imprime
        System.out.println("10 Centímetros em Polegadas: " + centimetrosParaPolegadas(10)); // Converte 10 cm para polegadas
        System.out.println("5 Polegadas em Centímetros: " + polegadasParaCentimetros(5)); // Converte 5 polegadas para cm
        System.out.println("1 Radiano em Graus: " + radianosParaGraus(1)); // Converte 1 radiano para graus e imprime
        System.out.println("45 Graus em Radianos: " + grausParaRadianos(45)); // Converte 45 graus para radianos e imprime
        converterSegundos(3661); // Converte 3661 segundos em horas, minutos e segundos e imprime o resultado
        converterDias(365); // Converte 365 dias em anos, meses e dias e imprime o resultado
        System.out.println("Decimal 255 em Hexadecimal: " + decimalParaHexadecimal(255)); // Converte 255 em hexadecimal
        System.out.println("Hexadecimal FF em Decimal: " + hexadecimalParaDecimal("FF")); // Converte "FF" em decimal
        System.out.println("10 m/s em km/h: " + metrosPorSegundoParaQuilometrosPorHora(10)); // Converte 10 m/s em km/h
        System.out.println("36 km/h em m/s: " + quilometrosPorHoraParaMetrosPorSegundo(36)); // Converte 36 km/h em m/s
        System.out.println("2048 Kilobytes em Gigabytes: " + kilobytesParaGigabytes(2048)); // Converte 2048 KB em GB
    }

    // Métodos de conversão

    // Método para converter Dólar para Real
    public static double dolarParaReal(double dolares) {
        double taxaConversao = 3.68;
        return dolares * taxaConversao;
    }

    // Método para converter Real para Dólar
    public static double realParaDolar(double reais) {
        double taxaConversao = 1 / 3.68;
        return reais * taxaConversao;
    }

    // Método para converter Graus Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Centímetros para Polegadas
    public static double centimetrosParaPolegadas(double centimetros) {
        return centimetros / 2.54;
    }

    // Método para converter Polegadas para Centímetros
    public static double polegadasParaCentimetros(double polegadas) {
        return polegadas * 2.54;
    }

    // Método para converter Radianos para Graus
    public static double radianosParaGraus(double radianos) {
        return radianos * (180 / Math.PI);
    }

    // Método para converter Graus para Radianos
    public static double grausParaRadianos(double graus) {
        return graus * (Math.PI / 180);
    }

    // Método para converter segundos em horas, minutos e segundos
    public static void converterSegundos(int segundos) {
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }

    // Método para converter dias em anos, meses e dias
    public static void converterDias(int dias) {
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        System.out.println(anos + " anos, " + meses + " meses, " + dias + " dias");
    }

    // Método para converter Decimal para Hexadecimal
    public static String decimalParaHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    // Método para converter Hexadecimal para Decimal
    public static int hexadecimalParaDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    // Método para converter Metros por Segundo para Quilômetros por Hora
    public static double metrosPorSegundoParaQuilometrosPorHora(double metrosPorSegundo) {
        return metrosPorSegundo * 3.6;
    }

    // Método para converter Quilômetros por Hora para Metros por Segundo
    public static double quilometrosPorHoraParaMetrosPorSegundo(double quilometrosPorHora) {
        return quilometrosPorHora / 3.6;
    }

    // Método para converter Kilobytes para Gigabytes
    public static double kilobytesParaGigabytes(int kilobytes) {
        return kilobytes / (1024.0 * 1024.0);
    }
}