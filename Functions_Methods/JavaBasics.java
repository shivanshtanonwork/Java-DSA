
public class JavaBasics {

    public static void printHello(){
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static int multiply(int x, int y){
        int product = x * y;
        return product;
    }

    public static int factorial(int n){
        // n! = n * (n-1) * (n-2) .... * 1  
        int f = 1;

        for(int i = 1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        // nCr = n! / r!(n-r)!
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        
        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }
    public static void main(String[] args) {    
        printHello();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println(sum);
        
        // swap 
        int a = 5;
        int b = 10;
        swap(a,b);

        System.out.println(multiply(5, 5));

        // factorial
        System.out.println(factorial(4));

        //binCoeff
        System.out.println(binCoeff(5, 2));
    }
}
