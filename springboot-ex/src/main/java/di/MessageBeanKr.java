package di;

public class MessageBeanKr implements MessageBean{
    @Override
    public void sayHello(String text) {
        System.out.println("안녕, " + text+ "씨!");
    }
}
