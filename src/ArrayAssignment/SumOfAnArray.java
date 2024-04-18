package ArrayAssignment;

public class SumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};

        int sum=Sum(arr);
        System.out.println("Sum of the Numbers are:"+sum);
    }

    public static int Sum(int[] arr){

        int sum=0;
        int n=arr.length;

        for (int i = 0; i < n; i++) {

            sum=sum+arr[i];
        }

        return sum;
    }
}
