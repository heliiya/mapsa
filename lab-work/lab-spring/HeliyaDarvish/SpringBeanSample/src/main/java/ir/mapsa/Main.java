package ir.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMsg("ali");
        helloWorld.getMsg();
    }
}
