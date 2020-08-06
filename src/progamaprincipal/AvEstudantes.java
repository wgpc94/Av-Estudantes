package progamaprincipal;

import java.util.Scanner;

import entidades.Estudantes;

public class AvEstudantes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Estudantes aL = new Estudantes();
		System.out.println("Digete o nome: ");
		aL.nome = entrada.nextLine();
		System.out.println("Digete o valor de AV1: ");
		aL.av1 = entrada.nextDouble();
		System.out.println("Digete o valor de AV2: ");
		aL.av2 = entrada.nextDouble();
		System.out.println("Digete o valor de AV3: ");
		aL.av3 = entrada.nextDouble();
		while (aL.av1 >30 ) {
			System.out.println("Digete o valor correto: ");
			aL.av1 = entrada.nextDouble();
		}
		while (aL.av2 >35) {
			System.out.println("Digete o valor correto : ");
			aL.av2 = entrada.nextDouble();
		}
		while (aL.av3 >35) {
			System.out.println("Digete o valor correto :");
			
		}
		double notaF = aL.CalcularNota();
		System.out.println(aL.situacao+" Sua Nota Final e: "+notaF);
	
		
		
		entrada.close();
	}

}
