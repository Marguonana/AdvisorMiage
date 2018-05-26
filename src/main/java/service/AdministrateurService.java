package service;

import java.util.List;

import dao.AdministrateurDAO;
import entitie.Administrateur;

public class AdministrateurService {
	
	AdministrateurDAO administrateurDAO = new AdministrateurDAO();
	
	public Administrateur create(Administrateur administrateur) {
		return administrateurDAO.create(administrateur);
	}

	public Administrateur update(Administrateur administrateur) {
		return administrateurDAO.update(administrateur);
	}

	public void delete(Administrateur administrateur) {
		administrateurDAO.delete(administrateur);
	}
	
	public List<Administrateur> findAll(){
		return administrateurDAO.findAll();
	}
	
	public Administrateur getById(Long id) {
		return administrateurDAO.getById(id);
	}
}
