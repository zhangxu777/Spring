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
        SomeService bean = (SomeService) context.getBean("someService");
        //System.out.println(bean.getClass().getName());
       // bean.doSome("zhangxu",11);

        //bean.doOther();
//        String ret = bean.doOther();
//        System.out.println(ret);
        //bean.doAround("zhangxuAround");
        String ret = bean.doAround("zx");
        System.out.println(ret);


    }

}
