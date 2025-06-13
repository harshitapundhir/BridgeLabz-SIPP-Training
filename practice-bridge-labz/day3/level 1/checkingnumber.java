import java.util.Scanner;
public class checkingnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if( n>0){
            System.out.println("The number is positive");
        
        }
        else if ( n==0){
            System.out.println("the number is Zero ");


        }
        else{
            System.out.println("The number is negative");
        }

        


    }
    
}
