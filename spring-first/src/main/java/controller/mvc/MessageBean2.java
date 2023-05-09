package controller.mvc;

import java.io.IOException;

public class MessageBean2 implements MessageBean {
    //매개변수
    private String name;
    private String greeting;
    private Outputter outputter;

    public MessageBean2(String name) {
        this.name = name;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setOutputter(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String sayHello() {
        String message=greeting +", "+ name+"!";
        System.out.println(message);

        try {
            outputter.output(message);
        } catch (IOException e){
            e.printStackTrace();
        }
        return message;
    }
}
