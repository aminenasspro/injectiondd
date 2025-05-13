package pres;

import dao.DaoImp;
import mitier.MitierrImp;

public class pres {
    public static void main(String[] args) {
        DaoImp d= new DaoImp();
        MitierrImp mt=new MitierrImp(d);
        //mt.setDao(d);
        System.out.println("res " + mt.clacul());

    }
}
