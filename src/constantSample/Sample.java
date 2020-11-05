package constantSample;

public class Sample {

	public static void main(String[] args) {
		// 상수는 값을 변경 불가 하다
		final int SIZE =100;
		int num = 10;
		
		System.out.println(SIZE);
		System.out.println(num);
		num = 20;
	}

}
