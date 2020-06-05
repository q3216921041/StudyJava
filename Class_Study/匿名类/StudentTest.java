package Class_Study.匿名类;

import java.util.Arrays;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/15 14:27
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class StudentTest {


    public static void main(String[] args) {
        Student[] stus = {new Student("张三", 20,31105),
                new Student("李四",20,31102),
                new Student("王五",19,31107)};

        //接口回调:接口回调思想在代码设计里面经常用。
        StudentUtils.sort(stus, new Comparator() {
            @Override
            public boolean compare(Student pre, Student curr) {
                if(pre.getAge() == curr.getAge())
                    return pre.getNumber() > curr.getNumber();
                return pre.getAge()> curr.getAge();
            }
        });

        //lambda表达式写法
        StudentUtils.sort(stus, (Student pre, Student curr)->{
            if(pre.getAge() == curr.getAge())
                return pre.getNumber() > curr.getNumber();
            return pre.getAge() > curr.getAge();
        });


        for(Student stu : stus){
            System.out.println(stu);
        }
    }
}
