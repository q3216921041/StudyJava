package Class_Study.work2;
//        (1）Student类中包含姓名、成绩两个属性。
//        （2）分别给这两个属性定义两个方法，一个方法用于设置值，另一个方法用于获取值。
//        （3）Student类中定义一个无参的构造方法和一个接收两个参数的构造方法，两个参数分别为姓名和成绩属性赋值。
//        （4）在测试类中创建两个Student对象，一个使用无参的构造方法，然后调用方法给姓名和成绩赋值，
//        一个使用有参的构造方法，在构造方法中给姓名和成绩赋值。
//        （5）通过toString方法将两个对象的成员变量内容进行输出。

public class Student {
    private String Name;
    private double Score;
    public Student(String name,double Score) //构造器
    {
     this.Name=name;
     this.Score=Score;
    }
    public Student(){}                  //默认构造器
    public void setName(String Name)    //设置姓名
    {
        this.Name=Name;
    }
    public void setScore(double Score)
    {
        this.Score=Score;               //设置成绩
    }
    public String getName()             //获取姓名
    {
        return Name;
    }
    public double getScore()            //获取成绩
    {
        return Score;
    }

    @Override
    public String toString()        //重写toString方法
    {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
