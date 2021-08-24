public class BasicProgramingHomework {
//1.Find the sum of the odd numbers between 0 to 50, output sum value on screen.
	public static void main(String[] args) {
		
		int oddSum = 0;
		
		for(int i = 0; i <= 50; i++){
			if(i % 2 == 1){
				oddSum += i;
			}
		}
		System.out.println("1.sum of odd numbers between 0 to 50 : " + oddSum);
		
		
//2.Completed below function to calculate the factorial of a number (a non-negative integer). The function accepts the number as an argument.
		System.out.println("2.factorial of number : " + factorialOfNumber(10));
		
	}
	public static long factorialOfNumber(int n) {
		// Write your source code here
		
		int multiplicationResult = 1;
		
		if(n > 0){
			
			for(int i = n; i > 0; i--){
				multiplicationResult *= i;
			}
			
		}
		else{
			// negative integer
			multiplicationResult = 0;
		}
		
		return multiplicationResult;
	}
}