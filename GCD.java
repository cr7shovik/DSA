package Recursion;

// GCD - greatest common divisor of two numbers - (12,8) =4 ,  here 8=2*2*2, 12=2*2*3 => gcd =4

// Eucledian's formula :  
// GCD(48,18)
// Step 1: 48/18 =2 , remainder = 12
// Step 2: 18/12=1, remainder = 6
// Step 3: 12/6 , remainder = 0
// GCD (a,0) = 0
// GCD (a,b) = GCD(b,a%b)


public class GCD {
	
	public static void main(String[] args) {
		
		GCD obj = new GCD();
		System.out.println(obj.gcd(48, 18));
		
	}
    
	public int gcd(int a, int b) {
		if(b<0) {
			return -1;
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
