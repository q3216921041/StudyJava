package 数学计算能力训练;

/**
 * @Author ：QIU
 * @E-mail: 3216921041@qq.com
 * @Date ： 2020/6/5 13:10
 * @Description : 乘法题目类
 */
public class MulProblems extends Problems {
    public MulProblems(){
        result = num1 * num2;
    }
    public void getInfo(){
        System.out.print(String.format("%d X %d = ",num1,num2));
    }
}
