package implement;

import java.util.Scanner;

public class chess {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String s = input.next(); 
		
		int x = s.charAt(1) - '0';
		int y = s.charAt(0) - 'a' + 1;
		
		int [] dx = {-2, -1, -2, -1, 1, 2, 1, 2};
		int [] dy = {-1, -2, 1, 2, -2, -1, 2, 1};
		
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8)
				count++;
		}
		
		System.out.println(count);
	}

}
