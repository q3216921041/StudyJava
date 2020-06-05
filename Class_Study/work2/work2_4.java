package Class_Study.work2;

public class work2_4 {
    //    2.一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
//    注意：编写方法实现需求，方法为： public static int  method( int n ){ return 0;}。
//    当n=2 ,则方法返回值为2：即两种跳法。 当 n= 7 时， 则方法返回值为21 即21种跳法。
    public static int method(int n) {
        int number = n;          //青蛙跳的次数
        int sum = 0;             //青蛙的跳法和
        while (number >= n / 2) {
            int pro1 = 1;
            int pro2 = 1;
            int cutpro = 0;
            for (int i = 0; i < n - number; i++) {
                pro1 *= (number - i);           //组合的分子
                pro2 *= (i + 1);                //组合的分母
            }
            sum += pro1 / pro2;
            number -= 1;
        }
        return sum;
    }

    //    3.输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
//    注意：编写方法实现： public int[] getLeastNumbers(int[] arr , int k){}
//    示列1：输入：arr = [3,2,1], k = 2
//    输出：[1,2] 或者 [2,1]
//
//    示列2：输入：arr = [0,1,2,1], k = 1
//    输出：[0]
//
    public static int[] getleastNumbers(int[] arr, int k) {
        int[] list = new int[k];
        int test, min = 0;
        for (int i = 0; i < k; i++) {
            test = Integer.MAX_VALUE;               //Integer.MAX_VALUE最大的整数
            for (int j = 0; j < arr.length; j++) {
                if (test > arr[j]) {
                    min = j;
                    test = arr[j];
                }
            }
            arr[min] = Integer.MAX_VALUE;
            list[i] = test;
        }
        for (int i = 0; i < list.length; i++) {        //方便演示
            if (i == 0) {
                System.out.print("[" + list[i] + ",");
            }
            else if (i == list.length - 1) {
                System.out.println(list[i] + "]");
            }
            else {System.out.print(list[i]+",");}
        }
        return list;
    }

//    4.给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 true，否则返回 false。
//    注意：编写方法实现：public  boolean isPerfectSquare(int num){}
//    示列1：输入：16
//    输出：true
//    示列2：
//    输入：14
//    输出：false
    public static boolean isPerfectSquare(int num){
        for(int i=1;i*i<=num;i++){
            if(i*i==num){
                return true;
            }
        }

        return false;
    }
}
