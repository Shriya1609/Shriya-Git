package ArrayAssignment;

public class SecondMinNum {
    public static void main(String[] args) {
        int[] arr={10,30,43,54,23,543,43,32};

        System.out.println("Second minimum number is:"+SecondMinNum(arr));
    }

    public static int SecondMinNum(int[] arr) {

        int n = arr.length;
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }


        }
        return arr[1];
    }
}
