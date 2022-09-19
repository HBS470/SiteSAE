import java.util.Scanner;
public class Baccalaureat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
		double moyenne, finale;
		
		System.out.print(" Saisissez votre moyenne : ");
		moyenne = scanner.nextDouble();
		
		if (moyenne < 0 || moyenne > 20){
			System.out.println("Moyenne incorrecte !");
		}

		else if (moyenne < 8){
			System.out.println("Refusé !");
		}

		else if (moyenne < 10){
			System.out.println("Doit passer l'oral de rattrapage !");
			System.out.print(" Saisissez votre moyenne finale :");	
			finale = scanner.nextDouble();
			if (finale < 10){
				System.out.println("Refusé !");
			}
			else {
				System.out.println("Admis mention passable !");
			}
		}

		else if (moyenne < 12){
			System.out.println("Admis mention passable !");
		}

		else if (moyenne < 14){
			System.out.println("Admis mention assez bien !");
		}

		else if (moyenne < 16){
			System.out.println("Admis mention bien !");
		}

		else {
			System.out.println("Admis mention très bien !");
		}
		
		scanner.close();
	}

}

