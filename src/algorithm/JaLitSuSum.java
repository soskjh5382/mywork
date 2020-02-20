package algorithm;
//각 자릿수의 합

import java.util.Scanner;

public class JaLitSuSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		System.out.println("숫자 입력 : ");
		num = scan.nextInt();

		while (num != 0) {
			sum = sum + num % 10;
			// 10으로 나눈 나머지들은 일의자리가 나옴

			num = num / 10;
			// 입력값도 다시 10으로 나누어줌
		}
		System.out.println("각 자리수의 합은" + sum);
	}

}
