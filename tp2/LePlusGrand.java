import java.util.Scanner;

public class LePlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	
		int nb1, nb2, nb3;

		System.out.print(" 1er nombre : ");
		nb1 = scanner.nextInt();
		System.out.print(" 2ème nombre : ");		
		nb2 = scanner.nextInt();
		System.out.print(" 3ème nombre : ");
		nb3 = scanner.nextInt();

		if ((nb1 > nb2) && (nb1 > nb3)){
			System.out.println("Le maximum est :" + nb1);
		}

		else if ((nb2 > nb1) && (nb2 > nb3)){ 
			System.out.println("Le maximum est :" + nb2);
		}
		else {
			System.out.println("Le maximum est :" + nb3);
		}

		scanner.close();
	}

}

