import java.util.Scanner;

public class Reduction {

	final static double REDUC = 0.95;
	final static double MONTANT = 100;	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
	double prix;
			
	System.out.print("Saississez le montant de votre achat :");
	prix = scanner.nextDouble();

	if (prix >= MONTANT){
		prix = prix * REDUC;
		System.out.println(" Le montant à payer est de " + prix); 
	}	
	else {
		System.out.println("Le montant à payer est de " + prix);
		
	}


		scanner.close();
	}

}

