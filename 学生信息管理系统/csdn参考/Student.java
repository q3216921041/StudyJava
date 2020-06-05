package 学生信息管理系统.csdn参考;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/24 14:47
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
import java.util.Scanner;
class  Student {
    String num;
    String name;
    String gender;
    byte age;
    byte grade;
}

class main{
    public static void main(String[] args ){
        System.out.println("欢迎使用学生信息管理系统");
        Student stu[] =  new Student[10];
        int dataIndex = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("请选择操作");
            System.out.println("0：退出系统");
            System.out.println("1：输入学生信息");
            System.out.println("2：查询学生信息");
            System.out.println("3：修改学生信息");
            System.out.println("4：删除学生信息");
            //int opIndex = scan.nextInt();
            int opIndex = scanner.nextInt();

            switch(opIndex){
                case 0:
                    System.exit(0);///退出系统

                case 1:
                    Scanner scan = new Scanner(System.in);
                    Student stud = new Student();
                    System.out.println("请输入学生的学号");
                    stud.num = scan.next() ;///重点：scanner 的使用

                    System.out.println("请输入学生的姓名");
                    stud.name = scan.next() ;///加括号

                    System.out.println("请输入学生的性别");
                    stud.gender = scan.next() ;

                    System.out.println("请输入学生的年龄");
                    stud.age = scan.nextByte() ;

                    System.out.println("请输入学生的成绩");
                    stud.grade = scan.nextByte() ;
                    stu[dataIndex] = stud;
                    dataIndex++;
                    break;

                case 2:

                    System.out.println("请输入要查询学生的姓名");
                    Scanner sc = new Scanner(System.in);
                    String nam = sc.next();
                    int numb = -1;
                    for(int i = 0; i <dataIndex ; i++){
                        if(stu[i].name .equals(nam)){
                            numb = i;
                        }

                    }
                    if(numb >=0){
                        System.out.println("该学生的学号为：" + stu[numb].num);
                        System.out.println("该学生的性别为：" + stu[numb].gender);
                        System.out.println("该学生的年龄为：" + stu[numb].age);
                        System.out.println("该学生的成绩为：" + stu[numb].grade);
                    }

                    else{
                        System.out.println("不存在该学生！！");
                    }
                    break;
                case 3:
                    System.out.println("请输入要修改信息学生的姓名");
                    Scanner sc1 = new Scanner(System.in);//sc不能重复定义
                    String nam1 = sc1.next();///nam不能重复定义
                    int numb1 = -1;
                    for(int i = 0; i <dataIndex ; i++){
                        if(stu[i].name .equals(nam1)){
                            numb1 = i;
                        }
                    }
                    if(numb1 >= 0){
                        System.out.println("请输入学生的学号");
                        stu[numb1].num = sc1.next() ;

                        System.out.println("请输入学生的姓名");
                        stu[numb1].name = sc1.next() ;

                        System.out.println("请输入学生的性别");
                        stu[numb1].gender = sc1.next() ;

                        System.out.println("请输入学生的年龄");
                        stu[numb1].age = sc1.nextByte() ;

                        System.out.println("请输入学生的成绩");
                        stu[numb1].grade = sc1.nextByte() ;
                    }
                    else{
                        System.out.println("不存在该学生！！");
                    }
                    break;

                case 4:
                    System.out.println("请输入要删除信息学生的姓名");
                    Scanner sc2 = new Scanner(System.in);
                    String nam2 = sc2.next();
                    int numb2 = -1;
                    for(int i = 0; i <dataIndex ; i++){
                        if(stu[i].name .equals(nam2)){
                            numb2 = i;
                        }
                        if(numb2 >= 0){
                            for(i= numb2;i<dataIndex;i++){
                                stu[i] = stu[i+1];
                            }
                            dataIndex --;
                        }
                        else{
                            System.out.println("不存在该学生！！");
                        }

                    }

            }
            ///数组的增长
            if(dataIndex == stu.length){
                Student newstu[] = new Student[stu.length + stu.length>>1];
                for(int i = 0;i < stu.length ;i++){
                    newstu[i] = stu[i];
                }
                stu = newstu;

            }




        }
    }
}