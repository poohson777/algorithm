package study;

import java.util.ArrayList;
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
	
	
	@Test
	void algo1546() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		double M = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		
		Arrays.sort(arr);
		M = arr[num-1]; // 받은 점수 중 최고점
		
		
		double arr2[] = new double[num]; // 조작된 성적 넣는 배열
		
		for (int i = 0; i < arr.length; i++) {
		
			arr2[i] =  (arr[i]/M)*100;
		}
		
		double result = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			result +=  arr2[i];
		}
		
		System.out.println(result / num);
		
	}
	
	@Test
	void algo8958() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
				
		ArrayList<String> lst = new ArrayList<String>();
				
		for(int i = 0; i<= num; i++) {
			
			lst.add(i, sc.nextLine());
			
		}
		sc.close();
		
		int result = 0;
		int idx = 0;
		
		for(int j=1; j<lst.size(); j++) {
			
			String[] arr =  lst.get(j).split("");
			
			for(int i = 0; i< arr.length; i++) {
				
				if(arr[i].equals("O")) {
				
					idx = idx+1;
					result = result + idx;
					
				}else if(arr[i].equals("X")) {
					idx = 0;
				}
				
			}
			System.out.println(result);
			idx = 0;
			result = 0;
		}
	}
	
	@Test
	void algo4344() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double score = 0;
		
		if(sc.hasNextLine()) {
			
			for(int i = 0; i<num; i++) {
				
				int idx = sc.nextInt();
				
				for(int j= 0; j < idx; j++) {
					
					score = score+sc.nextDouble();
				}
				
				System.out.println(score);
				score = 0;
			}
		}
		
		
		sc.close();
	}
	
}
