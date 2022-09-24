package pattern;

import java.util.Scanner;

public class LeftArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = n/2, star=1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i==n/2) {
				star = n;
				space = 0;
			}else if(i<n/2) {
				star += 1;
				space -= 1;
			}else if(i==n/2+1) {
				star = n/2;
				space = 1;
			}else {
				star -= 1;
				space += 1;
			}
		}
	}

}
