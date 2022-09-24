package pattern;

import java.util.Scanner;

public class FilledDamroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int space = n-2, star=1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			int pstar = star;
			if(i==n/2+1) {
				pstar--; // for ignoring one extra Star
			}
			for(int j=1; j<=pstar; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<=n/2){
				star++;
				space -=2;
			}else {
				star--;
				space +=2;
			}
		}	
	}

}
