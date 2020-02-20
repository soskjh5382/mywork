package algorithm;
//10진수를 2진수로 변환

public class BinaryNumber {

	public static void main(String[] args) {

		int inputNumber = 19;
		int bin[] = new int[100];

		int i = 0;
		int mok = inputNumber;

		while (mok > 0) {
			bin[i] = mok % 2; // mok을 2로나눈 나머지를 bin[i]배열에 저장
			mok /= 2; // mok 값에 2로나눈 값을 저장
			i++; // 배열번지증가
		}
		
		i--;
		for (; i >= 0; i--) {
			System.out.print(bin[i]);
		}
		// 끝번지수부터 출력하므로 i--
	}

}
