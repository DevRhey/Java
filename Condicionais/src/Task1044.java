import java.util.Scanner;

public class Task1044 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 valores");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (a % b == 0 || b % a == 0  ){
			System.out.println("São multiples");
		}else {
			System.out.println("Não sao multiplos");
		}
	
	}

}
