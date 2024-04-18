package ArrayAssignment;

public class FindMaxElement {
    public static void main(String[] args) {

        int[] arr={10,30,43,54,23,543,43,32};

        System.out.println("max number in the given Array:"+ Max(arr));
    }

    public static int Max(int[] arr){
        int max=0;
        for (int i = 0; i <arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
