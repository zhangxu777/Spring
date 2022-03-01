import com.xxxx.entity.Goods;
import com.xxxx.service.BuyGoods;
import com.xxxx.service.SaleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationConext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // ApplicationContext ctx = new ClassPathXmlApplicationContext(applicationContext.xml);

        BuyGoods bean = (BuyGoods) context.getBean("buyGoods");
        bean.buy(1001,10);





    }
}
