package package1;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int num = 1234567;
		
		while(num != 0) {
			num = num/10;
			count++;
		}
		
		System.out.println(count);

	}

}
