package context.constructor.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CollectionApplicationContext {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("application-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Question question = beanFactory.getBean("question", Question.class);
        question.displayInfo();
    }


}
