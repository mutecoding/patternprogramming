package pattern;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int star = 1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) {
				if(j==1||j==star||i==1||i==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			star +=1;
		}
	}

}
