package Book_Stydy.java核心技术;
import java.util.ArrayList;
public class ArrayList动态数组 {
    public static void main(String[] args)
    {
        ArrayList<person> person_list=new ArrayList<person>();    //Arraylist 数组的使用
        person_list.add(new person("a1",11));
        person_list.add(new person("a2",12));
        person p1=person_list.get(1);                             //取出动态数组的元素
        System.out.println("数组长度"+person_list.size());       //数组长度
        System.out.println(p1.jieshao());
        person_list.set(1,new person("a3",13));  //在第一个位置设置元素
        for (person a:person_list)
        {
            System.out.println(a.jieshao());
        }
        //Integer integer类   Double double类【
    }
}
