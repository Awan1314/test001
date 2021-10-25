package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,78,89,114,225,558,669};
        int index = binarySearch(arr,3);
        System.out.println(index == -1 ? "该元素不存在"  : "该元素下标为" + index);

    }

    public static int binarySearch(int[] arr, int dest){
        // 开始下标
        int begin = 0;
        // 结束下标
        int end = arr.length - 1;

        // 开始元素下标只要在结束元素下标的左边，就有机会继续执行
        while (begin <= end){
            // 中间元素下标
            int mid = (begin + end) / 2;
            if (arr[mid] == dest){
                return mid;
            }else if(arr[mid] < dest){
                // 目标元素在中间元素右边
                // 开始元素下标需要重新赋值
                begin = mid + 1;
            }else {
                // 目标元素在中间元素左边
                // 结束元素下标需要重新赋值
                end = mid - 1;
            }
        }
        return -1;
    }

}
