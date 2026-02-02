public class forLoop {
    public static void main(String args[]){
        System.out.println("For Loop");
        // for(int i = 1; i <= 10;i++){
        //     System.out.println("Hello JAVA");
        // }

        // System.out.println("Square pattern");
        // for(int line = 1;line<=4;line++){
        //     System.out.println("****");
        // }

        // int j = 1;
        // while(j <= 4){
        //     System.out.println("****");
        //     j++;
        // }

        //Print reverse of a number
        // lastDigit = num % 10 
        // remove last digit = num/10

        // int n = 10899;
        // while(n>0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }
        // System.out.println();

        // Reverse the given number
        // rev = (rev * 10) + lastDigit
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        } 
        System.out.println(rev);
    }
}
