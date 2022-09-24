package pattern;

import java.util.Scanner;

public class ReverseTriangleMirrorEffect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = 0, star = 2*n-1;
		for (int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				if(j==1||j==star||i==1||i==n || i==2*n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}			}
			System.out.println();
			if(i>=n) {
				space--;
				star +=2;
			}else {
				space++;
				star -=2;
			}
		}
	}

}
