

import java.util.Scanner;

//Leia 4 valores inteiros A, B, C e D. Então, se B é maior que C e D é maior que A e se a soma de C e D é maior que a soma de A e B e se C e D são valores positivos e se A é par, escreva a mensagem "Valores aceitos". Caso contrário, escreva a mensagem "Valores não aceitos".
public class Task1035 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 4 valores inteiros");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if( (B>C && D>A) && (C+D>A+B) && (C>0 && D>0) &&(A%2 == 0)){
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores não aceitos");
		};
		
		sc.close();
	}
	
	
}






