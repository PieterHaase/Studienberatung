import java.util.Scanner;

public class Studienberatung {
	
	private String input;
	
	public Studienberatung(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		input = scan.nextLine();
		if(input.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachbitur?");
			input = scan.nextLine();	
		}
	}
	
	public static void main (String args[]){
		new Studienberatung();
	}

}
