package 数学计算能力训练;

/**
 * @Author ：QIU
 * @E-mail: 3216921041@qq.com
 * @Date ： 2020/6/5 12:14
 * @Description : 加法题目类
 */
public class AddProblems extends Problems {
    public AddProblems(){
        result = num1 +num2;
    }
    public void getInfo(){
        System.out.print(String.format("%d + %d = ",num1,num2));
    }
}
