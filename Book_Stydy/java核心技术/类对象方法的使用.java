package Book_Stydy.java核心技术;
public class 类对象方法的使用 {
    public static void main(String[] args){
        person person1 =new person("aaa",19);   //引用person类
        person1.age=19;
        person1.name="QHQ";
        System.out.println(person1.jieshao());

        student stu1 =new student("aaa",19,"大二","武生院");
        stu1.age=19;                                        //引用student
        stu1.name="QHQ";
        System.out.println(stu1.jieshao());

    }
}
