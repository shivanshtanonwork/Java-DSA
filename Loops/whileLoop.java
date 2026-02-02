
import java.util.Scanner;




public class whileLoop {
    public static void main(String args[]){
        System.out.println("While Loop");
        // System.out.println("Print nos. 1 to n");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter <= n){
        //     System.out.println(counter);
        //     counter++;
        // }
        System.out.println("Print sum of first n natural nos.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("sum is : " + sum);
        }
    }
