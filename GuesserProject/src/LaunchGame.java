import java.util.*;

public class LaunchGame {

	/*features added:1.Added the feature that player wanted to again or not
	 * given the options to players to select the from guesser
	 * added feature of customizing how many members of player can partcipate at a time in project
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to guesser game");
		Scanner sc=new Scanner(System.in);
		 String str;
		do {
			System.out.println("Enter 'start' to start the game!");
	     String str1=sc.next();
	     if(str1.equalsIgnoreCase("start"));
		{Umpire u=new Umpire();
		u.collectNameFromGuesser();
		u.collectNameFromPlayers();
		u.compare();
		System.out.println("Do you want to play again? Yes|No");
		  str=sc.next();}
		}while(str.equalsIgnoreCase("Yes"));
		
	}

}
