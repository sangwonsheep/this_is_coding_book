package implement;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		String str = new String();
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				str += s.charAt(i);
			else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum += s.charAt(i) - '0';
			}
		}
		char [] array = str.toCharArray();
		Arrays.sort(array);
		str = new String(array);
		System.out.println(str + sum);
	}

}
