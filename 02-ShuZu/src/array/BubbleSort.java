package array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,2,4,6,8,3};

        int count = 0;
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j] > arr[j + 1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
