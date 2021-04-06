package study;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class BaekArr {

	@Test
	void algo10818() {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for (int i = 0; i <N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		sc.close();
		
		System.out.println(arr[0] + " " + arr[N-1]);
		
	}

}
