package mitier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("mitier")
public class MitierrImp implements IMitier{
    //@Autowired
    private Idao dao;

    public MitierrImp(@Qualifier("Dao") Idao dao) {
        this.dao = dao;
    }

    //public MitierrImp() {} not using it because of annotation spring don't now wish constactor use

    @Override
    public double clacul() {
        double t= dao.getData();
        double res=t*23;
        return res;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
