package ArrayAssignment;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        System.out.println("Original Array:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");

            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if(arr[j]>arr[k]){

                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

            }
        System.out.println("***********************");
        System.out.println("Sorted Array:");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p]+ " ");
        }








    }

}
