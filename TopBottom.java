package pattern;

import java.util.Scanner;

public class TopBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int preSpace = n/2, star=1;
		for (int i=1; i<=2*n; i++) {
			for(int j=1; j<=preSpace; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<=n/2) { // For Top arrow Head part
				star +=2 ;
				preSpace -= 1;
			}else if(i<2*n-n/2-1) { // For Both Arrow Tail part 
				star = 1;
				preSpace = n/2;
			}
			else if (i==2*n-n/2-1) { // Changing control for Bottom Arrow Head part
				star = n;
				preSpace =0;
			}else {  // For Bottom arrow Head part
				star -=2;
				preSpace +=1;
			}
		}
	}

}
