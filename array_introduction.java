import java.util.Scanner;

public class array_introduction{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        /* array creation
        * int[] marks={1,2,3,4,5};
        * int[] marks=new int[size];
        * int[] marks; marks=new int[size]; */
        int[] nums=new int[n];
        // array traversal
        for(int i=0;i<nums.length;i++){
            System.out.printf("Enter %d number",i+1);
            nums[i]=sc.nextInt();
        }
        //display array
        for(int i=0;i<n;i++) {
            System.out.println(nums[i]);

        }
        //display array in reverse order
        for(int i=nums.length-1;i>=0;i--){
            System.out.println(nums[i]);

        }
        // for-each loop
        for(int i: nums){
            System.out.println(i);
        }
    }
}