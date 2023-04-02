package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class soldier {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		ArrayList<Integer> dp = new ArrayList<>();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		boolean check;
		int result = 0;
		dp.add(array[n-1]);
		
		for(int i = n-2; i >= 0; i--) {
			check = false;
			for(int j = 0; j < dp.size(); j++) {
				if(dp.get(j) < array[i])
					check = true;
				else
					check = false;
			}
			if(check)
				dp.add(array[i]);
			else 
				result++;
		}
		
//		for(int i : dp)
//			System.out.println(i);
		System.out.println(result);
	}

}
