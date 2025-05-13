package pres;

import dao.Idao;
import mitier.IMitier;

import java.lang.reflect.Method;


    import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Scanner;

    public class Pres2 {
        public static void main(String[] args) {
            try{
                Scanner scanner=new Scanner(new File("config.txt"));
                String daoClassname=scanner.nextLine();
                Class cDao = Class.forName(daoClassname);
                Idao dao = (Idao) cDao.getConstructor().newInstance();

                String metierClassname=scanner.nextLine();
                Class cMetier = Class.forName(metierClassname);
                IMitier metier = (IMitier) cMetier.getConstructor().newInstance();

                Method setDao = cMetier.getDeclaredMethod("setDao", Idao.class);
                setDao.invoke(metier,dao);


                System.out.println("RES");

            } catch (Exception e) {
                System.out.println(e.getMessage());;
  }

}
    }

