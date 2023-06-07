package in.ineuron.assessment;

import java.util.Scanner;

public class ExceptionHandlingQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		try {
			positiveNoChecker(number);
			System.out.print("It is a positive number.........");
		} catch (NegativeNumberException e) {
			e.printStackTrace();
			System.out.println("Negative number.......");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void positiveNoChecker(int number) throws NegativeNumberException {
		
		if(number<0) {
			throw new NegativeNumberException();
		}
		
	}

}


class NegativeNumberException extends Exception{

	private static final long serialVersionUID = 1L;
	
}