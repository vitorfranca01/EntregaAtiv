package Aulas;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double A, B, C;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe A: ");
        A = leia.nextDouble();
        System.out.print("Informe B: ");
        B = leia.nextDouble();
        System.out.print("Informe C: ");
        C = leia.nextDouble();
        
        System.out.println("a)a área do triângulo retângulo que tem A por base e C por altura = " + (A*C)/2);
        System.out.println("b)a área do círculo de raio C. (π = 3.14159) = " + 3.14159*(C*C));
        System.out.println("c)a área do trapézio que tem A e B por bases e C por altura = " + ((A+B)*C)/2);
        System.out.println("d)a área do quadrado que tem lado B = " + B*B);
        System.out.println("e) a área do retângulo que tem lados A e B = " + A*B);
        System.out.println("f) o perímetro do retângulo que tem lados A e B = " + (A+A+B+B));
    }
}
