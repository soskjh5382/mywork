package algorithm;
//팩토리얼 재귀함수

import java.util.Scanner;

public class factorial2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int x;
		int fac = 1;

		System.out.println("정수 입력 : ");
		x = scan.nextInt();
		
			System.out.println(facNomal);
	}
	
	
	public static int facNomal(int x){
		for (int i = x; i > 0; i--) {
		fac = fac * i;
	}		

	}



//Scanner scan = new Scanner(System.in);

//int x;
//int fac = 1;
//
//System.out.println("정수 입력 : ");
//x = scan.nextInt();
//
//
//
//for(int i = 1; i<=x; i++) {
//	fac = fac * i;
//}
//
//System.out.println(fac);