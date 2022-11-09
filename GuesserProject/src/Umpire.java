import java.util.*;
public class Umpire {
	
		String nameFromGuesser;
		Scanner sc=new Scanner(System.in);
		
		
		String[] arrPlayers;
		void collectNameFromGuesser()
		{
			Guesser g=new Guesser();
			nameFromGuesser=g.guessName();
		}
		void collectNameFromPlayers()
		{   
			Player p1=new Player();
			
			System.out.println("How many players wanted to play the game?");
			int num=sc.nextInt();
			arrPlayers=new String[num];
			for(int i=0;i<num;i++) {
				arrPlayers[i]=p1.guessNum();
			}
			
		}
		void compare()
		{
			int[] res=new int[arrPlayers.length];
			int k=0;
			for(int i=0;i<res.length;i++) {
				if(arrPlayers[i].equalsIgnoreCase(nameFromGuesser)) {
					res[k++]=i+1;
				}
			}
			System.out.print("Player ");
			for(int i=0;i<k;i++) {
				System.out.print(res[i]+" ");
			}
			System.out.print("won the game.");
			System.out.println();
		}

	}


