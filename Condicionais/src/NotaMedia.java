
import java.util.Scanner;
import java.util.Locale;

public class NotaMedia {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota");
		float nota2 = sc.nextInt();
		
		float notaFinal = nota1+nota2;
		
		if (notaFinal>=5){
			System.out.printf("A nota final é = %.1f%n", notaFinal);
		}
		else {
			System.out.println("Aluno Reprovado"+ notaFinal);
		}
		
		sc.close();
		
		
	}
}
