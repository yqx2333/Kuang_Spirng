import com.yqx.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/10 16:06
 */
public class MyTest {

    public static void main(String[] args) {

        // 获取ApplicationContext 拿到Spring容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 调用bean工厂 获取到bean对象
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        // 调用方法
        userServiceImpl.getUser();

    }

}
