import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
		double nb1, nb2;	

		System.out.print("Valeur de a : ");
		nb1 = scanner.nextDouble();
		
		System.out.print("Valeur de b : ");
		nb2 = scanner.nextDouble();

		if (nb1 != 0) {
			System.out.println("{" + ((-nb2/nb1)) + "}");

		}
		else if (nb2 == 0) {
			System.out.println("Il y a une infinité de solution");
		}

		else {
			System.out.println("Pas de solution");
		
		}

		scanner.close();
	}

}

