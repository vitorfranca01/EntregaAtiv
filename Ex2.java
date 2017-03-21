package Aulas;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double n1, n2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe N1(base): ");
        n1 = leia.nextDouble();
        System.out.println("Informe N2(expoente): ");
        n2 = leia.nextDouble();
        
        double result = Math.pow(n1, n2);
        
        System.out.println("O resultado da elevação é: " + result);
    }
}
