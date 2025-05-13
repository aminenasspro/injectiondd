package pres;

import mitier.IMitier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presxml {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        IMitier m= (IMitier) con.getBean("mt");
    System.out.println(m.clacul());}
}
