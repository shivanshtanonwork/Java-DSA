public class Patterns {
    
    public static void hollow_rectangle(int totRows, int totCols){
        // outer loop
        for(int i = 1; i <= totRows; i++){
            // inner loop
            for(int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_halfPyramid(int n){
        // outer loop
        for(int i = 1; i <= n ;i++){
            // inner loop
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
                // stars loop
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void inverted_halfPyramidWithNos(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <= n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){
        // outer loop
        for(int i = 1; i<=n;i++){
            // inner loop
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1;i--){
            // inner loop
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n;i>=1;i--){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverted_halfPyramid(4);
        // inverted_halfPyramidWithNos(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly_pattern(4);
        // solid_rhombus(4);
        // hollow_rhombus(10);
        diamond_pattern(4);
    }

}