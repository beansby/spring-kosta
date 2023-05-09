package di_file;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("beans2.xml");
        MessageBean bean = context.getBean("messageBean", MessageBean.class);
        bean.sayHello();
    }
}
