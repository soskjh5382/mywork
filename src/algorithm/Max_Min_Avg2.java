package algorithm;

import java.util.Scanner;

public class Max_Min_Avg2 {

	public static int i;

	public static void main(String[] args) {
		
		boolean count = true;
		while count{
			
		}
		
	public static input() {
		
		int[] score = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.print("숫자 입력 : ");
			score[i] = scan.nextInt();

		}
		for (int i = 0; i < score.length; i++) {
			System.out.print("입력된 숫자 : " + score[i] + "  ");
		}
		System.out.println();
		
	}

		

		int max;
		int min;

		max = score[0];
		min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
