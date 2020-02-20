package algorithm;
//최대공약수, 최소공배수(while문)

import java.util.Scanner;

//유클리드 호제법 알고리즘은 아래와 같습니다.
//1. 두 수를 입력받는다.
//2. 두 수중 큰수와 작은수를 구분한다.
//3. 두 수를 나눈 나머지가 0일때 까지 큰수와 작은수를 나눈다.
//4. 나머지가 0이 되는 순간 작은수가 최대공약수이다.
//5. 나머지가 0이 아니면 큰수는 작은수, 작은수는 나머지에 대입한다.
//6. 처음 입력받은 두수의 곱을 최대공약수로 나누면 최소공배수가된다.

public class Gcd_Lcm_while {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2;
		System.out.println("첫 번째 수 : ");
		num1 = scan.nextInt();
		System.out.println("두 번째 수 : ");
		num2 = scan.nextInt();

		int small;
		int big;

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}

		int gcd = 1; // 최대공약수
		int lcm = 1; // 최소공배수
		int mok = 1;
		int nmg = 1;

		while (true) {
			mok = big / small;
			nmg = big - mok * small;

			if (nmg == 0) {
				gcd = small;
				lcm = num1 * num2 / gcd;
				System.out.println("최대공약수 : " + gcd);
				System.out.println("최소공배수 : " + lcm);
				break;
			} else {
				big = small;
				small = nmg;
			}

		}

	}
}