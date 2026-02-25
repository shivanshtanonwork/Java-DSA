public class ArrayCC {

    public static void update(int marks[]){
        for(int i = 0; i< marks.length;i++){
            marks[i] += 1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length - 1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length-1;
        while(start<end){
            int temp = numbers[end];
            numbers[end]= numbers[start];
            numbers[start]=temp;
            start++;
            end--;      
        }
    }

    public static void printPairs(int numbers[]){
        for(int i = 0; i < numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+curr + "," + numbers[j] +")");
            }
            System.out.println();
        }
    }

    public static void subarrays(int nums[]){
        int ts = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + ts);
    }
    public static void main (String args[]){
        // int marks[] = new int[50];
        // int numbers[] = {1,2,3};
        // String fruits[] = {"Apple", "Mango", "banana"};

        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy: " + marks[0]);
        // System.out.println("chem: " + marks[1]);
        // System.out.println("math: " + marks[2]);
    //     int marks[] = {98,99,97};
    //     update(marks);
    //     // print updated marks
    //     for(int i = 0; i<marks.length;i++){
    //         System.out.println(marks[i]);
    //     }
    // }

    // int numbers[] = {2,4,6,8,10,12,14,16};
    // int key = 10;
    // int index = linearSearch(numbers, key);
    // if(index == -1){
    //     System.out.println("Not Found");
    // }else {
    //     System.out.println("key is at index : " + index);
    // }

    // int numbers[]= {1,3,6,2,4}; 
    // System.out.println("largest number is : "+ getLargest(numbers));

    // int numbers[] = {2,4,6,8,10,12,14};
    // int key = 10;

    // System.out.println("index of key is : " + binarySearch(numbers, key));

    // int numbers[] = {2,4,6,8,10};
    // reverseArray(numbers);
    // for(int i = 0;i<numbers.length;i++){
    //     System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // int numbers[] = {2,4,6,8,10};
    // printPairs(numbers);

    int nums[] = {2,4,6,8,10};
    subarrays(nums);
  }
}
