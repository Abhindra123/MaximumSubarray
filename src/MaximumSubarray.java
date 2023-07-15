import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarray {
    public static int maximinSubArray(int arr[],int limit)
    {
        int sum=0;
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            // arr[i]=arr[i-1]+arr[i];
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    //   System.out.print(arr[k]);
                    if(k==j){
                        sum=sum+arr[k];
                    }
                }
                // System.out.println();
            }
            //System.out.println(sum);
            list.add(sum);
            sum=0;
            //System.out.println();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                if(list.get(i)<=limit){
                    max=list.get(i);
                }
            }
        }
        if(max<0){

            return 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the limit : ");
        int l=sc.nextInt();
        int val=maximinSubArray(arr,l);
        System.out.println("the value is :"+val);
    }


}