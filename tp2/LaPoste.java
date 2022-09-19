import java.util.Scanner;

public class LaPoste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
		int poids, dest;
	
		System.out.print("Poids de la lettre : ");
		poids = scanner.nextInt();

		if (poids > 250){
			System.out.println("Allez donc voir à la poste !! ");
		}

		else {
			System.out.println(" 1 pour France et 2 pour Internationale");
			dest = scanner.nextInt();
			if (dest == 1){
				if (poids <= 20){
					System.out.println(" Vous devez payer 1,56 euros");
		}
				else if (poids <= 100){
					System.out.println(" Vous devez payer 2,64 euros");
		}
				else {
					System.out.println(" Vous devez payer 4,42 euros");
		}

		}
			if (dest == 2){
				if (poids <= 20){
					System.out.println(" Vous devez payer 4 euros");
		}
				else if (poids <= 100){
					System.out.println(" Vous devez payer 5,50 euros");
		}
				else {
					System.out.println(" Vous devez payer 10 euros");
		}

		}
	
		}
			

		scanner.close();
	}

}

