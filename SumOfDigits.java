package Recursion;
// program to find the sum of all the digits of a number
public class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits sum = new SumOfDigits();
		System.out.print(sum.sumOfDigits(123));
	}
	
  public int sumOfDigits(int num) {
	  if(num==0 || num<1 ) {
		  return 0;
	  }
	  return num%10 + sumOfDigits(num/10);  
	  
  }
}
