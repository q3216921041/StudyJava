package Class_Study.work1;

import java.util.Scanner;
public class HomeWork1{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("输入一个数判断是否为回文数");
        long num1 =in.nextLong();
        System.out.println(isPlalindrome(num1));

        System.out.println(" 分别输入待转移的字符串和转移位置");
        String str1 =in.next();
        int num2 =in.nextInt();
        System.out.println(strReversal(str1,num2));

        System.out.println("输入一个待计算整数");
        int num3 = in.nextInt();
        System.out.println(result(num3));
    }
    /**
     * 判断number是否为回文数
     * 如果number为回文数，则返回true
     * 如果number不是回文数，则返回false
     * @param number
     * @return
     */
    public static boolean isPlalindrome(long number){
        boolean isFlag = true;
        String l = number+"";     //转化为字符串
        long[] list = new long[l.length()];
        int i =0;
        while(number!=0){
            long A = number%10;  //取出个位数
            number/=10;          //去除个位数
            list[i]=A;
            i++;
        }
        for(int j=0;j<(l.length()/2);j++)
            if(list[j]!=list[l.length()-j-1]){isFlag=false;}

        return isFlag;
    }

    /**
     * 字符串前面的n个字符转移到字符串的尾部。
     * 例如输入："abcdefg"和数字2 即str="abcdefg" n=2
     * 则函数的返回值为 ："cdefgab"
     *
     * @param str = "abcdefg"
     * @param n = 2
     * @return "cdefgab"
     */
    public static String strReversal(String str, int n ){
        String str1=str.substring(0,n);
        String str2=str.substring(n,str.length());
        str=str2+str1;
        return str;
    }

    /**
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     *   函数入参：number = 234
     * 函数返回值为：15
     *     解释：
     *  各位数之积 = 2 * 3 * 4 = 24
     *  各位数之和 = 2 + 3 + 4 = 9
     *  结果 = 24 - 9 = 15
     * @param number = 234
     * @return 15
     */
    public static long result(long number){
        long sum=0;
        long pro=1;
        long i=0;
        while(number!=0){
            i=number%10;
            number/=10;
            sum+=i;
            pro*=i;
        }
        number=pro-sum;
        return number;
    }
}



