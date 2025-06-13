import java.util.Scanner;
public class sumwithoutnegativenumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double total = 0.0;

    
    while (true){
        System.out.print("Enter a number (0 or negative number to stop)");
        double number = sc.nextDouble();
        if( number <=0){
            break;
        }
        total += number;

    }

    System.out.println("total sum = " +total);


}
}
