package 数学计算能力训练;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author ：QIU
 * @E-mail: 3216921041@qq.com
 * @Date ： 2020/6/5 12:17
 * @Description : 运行类，主要逻辑实现
 */
public class Main {
    public static ArrayList<Problems> problemsLise = new ArrayList<Problems>(); //保存题目对象
    static float fnum =0;   //储存答对题目的数量
    static long usedTime;          //用于计时
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("作者姓名：邱洪奇    学号：1806410120  \n\n");
        System.out.println("1--加法   2--减法  3--乘法  4--除法  5--随机");
        System.out.print("请输入训练的项目");
        String p = scanner.next();
        System.out.println("\n训练开始，输入-1终止训练");
        switch (p) {
            case "1":
                while (true){
                    Problems problems = new AddProblems();
                    if (doProblems(problems) == -1) break;
                }
                break;
            case "2":
                while (true){
                    Problems problems = new MinProblems();
                    if (doProblems(problems) == -1) break;
                }
                break;
            case "3":
                while (true){
                    Problems problems = new MulProblems();
                    if (doProblems(problems) == -1) break;
                }
                break;
            case "4":
                while (true){
                    Problems problems = new DivProblems();
                    if (doProblems(problems) == -1) break;
                }
                break;

            case "5":            //随机题目
                while (true) {                                   //生成随机题目
                    int num = new Random().nextInt(4) + 1;
                    Problems problems = new Problems();
                    switch (num) {
                        case 1:
                            problems = new AddProblems();
                            break;
                        case 2:
                            problems = new MinProblems();
                            break;
                        case 3:
                            problems = new MulProblems();
                            break;
                        case 4:
                            problems = new DivProblems();
                            break;
                    }
                    if (doProblems(problems) == -1) break;
                }
                break;
        }
        int frate =(int) fnum *100 / problemsLise.size();   //把浮点型转换为100倍的整形
        long time = usedTime / problemsLise.size();         //把总时间转换成平均时间
        System.out.println(String.format("本次答题正确率：%d%% ,平均耗时%d秒",frate,time));
        if(frate==100 && time<3) System.out.println("评价：算术之神\n\n");
        else if(frate==100) System.out.println("评价： 算无遗漏\n\n");
        else if(frate>80) System.out.println("评价：口算能手\n\n");
        else if(frate>60) System.out.println("评价：勉强及格\n\n");
        else System.out.println("评价：仍需努力\n\n");
        while (true) {
            System.out.print("1--查看错题记录 2--重做错题 3--查看题目记录 4--退出系统\n请输入指令");
            String t = scanner.next();
            switch (t) {
                case "1":
                    System.out.println("错题记录：");
                    for (Problems problems : problemsLise) {
                        if (problems.isYesorno() == false) {
                            problems.getInfo();
                            System.out.println(String.format(" 我的答案：%s 正确答案：%s",problems.getMyresult(),problems.getResult()));
                        }
                    }
                    System.out.println("\n\n");
                    break;
                case "2":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
                    for(Problems problems :problemsLise){
                        if(problems.isYesorno()==false) donoProblems(problems);
                    }
                    break;
                case "3":
                    for (Problems problems : problemsLise){
                        problems.getInfo();
                        System.out.println(String.format("%s %s 耗时%s秒",problems.getMyresult(),problems.getYesorno(),problems.getTime()));
                    }
                    System.out.println("\n\n");
                    break;
            }
            if(t.equals("4")) break;
        }

    }



    static int doProblems(Problems p){    //做题的方法 返回输入的数字
        long startTime =  System.currentTimeMillis();  //初始时间
        p.getInfo();
        int myresults = scanner.nextInt();
        if(myresults==-1) return -1;
        long time = (System.currentTimeMillis() - startTime )/1000;
        usedTime += time;  //单位毫秒乘一千为秒
        p.setTime(time);   //把时间写入题目类
        p.setMyresult(myresults);
        if(p.isYesorno()==true) fnum++ ;   //答对数量
        problemsLise.add(p);
        return myresults;
    }

    static void donoProblems(Problems p){    //重做错题的方法 返回输入的数字
        p.getInfo();
        int myresults = scanner.nextInt();
        p.setMyresult(myresults);
        p.getYesorno();
    }
}
