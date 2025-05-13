package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("Dao")
public class DaoImp implements Idao {
    @Override
    public double getData() {
        System.out.println("version base de donnes");
        double temp =25;
        return temp;
    }
}
