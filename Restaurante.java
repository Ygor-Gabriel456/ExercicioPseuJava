package hellowolrd;

import java.util.Scanner;

public class Restaurante {
      public static void main(String[] args) {
        // Criar um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor gasto pelo cliente
        System.out.print("Digite o valor do gasto realizado pelo cliente (em reais): ");
        double valorGasto = scanner.nextDouble();

        // Calcula os 10% do garçom
        double gorjeta = valorGasto * 0.10;

        // Calcula o valor total a ser pago
        double valorTotal = valorGasto + gorjeta;

        // Exibe o resultado
        System.out.printf("O valor total a ser pago, incluindo os 10%% do garçom, é: R$ %.2f\n", valorTotal);
    }
}

//Pseudocódigo
//
//Iniciar Programa Restaurante_coma_bem
//
//    // Criar um objeto para capturar a entrada do usuário
//    Declarar valorGasto, gorjeta, valorTotal COMO REAL
//
//    // Entrada do valor gasto pelo cliente
//    Escrever "Digite o valor do gasto realizado pelo cliente (em reais):"
//    Ler valorGasto
//
//    // Calcula os 10% de gorjeta
//    gorjeta = valorGasto * 0.10
//
//    // Calcula o valor total a ser pago
//    valorTotal = valorGasto + gorjeta
//
//    // Exibir o resultado
//    Escrever "O valor total a ser pago, incluindo os 10% do garçom, é: R$", valorTotal
//
//Fim

