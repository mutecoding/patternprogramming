package pattern;

import java.util.Scanner;

public class FilledSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {			
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
