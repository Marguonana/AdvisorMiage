package service;

import java.util.List;

import dao.IndividuDAO;
import entitie.Individu;

public class IndividuService {
	
	IndividuDAO individuDAO = new IndividuDAO();
	
	public Individu create(Individu individu) {
		return individuDAO.create(individu);
	}

	public Individu update(Individu individu) {
		return individuDAO.update(individu);
	}

	public void delete(Individu individu) {
		individuDAO.delete(individu);
	}
	
	public List<Individu> findAll(){
		return individuDAO.findAll();
	}
	
	public Individu getById(Long id) {
		return individuDAO.getById(id);
	}
}
