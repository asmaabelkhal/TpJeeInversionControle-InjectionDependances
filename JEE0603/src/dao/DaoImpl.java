package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		System.out.println("Version base de donnee");
		/*
		 * 
		 Se connecter a la bd pour lire la valeur de data
		 */
		double data=23;
		return data;
	}

}
