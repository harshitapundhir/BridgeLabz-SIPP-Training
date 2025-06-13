import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int fact = 0;
        int i = 1;
        while (i<=n){
            fact = (n*(n-1));
            i++;
        }
        System.out.println("the factorial of " + n + " is " +fact);
    }
    
}
