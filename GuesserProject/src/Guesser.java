import java.util.*;
public class Guesser {

	
		String guessName;
		
		String guessName()
		{
			Scanner scan=new Scanner(System.in);
			boolean val=false;
			do {
			System.out.println("Guesser select given options.");
			System.out.println("1.Fruits 2.Birds 3.Animals 4.Colors");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Guesser kindly guess the Fruit name");
			       guessName=scan.next();
			       val=true;
			       break;
			case 2:System.out.println("Guesser kindly guess the Bird name");
		            guessName=scan.next();
		            val=true;
		            break;
			case 3:System.out.println("Guesser kindly guess the Animal name");
		           guessName=scan.next();
		           val=true;
		           break;
			case 4:System.out.println("Guesser kindly guess the Color name");
		           guessName=scan.next();
		           val=true;
		           break;
		    default:System.out.println("Select the choice from given range");
			
			}
			}while(val==false);
			
			
			return guessName;
		}	

	

}
