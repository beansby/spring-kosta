package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDi {
    public static void main(String[] args) {
//        MessageBean bean = new MessageBeanEn();
//        bean.sayHello("Spring");

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("beans.xml");
        MessageBean bean = context.getBean("messageBean", MessageBean.class);
        bean.sayHello("Spring");
    }
}
