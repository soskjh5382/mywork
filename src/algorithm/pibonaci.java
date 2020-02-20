package algorithm;
//피보나치수열

public class pibonaci {

	public static void main(String[] args) {

		// array배열
		int[] arr = new int[100];

		arr[1] = 1;
		arr[2] = 1;
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");

		for (int i = 3; i < 10; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];

			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// int선언
		int num1 = 1;
		int num2 = 1;

		System.out.print
		(num1 + " ");
		System.out.print(num2 + " ");

		for (int i = 3; i < 10; i++) {

			int num3 = num1 + num2;
			System.out.print
			(num3 + " ");
			
			num1 = num2;
			num2 = num3;
			
			

		}
	}

}
