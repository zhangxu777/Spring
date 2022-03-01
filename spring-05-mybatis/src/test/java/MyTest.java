import com.xxxx.dao.StudentDao;
import com.xxxx.pojo.Student;
import com.xxxx.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


        StudentDao bean = (StudentDao) ctx.getBean("studentDao");
        List<Student> students = bean.selectAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }


//         Student stu = new Student();
//         stu.setAge(2);
//         stu.setName("name2");
//         int i = bean.insertStudent(stu);
//        System.out.println(i);


    }
    @Test
    public void test2(){
        Student stu = new Student();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService bean = (StudentService) ctx.getBean("studentService");


        List<Student> students = bean.queryStudent();
        for (Student student : students) {
            System.out.println(student);
        }

        stu.setName("name3");
        stu.setAge(003);
        int stuin = bean.addStudent(stu);
        System.out.println(stuin);
    }
    @Test
    public void test3(){
        Student stu = new Student();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService bean = (StudentService) ctx.getBean("studentService");
        stu.setId(3);
        int studel = bean.removeStudent(stu);
        System.out.println(studel);
    }
}
