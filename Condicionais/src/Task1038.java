

import java.util.Locale;
import java.util.Scanner;

public class Task1038 {
	public static void main(String[]args){
		String prod1 ="Cachorro quente";
		String prod2 ="X-Salada";
		String prod3 ="X-Bacon";
		String prod4 ="Torrada simples";
		String prod5 ="Refrigerante";
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do produto");
		String cod = sc.next();
		System.out.println("Qual a quantidade");
		int quantidade = sc.nextInt();
		
		switch (cod){
			case "1":
				double preco1 = 4.00;
				double total1 = quantidade * preco1;
				System.out.printf("O valor total a ser pago por "+prod1+" é %.2f%n:", total1);
				break;
			case "2":
				double preco2 = 4.50;
				double total2 = quantidade * preco2;
				System.out.printf("O valor total a ser pago é %.2f%n:", total2);
				break;
			case "3":
				double preco3 = 5.00;
				double total3 = quantidade * preco3;
				System.out.printf("O valor total a ser pago é %.2f%n:", total3);
				break;
			case "4":
				double preco4 = 2.00;
				double total4 = quantidade * preco4;
				System.out.printf("O valor total a ser pago é %.2f%n", total4);
				break;
			case "5":
				double preco5 = 1.50;
				double total5 = quantidade * preco5;
				System.out.printf("O valor total a ser pago é %.2f%n", total5);
				break;
			default:
				System.out.print("Nada");
			
		}
		sc.close();
	}
	
}
