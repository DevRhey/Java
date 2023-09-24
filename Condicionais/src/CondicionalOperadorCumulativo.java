
import java.util.Scanner;

public class CondicionalOperadorCumulativo {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int franquia = 100;
		int valBase = 50;
		int valMin = 2;
		
		System.out.println("quantos minutos?");
		int minutos = sc.nextInt();
		
		if(minutos <= 100){
			System.out.println("O valor a pagar sera" + valBase+ "voce esta dentro do limite e sua franquia e utilizou" +minutos);
		}else{
			int valExcedente = minutos - franquia;
			valBase += valExcedente * valMin;
			System.out.print("Vai pagar " + valBase);
		}
		
	}
}
