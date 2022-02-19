import com.xxxx.pojo.Cat;
import com.xxxx.pojo.Temp;
import com.xxxx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean(User.class);
        Cat cat = context.getBean(Cat.class);
        Temp temp = context.getBean(Temp.class);

//        user.getDog().shout();
//        System.out.println(user.getStr().toString());
//        user.getCat().shout();
//        System.out.println(user.getStr().toString());
        System.out.println(temp.getTemp().toString());
        temp.getCat().shout();



        // user.getCat().shout();


    }

}
