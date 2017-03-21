package Aulas;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double l1, l2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe os dois catetos do triângulo: ");
        l1 = leia.nextDouble();
        l2 = leia.nextDouble();
        
        double result = Math.sqrt((l1*l1) + (l2*l2));
        System.out.println("Hipotenusa = " + result);
    }
}
