package Recursion;

// Convert numbers from decimal to binary

// Step 1: Divide the number by 2, 
// Step 2: Get the integer quotient for next iteration
// Step 3: Get the remainder for binary digit
// Step 4: repeat the steps until quotient is equal to 0

// 15/2 => quot = 7, rem =1
// 7/2 => quot =3, rem = 1
// 3/2 => quot =1, rem=1
// 1/2 => quot =0, rem =1

//10/2 => quot =5, rem =0
//5/2 => quot =2, rem = 1
//2/2 => quot =1, rem=0
//1/2 => quot =0, rem =1

// fn(n) = n%2 + 10*fn(n/2)

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary obj = new DecimalToBinary();
		System.out.println(obj.decimalToBinary(10));
	}
	
	public int decimalToBinary(int num) {
		if(num==0) {
			return 0;
		}
		return num%2 + 10*decimalToBinary(num/2);
	}
}
