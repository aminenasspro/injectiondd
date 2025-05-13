package pres;

import mitier.IMitier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {

    public static void main(String[] args) {
        ApplicationContext con=new AnnotationConfigApplicationContext("ext","mitier","dao");
        IMitier mtt=con.getBean(IMitier.class);
        System.out.println(mtt.clacul());

}}
