package controller;

import controller.di_ex.Employee;
import controller.di_ex.EmployeeI;
import controller.mvc.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;


@Controller
public class HomeController {
//    private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private MessageBean messageBean; //bean id="messageBean"
    //@Autowired 사용
//    public void setMessageBean(MessageBean messageBean) {
//        this.messageBean = messageBean;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String home(Locale locale, Model model){
        model.addAttribute("say", messageBean.sayHello());  //view : ${say}
        return "home";  //home.jsp
    }

    @Autowired
    private EmployeeI employee; //bean id="employee"
    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String emp(Model model){
        model.addAttribute("emp", employee.info()); //view : ${emp}
        return "emp";   //emp.jsp
    }

}
