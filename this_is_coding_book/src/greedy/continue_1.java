package greedy;

import java.util.Scanner;

public class continue_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		long start = System.currentTimeMillis();
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int count = 0;
		
		while(true) {
			if(n <= 1)
				break;
			if(n % k == 0) {
				n /= k;
			}
			else {
				n -= 1;
			}
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println((end-start) / 1000);
	}

}
