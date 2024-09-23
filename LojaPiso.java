
package hellowolrd;

import java.util.Scanner;


public class LojaPiso {
    
    public static void main(String[] args) {
        
       
       double largura;
       double comprimento;
       double valorUnitario;
       
        Scanner leia = new Scanner(System.in);
        
        System.out.println("valor da largura");
        largura = leia.nextDouble();
        System.out.println("Valor do comprimento");
        comprimento = leia.nextDouble();
        System.out.println("Valor unitario da caixa de piso");
        valorUnitario = leia.nextDouble();
        
        double areaTotal = largura * comprimento;
        System.out.println("A area total é: " + areaTotal);
        
        double caixapisoNesc = areaTotal / 2.5;
        System.out.println("A quantidade caixa de piso necessario é: " + caixapisoNesc);
               
        double custoTotal = valorUnitario * caixapisoNesc;
        System.out.println("O custo total é R$:  "  + custoTotal);
        
    }   
}
