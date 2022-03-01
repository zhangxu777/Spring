import com.xxxx.entity.Goods;
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

        SaleService bean = (SaleService) context.getBean("saleService");
        List<Goods> goods = bean.queryGoodsById();
        //System.out.println(goods);
        for (Goods good : goods) {
            System.out.println(good);
        }
//        for (Goods good : goods) {
//            System.out.println(good);
//
//        }




    }
}
