

public class doWhile {
    public static void main(String args[]){
        /* do While Loop */
        // int counter = 1;
        // do { 
        //     System.out.println("Hello JAVA");
        //     counter++;
        // } while (counter <= 10);

        /* Break keyword */
        // for(int i = 1; i<=5;i++){
        //     if(i==3) break;
        //     System.out.println(i);
        // }
        // System.out.println("Out of loop");

        /* Keep entering nos until user enters multiple of 10 */
        // Scanner sc = new Scanner(System.in);
        // do { 
        //     System.out.println("Enter your number : ");
        //     int num = sc.nextInt();
        //     if(num%10 == 0) break;
        //     System.out.println(num);
        // } while (true);

        /* Continue statement - used to skip an iteration */
        // for(int i = 0;i<=10;i++){
        //     if (i==3 || i == 7) continue;
        //     System.out.println(i);
        // }

        /* Display all nos. entered by used except multiples of 10 */
        for(int i = 0; i <=100; i++){
            if(i % 10 == 0) continue;
            System.out.println(i);
        }
    }
}
