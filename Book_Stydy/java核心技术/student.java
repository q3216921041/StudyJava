package Book_Stydy.java核心技术;

public class student extends person{       //继承
    private String  grade;
    private  String school;
    public  String  subject;
    public student(String name, int age, String  grade, String school) //新构造器
    {
        super(name,age);    //引用超类构造器
        this.school=school;
        this.grade=grade;
    }
    public student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public student()
    {
        name="";
        age=0;
        grade="";
        school="";
        subject="";
    }
    public String jieshao()
    {
        return "姓名："+name+",年龄 ："+age+",来自"+school+grade;
    }
}
