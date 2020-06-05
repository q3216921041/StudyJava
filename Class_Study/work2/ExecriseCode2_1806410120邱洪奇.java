package Class_Study.work2;

import Class_Study.work2.Student;
import Class_Study.work2.work2_4;

public class ExecriseCode2_1806410120邱洪奇 {
    public static void main(String[] args){

        //----------第1题演示------------
        Student Stu1 = new Student("stu1",77.7);
        Student Stu2 = new Student();
        Stu2.setName("stu2");
        Stu2.setScore(66.6);
        System.out.println(Stu1.toString());
        System.out.println(Stu2.toString());

        //----------第2题演示------------
        System.out.println(work2_4.method(3));

        //----------第3题演示------------
        int a[]  ={2,4,5,1,2,6};
        work2_4.getleastNumbers(a,4);

        //----------第4题演示-------------
        System.out.println(work2_4.isPerfectSquare(16));
    }
}
