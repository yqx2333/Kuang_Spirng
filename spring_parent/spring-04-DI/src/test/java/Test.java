import com.trans.pojo.Person;
import com.trans.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/10 17:10
 */
public class Test {

    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Student student = (Student) context.getBean("student");
        // System.out.println( student );

        // 获取当前时间的工具类
        // Calendar now = Calendar.getInstance();
        // System.out.println(now);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p3 = (Person) context.getBean("p3");
        Person person2 = (Person) context.getBean("person2");
        System.out.println("p3: " + p3);
        System.out.println("person2: " + person2);

    }


    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User userP = context.getBean("userP", User.class);
        User userC = context.getBean("userC", User.class);
        System.out.println("userP: " + userP);
        System.out.println("userC: " + userC);
    }

}
