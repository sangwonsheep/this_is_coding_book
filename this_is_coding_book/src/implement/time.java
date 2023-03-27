package implement;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int h = n;
		int m = 60;
		int s = 60;
		
		int count = 0;
		
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < s; k++) {
					if(check(i, j, k)) count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
			return true;
		return false;
	}
}
