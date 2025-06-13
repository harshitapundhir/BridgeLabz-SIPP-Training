import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("mention the month [1-12]");
        int n  = sc.nextInt();
        System.out.println("mention the date (1-31)");
        int m = sc.nextInt();
        boolean isSpring= ( n == 3 && m >=20) || ( n== 4) || (n ==5) || (n==6  && m <=20);
         if (isSpring){
            System.out.println(" It is a spring season.");
         }
         else{
            System.out.println("It is not spring season");
         }

    }
    
}
