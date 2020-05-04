package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura");
		double c =sc.nextDouble();
		
		char res;
		
		do {
			double f = 9.0*c/5.0+32;
			System.out.printf("Temperatura em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja continuar");
			res = sc.next().charAt(0);
			// aspas simpes '
		}while(res != 'n');
		
		
		sc.close();
	}

}
