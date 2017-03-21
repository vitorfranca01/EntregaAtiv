package Aulas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do lado de um quadrado: ");
        double L = leia.nextDouble();
        System.out.println("Este quadrado tem " + L*L + " de área");
    }
}
