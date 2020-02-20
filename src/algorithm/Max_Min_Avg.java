package algorithm;
//최대값,최소값, 합계, 평균

import java.util.Scanner;

public class Max_Min_Avg {

	public static int i;

	public static void main(String[] args) {

		int[] score = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.print("숫자 입력 : ");
			score[i] = scan.nextInt();

		}
		System.out.print("입력된 숫자 목록 : ");

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "  ");
		}
		System.out.println();
		// 숫자 input

		int max;
		int min;
		int sum = 0;
		double avg;

		max = score[0];
		min = score[0];

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
			
		}avg = (int) (sum / (double)score.length);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균" + avg);

	}

}
