package controller.di_ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("beansEx.xml");
        EmployeeI employee = context.getBean("employee", EmployeeI.class);
        employee.info();
    }
}
