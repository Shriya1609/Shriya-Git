package ArrayAssignment;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr ={10,30,43,54,23,543,43,32};

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("********************");
        System.out.print("Reverse Array:");

        RevArray(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void RevArray(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

}
