package package1;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 23;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	        flag = true;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

	}

}
