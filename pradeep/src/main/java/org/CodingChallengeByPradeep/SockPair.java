package org.CodingChallengeByPradeep;
import java.util.*;

public class SockPair {
	

	   
	    public static int sockMerchant(int n, int[] ar) {
	        int pairCount=0;
	        Integer temp;
	       List<Integer> ll=new ArrayList<Integer>(); 
	        for (int i=0 ; i<n;i++){
	        	temp=(Integer)ar[i];
	           if(ll.contains(temp)==false) {
	        	   ll.add(temp);
	        	   System.out.println(" New sock adding "+temp);
	           }
	           else {
	        	   System.out.println(" Sock pair found "+temp);
	        	   ll.remove(temp);
	        	   pairCount++;
	           }
	        }
	        return pairCount;
	    }

	public static void main(String[] args) {
		int n=6;
		int a[]= {1,2,3,1,2,2};
		System.out.println(" Socks "+a);
		int count=sockMerchant(n,a);
		
		System.out.println("Pair Count is : "+count);	
	
}
}
