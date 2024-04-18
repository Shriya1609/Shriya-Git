package ArrayAssignment;

public class AverageOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};

        float Avg=Avg(arr);
        System.out.println("Average of array elements are:"+Avg);
    }

    public static float Avg(int[] arr){
        float avg=0;
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            avg=sum/2;
        }

        return avg;
    }
}
