public class invertedStarPattern {
    public static void main(String args[]){
        // outer loop - 4 times - 4 lines
        int n = 4;
        for(int i = 1; i <= n; i++){
            // inner loop - i=1 star=4 stars = n-i+1
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
