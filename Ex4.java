package Aulas;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n1, n2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe N1: ");
        n1 = leia.nextInt();
        System.out.print("Informe N2: ");
        n2 = leia.nextInt();
        
        int n11 = n1 + 1;
        int n22 = n2 + 1;
        
        System.out.println("Os números consecutivos de N1 e N2 são: " + n11 + " e " + n22);
    }
}
