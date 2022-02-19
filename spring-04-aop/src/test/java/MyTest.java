import com.xxxx.config.MyConfig;
import com.xxxx.service.SomeService;
import com.xxxx.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        SomeService bean = (SomeService) context.getBean("some");
        bean.doSome("zhangxu",11);


    }

}
