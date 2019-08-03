package pradeep;
import java.util.*;
import java.lang.*;
import java.io.*;

public class NextNum {

	public static void main(String[] args) {
		int i,j,n;
		int t[][]=new int[10][10];
		int num[]=new int[10];
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("There are "+n+" test cases");
		for (i=0 ; i<n ; i++) {
			System.out.println(" enter number of inputs for test case : "+ (i+1));
			num[i]=scan1.nextInt();
			System.out.println("Enter the values ");
			for ( j=0 ; j<num[i] ; j++) {
				t[i][j]=scan2.nextInt();
			}
		}
		System.out.println("output");
		System.out.println();
		for (i=0;i<n;i++) {
			for(j=0 ; j<num[i]-1; j++) {
				if(t[i][j]>t[i][j+1]) {
					System.out.print(t[i][j] + " ");
				}
				else {
					System.out.print(-1 + " ");
				}
				
			}
			System.out.print(-1);
			System.out.println();
		}
		System.out.println("The End");
	}

}
