package pattern;

import java.util.Scanner;

public class SwastikWithDeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				boolean isPrintStar = 
						i==1&&j>n/2|| // for top wall star
						i==n&&j<=n/2 || // for bottom wall star
						j==1&&i<=n/2 || // for left wall star
						j==n&&i>n/2 ||	// for Right wall star
						i==n/2+1|| // for Horizontal middle line star
						j==n/2+1 || // for Vertical middle line star
						(i==n/4+1||i==n-n/4)&&(j==n/4+1||j==n-n/4); 
						// for 4 Deep star
				if(isPrintStar) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
