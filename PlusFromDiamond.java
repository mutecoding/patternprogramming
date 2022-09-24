package pattern;

import java.util.Scanner;

public class PlusFromDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = n-1, star = 1;
		for (int i=1; i<2*n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				if( i==n || j==star/2+1) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i>=n) {
				space++;
				star -=2;
			}else {
				space--;
				star +=2;
			}
		}
	}

}
