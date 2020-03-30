import java.util.Scanner;

public class Mistake {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Float a = sc.nextFloat();
		Float b = sc.nextFloat();
		
		//if (Math.abs(a - Math.round(a*100)/100) < 0.01) System.out.println("Probably two decimal places");
		
		Float z;
		z = a + b;
		System.out.println(z);
		
	}
}
