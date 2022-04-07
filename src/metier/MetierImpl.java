package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
   //couplage faible
    private IDao dao=null;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
// Injecter dans la variable un objet d'une classe qui implente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
