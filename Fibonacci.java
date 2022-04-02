package Recursion;

public class Fibonacci {
 public static void main(String[] args) {
	 
	 Fibonacci fib = new Fibonacci();
	 System.out.println(fib.fibonacci(5));
	 
 }
 public int fibonacci(int num)
 {
	 if (num<0) {
		 return -1;
	 }
	 else {
		 if ( num ==0 || num ==1) {
			 return num;
		 }
		 else  return fibonacci(num-1)+fibonacci(num-2);
	 }
	 
 }
}
