import java.util.Scanner;
public class Perimeterofrectangle{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		
		System.out.println(" Enter the width of rectangle: ");
		double width = sc.nextDouble();
		
		double perimeter = 2*(length + width);
		
		System.out.println("perimeter of rectangle : " + perimeter);
		sc.close();
		
	}
}
