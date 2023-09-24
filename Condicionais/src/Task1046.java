import java.util.*;
public class Task1046 {

public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o inicio do jogo");
	
	int inicio = sc.nextInt();
	
	System.out.println("Digite o inicio do jogo");
	
    int fim = sc.nextInt();
	
	if(inicio ==0 && fim==0){
		System.out.println("O jogo durou 24 Horas");
	}else {
		int tempoTotal = (fim-inicio);
		System.out.println("O jogo durou " +tempoTotal+ "Horas");
	}
	
	
	

};
};
