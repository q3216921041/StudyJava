package Class_Study.匿名类;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/15 14:29
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class Student {

    private String name;

    private int age;

    private int number;

    public Student(String name, int age, int number) {
        super();
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", number=" + number + "]";
    }


}
