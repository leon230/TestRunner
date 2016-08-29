package DESSERT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./DESSERT/Beans.xml");
        Dessert des;
        Cake cake = new Cake();



    }
}