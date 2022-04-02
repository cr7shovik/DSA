package Recursion;

public class Factorial {
  public static void main(String[] args) {
	  Factorial rec  = new Factorial();
	  
	  System.out.println(rec.factorial(5));
	  
  }
  
  public int factorial(int num) {
	  
	  if(num<0)
	  {
		  return -1;
	  }
	  else {
		  if(num==0 || num ==1) {
			  return 1;
		  }
		  else {
			  return num * factorial(num-1);
		  }
	  }
  }
}
