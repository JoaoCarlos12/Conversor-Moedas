/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormoedas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author João Carlos
 */
public class ConverteMoedas {
    // Atributos
    double valorUsuario;

    // Chamado de classe para formatação de dados com ponto flutuante
    DecimalFormat df = new DecimalFormat("#.##");

    public void converteDolar(double taxaUSD) {
        // Variável local
        double dolarConversor;
        // Chamado da classe Scanner para leitura de entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor desejado em R$: ");
        valorUsuario = entrada.nextDouble();
        dolarConversor = valorUsuario * taxaUSD;
        System.out.println("O valor de R$ " + valorUsuario + " equivale a U$" + df.format(dolarConversor));
    }

    public void converteEuro(double taxaEUR) {
        // Variável local
        double euroConversor;
        // Chamado da classe Scanner para leitura de entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor desejado em R$: ");
        valorUsuario = entrada.nextDouble();
        euroConversor = valorUsuario * taxaEUR;
        System.out.println("O valor de R$ " + valorUsuario + " equivale a €" + df.format(euroConversor));
    }
}
