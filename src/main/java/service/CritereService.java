package service;

import dao.CritereDAO;
import entitie.Critere;

public class CritereService {
	CritereDAO critereDAO = new CritereDAO();
	
	public Critere create(Critere critere) {
		return critereDAO.create(critere);
	}
	
	public Critere update(Critere critere) {
		return critereDAO.update(critere);
	}

}
