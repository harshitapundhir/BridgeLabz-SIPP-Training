
import java.util.Scanner;
public class naturalnumberwhileloop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number : ");
        int n = sc.nextInt();
        if ( n<=0){
            System.out.println("please enter a valid number : ");

        }
        else{
            int sum = n*(n+1)/2;
            int loopsum = 0;
            int i =1;
            while( i<=n){
                loopsum +=i;
                i++;
            }
            System.out.println("Sum using formula : " + sum);
            System.out.println("Sum using while loop: " + loopsum);

            if( sum == loopsum){
                System.out.println("both are correct");


            }
            else{
                System.out.println("both are mismatched");
            }

        }
       

    }

    
}
