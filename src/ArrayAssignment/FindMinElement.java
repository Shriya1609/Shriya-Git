package ArrayAssignment;

public class FindMinElement {
    public static void main(String[] args) {

        int[] arr={10,30,43,54,23,543,43,32};

        System.out.println("Minimum number in the given Array:"+ Min(arr));

    }

    public static int Min(int[] arr){
        int min=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
