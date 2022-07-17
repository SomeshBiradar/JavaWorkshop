import java.util.Random;

public class Gambler {
	
	
	public static void main(String[] args) {
		
		int stake =100;
	
		
		Random rd=new Random();
	    int RANDOM = rd.nextInt();
	    int game=(RANDOM%2);

			int remainingStake=stake;
			
				if(game ==0) {
					System.out.println("You win 1$");
	
					remainingStake=remainingStake+1;
					System.out.println(remainingStake);
				}
				else {
					
					System.out.println("You Loose 1$");
					remainingStake=remainingStake-1;
					System.out.println(remainingStake);
				}
			
			
		
	  }
		
	

}
