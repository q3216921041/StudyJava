package 算法_1;

public class 斐波那契数列求和 {
    public static void main(String[] arge) {

        System.out.println(f(6));
        System.out.println(hanshu(50));

    }
    /*   ------------递归-------------------*/
    public static int f(int n){
        if(n==0||n==1){return n;}
        else{return f(n-1)+f(n-2);}


    }
    /*-----------------------优化----------------*/
    public static long hanshu (int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        long a1=0;
        long a2=1;
        long a=0;
        for(int i=2;i<=n;i++){
            a=a1+a2;
            a1=a2;
            a2=a;
        }
        return a;
    }


}
