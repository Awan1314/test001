package array;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,6,7,9,8,4};

        for (int i = 0; i < arr.length; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;// 最小的元素是min
                }
            }

            // 如果i和min相等时，说明最初的猜测是正确的
            // 如果i和min不相等时，表示最初的猜测是错误的，有比这个元素更小的元素
            // 需要拿着这个更小的元素和最小的元素交换位置
            if (min != i) {
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
