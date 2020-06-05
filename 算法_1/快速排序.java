package 算法_1;

public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 5, 9, 11, 16, 19, 1, 2, 4, 3, 1};
        Sort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + ",");
        }
        System.out.println("");

    }

    public static void Sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int k = array[left], i = left, j = right, t; //基准数k
        while (i != j) {
            while (array[j] >= k && i < j) {        //右边开始找
                j--;
            }
            while (array[i] <= k && i < j) {        //再左边
                i++;
            }
            if (i < j) {                //交换左右位置
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
        array[left] = array[i];         //把基数换到中间
        array[i] = k;


        Sort(array, left, i - 1);      //继续处理左边  递归
        Sort(array, i + 1, right);      //继续处理右边

    }
}