package 数学计算能力训练;

/**
 * @Author ：QIU
 * @E-mail: 3216921041@qq.com
 * @Date ： 2020/6/5 13:07
 * @Description : 减法题目类
 */
public class MinProblems extends Problems {
    public MinProblems(){
        if(num1 - num2==-1){num2-=1;}
        result = num1-num2;
    }
    public void getInfo(){
        System.out.print(String.format("%d - %d = ",num1,num2));
    }
}
