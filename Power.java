package Recursion;
//Program to calculate power of a number
public class Power {
	
	public static void main(String[] args) {
		Power numPow = new Power();
		System.out.println(numPow.power(5, 2));
	}
	
	public int power(int num, int pow) {
		if(pow<0) {
			return -1;
		}
	if(pow==0) {
		return 1;
	}
	return num*power(num,pow-1);  // 3^5 = 3^1*3^4

}
}
