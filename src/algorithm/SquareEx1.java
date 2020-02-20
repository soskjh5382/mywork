package algorithm;
//사각형 차수

// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

public class SquareEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int i = 1;
		

		System.out.println("사각형 차수 입력 : ");
		num = scan.nextInt();

		int arr[][] = new int[num][num];
		int row, col;
		for (row = 0; row < num; row++) {
			for (col = 0; col < num; col++) {
				arr[row][col] = i++;
				//arr[col][row]로 변경시
				// 1   4   7
				// 2   5   8
				// 3   6   9
			}
		}
			for (row = 0; row < num; row++) {
				for (col = 0; col < num; col++) {
					System.out.printf("%4d",arr[row][col]);
				}System.out.println();
			}
		}
	}
