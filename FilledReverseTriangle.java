package pattern;

import java.util.Scanner;

public class FilledReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = 0, star = 2*n-1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star -=2;
		}
	}

}
