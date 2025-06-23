import java.util.Scanner;
public class FindTheSumofNumbers {
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("enter numbers to add( 0 to stop)");
        number = sc.nextDouble();
        while( number !=0){
            total += number;
            System.out.println("enter next number(0 to stop)");
            number  = sc.nextDouble();

        }
        System.out.println("total sum =" + total);

        


    }
}
