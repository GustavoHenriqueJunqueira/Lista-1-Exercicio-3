package lista1exercicio3;

import java.util.Scanner;

public class Lista1Exercicio3 {

    public static void main(String[] args) {
        
        System.out.println("Programa para calcular o desconto monetario.");
        
        float D, PR;
        
        System.out.println("Digite o valor do produto o qual qer saber o desconto");
        Scanner teclado = new Scanner(System.in);
        PR = teclado.nextFloat();
        
        D = (float) (PR*0.05);
        
        System.out.println("O valor do produto informado é: "+PR);
        System.out.println("E o valor do desconto do produto é: "+D);
        
    }
    
}
