package ExercicioMod12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		ExercicioListaMasculinaEFeminina();

	}

	private static void ExercicioListaMasculinaEFeminina() {
		System.out.println("*************** CADASTRO DE PESSOAS ***************");
		List<String> listaMasculina = new ArrayList<>();
		List<String> listaFeminina = new ArrayList<>();
		Scanner el = new Scanner(System.in);
		String resp = "";
		Integer generoMasculino = 0;
		Integer generoFeminino = 0;
		while(!resp.equals("S")) {
			for(int i = 0; i<5; i++) {
				System.out.println("Digite o nome: ");
				String nome = el.nextLine();
				System.out.println("Digite o gênero: [M/F]");
				String genero = el.nextLine();
				if (genero.equals("M")) {
					listaMasculina.add(nome);
					generoMasculino = generoMasculino + 1;
				} else if (genero.equals("F")) {
					listaFeminina.add(nome);
					generoFeminino = generoFeminino + 1;

				} else {
					System.out.println("Porfavor, digite um nome válido.");
					break;
				}
				
			}
			Collections.sort(listaMasculina);
			Collections.sort(listaFeminina);
			
			System.out.println("**********MOSTRANDO ARRAY*************");
			exibirCarregamento();
			System.out.printf("Foram cadastrados: %d Homens e %d Mulheres. \n", generoMasculino, generoFeminino);
			System.out.println("Lista Masculina: " + listaMasculina);
			System.out.println("Lista Feminina: " + listaFeminina);
			
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

