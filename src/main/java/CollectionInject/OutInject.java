package CollectionInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutInject {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectInject.xml");
        CollectionInject collectionInject = (CollectionInject) applicationContext.getBean("collectionInject");
        System.out.println(collectionInject.getAddress());
        System.out.println(collectionInject.getLocation());
        System.out.println(collectionInject.getCollege());
    }
}

