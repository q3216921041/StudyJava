package 数学计算能力训练;

import java.util.Random;

/**
 * @Author ：QIU
 * @E-mail: 3216921041@qq.com
 * @Date ： 2020/6/5 12:01
 * @Description : 题目类，
 */
public class Problems {
    public int num1;
    public int num2;
    public int result;
    public boolean yesorno;
    public int myresult;
    public long time;
    public Problems(){
        num1 = new Random().nextInt(50) +1;
        num2 = new Random().nextInt(50) +1;

    }

    public void getInfo() {  //打印题目信息，具体由子类实现
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public boolean isYesorno(){
        return yesorno;
    }

    public String getYesorno() {
        String jieguo = yesorno? "正确" : "错误";
        return jieguo;
    }

    public void setYesorno(boolean yesorno) {
        this.yesorno = yesorno;
    }

    public int getMyresult() {
        return myresult;
    }

    public void setMyresult(int myresult) {
        this.myresult = myresult;
        if(myresult==result){
            yesorno = true;
        }
        else{
            yesorno = false;
        }
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
