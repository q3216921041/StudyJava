package Class_Study.匿名类;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/15 14:30
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:排序工具类，一般工具类里面的方法都是静态方法
 */
public class StudentUtils {

    public static void sort(Student[] stu, Comparator cmp) {

        for (int i = 1; i < stu.length; i++) {

            for (int j = 0; j < stu.length - i; j++) {
                if (cmp.compare(stu[j], stu[j + 1])) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }

        }

    }


}
