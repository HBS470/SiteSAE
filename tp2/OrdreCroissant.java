import java.util.Scanner;

public class OrdreCroissant{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
		int nb1, nb2, nb3;

		System.out.print(" 1er nombre : ");
		nb1 = scanner.nextInt();
		System.out.print(" 2ème nombre : ");		
		nb2 = scanner.nextInt();
		System.out.print(" 3ème nombre : ");
		nb3 = scanner.nextInt();

		if ((nb1 > nb2) && (nb1 > nb3) && (nb2 > nb3)){
			System.out.println(" L'ordre croissant est : " + nb3 + "," + nb2+ "," + nb1);
		}
				
		else if ((nb1 > nb2) && (nb1 > nb3) && (nb3 > nb2)){
			System.out.println(" L'ordre croissant est : " + nb2 + "," + nb3 + ","+ nb1);
		}		

		else if ((nb2 > nb1) && (nb2 > nb3) && (nb1 > nb3)){
			System.out.println(" L'ordre croissant est : " + nb3 + "," + nb1 + "," + nb2);
		}

		else if ((nb2 > nb1) && (nb2 > nb3) && (nb3 > nb1)){
			System.out.println(" L'ordre croissant est : " + nb1 + "," + nb3 + "," + nb2);
		}

		else if ((nb3 > nb1) && (nb3 > nb2) && (nb1 > nb2)){
			System.out.println(" L'ordre croissant est : " + nb2 + "," + nb1 + "," + nb3);
		}

		else {
			System.out.println(" L'ordre croissant est : " + nb1 + "," + nb2 + "," + nb3);
		}

		scanner.close();
	}

}

