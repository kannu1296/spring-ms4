package context.setter.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSetterDi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context-setter.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.displayInfo();
    }
}
