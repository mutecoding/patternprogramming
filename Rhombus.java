package pattern;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = n-1;
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*  ");
				}else {
					System.out.print("   ");
				}
			}
			space--;
			System.out.println();
		}
	}

}
