package Programs;

public class Factorial {

	public static void main(String[] args) {
		//factorial of 4 = 4*3*2*1=24
		
		int fact =1;
		for(int i =1; i<=4; i++) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
