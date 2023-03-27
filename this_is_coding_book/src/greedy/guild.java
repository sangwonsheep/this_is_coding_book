package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class guild {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int [] x = new int[n];

		int count = 0;
		int group = 0;

		for(int i = 0; i < n; i++) {
			x[i] = input.nextInt();
		}
		
		Arrays.sort(x);

		for(int i = 0; i < n; i++) {
			int num = x[i];
			count++;
			if(num <= count) {
				group++;
				count = 0;
			}
		}
		System.out.println(group);
	} 

}
