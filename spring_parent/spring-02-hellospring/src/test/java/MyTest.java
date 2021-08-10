import com.yqx.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/10 15:41
 */
public class MyTest {

    public static void main(String[] args) {

        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象都是在Spring中管理.我们使用的时候直接取出来即可
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

}
