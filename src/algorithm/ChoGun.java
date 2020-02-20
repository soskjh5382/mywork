package algorithm;

import java.util.Scanner;

public class ChoGun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String str;
		
		System.out.println("오늘 공부 하실건가요?");
		str = sc.nextLine();
		if (sc.equals("네")) {
			System.out.println("언제까지 하실꺼에요?");
			a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("1시간이요");
				str = sc.nextLine();
				if(str.equals("")) {					
				}
				break;
			case 2:
				System.out.println("2시간이요");
				break;
			case 3:
				System.out.println("3시간이요");
				break;
			case 4:
				System.out.println("4시간이요");
				break;
			case 5:
				System.out.println("5시간이요");
				break;
				default:
					break;
			}
		} else if (sc.equals("아니요")) {
			System.out.println("그럼 꺼져");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
	}
}
