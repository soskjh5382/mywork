package algorithm;
//입력값 소수판별 flag함수

import java.util.Scanner;

public class SosuCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		
		int num = scan.nextInt();
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true; // 조건에 만족할 경우 true로 바뀜
				break;
			}
		}
		if (flag) {
			System.out.println("소수가 입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
