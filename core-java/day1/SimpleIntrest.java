import java.util.Scanner;
public class SimpleIntrest {
	public static void main( String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter principal :");
		double principal = scanner.nextDouble();
		
		System.out.print(" Enter rate(%) :");
		double rate = scanner.nextDouble();
		
		System.out.print(" Enter time(in years) :");
		double time = scanner.nextDouble();
		
		
		double simpleIntrest = (principal * rate * time) / 100;
		
		System.out.println(" Simple Intrest = " + simpleIntrest);
		scanner.close();
		}
}
