package 学生信息管理系统;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/24 14:48
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class Main {
    public static List<Student> stus = new ArrayList<>();          //学生对象数组
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("欢迎来到学生管理系统");
        String inputnum;
        while (true){
            System.out.println("请选择操作");
            System.out.println("0：退出系统");
            System.out.println("1：增加学生信息");
            System.out.println("2：查询学生信息");
            System.out.println("3：修改学生信息");
            System.out.println("4：删除学生信息");

            inputnum = scanner.next();
            switch (inputnum){
                case "0" :
                    System.exit(0);
                case "1" : writeStudent();
                        break;
                case "2" : getStudentinfo();
                        break;
                case "3" : changStudent();
                        break;
                case "4" : rmStudent();
                        break;
                default:
                    System.out.println("指令错误，请重新输入");
                    break;

            }
        }
    }
    public static void writeStudent(){
        System.out.println("输入学号");
        String inputid;
        while(true) {
            inputid = scanner.next();
            for (Student stu : stus) {
                if (stu.getStuId().equals(inputid)) {
                    System.out.println("已有该学生"+stu.toString()+"\n,请重新输入");
                }
            }
            break;
        }
        System.out.println("输入姓名");
        String inputname = scanner.next();

        System.out.println("输入年龄");
        int inputage = 0;
        boolean errorage = true;
        while (true) {
            try {
                Scanner scanner= new Scanner(System.in);
                inputage = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入不合法，请重新输入");
                continue;
            }
        }
        System.out.println("输入成绩");
        Double inputscore;
        while (true) {
            try {
                Scanner scanner= new Scanner(System.in);
                inputscore = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("输入不合法，请重新输入");
            }
        }
        System.out.println(String.format("学号：%s，姓名：%s，年龄：%d，成绩：%s\n," + "输入1保存，输入0退出不保存"
                                            ,inputid,inputname,inputage,inputscore));

        int isorno = scanner.nextInt();
        while (true){
            if(isorno==0){
                break;
            }
            if(isorno ==1){
                stus.add(new Student(inputid,inputname,inputage,inputscore));
                break;
            }
            else{
                System.out.println("输入有误，请输入1保存或0退出");
                isorno = scanner.nextInt();
            }
        }

    }
    public static void getStudentinfo(){
        System.out.println("输入查询学生的姓名或学号");
        String nameorid = scanner.next();
        boolean yesno = false;
        for(Student stu :stus){
            if(stu.getStuId().equals(nameorid)||stu.getName().equals(nameorid)){
                System.out.println("该学生信息"+stu);
                yesno = true;
                break;
            }
        }
        if(yesno==false){
            System.out.println("没有找到该学生");
        }
    }
    public static void changStudent(){
        System.out.println("输入待修改学生的学号");
        String stuid = scanner.next();
        for(int i=0;i<=stus.size();i++){
            if(i==stus.size()){
                System.out.println("没有找到该学生");
            }
            if(stus.get(i).getStuId().equals(stuid)){
                Student stu = stus.get(i);
                System.out.println("请选择操作\n0：修改姓名\n1：修改年龄\n2：修改成绩");
                String info = scanner.next();
                while (true){
                    if(info.equals("0")) {
                        System.out.println("新的姓名为：");
                        String stuname = scanner.next();
                        stu.setName(stuname);
                        stus.set(i,stu);
                        System.out.println("新的学生信息"+stu);
                        break;
                    }
                    else if(info.equals("1")) {
                        System.out.println("新的年龄为：");
                        int stuage;
                        while (true) {
                            try {
                                Scanner scanner = new Scanner(System.in);
                                stuage = scanner.nextInt();
                                stu.setAge(stuage);
                                stus.set(i,stu);
                                System.out.println("新的学生信息"+stu);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("输入不合法，请重新输入");
                                continue;
                            }
                        }
                    }
                    else if(info.equals("2")) {
                        System.out.println("新的成绩为：");
                        double stuscore;
                        while (true) {
                            try {
                                Scanner scanner = new Scanner(System.in);
                                stuscore = scanner.nextDouble();
                                stu.setScore(stuscore);
                                stus.set(i,stu);
                                System.out.println("新的学生信息"+stu);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("输入不合法，请重新输入");
                            }
                        }
                    }
                    else {
                        System.out.println("指令错误，请重新输入");
                        info = scanner.next();
                        continue;
                    }
                }
            }
        }
    }
    public static void rmStudent(){
        System.out.println("输入要删除学生的学号");
        String id = scanner.next();
        boolean seekout = false;
        for(int i=0;i<stus.size();i++){
            if(stus.get(i).getStuId().equals(id)){
                System.out.println("该学生信息为："+stus.get(i));
                System.out.println("确定要删除吗,输入1确定，输入0取消");
                while (true){
                    String yesorno =scanner.next();
                    if(yesorno.equals("1")){
                        stus.remove(i);
                        System.out.println("已删除");
                        seekout = true;
                        break;
                    }
                    if(yesorno.equals("0")){
                        System.out.println("已返回主页面");
                        seekout = true;
                        break;
                    }
                }

            }
        }
        if(seekout = false){
            System.out.println("没有找到该学生信息");
        }
    }
}
