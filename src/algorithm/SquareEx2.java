package algorithm;
//사각형 차수

//0 0 1	0 0
//0	2 3	4 0
//5 6 7 8 9
//0 10 11 12 0
//0 0 13 0 0

//import java.util.Scanner;

public class SquareEx2 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("사각형 차수 입력 : ");
//		int num = 0;
//		num = scan.nextInt();
		int arr[][] = new int[5][5];
		

		int i = 1;
//		int center  = (int) 5/2+1;
//		int start = center;
//		int end = center;

		int row, col = 0;
		int start,end = 5/2;
		

		for (row = 0; row < 5; row++) {			
			for (col = start; col < end; col++) {
				arr[row][col] = i;
				i = i + 1;
			}
		}

//			if (row < center) {
//				start--;
//				end++;
//			} else {
//				start++;
//				end--;
//			}

		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr.length; col++) {
				System.out.printf("%4d", arr[row][col]);
			}
			System.out.println();
		}
	}
}
