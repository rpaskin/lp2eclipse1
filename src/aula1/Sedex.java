package aula1;

import java.util.Scanner;

public class Sedex {

	public static void main(String[] args) {
         int d, a, l, p;
         
         Scanner leia = new Scanner(System.in);
         System.out.println("\n Informe o diametro da bola");
         d = leia.nextInt();
         System.out.println("\n Informe a altura da caixa");
         a = leia.nextInt();
         System.out.println("\n Informe a largura da caixa");
         l = leia.nextInt();
         System.out.println("\n Informe a profundidade da caixa");
         p = leia.nextInt();
         
         if (d<=a && d<=p && d<=l) System.out.println("S");
         else System.out.println("N");
         
         
         
         
         
         
		
	}

}
