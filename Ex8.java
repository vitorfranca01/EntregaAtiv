package Aulas;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe 1º nota: ");
        n1 = leia.nextDouble();
        System.out.println("Informe 2º nota: ");
        n2 = leia.nextDouble();
        System.out.println("Informe 3º nota: ");
        n3 = leia.nextDouble();
        System.out.println("Informe 4º nota: ");
        n4 = leia.nextDouble();
        
        double result = (n1 + n2 + n3 + n4)/4;
        
        System.out.println("A média aritmética é: " + result);
    }
}
