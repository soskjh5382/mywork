package algorithm;
//대소문자 변환

public class DeaSoMunja {
	public static void main(String[] args) {

		String input = "Hello Wolrd";
		char[] arr;
		arr = input.toCharArray(); // toCharArray() ->문자열을 문자배열로 변환해서 사용
		
		System.out.println(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + 'A' - 'a');
			} // 알파벳도 고유의 아스키코드 숫자를 가지고 있음
			  // 'a'가 1이고 'A'가 11이라고 가정할경우 간격은 항상 일정
			  // 'b' 와 'B' 도 간격이 11이 됨
			  // 따라서 A 에서 a를 뺀 간격으로 대문자로 변환
			
			else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}

		}
		
		System.out.println(arr);

	}

}
