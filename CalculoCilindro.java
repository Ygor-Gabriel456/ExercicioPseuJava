package hellowolrd;

import java.util.Scanner;

public class CalculoCilindro {
    public static void main(String[] args) {
        // Fórmula do cilindro v = h * pi * r^2
        Scanner entrada = new Scanner(System.in);

        //Agregamos as variáveis
        double h, a = 0, v = 0;

        //Pedimos a altura e o raio do cilindro
        System.out.println("Escreva a altura");
        h = entrada.nextDouble();
        System.out.println("Escreva o raio da base");
        double r = entrada.nextDouble();

        //Realizamos a operação
        a = Math.PI * Math.pow (r,2);
        v = a * h;
        //Recebemos o resultado da operação
        System.out.println("O volume é = " + v);

        
    }
}
 