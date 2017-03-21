package Aulas;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n1, n2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        n1 = leia.nextInt();
        System.out.print("Informe um número p/ ser multiplicado pelo primeiro: ");
        n2 = leia.nextInt();
        
        int result = n1*n2;
        
        System.out.println("O Produto é: " + result);
        
    }
}
