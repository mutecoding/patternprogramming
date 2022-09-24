package pattern;

import java.util.Scanner;

public class LeftRightArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int preSpace = n/2,betWeenSpace = n-1, star=1;
		for (int i=1; i<=n; i++) {
			// previous space
			for(int j=1; j<=preSpace; j++) {
				System.out.print("  ");
			}
			// Left Arrow star
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			// Between space
			if(i!=n/2+1) {
				for(int j=1; j<=betWeenSpace; j++) {
					System.out.print("  ");
				}
			}
			// Right Arrow Star
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i==n/2) {
				star =n ;
				preSpace = 0;
			}else if(i<n/2){
				star +=1;
				preSpace -=1 ;
			}else if(i==n/2 + 1){
				star =n/2 ;
				preSpace = 1;
			}
			else {
				star -=1 ;
				preSpace += 1;
			}
		}
	}

}
