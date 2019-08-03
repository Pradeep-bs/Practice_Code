package org.CodingChallengeByPradeep;

public class ValleyChallenge {
	

	    private static final char U = 0;

		// Complete the countingValleys function below.
	    static int countingValleys(int n, String s) {
	        int level=0;
	        char c;
	        int valleyCount=0;
	        for (int i=0 ; i<n ; i++){
	        	c=s.charAt(i);
	            if(c=='U') {
	            	if(level==-1) {
	            	++level;
	            	++valleyCount;
	            	}
	            	else {
	            		++level;
	            	}
	            }
	            else
	            {
	            	--level;
	            }
	            if(level >0) {
	            	System.out.println("On Mountain");
	            }
	            else if (level<0) {
	            	System.out.println("In Valley");
	            }
	            else {
	            	System.out.println(" Sea - Level");
	            }
	            
	        }
	        return valleyCount;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("UDDDUDUU");
		int count=ValleyChallenge.countingValleys(8, s);
		System.out.println("Valleys :"+count);
	}

}
