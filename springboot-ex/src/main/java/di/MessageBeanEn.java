package di;

public class MessageBeanEn implements MessageBean{
    @Override
    public void sayHello(String text) {
        System.out.println("Hello, "+text+"!");
    }
}
