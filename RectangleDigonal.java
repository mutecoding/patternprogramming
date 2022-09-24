package pattern;

import java.util.Scanner;
public class RectangleDigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n || i+j==n+1 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
