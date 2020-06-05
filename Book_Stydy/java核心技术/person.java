package Book_Stydy.java核心技术;

public class person {   //abstractk抽象类
    public String name;
    public int age;
    public person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public person()
    {
       name="";
       age=0;
    }
    public String jieshao()
    {
      return "姓名："+name+",年龄 ："+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
