import java.util.*;
public class Player {

	
		String guessName;
		
		String guessNum()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Player kindly guess the guessName");
			guessName=scan.next();
			return guessName;
		}

	

}
