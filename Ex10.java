package Aulas;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        String nome;
        double salFix, totalVendas;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o nome do vendedor: ");
        nome = leia.next();
        System.out.print("Informe o salário fixo desse vendedor: ");
        salFix = leia.nextDouble();
        System.out.print("Informe o total das vendas em reais desse vendedor: ");
        totalVendas = leia.nextDouble();
        
        double comissao = totalVendas * 0.15;
        
        System.out.println("O funcionário " + nome + " vai receber R$" + (salFix + comissao) + " no final do mês.");
    }
}
