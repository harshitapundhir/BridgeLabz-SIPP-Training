import java.util.Scanner;
public class RocketLaunchCondition {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter thr countdown number :");
        int counter  = sc.nextInt();
        while( counter>=1){
            System.out.println(counter);
            counter--;
        }

        System.out.println("rocket launched");



    }
    
}
