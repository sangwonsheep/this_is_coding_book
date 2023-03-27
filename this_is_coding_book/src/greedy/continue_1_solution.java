package greedy;

import java.util.Scanner;

public class continue_1_solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		long start = System.currentTimeMillis();
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int count = 0;
		
		while(true) {
			int target = (n / k) * k;
			count += (n - target);
			n = target;
			if(n < k)
				break;
			count += 1;
			n /= k;
		}
		
		count -= 1;
		
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println((end-start) / 1000);
	}

}
