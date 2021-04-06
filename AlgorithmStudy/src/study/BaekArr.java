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
	
	@Test
	void algo2562() {
	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int a = 1;

		for (int j = 0; j < arr.length; j++) {
		
			if(max < arr[j]) {
				max = arr[j];
				a = j+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(a);
		
	}
	
	@Test
	void algo3052() {
		//나머지
		Scanner sc = new Scanner(System.in);
		
		int arr[]  = new int[10]; //입력된 숫자
		
		for(int i=0; i<arr.length; i++){
			
			arr[i] = sc.nextInt() % 42;
			
		}
		sc.close();
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = 0;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					a++;
				}
			}
			
			if( a == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
}
