package implement;

import java.util.Scanner;

public class LRUD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String [] sArray = input.nextLine().split(" ");
		
		int x = 1; 
		int y = 1;
		
		// L, R, U, D
		int [] dx = {0, 0, -1, 1};
		int [] dy = {-1, 1, 0, 0};
		char [] moveTypes = {'L', 'R', 'U', 'D'};
		
		for(int i = 0; i < sArray.length; i++) {
			char a = sArray[i].charAt(0);
			int nx = x;
			int ny = y;
			for(int j = 0; j < moveTypes.length; j++) {
				if(a == moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			if(nx < 1 || ny < 1 || nx > n || ny > n)
				continue;
			x = nx;
			y = ny;
		}
		System.out.println(x + " " + y);
	}

}
