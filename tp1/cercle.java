import java.util.Scanner;
class Cercle {

 final static double PI=3.14;
 public static void main (String[] args) {
 
	Scanner scanner = new Scanner(System.in).useDelimiter("\n");

	int rayon;
	double circonference, aire;	
	
	System.out.print(" rayon : ");
	rayon = scanner.nextInt();
	

	circonference = 2*PI*rayon;
	aire = PI*rayon*rayon;
	
	
	System.out.println(" Circonférence :" + circonference);
	System.out.println("Aire :" + aire);
 }

}
