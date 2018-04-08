
package cricketer1;
import java.util.Scanner;


public class Cricketer1 {

    
    public static void main(String[] args) {
        

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String name = scanner.nextLine();
		System.out.println("Enter age of the player: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the country of the player: ");
		String country = scanner.nextLine();
		
		Controller obj = new Controller(name,age,country);
		
		System.out.println("Enter run of the player: ");
		int run = scanner.nextInt();
		obj.increasingRun(run);
		System.out.println("Enter total wicket: ");
		int wicket = scanner.nextInt();
		obj.increasingwicket(wicket);
		System.out.println("Enter total match played: ");
		int match = scanner.nextInt();
		obj.increasingmatch(match);
		
		obj.printinfo();
		
		scanner.close();
				
	}
}
    
        