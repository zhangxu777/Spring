import com.xxxx.config.MyConfig;
import com.xxxx.pojo.Cat;
import com.xxxx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean(Cat.class);
        User user = context.getBean(User.class);
      //  cat.shout();
        user.getCat().shout();
    }

}
