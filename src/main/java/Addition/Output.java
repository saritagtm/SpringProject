package Addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Output {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bin1.xml");
        Addition addition = (Addition) applicationContext.getBean("addition");
        addition.sum();
    }
}
