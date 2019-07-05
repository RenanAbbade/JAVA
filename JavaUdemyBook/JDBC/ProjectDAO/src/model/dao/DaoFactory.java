package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {//F�brica de DAO
	//Essa classe vai ter m�todos estaticos para instanciar os DAOs
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(); 
		//Dessa forma a classe vai internamente instanciar
		//a implementacao
	}

}
