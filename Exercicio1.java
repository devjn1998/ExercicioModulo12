package ExercicioMod12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			AlterandoElementosEmArray();

		}
	
	

	private static void AlterandoElementosEmArray() {
		Scanner el = new Scanner(System.in);
		String resp = "";
		while(!resp.equals("S")) {
			System.out.println("Digite 5 nomes: => ");
			String nm1 = el.nextLine();
			String nm2 = el.nextLine();
			String nm3 = el.nextLine();
			String nm4 = el.nextLine();
			String nm5 = el.nextLine();
			String elementos = String.format("%s, %s, %s, %s, %s", nm1, nm2, nm3, nm4, nm5);
			String[] elementosNoArray = elementos.split(", ");
			System.out.println("**********MOSTRANDO ARRAY*************");
			exibirCarregamento();
			System.out.println(Arrays.toString(elementosNoArray));
			
			System.out.println("Quer fechar a aplicação ? [S/N]");
			resp = el.next();
			el.nextLine();
			if(resp.equals("S")) {
				System.out.println("**********FINALIZANDO*************");
				exibirCarregamento();
			} else {
				System.out.println("**********REINICIANDO SISTEMA*************");
				exibirCarregamento();
			}
		}
	}



	private static void exibirCarregamento() {
		for(int i = 0; i<3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}


