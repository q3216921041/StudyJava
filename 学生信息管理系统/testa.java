package 学生信息管理系统;

import java.util.Scanner;

public class testa {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner sc=new Scanner(System.in);//这里出问题了，声明写到循环内
        while(true){
            try {
//              Scanner sc=new Scanner(System.in);
                System.out.println("请输入被除数");
                a=sc.nextInt();
                System.out.println("请输入除数");
                b=sc.nextInt();
            } catch (Exception e) {
                System.out.println("输入的内容包含非数字的字符，请重新输入");
            }
            try {
                System.out.println("商是"+(a/b));
            } catch (Exception e) {
                System.out.println("NaN");
            }
        }
    }

}
