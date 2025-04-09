/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormoedas;
import api.ConversorAPI;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.json.JSONObject;

/**
 * Organizado e indentado
 * 
 * @author João Carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        ConverteMoedas conv = new ConverteMoedas();
        // Chamado da Classe de conversor API
        ConversorAPI cv = new ConversorAPI();
        // Variavel em formato JSON puxando o metodo para buscar as taxas de cambio
        JSONObject taxa = cv.buscarTaxasCambio();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        boolean sair = true;

        try {
            while (sair) {
                if (taxa != null) {
                    double taxaUSD = taxa.getDouble("USD");
                    double taxaEUR = taxa.getDouble("EUR");

                    // Menu inicial
                     menu();
                    escolha = entrada.nextInt();

                    if (escolha ==  1) {
                          conv.converteDolar(taxaUSD);
                    } else if (escolha == 2) {
                       conv.converteEuro(taxaEUR);
                    } else if (escolha == 3) {
                        sair = false;
                        System.out.println("Saindo....");
                    }
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Tipo inválido digitado");
        } finally {
            entrada.close();
        }
    }
    
    
    
    

            public static void menu(){
                     // Menu inicial
                    System.out.println("\n===== Conversor de  Moedas =====");
                    System.out.println("1 - Converter para Dólar (USD)");
                    System.out.println("2 - Converter para Euro (EUR)");
                    System.out.println("3 - Sair");
                    System.out.print("Escolha uma opção: ");
    }
}
