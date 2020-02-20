package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int deg;
		

				System.out.print("사각형의 차수를 입력하세요. : ");
				deg = scan.nextInt();				
			
				System.out.println("숫자만 입력해야 합니다.");
			
		
		scan.close();
		int array[][] = new int[deg][deg];
		int row, col;
		int i=1;
		for(row=0;row<deg;row++){

			for(col=0;col<deg;col++){
				array[row][col]=i++;
			}
		}
		for(row=0;row<deg;row++){
			for(col=0;col<deg;col++){
				System.out.printf("%3d",array[row][col]); //글자수를 3개로 배열을 출력
			}
			System.out.println();
		}
	}
}


