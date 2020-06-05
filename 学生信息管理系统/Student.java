package 学生信息管理系统;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/24 14:48
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class Student {
    private String stuId;
    private String name;
    private int age;
    private double score;

    public Student(String stuId, String name, int age, double score) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
