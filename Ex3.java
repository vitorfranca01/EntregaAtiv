package Aulas;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double n1, n2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe N1: ");
        n1 = leia.nextDouble();
        System.out.println("Informe N2: ");
        n2 = leia.nextDouble();
        
        double result = (n1*n1) + (n2*n2);
        
        System.out.println("A soma do quadrado dos dois números é: " + result);
    }
}
