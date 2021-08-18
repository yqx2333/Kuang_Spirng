import com.trans.mapper.UserMapper;
import com.trans.mapper.UserMapperImpl;
import com.trans.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/18 10:16
 */
public class UserTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper uuuuser = context.getBean("uuuuser", UserMapper.class);
        List<User> users = uuuuser.selectUser();
        System.out.println(users);
    }


}
