import com.chen.dao.BookMapper;
import com.chen.pojo.Book;
import com.chen.service.BookServiceImpl;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void TestBook(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionTemplate sqlSessionTemplate = (SqlSessionTemplate) applicationContext.getBean("sqlSessionTemplate");
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        for (Book book : mapper.queryAllBook())
        {
            System.out.println(book.toString());
        }
    }

    //测试service层，与上一测试测试功能单元相同
    @Test
    public void TestService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl impl = (BookServiceImpl)applicationContext.getBean("bookServiceImpl");
        List<Book> list = impl.queryAllBook();
        System.out.println(list);
    }
}
