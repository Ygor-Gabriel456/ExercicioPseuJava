package hellowolrd;

import java.util.Scanner;

public class notasAluno {
    public static void main(String[] args) {
        
        int n1, n2, n3;
       
        Scanner leia =  new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        n1 = leia.nextInt();
        System.out.println("Digite sua segunda nota:");
        n2 = leia.nextInt();
        System.out.println("Digite sua terceira nota:");
        n3 = leia.nextInt();
        
        int nota1 = n1 * 1;
        System.out.println("Sua primeria nota é: " + nota1);
        
        int nota2 = n2 * 2;
        System.out.println("Sua segunda nota é: " + nota2);
        
        int nota3 = n3 * 4;
        System.out.println("Sua terceira nota é:" + nota3);
         
        int media = n1 + n2 + n3 / 3;
        System.out.println("Sua media é: " + media);
        
    }
}
