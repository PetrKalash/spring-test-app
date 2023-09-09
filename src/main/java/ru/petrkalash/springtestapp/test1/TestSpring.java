package ru.petrkalash.springtestapp.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.petrkalash.springtestapp.test1.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        TestBean anonymous = context.getBean("anonymousBean", TestBean.class);
        System.out.println(anonymous.getName());

        context.close();


    }
}