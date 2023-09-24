
import java.util.Scanner;

public class MostraMenorNumero {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		
		 System.out.println("Digite o primeiro numero");
		 int Num1 = sc.nextInt();
		 System.out.println("Digite o segundo número");
		 int Num2 = sc.nextInt();
		 System.out.println("Digite o terceiro valor");
		 int Num3 = sc.nextInt();
		 
		 if (Num1 == Num2 && Num1 == Num3){
			 System.out.println("Numeros são iguais");
		 }else {
			 if (Num1 > Num2 && Num1 > Num3) {
				 System.out.println("O " + Num1 + "é o maior numero");
			 } else if (Num2 > Num1 && Num2 > Num3) {
				 System.out.println("O" + Num2 + "é maior");
			 } else {
				 System.out.println("O" + Num3 + "é maior");
			 }
		 }
		
		
	}
	
}
