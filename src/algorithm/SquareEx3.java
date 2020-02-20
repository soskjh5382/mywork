package algorithm;
//사각형 차수

// 1 4 7
// 2 5 8 
// 3 6 9 

import java.util.Scanner;

public class SquareEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		

		System.out.println("숫자 입력 : ");
		num = scan.nextInt();

		int arr[] = new int[num];

		while (num > 0) {
			arr[num % 10]++;
			num /= 10;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println(i + "의 개수 : " + arr[i]);
			
		}
	}
}
