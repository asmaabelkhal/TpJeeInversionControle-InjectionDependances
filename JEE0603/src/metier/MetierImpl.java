package metier;
import dao.IDao;

public class MetierImpl implements IMetier {

	private IDao dao;// couplage faible
	
	@Override
	public double calcul() {

		double data=dao.getData();
		double res=data*44;
		return res;
	}
	
	// pour injecter dans la variable dao un objet d'une classe qui implemente IDao
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
